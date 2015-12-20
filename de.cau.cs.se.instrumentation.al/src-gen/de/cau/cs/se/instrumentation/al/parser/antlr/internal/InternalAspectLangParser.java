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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'type'", "'$'", "'pointcut'", "'class'", "'operation'", "'@'", "'.'", "'*'", "'['", "']'", "'**'", "'up'", "'#'", "'istypeof'", "'before'", "'after'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
                case 22:
                    {
                    alt3=1;
                    }
                    break;
                case 27:
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 17:
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


    // $ANTLR start "entryRuleAspect"
    // InternalAspectLang.g:335:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // InternalAspectLang.g:336:2: (iv_ruleAspect= ruleAspect EOF )
            // InternalAspectLang.g:337:2: iv_ruleAspect= ruleAspect EOF
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
    // InternalAspectLang.g:344:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_advices_3_0 = null;

        EObject lv_advices_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:347:28: ( (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* ) )
            // InternalAspectLang.g:348:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* )
            {
            // InternalAspectLang.g:348:1: (otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )* )
            // InternalAspectLang.g:348:3: otherlv_0= 'aspect' ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (lv_advices_3_0= ruleUtilizeAdvice ) ) (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                  
            }
            // InternalAspectLang.g:352:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:353:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:353:1: ( ruleQualifiedName )
            // InternalAspectLang.g:354:3: ruleQualifiedName
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
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getColonKeyword_2());
                  
            }
            // InternalAspectLang.g:374:1: ( (lv_advices_3_0= ruleUtilizeAdvice ) )
            // InternalAspectLang.g:375:1: (lv_advices_3_0= ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:375:1: (lv_advices_3_0= ruleUtilizeAdvice )
            // InternalAspectLang.g:376:3: lv_advices_3_0= ruleUtilizeAdvice
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
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

            // InternalAspectLang.g:392:2: (otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAspectLang.g:392:4: otherlv_4= ',' ( (lv_advices_5_0= ruleUtilizeAdvice ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAspectAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // InternalAspectLang.g:396:1: ( (lv_advices_5_0= ruleUtilizeAdvice ) )
            	    // InternalAspectLang.g:397:1: (lv_advices_5_0= ruleUtilizeAdvice )
            	    {
            	    // InternalAspectLang.g:397:1: (lv_advices_5_0= ruleUtilizeAdvice )
            	    // InternalAspectLang.g:398:3: lv_advices_5_0= ruleUtilizeAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleUtilizeAdvice"
    // InternalAspectLang.g:422:1: entryRuleUtilizeAdvice returns [EObject current=null] : iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF ;
    public final EObject entryRuleUtilizeAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtilizeAdvice = null;


        try {
            // InternalAspectLang.g:423:2: (iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF )
            // InternalAspectLang.g:424:2: iv_ruleUtilizeAdvice= ruleUtilizeAdvice EOF
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
    // InternalAspectLang.g:431:1: ruleUtilizeAdvice returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleUtilizeAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameterAssignments_2_0 = null;

        EObject lv_parameterAssignments_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:434:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? ) )
            // InternalAspectLang.g:435:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalAspectLang.g:435:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )? )
            // InternalAspectLang.g:435:2: ( ( ruleQualifiedName ) ) (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            {
            // InternalAspectLang.g:435:2: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:436:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:436:1: ( ruleQualifiedName )
            // InternalAspectLang.g:437:3: ruleQualifiedName
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
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:453:2: (otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAspectLang.g:453:4: otherlv_1= '(' ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:457:1: ( ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==26||LA6_0==32||(LA6_0>=35 && LA6_0<=36)||(LA6_0>=41 && LA6_0<=43)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAspectLang.g:457:2: ( (lv_parameterAssignments_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            {
                            // InternalAspectLang.g:457:2: ( (lv_parameterAssignments_2_0= ruleValue ) )
                            // InternalAspectLang.g:458:1: (lv_parameterAssignments_2_0= ruleValue )
                            {
                            // InternalAspectLang.g:458:1: (lv_parameterAssignments_2_0= ruleValue )
                            // InternalAspectLang.g:459:3: lv_parameterAssignments_2_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
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

                            // InternalAspectLang.g:475:2: (otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==19) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalAspectLang.g:475:4: otherlv_3= ',' ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    {
                            	    otherlv_3=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:479:1: ( (lv_parameterAssignments_4_0= ruleValue ) )
                            	    // InternalAspectLang.g:480:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    {
                            	    // InternalAspectLang.g:480:1: (lv_parameterAssignments_4_0= ruleValue )
                            	    // InternalAspectLang.g:481:3: lv_parameterAssignments_4_0= ruleValue
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_13);
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
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:509:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalAspectLang.g:510:2: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalAspectLang.g:511:2: iv_ruleAdvice= ruleAdvice EOF
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
    // InternalAspectLang.g:518:1: ruleAdvice returns [EObject current=null] : (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) ;
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
            // InternalAspectLang.g:521:28: ( (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' ) )
            // InternalAspectLang.g:522:1: (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            {
            // InternalAspectLang.g:522:1: (otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}' )
            // InternalAspectLang.g:522:3: otherlv_0= 'advice' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_collectors_8_0= ruleCollector ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
                  
            }
            // InternalAspectLang.g:526:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:527:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:527:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:528:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            // InternalAspectLang.g:544:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAspectLang.g:544:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // InternalAspectLang.g:548:1: ( ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalAspectLang.g:548:2: ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )*
                            {
                            // InternalAspectLang.g:548:2: ( (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration ) )
                            // InternalAspectLang.g:549:1: (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration )
                            {
                            // InternalAspectLang.g:549:1: (lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration )
                            // InternalAspectLang.g:550:3: lv_parameterDeclarations_3_0= ruleAdviceParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
                            lv_parameterDeclarations_3_0=ruleAdviceParameterDeclaration();

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
                                      		"de.cau.cs.se.instrumentation.al.AspectLang.AdviceParameterDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalAspectLang.g:566:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==19) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalAspectLang.g:566:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,19,FOLLOW_17); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:570:1: ( (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration ) )
                            	    // InternalAspectLang.g:571:1: (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration )
                            	    {
                            	    // InternalAspectLang.g:571:1: (lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration )
                            	    // InternalAspectLang.g:572:3: lv_parameterDeclarations_5_0= ruleAdviceParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_13);
                            	    lv_parameterDeclarations_5_0=ruleAdviceParameterDeclaration();

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
                            	              		"de.cau.cs.se.instrumentation.al.AspectLang.AdviceParameterDeclaration");
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

                    otherlv_6=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalAspectLang.g:596:1: ( (lv_collectors_8_0= ruleCollector ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=39 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAspectLang.g:597:1: (lv_collectors_8_0= ruleCollector )
            	    {
            	    // InternalAspectLang.g:597:1: (lv_collectors_8_0= ruleCollector )
            	    // InternalAspectLang.g:598:3: lv_collectors_8_0= ruleCollector
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdviceAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
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
            	    break loop11;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAdviceParameterDeclaration"
    // InternalAspectLang.g:626:1: entryRuleAdviceParameterDeclaration returns [EObject current=null] : iv_ruleAdviceParameterDeclaration= ruleAdviceParameterDeclaration EOF ;
    public final EObject entryRuleAdviceParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdviceParameterDeclaration = null;


        try {
            // InternalAspectLang.g:627:2: (iv_ruleAdviceParameterDeclaration= ruleAdviceParameterDeclaration EOF )
            // InternalAspectLang.g:628:2: iv_ruleAdviceParameterDeclaration= ruleAdviceParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdviceParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdviceParameterDeclaration=ruleAdviceParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdviceParameterDeclaration; 
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
    // $ANTLR end "entryRuleAdviceParameterDeclaration"


    // $ANTLR start "ruleAdviceParameterDeclaration"
    // InternalAspectLang.g:635:1: ruleAdviceParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAdviceParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:638:28: ( ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAspectLang.g:639:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAspectLang.g:639:1: ( ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAspectLang.g:639:2: ( (lv_type_0_0= 'type' ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAspectLang.g:639:2: ( (lv_type_0_0= 'type' ) )
            // InternalAspectLang.g:640:1: (lv_type_0_0= 'type' )
            {
            // InternalAspectLang.g:640:1: (lv_type_0_0= 'type' )
            // InternalAspectLang.g:641:3: lv_type_0_0= 'type'
            {
            lv_type_0_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_type_0_0, grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAdviceParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(current, "type", lv_type_0_0, "type");
              	    
            }

            }


            }

            // InternalAspectLang.g:654:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:655:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:655:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:656:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAdviceParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAdviceParameterDeclarationRule());
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
    // $ANTLR end "ruleAdviceParameterDeclaration"


    // $ANTLR start "entryRuleCollector"
    // InternalAspectLang.g:680:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // InternalAspectLang.g:681:2: (iv_ruleCollector= ruleCollector EOF )
            // InternalAspectLang.g:682:2: iv_ruleCollector= ruleCollector EOF
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
    // InternalAspectLang.g:689:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) ;
    public final EObject ruleCollector() throws RecognitionException {
        EObject current = null;

        Enumerator lv_insertionPoint_0_0 = null;

        EObject lv_events_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:692:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) )
            // InternalAspectLang.g:693:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            {
            // InternalAspectLang.g:693:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            // InternalAspectLang.g:693:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+
            {
            // InternalAspectLang.g:693:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // InternalAspectLang.g:694:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // InternalAspectLang.g:694:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // InternalAspectLang.g:695:3: lv_insertionPoint_0_0= ruleInsertionPoint
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

            // InternalAspectLang.g:711:2: ( (lv_events_1_0= ruleEvent ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAspectLang.g:712:1: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalAspectLang.g:712:1: (lv_events_1_0= ruleEvent )
            	    // InternalAspectLang.g:713:3: lv_events_1_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectorAccess().getEventsEventParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalAspectLang.g:737:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAspectLang.g:738:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalAspectLang.g:739:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAspectLang.g:746:1: ruleEvent returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializations_2_0 = null;

        EObject lv_initializations_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:749:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) )
            // InternalAspectLang.g:750:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            {
            // InternalAspectLang.g:750:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            // InternalAspectLang.g:750:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')'
            {
            // InternalAspectLang.g:750:2: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:751:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:751:1: ( ruleQualifiedName )
            // InternalAspectLang.g:752:3: ruleQualifiedName
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
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalAspectLang.g:772:1: ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==26||LA14_0==32||(LA14_0>=35 && LA14_0<=36)||(LA14_0>=41 && LA14_0<=43)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:772:2: ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    {
                    // InternalAspectLang.g:772:2: ( (lv_initializations_2_0= ruleValue ) )
                    // InternalAspectLang.g:773:1: (lv_initializations_2_0= ruleValue )
                    {
                    // InternalAspectLang.g:773:1: (lv_initializations_2_0= ruleValue )
                    // InternalAspectLang.g:774:3: lv_initializations_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalAspectLang.g:790:2: (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAspectLang.g:790:4: otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalAspectLang.g:794:1: ( (lv_initializations_4_0= ruleValue ) )
                    	    // InternalAspectLang.g:795:1: (lv_initializations_4_0= ruleValue )
                    	    {
                    	    // InternalAspectLang.g:795:1: (lv_initializations_4_0= ruleValue )
                    	    // InternalAspectLang.g:796:3: lv_initializations_4_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleValue"
    // InternalAspectLang.g:824:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalAspectLang.g:825:2: (iv_ruleValue= ruleValue EOF )
            // InternalAspectLang.g:826:2: iv_ruleValue= ruleValue EOF
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
    // InternalAspectLang.g:833:1: ruleValue returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_ReferenceValue_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:836:28: ( (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue ) )
            // InternalAspectLang.g:837:1: (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue )
            {
            // InternalAspectLang.g:837:1: (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID||LA15_0==26||LA15_0==32||(LA15_0>=35 && LA15_0<=36)||(LA15_0>=41 && LA15_0<=43)) ) {
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
                    // InternalAspectLang.g:838:2: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:851:2: this_ReferenceValue_1= ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_ReferenceValue_1=ruleReferenceValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceValue_1; 
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


    // $ANTLR start "entryRuleReferenceValue"
    // InternalAspectLang.g:870:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // InternalAspectLang.g:871:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // InternalAspectLang.g:872:2: iv_ruleReferenceValue= ruleReferenceValue EOF
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
    // InternalAspectLang.g:879:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_property_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:882:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) ) )
            // InternalAspectLang.g:883:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) )
            {
            // InternalAspectLang.g:883:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) )
            // InternalAspectLang.g:883:2: ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) )
            {
            // InternalAspectLang.g:883:2: ( (lv_query_0_0= ruleLocationQuery ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==32||(LA16_0>=35 && LA16_0<=36)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:884:1: (lv_query_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:884:1: (lv_query_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:885:3: lv_query_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalAspectLang.g:901:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalAspectLang.g:902:1: (lv_property_1_0= ruleProperty )
            {
            // InternalAspectLang.g:902:1: (lv_property_1_0= ruleProperty )
            // InternalAspectLang.g:903:3: lv_property_1_0= ruleProperty
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceValueAccess().getPropertyPropertyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_property_1_0=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceValueRule());
              	        }
                     		set(
                     			current, 
                     			"property",
                      		lv_property_1_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.Property");
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


    // $ANTLR start "entryRuleProperty"
    // InternalAspectLang.g:927:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAspectLang.g:928:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalAspectLang.g:929:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAspectLang.g:936:1: ruleProperty returns [EObject current=null] : (this_InternalFunctionProperty_0= ruleInternalFunctionProperty | this_ReflectionProperty_1= ruleReflectionProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_InternalFunctionProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:939:28: ( (this_InternalFunctionProperty_0= ruleInternalFunctionProperty | this_ReflectionProperty_1= ruleReflectionProperty ) )
            // InternalAspectLang.g:940:1: (this_InternalFunctionProperty_0= ruleInternalFunctionProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            {
            // InternalAspectLang.g:940:1: (this_InternalFunctionProperty_0= ruleInternalFunctionProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=41 && LA17_0<=43)) ) {
                alt17=1;
            }
            else if ( (LA17_0==26) ) {
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
                    // InternalAspectLang.g:941:2: this_InternalFunctionProperty_0= ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getInternalFunctionPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_InternalFunctionProperty_0=ruleInternalFunctionProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InternalFunctionProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:954:2: this_ReflectionProperty_1= ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getReflectionPropertyParserRuleCall_1()); 
                          
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


    // $ANTLR start "entryRuleInternalFunctionProperty"
    // InternalAspectLang.g:973:1: entryRuleInternalFunctionProperty returns [EObject current=null] : iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF ;
    public final EObject entryRuleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalFunctionProperty = null;


        try {
            // InternalAspectLang.g:974:2: (iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF )
            // InternalAspectLang.g:975:2: iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF
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
    // InternalAspectLang.g:982:1: ruleInternalFunctionProperty returns [EObject current=null] : ( (lv_function_0_0= ruleInternalFunction ) ) ;
    public final EObject ruleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_function_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:985:28: ( ( (lv_function_0_0= ruleInternalFunction ) ) )
            // InternalAspectLang.g:986:1: ( (lv_function_0_0= ruleInternalFunction ) )
            {
            // InternalAspectLang.g:986:1: ( (lv_function_0_0= ruleInternalFunction ) )
            // InternalAspectLang.g:987:1: (lv_function_0_0= ruleInternalFunction )
            {
            // InternalAspectLang.g:987:1: (lv_function_0_0= ruleInternalFunction )
            // InternalAspectLang.g:988:3: lv_function_0_0= ruleInternalFunction
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


    // $ANTLR start "entryRuleReflectionProperty"
    // InternalAspectLang.g:1012:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // InternalAspectLang.g:1013:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // InternalAspectLang.g:1014:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
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
    // InternalAspectLang.g:1021:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1024:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // InternalAspectLang.g:1025:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // InternalAspectLang.g:1025:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // InternalAspectLang.g:1025:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // InternalAspectLang.g:1029:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // InternalAspectLang.g:1030:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // InternalAspectLang.g:1030:1: (lv_function_1_0= ruleReflectionFunction )
            // InternalAspectLang.g:1031:3: lv_function_1_0= ruleReflectionFunction
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


    // $ANTLR start "entryRulePointcut"
    // InternalAspectLang.g:1055:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // InternalAspectLang.g:1056:2: (iv_rulePointcut= rulePointcut EOF )
            // InternalAspectLang.g:1057:2: iv_rulePointcut= rulePointcut EOF
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
    // InternalAspectLang.g:1064:1: rulePointcut returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )? ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_location_4_0 = null;

        EObject lv_operation_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1067:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )? ) )
            // InternalAspectLang.g:1068:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )? )
            {
            // InternalAspectLang.g:1068:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )? )
            // InternalAspectLang.g:1068:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (lv_location_4_0= ruleLocationQuery ) ) (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )?
            {
            // InternalAspectLang.g:1068:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAspectLang.g:1069:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // InternalAspectLang.g:1069:1: (lv_annotation_0_0= ruleAnnotation )
                    // InternalAspectLang.g:1070:3: lv_annotation_0_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointcutAccess().getPointcutKeyword_1());
                  
            }
            // InternalAspectLang.g:1090:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAspectLang.g:1091:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAspectLang.g:1091:1: (lv_name_2_0= RULE_ID )
            // InternalAspectLang.g:1092:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,28,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPointcutAccess().getClassKeyword_3());
                  
            }
            // InternalAspectLang.g:1112:1: ( (lv_location_4_0= ruleLocationQuery ) )
            // InternalAspectLang.g:1113:1: (lv_location_4_0= ruleLocationQuery )
            {
            // InternalAspectLang.g:1113:1: (lv_location_4_0= ruleLocationQuery )
            // InternalAspectLang.g:1114:3: lv_location_4_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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

            // InternalAspectLang.g:1130:2: (otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAspectLang.g:1130:4: otherlv_5= 'operation' ( (lv_operation_6_0= ruleOperationQuery ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPointcutAccess().getOperationKeyword_5_0());
                          
                    }
                    // InternalAspectLang.g:1134:1: ( (lv_operation_6_0= ruleOperationQuery ) )
                    // InternalAspectLang.g:1135:1: (lv_operation_6_0= ruleOperationQuery )
                    {
                    // InternalAspectLang.g:1135:1: (lv_operation_6_0= ruleOperationQuery )
                    // InternalAspectLang.g:1136:3: lv_operation_6_0= ruleOperationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operation_6_0=ruleOperationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointcutRule());
                      	        }
                             		set(
                             			current, 
                             			"operation",
                              		lv_operation_6_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.OperationQuery");
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
    // InternalAspectLang.g:1160:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAspectLang.g:1161:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAspectLang.g:1162:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalAspectLang.g:1169:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1172:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalAspectLang.g:1173:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalAspectLang.g:1173:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalAspectLang.g:1173:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalAspectLang.g:1177:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:1178:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:1178:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:1179:3: lv_name_1_0= RULE_ID
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

            // InternalAspectLang.g:1195:2: ( (lv_value_2_0= RULE_STRING ) )
            // InternalAspectLang.g:1196:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalAspectLang.g:1196:1: (lv_value_2_0= RULE_STRING )
            // InternalAspectLang.g:1197:3: lv_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleLocationQuery"
    // InternalAspectLang.g:1221:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // InternalAspectLang.g:1222:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // InternalAspectLang.g:1223:2: iv_ruleLocationQuery= ruleLocationQuery EOF
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
    // InternalAspectLang.g:1230:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;

        EObject lv_composition_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1233:28: ( ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) )
            // InternalAspectLang.g:1234:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            {
            // InternalAspectLang.g:1234:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            // InternalAspectLang.g:1234:2: ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            {
            // InternalAspectLang.g:1234:2: ( (lv_node_0_0= ruleNode ) )
            // InternalAspectLang.g:1235:1: (lv_node_0_0= ruleNode )
            {
            // InternalAspectLang.g:1235:1: (lv_node_0_0= ruleNode )
            // InternalAspectLang.g:1236:3: lv_node_0_0= ruleNode
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

            // InternalAspectLang.g:1252:2: ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==23||(LA20_0>=48 && LA20_0<=49)) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalAspectLang.g:1252:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    {
                    // InternalAspectLang.g:1252:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    // InternalAspectLang.g:1252:5: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0());
                          
                    }
                    // InternalAspectLang.g:1256:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // InternalAspectLang.g:1257:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:1257:1: (lv_specialization_2_0= ruleLocationQuery )
                    // InternalAspectLang.g:1258:3: lv_specialization_2_0= ruleLocationQuery
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
                    // InternalAspectLang.g:1275:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    {
                    // InternalAspectLang.g:1275:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    // InternalAspectLang.g:1276:1: (lv_composition_3_0= ruleCompositionQuery )
                    {
                    // InternalAspectLang.g:1276:1: (lv_composition_3_0= ruleCompositionQuery )
                    // InternalAspectLang.g:1277:3: lv_composition_3_0= ruleCompositionQuery
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
    // InternalAspectLang.g:1301:1: entryRuleCompositionQuery returns [EObject current=null] : iv_ruleCompositionQuery= ruleCompositionQuery EOF ;
    public final EObject entryRuleCompositionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionQuery = null;


        try {
            // InternalAspectLang.g:1302:2: (iv_ruleCompositionQuery= ruleCompositionQuery EOF )
            // InternalAspectLang.g:1303:2: iv_ruleCompositionQuery= ruleCompositionQuery EOF
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
    // InternalAspectLang.g:1310:1: ruleCompositionQuery returns [EObject current=null] : ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) ;
    public final EObject ruleCompositionQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_subQueries_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1313:28: ( ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) )
            // InternalAspectLang.g:1314:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            {
            // InternalAspectLang.g:1314:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            // InternalAspectLang.g:1314:2: () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}'
            {
            // InternalAspectLang.g:1314:2: ()
            // InternalAspectLang.g:1315:2: 
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

            // InternalAspectLang.g:1323:2: ( (lv_modifier_1_0= ruleQueryModifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=48 && LA21_0<=49)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:1324:1: (lv_modifier_1_0= ruleQueryModifier )
                    {
                    // InternalAspectLang.g:1324:1: (lv_modifier_1_0= ruleQueryModifier )
                    // InternalAspectLang.g:1325:3: lv_modifier_1_0= ruleQueryModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,23,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalAspectLang.g:1345:1: ( (lv_subQueries_3_0= ruleLocationQuery ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==32||(LA22_0>=35 && LA22_0<=36)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAspectLang.g:1346:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    {
            	    // InternalAspectLang.g:1346:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    // InternalAspectLang.g:1347:3: lv_subQueries_3_0= ruleLocationQuery
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
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleOperationQuery"
    // InternalAspectLang.g:1375:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalAspectLang.g:1376:2: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalAspectLang.g:1377:2: iv_ruleOperationQuery= ruleOperationQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperationQuery=ruleOperationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationQuery; 
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
    // $ANTLR end "entryRuleOperationQuery"


    // $ANTLR start "ruleOperationQuery"
    // InternalAspectLang.g:1384:1: ruleOperationQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) ;
    public final EObject ruleOperationQuery() throws RecognitionException {
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
            // InternalAspectLang.g:1387:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) )
            // InternalAspectLang.g:1388:1: ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            {
            // InternalAspectLang.g:1388:1: ( () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            // InternalAspectLang.g:1388:2: () ( (otherlv_1= RULE_ID ) )? ( (otherlv_2= RULE_ID ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            {
            // InternalAspectLang.g:1388:2: ()
            // InternalAspectLang.g:1389:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOperationQueryAccess().getOperationQueryAction_0(),
                          current);
                  
            }

            }

            // InternalAspectLang.g:1397:2: ( (otherlv_1= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred26_InternalAspectLang()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalAspectLang.g:1398:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1398:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1399:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationQueryRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1413:3: ( (otherlv_2= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID||LA24_1==32) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalAspectLang.g:1414:1: (otherlv_2= RULE_ID )
                    {
                    // InternalAspectLang.g:1414:1: (otherlv_2= RULE_ID )
                    // InternalAspectLang.g:1415:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationQueryRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getOperationQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1429:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==32) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAspectLang.g:1429:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalAspectLang.g:1429:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    // InternalAspectLang.g:1429:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    {
                    // InternalAspectLang.g:1429:5: ( (otherlv_3= RULE_ID ) )
                    // InternalAspectLang.g:1430:1: (otherlv_3= RULE_ID )
                    {
                    // InternalAspectLang.g:1430:1: (otherlv_3= RULE_ID )
                    // InternalAspectLang.g:1431:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationQueryRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getOperationQueryAccess().getOperationReferenceOperationCrossReference_3_0_0_0()); 
                      	
                    }

                    }


                    }

                    // InternalAspectLang.g:1445:2: (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==20) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAspectLang.g:1445:4: otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0());
                                  
                            }
                            // InternalAspectLang.g:1449:1: ( (lv_parameterQueries_5_0= ruleParameterQuery ) )
                            // InternalAspectLang.g:1450:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            {
                            // InternalAspectLang.g:1450:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            // InternalAspectLang.g:1451:3: lv_parameterQueries_5_0= ruleParameterQuery
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
                            lv_parameterQueries_5_0=ruleParameterQuery();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOperationQueryRule());
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

                            // InternalAspectLang.g:1467:2: (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==19) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalAspectLang.g:1467:4: otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    {
                            	    otherlv_6=(Token)match(input,19,FOLLOW_27); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:1471:1: ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    // InternalAspectLang.g:1472:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    {
                            	    // InternalAspectLang.g:1472:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    // InternalAspectLang.g:1473:3: lv_parameterQueries_7_0= ruleParameterQuery
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_13);
                            	    lv_parameterQueries_7_0=ruleParameterQuery();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getOperationQueryRule());
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
                            	    break loop25;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getOperationQueryAccess().getRightParenthesisKeyword_3_0_1_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1494:7: otherlv_9= '*'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationQueryAccess().getAsteriskKeyword_3_1());
                          
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
    // $ANTLR end "ruleOperationQuery"


    // $ANTLR start "entryRuleParameterQuery"
    // InternalAspectLang.g:1506:1: entryRuleParameterQuery returns [EObject current=null] : iv_ruleParameterQuery= ruleParameterQuery EOF ;
    public final EObject entryRuleParameterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterQuery = null;


        try {
            // InternalAspectLang.g:1507:2: (iv_ruleParameterQuery= ruleParameterQuery EOF )
            // InternalAspectLang.g:1508:2: iv_ruleParameterQuery= ruleParameterQuery EOF
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
    // InternalAspectLang.g:1515:1: ruleParameterQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) ;
    public final EObject ruleParameterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1518:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) )
            // InternalAspectLang.g:1519:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            {
            // InternalAspectLang.g:1519:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            // InternalAspectLang.g:1519:2: () ( (otherlv_1= RULE_ID ) )? ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )?
            {
            // InternalAspectLang.g:1519:2: ()
            // InternalAspectLang.g:1520:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterQueryAccess().getParameterQueryAction_0(),
                          current);
                  
            }

            }

            // InternalAspectLang.g:1528:2: ( (otherlv_1= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_ID) ) {
                    int LA28_3 = input.LA(3);

                    if ( (synpred31_InternalAspectLang()) ) {
                        alt28=1;
                    }
                }
                else if ( (LA28_1==32) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalAspectLang.g:1529:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1529:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1530:3: otherlv_1= RULE_ID
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

                      		newLeafNode(otherlv_1, grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1544:3: ( ( (otherlv_2= RULE_ID ) ) | otherlv_3= '*' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:1544:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalAspectLang.g:1544:4: ( (otherlv_2= RULE_ID ) )
                    // InternalAspectLang.g:1545:1: (otherlv_2= RULE_ID )
                    {
                    // InternalAspectLang.g:1545:1: (otherlv_2= RULE_ID )
                    // InternalAspectLang.g:1546:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1561:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterQueryAccess().getAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // InternalAspectLang.g:1565:2: ( (otherlv_4= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAspectLang.g:1566:1: (otherlv_4= RULE_ID )
                    {
                    // InternalAspectLang.g:1566:1: (otherlv_4= RULE_ID )
                    // InternalAspectLang.g:1567:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_3_0()); 
                      	
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


    // $ANTLR start "entryRuleNode"
    // InternalAspectLang.g:1589:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAspectLang.g:1590:2: (iv_ruleNode= ruleNode EOF )
            // InternalAspectLang.g:1591:2: iv_ruleNode= ruleNode EOF
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
    // InternalAspectLang.g:1598:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_SubPathNode_0 = null;

        EObject this_WildcardNode_1 = null;

        EObject this_ParentNode_2 = null;

        EObject this_ContainerNode_3 = null;

        EObject lv_constraint_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1601:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) )
            // InternalAspectLang.g:1602:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            {
            // InternalAspectLang.g:1602:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            // InternalAspectLang.g:1602:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            {
            // InternalAspectLang.g:1602:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt31=1;
                }
                break;
            case 32:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
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
                    // InternalAspectLang.g:1603:2: this_SubPathNode_0= ruleSubPathNode
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
                    // InternalAspectLang.g:1616:2: this_WildcardNode_1= ruleWildcardNode
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
                    // InternalAspectLang.g:1629:2: this_ParentNode_2= ruleParentNode
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
                    // InternalAspectLang.g:1642:2: this_ContainerNode_3= ruleContainerNode
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

            // InternalAspectLang.g:1653:2: (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:1653:4: otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:1657:1: ( (lv_constraint_5_0= rulePropertyConstraint ) )
                    // InternalAspectLang.g:1658:1: (lv_constraint_5_0= rulePropertyConstraint )
                    {
                    // InternalAspectLang.g:1658:1: (lv_constraint_5_0= rulePropertyConstraint )
                    // InternalAspectLang.g:1659:3: lv_constraint_5_0= rulePropertyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getConstraintPropertyConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
                    lv_constraint_5_0=rulePropertyConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNodeRule());
                      	        }
                             		set(
                             			current, 
                             			"constraint",
                              		lv_constraint_5_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.PropertyConstraint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2());
                          
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


    // $ANTLR start "entryRuleContainerNode"
    // InternalAspectLang.g:1687:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // InternalAspectLang.g:1688:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // InternalAspectLang.g:1689:2: iv_ruleContainerNode= ruleContainerNode EOF
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
    // InternalAspectLang.g:1696:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1699:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAspectLang.g:1700:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAspectLang.g:1700:1: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:1701:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:1701:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:1702:3: otherlv_0= RULE_ID
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
    // InternalAspectLang.g:1724:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // InternalAspectLang.g:1725:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // InternalAspectLang.g:1726:2: iv_ruleWildcardNode= ruleWildcardNode EOF
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
    // InternalAspectLang.g:1733:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1736:28: ( ( () otherlv_1= '*' ) )
            // InternalAspectLang.g:1737:1: ( () otherlv_1= '*' )
            {
            // InternalAspectLang.g:1737:1: ( () otherlv_1= '*' )
            // InternalAspectLang.g:1737:2: () otherlv_1= '*'
            {
            // InternalAspectLang.g:1737:2: ()
            // InternalAspectLang.g:1738:2: 
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

            otherlv_1=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1758:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // InternalAspectLang.g:1759:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // InternalAspectLang.g:1760:2: iv_ruleSubPathNode= ruleSubPathNode EOF
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
    // InternalAspectLang.g:1767:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1770:28: ( ( () otherlv_1= '**' ) )
            // InternalAspectLang.g:1771:1: ( () otherlv_1= '**' )
            {
            // InternalAspectLang.g:1771:1: ( () otherlv_1= '**' )
            // InternalAspectLang.g:1771:2: () otherlv_1= '**'
            {
            // InternalAspectLang.g:1771:2: ()
            // InternalAspectLang.g:1772:2: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1792:1: entryRuleParentNode returns [EObject current=null] : iv_ruleParentNode= ruleParentNode EOF ;
    public final EObject entryRuleParentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentNode = null;


        try {
            // InternalAspectLang.g:1793:2: (iv_ruleParentNode= ruleParentNode EOF )
            // InternalAspectLang.g:1794:2: iv_ruleParentNode= ruleParentNode EOF
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
    // InternalAspectLang.g:1801:1: ruleParentNode returns [EObject current=null] : ( () otherlv_1= 'up' ) ;
    public final EObject ruleParentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1804:28: ( ( () otherlv_1= 'up' ) )
            // InternalAspectLang.g:1805:1: ( () otherlv_1= 'up' )
            {
            // InternalAspectLang.g:1805:1: ( () otherlv_1= 'up' )
            // InternalAspectLang.g:1805:2: () otherlv_1= 'up'
            {
            // InternalAspectLang.g:1805:2: ()
            // InternalAspectLang.g:1806:2: 
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

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParentNodeAccess().getUpKeyword_1());
                  
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


    // $ANTLR start "entryRulePropertyConstraint"
    // InternalAspectLang.g:1826:1: entryRulePropertyConstraint returns [EObject current=null] : iv_rulePropertyConstraint= rulePropertyConstraint EOF ;
    public final EObject entryRulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraint = null;


        try {
            // InternalAspectLang.g:1827:2: (iv_rulePropertyConstraint= rulePropertyConstraint EOF )
            // InternalAspectLang.g:1828:2: iv_rulePropertyConstraint= rulePropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyConstraint=rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyConstraint; 
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
    // $ANTLR end "entryRulePropertyConstraint"


    // $ANTLR start "rulePropertyConstraint"
    // InternalAspectLang.g:1835:1: rulePropertyConstraint returns [EObject current=null] : (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) ;
    public final EObject rulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyConstraintCompare_0 = null;

        Enumerator lv_logic_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1838:28: ( (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) )
            // InternalAspectLang.g:1839:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            {
            // InternalAspectLang.g:1839:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            // InternalAspectLang.g:1840:2: this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_33);
            this_PropertyConstraintCompare_0=rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PropertyConstraintCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:1851:1: ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=50 && LA33_0<=51)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:1851:2: () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    {
                    // InternalAspectLang.g:1851:2: ()
                    // InternalAspectLang.g:1852:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPropertyConstraintAccess().getPropertyConstraintExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:1860:2: ( (lv_logic_2_0= ruleLogicOperator ) )
                    // InternalAspectLang.g:1861:1: (lv_logic_2_0= ruleLogicOperator )
                    {
                    // InternalAspectLang.g:1861:1: (lv_logic_2_0= ruleLogicOperator )
                    // InternalAspectLang.g:1862:3: lv_logic_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    lv_logic_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintRule());
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

                    // InternalAspectLang.g:1878:2: ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    // InternalAspectLang.g:1879:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    {
                    // InternalAspectLang.g:1879:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    // InternalAspectLang.g:1880:3: lv_right_3_0= rulePropertyConstraintCompare
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintCompareParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=rulePropertyConstraintCompare();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.PropertyConstraintCompare");
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
    // $ANTLR end "rulePropertyConstraint"


    // $ANTLR start "entryRulePropertyConstraintCompare"
    // InternalAspectLang.g:1904:1: entryRulePropertyConstraintCompare returns [EObject current=null] : iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF ;
    public final EObject entryRulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraintCompare = null;


        try {
            // InternalAspectLang.g:1905:2: (iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:1906:2: iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyConstraintCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyConstraintCompare=rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyConstraintCompare; 
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
    // $ANTLR end "entryRulePropertyConstraintCompare"


    // $ANTLR start "rulePropertyConstraintCompare"
    // InternalAspectLang.g:1913:1: rulePropertyConstraintCompare returns [EObject current=null] : (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) ;
    public final EObject rulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ConstraintElement_0 = null;

        Enumerator lv_compare_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1916:28: ( (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) )
            // InternalAspectLang.g:1917:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            {
            // InternalAspectLang.g:1917:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            // InternalAspectLang.g:1918:2: this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyConstraintCompareAccess().getConstraintElementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_34);
            this_ConstraintElement_0=ruleConstraintElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConstraintElement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:1929:1: ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=52 && LA34_0<=58)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:1929:2: () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) )
                    {
                    // InternalAspectLang.g:1929:2: ()
                    // InternalAspectLang.g:1930:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintExpressionLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:1938:2: ( (lv_compare_2_0= ruleCompareOperator ) )
                    // InternalAspectLang.g:1939:1: (lv_compare_2_0= ruleCompareOperator )
                    {
                    // InternalAspectLang.g:1939:1: (lv_compare_2_0= ruleCompareOperator )
                    // InternalAspectLang.g:1940:3: lv_compare_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintCompareAccess().getCompareCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    lv_compare_2_0=ruleCompareOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintCompareRule());
                      	        }
                             		set(
                             			current, 
                             			"compare",
                              		lv_compare_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:1956:2: ( (lv_right_3_0= ruleConstraintElement ) )
                    // InternalAspectLang.g:1957:1: (lv_right_3_0= ruleConstraintElement )
                    {
                    // InternalAspectLang.g:1957:1: (lv_right_3_0= ruleConstraintElement )
                    // InternalAspectLang.g:1958:3: lv_right_3_0= ruleConstraintElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintCompareAccess().getRightConstraintElementParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleConstraintElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstraintCompareRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.ConstraintElement");
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
    // $ANTLR end "rulePropertyConstraintCompare"


    // $ANTLR start "entryRuleConstraintElement"
    // InternalAspectLang.g:1982:1: entryRuleConstraintElement returns [EObject current=null] : iv_ruleConstraintElement= ruleConstraintElement EOF ;
    public final EObject entryRuleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintElement = null;


        try {
            // InternalAspectLang.g:1983:2: (iv_ruleConstraintElement= ruleConstraintElement EOF )
            // InternalAspectLang.g:1984:2: iv_ruleConstraintElement= ruleConstraintElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintElement=ruleConstraintElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintElement; 
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
    // $ANTLR end "entryRuleConstraintElement"


    // $ANTLR start "ruleConstraintElement"
    // InternalAspectLang.g:1991:1: ruleConstraintElement returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) ;
    public final EObject ruleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_LocalQuery_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1994:28: ( (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) )
            // InternalAspectLang.g:1995:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            {
            // InternalAspectLang.g:1995:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID||LA35_0==32||(LA35_0>=35 && LA35_0<=38)) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:1996:2: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintElementAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2009:2: this_LocalQuery_1= ruleLocalQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstraintElementAccess().getLocalQueryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalQuery_1=ruleLocalQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalQuery_1; 
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
    // $ANTLR end "ruleConstraintElement"


    // $ANTLR start "entryRuleLocalQuery"
    // InternalAspectLang.g:2028:1: entryRuleLocalQuery returns [EObject current=null] : iv_ruleLocalQuery= ruleLocalQuery EOF ;
    public final EObject entryRuleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalQuery = null;


        try {
            // InternalAspectLang.g:2029:2: (iv_ruleLocalQuery= ruleLocalQuery EOF )
            // InternalAspectLang.g:2030:2: iv_ruleLocalQuery= ruleLocalQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalQuery=ruleLocalQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalQuery; 
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
    // $ANTLR end "entryRuleLocalQuery"


    // $ANTLR start "ruleLocalQuery"
    // InternalAspectLang.g:2037:1: ruleLocalQuery returns [EObject current=null] : ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) ;
    public final EObject ruleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_locationQuery_0_0 = null;

        EObject lv_property_1_0 = null;

        EObject lv_typeof_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2040:28: ( ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) )
            // InternalAspectLang.g:2041:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            {
            // InternalAspectLang.g:2041:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            // InternalAspectLang.g:2041:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
            {
            // InternalAspectLang.g:2041:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||LA36_0==32||(LA36_0>=35 && LA36_0<=36)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAspectLang.g:2042:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:2042:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:2043:3: lv_locationQuery_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalQueryAccess().getLocationQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_31);
                    lv_locationQuery_0_0=ruleLocationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"locationQuery",
                              		lv_locationQuery_0_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:2059:3: ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            else if ( (LA37_0==38) ) {
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
                    // InternalAspectLang.g:2059:4: ( (lv_property_1_0= ruleModelProperty ) )
                    {
                    // InternalAspectLang.g:2059:4: ( (lv_property_1_0= ruleModelProperty ) )
                    // InternalAspectLang.g:2060:1: (lv_property_1_0= ruleModelProperty )
                    {
                    // InternalAspectLang.g:2060:1: (lv_property_1_0= ruleModelProperty )
                    // InternalAspectLang.g:2061:3: lv_property_1_0= ruleModelProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalQueryAccess().getPropertyModelPropertyParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_property_1_0=ruleModelProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"property",
                              		lv_property_1_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.ModelProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2078:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    {
                    // InternalAspectLang.g:2078:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    // InternalAspectLang.g:2079:1: (lv_typeof_2_0= ruleTypeof )
                    {
                    // InternalAspectLang.g:2079:1: (lv_typeof_2_0= ruleTypeof )
                    // InternalAspectLang.g:2080:3: lv_typeof_2_0= ruleTypeof
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalQueryAccess().getTypeofTypeofParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_typeof_2_0=ruleTypeof();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"typeof",
                              		lv_typeof_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.Typeof");
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
    // $ANTLR end "ruleLocalQuery"


    // $ANTLR start "entryRuleModelProperty"
    // InternalAspectLang.g:2104:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // InternalAspectLang.g:2105:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // InternalAspectLang.g:2106:2: iv_ruleModelProperty= ruleModelProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelProperty=ruleModelProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelProperty; 
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
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // InternalAspectLang.g:2113:1: ruleModelProperty returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2116:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAspectLang.g:2117:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAspectLang.g:2117:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            // InternalAspectLang.g:2117:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0());
                  
            }
            // InternalAspectLang.g:2121:1: ( (otherlv_1= RULE_ID ) )
            // InternalAspectLang.g:2122:1: (otherlv_1= RULE_ID )
            {
            // InternalAspectLang.g:2122:1: (otherlv_1= RULE_ID )
            // InternalAspectLang.g:2123:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelPropertyRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getModelPropertyAccess().getReferenceFeatureCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleTypeof"
    // InternalAspectLang.g:2145:1: entryRuleTypeof returns [EObject current=null] : iv_ruleTypeof= ruleTypeof EOF ;
    public final EObject entryRuleTypeof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeof = null;


        try {
            // InternalAspectLang.g:2146:2: (iv_ruleTypeof= ruleTypeof EOF )
            // InternalAspectLang.g:2147:2: iv_ruleTypeof= ruleTypeof EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeofRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeof=ruleTypeof();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeof; 
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
    // $ANTLR end "entryRuleTypeof"


    // $ANTLR start "ruleTypeof"
    // InternalAspectLang.g:2154:1: ruleTypeof returns [EObject current=null] : (otherlv_0= 'istypeof' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2157:28: ( (otherlv_0= 'istypeof' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalAspectLang.g:2158:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalAspectLang.g:2158:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalAspectLang.g:2158:3: otherlv_0= 'istypeof' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeofAccess().getIstypeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalAspectLang.g:2166:1: ( (otherlv_2= RULE_ID ) )
            // InternalAspectLang.g:2167:1: (otherlv_2= RULE_ID )
            {
            // InternalAspectLang.g:2167:1: (otherlv_2= RULE_ID )
            // InternalAspectLang.g:2168:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeofRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTypeofAccess().getReferenceNamedTypeCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeofAccess().getRightParenthesisKeyword_3());
                  
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
    // $ANTLR end "ruleTypeof"


    // $ANTLR start "entryRuleLiteral"
    // InternalAspectLang.g:2194:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAspectLang.g:2195:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAspectLang.g:2196:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalAspectLang.g:2203:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2206:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) )
            // InternalAspectLang.g:2207:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
            {
            // InternalAspectLang.g:2207:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_INT:
                {
                alt38=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAspectLang.g:2208:2: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
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
                    // InternalAspectLang.g:2221:2: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
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
                    // InternalAspectLang.g:2234:2: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
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


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalAspectLang.g:2253:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalAspectLang.g:2254:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalAspectLang.g:2255:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
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
    // InternalAspectLang.g:2262:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2265:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAspectLang.g:2266:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAspectLang.g:2266:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAspectLang.g:2267:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAspectLang.g:2267:1: (lv_value_0_0= RULE_FLOAT )
            // InternalAspectLang.g:2268:3: lv_value_0_0= RULE_FLOAT
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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalAspectLang.g:2292:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalAspectLang.g:2293:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalAspectLang.g:2294:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalAspectLang.g:2301:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2304:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAspectLang.g:2305:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAspectLang.g:2305:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalAspectLang.g:2306:1: (lv_value_0_0= RULE_INT )
            {
            // InternalAspectLang.g:2306:1: (lv_value_0_0= RULE_INT )
            // InternalAspectLang.g:2307:3: lv_value_0_0= RULE_INT
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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAspectLang.g:2331:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAspectLang.g:2332:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAspectLang.g:2333:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalAspectLang.g:2340:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2343:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAspectLang.g:2344:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAspectLang.g:2344:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAspectLang.g:2345:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalAspectLang.g:2345:1: (lv_value_0_0= RULE_STRING )
            // InternalAspectLang.g:2346:3: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAspectLang.g:2370:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAspectLang.g:2371:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAspectLang.g:2372:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAspectLang.g:2379:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2382:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalAspectLang.g:2383:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalAspectLang.g:2383:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalAspectLang.g:2383:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalAspectLang.g:2390:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==31) ) {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==RULE_ID) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalAspectLang.g:2390:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalAspectLang.g:2390:2: ( ( '.' )=>kw= '.' )
            	    // InternalAspectLang.g:2390:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalAspectLang.g:2413:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAspectLang.g:2414:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:2415:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:2422:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2425:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalAspectLang.g:2426:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalAspectLang.g:2426:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalAspectLang.g:2427:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_36);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:2437:1: (kw= '.' kw= '*' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:2438:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleInsertionPoint"
    // InternalAspectLang.g:2457:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2459:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // InternalAspectLang.g:2460:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // InternalAspectLang.g:2460:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                alt41=1;
            }
            else if ( (LA41_0==40) ) {
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
                    // InternalAspectLang.g:2460:2: (enumLiteral_0= 'before' )
                    {
                    // InternalAspectLang.g:2460:2: (enumLiteral_0= 'before' )
                    // InternalAspectLang.g:2460:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2466:6: (enumLiteral_1= 'after' )
                    {
                    // InternalAspectLang.g:2466:6: (enumLiteral_1= 'after' )
                    // InternalAspectLang.g:2466:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleInternalFunction"
    // InternalAspectLang.g:2476:1: ruleInternalFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) ;
    public final Enumerator ruleInternalFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2478:28: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) )
            // InternalAspectLang.g:2479:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            {
            // InternalAspectLang.g:2479:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt42=1;
                }
                break;
            case 42:
                {
                alt42=2;
                }
                break;
            case 43:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:2479:2: (enumLiteral_0= 'time' )
                    {
                    // InternalAspectLang.g:2479:2: (enumLiteral_0= 'time' )
                    // InternalAspectLang.g:2479:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2485:6: (enumLiteral_1= 'traceId' )
                    {
                    // InternalAspectLang.g:2485:6: (enumLiteral_1= 'traceId' )
                    // InternalAspectLang.g:2485:8: enumLiteral_1= 'traceId'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2491:6: (enumLiteral_2= 'orderIndex' )
                    {
                    // InternalAspectLang.g:2491:6: (enumLiteral_2= 'orderIndex' )
                    // InternalAspectLang.g:2491:8: enumLiteral_2= 'orderIndex'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2501:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2503:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) )
            // InternalAspectLang.g:2504:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            {
            // InternalAspectLang.g:2504:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt43=1;
                }
                break;
            case 45:
                {
                alt43=2;
                }
                break;
            case 46:
                {
                alt43=3;
                }
                break;
            case 47:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalAspectLang.g:2504:2: (enumLiteral_0= 'name' )
                    {
                    // InternalAspectLang.g:2504:2: (enumLiteral_0= 'name' )
                    // InternalAspectLang.g:2504:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2510:6: (enumLiteral_1= 'signature' )
                    {
                    // InternalAspectLang.g:2510:6: (enumLiteral_1= 'signature' )
                    // InternalAspectLang.g:2510:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2516:6: (enumLiteral_2= 'classname' )
                    {
                    // InternalAspectLang.g:2516:6: (enumLiteral_2= 'classname' )
                    // InternalAspectLang.g:2516:8: enumLiteral_2= 'classname'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2522:6: (enumLiteral_3= 'return-type' )
                    {
                    // InternalAspectLang.g:2522:6: (enumLiteral_3= 'return-type' )
                    // InternalAspectLang.g:2522:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:2532:1: ruleQueryModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) ;
    public final Enumerator ruleQueryModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2534:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) )
            // InternalAspectLang.g:2535:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            {
            // InternalAspectLang.g:2535:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            else if ( (LA44_0==49) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAspectLang.g:2535:2: (enumLiteral_0= 'include' )
                    {
                    // InternalAspectLang.g:2535:2: (enumLiteral_0= 'include' )
                    // InternalAspectLang.g:2535:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2541:6: (enumLiteral_1= 'exclude' )
                    {
                    // InternalAspectLang.g:2541:6: (enumLiteral_1= 'exclude' )
                    // InternalAspectLang.g:2541:8: enumLiteral_1= 'exclude'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2551:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2553:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalAspectLang.g:2554:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalAspectLang.g:2554:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            else if ( (LA45_0==51) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalAspectLang.g:2554:2: (enumLiteral_0= '&&' )
                    {
                    // InternalAspectLang.g:2554:2: (enumLiteral_0= '&&' )
                    // InternalAspectLang.g:2554:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2560:6: (enumLiteral_1= '||' )
                    {
                    // InternalAspectLang.g:2560:6: (enumLiteral_1= '||' )
                    // InternalAspectLang.g:2560:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleCompareOperator"
    // InternalAspectLang.g:2570:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
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
            // InternalAspectLang.g:2572:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // InternalAspectLang.g:2573:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // InternalAspectLang.g:2573:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt46=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt46=1;
                }
                break;
            case 53:
                {
                alt46=2;
                }
                break;
            case 54:
                {
                alt46=3;
                }
                break;
            case 55:
                {
                alt46=4;
                }
                break;
            case 56:
                {
                alt46=5;
                }
                break;
            case 57:
                {
                alt46=6;
                }
                break;
            case 58:
                {
                alt46=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalAspectLang.g:2573:2: (enumLiteral_0= '=' )
                    {
                    // InternalAspectLang.g:2573:2: (enumLiteral_0= '=' )
                    // InternalAspectLang.g:2573:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2579:6: (enumLiteral_1= '~' )
                    {
                    // InternalAspectLang.g:2579:6: (enumLiteral_1= '~' )
                    // InternalAspectLang.g:2579:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2585:6: (enumLiteral_2= '!=' )
                    {
                    // InternalAspectLang.g:2585:6: (enumLiteral_2= '!=' )
                    // InternalAspectLang.g:2585:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2591:6: (enumLiteral_3= '>' )
                    {
                    // InternalAspectLang.g:2591:6: (enumLiteral_3= '>' )
                    // InternalAspectLang.g:2591:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAspectLang.g:2597:6: (enumLiteral_4= '<' )
                    {
                    // InternalAspectLang.g:2597:6: (enumLiteral_4= '<' )
                    // InternalAspectLang.g:2597:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAspectLang.g:2603:6: (enumLiteral_5= '>=' )
                    {
                    // InternalAspectLang.g:2603:6: (enumLiteral_5= '>=' )
                    // InternalAspectLang.g:2603:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAspectLang.g:2609:6: (enumLiteral_6= '<=' )
                    {
                    // InternalAspectLang.g:2609:6: (enumLiteral_6= '<=' )
                    // InternalAspectLang.g:2609:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                          
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
    // $ANTLR end "ruleCompareOperator"

    // $ANTLR start synpred26_InternalAspectLang
    public final void synpred26_InternalAspectLang_fragment() throws RecognitionException {   
        Token otherlv_1=null;

        // InternalAspectLang.g:1398:1: ( (otherlv_1= RULE_ID ) )
        // InternalAspectLang.g:1398:1: (otherlv_1= RULE_ID )
        {
        // InternalAspectLang.g:1398:1: (otherlv_1= RULE_ID )
        // InternalAspectLang.g:1399:3: otherlv_1= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalAspectLang

    // $ANTLR start synpred31_InternalAspectLang
    public final void synpred31_InternalAspectLang_fragment() throws RecognitionException {   
        Token otherlv_1=null;

        // InternalAspectLang.g:1529:1: ( (otherlv_1= RULE_ID ) )
        // InternalAspectLang.g:1529:1: (otherlv_1= RULE_ID )
        {
        // InternalAspectLang.g:1529:1: (otherlv_1= RULE_ID )
        // InternalAspectLang.g:1530:3: otherlv_1= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalAspectLang

    // Delegated rules

    public final boolean synpred26_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalAspectLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000004842C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000048428002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000048420002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000E19042000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000E19040000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001900000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0003000080800002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001901000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000079000000F0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x07F0000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});

}
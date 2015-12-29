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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'$'", "'#'", "'['", "']'", "'pointcut'", "'class'", "'.'", "'operation'", "'@'", "'technology'", "'*'", "'**'", "'up'", "'istypeof'", "'[]'", "'before'", "'after'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'javaee'", "'servlet'", "'spring'", "'aspectj'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
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
                case 29:
                case 33:
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

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||(LA6_0>=25 && LA6_0<=26)||(LA6_0>=35 && LA6_0<=37)||(LA6_0>=42 && LA6_0<=44)) ) {
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

                    if ( (LA9_0==RULE_ID) ) {
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
                            	    otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
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

                    otherlv_6=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalAspectLang.g:596:1: ( (lv_collectors_8_0= ruleCollector ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=40 && LA11_0<=41)) ) {
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
            	    pushFollow(FOLLOW_18);
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
    // InternalAspectLang.g:635:1: ruleAdviceParameterDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAdviceParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:638:28: ( ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAspectLang.g:639:1: ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAspectLang.g:639:1: ( ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAspectLang.g:639:2: ( (lv_type_0_0= ruleTypeReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAspectLang.g:639:2: ( (lv_type_0_0= ruleTypeReference ) )
            // InternalAspectLang.g:640:1: (lv_type_0_0= ruleTypeReference )
            {
            // InternalAspectLang.g:640:1: (lv_type_0_0= ruleTypeReference )
            // InternalAspectLang.g:641:3: lv_type_0_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdviceParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:657:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAspectLang.g:658:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAspectLang.g:658:1: (lv_name_1_0= RULE_ID )
            // InternalAspectLang.g:659:3: lv_name_1_0= RULE_ID
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
    // InternalAspectLang.g:683:1: entryRuleCollector returns [EObject current=null] : iv_ruleCollector= ruleCollector EOF ;
    public final EObject entryRuleCollector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollector = null;


        try {
            // InternalAspectLang.g:684:2: (iv_ruleCollector= ruleCollector EOF )
            // InternalAspectLang.g:685:2: iv_ruleCollector= ruleCollector EOF
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
    // InternalAspectLang.g:692:1: ruleCollector returns [EObject current=null] : ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) ;
    public final EObject ruleCollector() throws RecognitionException {
        EObject current = null;

        Enumerator lv_insertionPoint_0_0 = null;

        EObject lv_events_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:695:28: ( ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ ) )
            // InternalAspectLang.g:696:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            {
            // InternalAspectLang.g:696:1: ( ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+ )
            // InternalAspectLang.g:696:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) ) ( (lv_events_1_0= ruleEvent ) )+
            {
            // InternalAspectLang.g:696:2: ( (lv_insertionPoint_0_0= ruleInsertionPoint ) )
            // InternalAspectLang.g:697:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            {
            // InternalAspectLang.g:697:1: (lv_insertionPoint_0_0= ruleInsertionPoint )
            // InternalAspectLang.g:698:3: lv_insertionPoint_0_0= ruleInsertionPoint
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

            // InternalAspectLang.g:714:2: ( (lv_events_1_0= ruleEvent ) )+
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
            	    // InternalAspectLang.g:715:1: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalAspectLang.g:715:1: (lv_events_1_0= ruleEvent )
            	    // InternalAspectLang.g:716:3: lv_events_1_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectorAccess().getEventsEventParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
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
    // InternalAspectLang.g:740:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalAspectLang.g:741:2: (iv_ruleEvent= ruleEvent EOF )
            // InternalAspectLang.g:742:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalAspectLang.g:749:1: ruleEvent returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_initializations_2_0 = null;

        EObject lv_initializations_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:752:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' ) )
            // InternalAspectLang.g:753:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            {
            // InternalAspectLang.g:753:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')' )
            // InternalAspectLang.g:753:2: ( ( ruleQualifiedName ) ) otherlv_1= '(' ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )? otherlv_5= ')'
            {
            // InternalAspectLang.g:753:2: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:754:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:754:1: ( ruleQualifiedName )
            // InternalAspectLang.g:755:3: ruleQualifiedName
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
            pushFollow(FOLLOW_20);
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
            // InternalAspectLang.g:775:1: ( ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=25 && LA14_0<=26)||(LA14_0>=35 && LA14_0<=37)||(LA14_0>=42 && LA14_0<=44)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:775:2: ( (lv_initializations_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    {
                    // InternalAspectLang.g:775:2: ( (lv_initializations_2_0= ruleValue ) )
                    // InternalAspectLang.g:776:1: (lv_initializations_2_0= ruleValue )
                    {
                    // InternalAspectLang.g:776:1: (lv_initializations_2_0= ruleValue )
                    // InternalAspectLang.g:777:3: lv_initializations_2_0= ruleValue
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

                    // InternalAspectLang.g:793:2: (otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==19) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalAspectLang.g:793:4: otherlv_3= ',' ( (lv_initializations_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalAspectLang.g:797:1: ( (lv_initializations_4_0= ruleValue ) )
                    	    // InternalAspectLang.g:798:1: (lv_initializations_4_0= ruleValue )
                    	    {
                    	    // InternalAspectLang.g:798:1: (lv_initializations_4_0= ruleValue )
                    	    // InternalAspectLang.g:799:3: lv_initializations_4_0= ruleValue
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
    // InternalAspectLang.g:827:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalAspectLang.g:828:2: (iv_ruleValue= ruleValue EOF )
            // InternalAspectLang.g:829:2: iv_ruleValue= ruleValue EOF
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
    // InternalAspectLang.g:836:1: ruleValue returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue | this_InternalFunctionProperty_2= ruleInternalFunctionProperty | this_AdviceParameter_3= ruleAdviceParameter ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_ReferenceValue_1 = null;

        EObject this_InternalFunctionProperty_2 = null;

        EObject this_AdviceParameter_3 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:839:28: ( (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue | this_InternalFunctionProperty_2= ruleInternalFunctionProperty | this_AdviceParameter_3= ruleAdviceParameter ) )
            // InternalAspectLang.g:840:1: (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue | this_InternalFunctionProperty_2= ruleInternalFunctionProperty | this_AdviceParameter_3= ruleAdviceParameter )
            {
            // InternalAspectLang.g:840:1: (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue | this_InternalFunctionProperty_2= ruleInternalFunctionProperty | this_AdviceParameter_3= ruleAdviceParameter )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalAspectLang.g:841:2: this_Literal_0= ruleLiteral
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
                    // InternalAspectLang.g:854:2: this_ReferenceValue_1= ruleReferenceValue
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
                case 3 :
                    // InternalAspectLang.g:867:2: this_InternalFunctionProperty_2= ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                          
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
                case 4 :
                    // InternalAspectLang.g:880:2: this_AdviceParameter_3= ruleAdviceParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getAdviceParameterParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_AdviceParameter_3=ruleAdviceParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AdviceParameter_3; 
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
    // InternalAspectLang.g:899:1: entryRuleReferenceValue returns [EObject current=null] : iv_ruleReferenceValue= ruleReferenceValue EOF ;
    public final EObject entryRuleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceValue = null;


        try {
            // InternalAspectLang.g:900:2: (iv_ruleReferenceValue= ruleReferenceValue EOF )
            // InternalAspectLang.g:901:2: iv_ruleReferenceValue= ruleReferenceValue EOF
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
    // InternalAspectLang.g:908:1: ruleReferenceValue returns [EObject current=null] : ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) ) ;
    public final EObject ruleReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject lv_query_0_0 = null;

        EObject lv_property_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:911:28: ( ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) ) )
            // InternalAspectLang.g:912:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) )
            {
            // InternalAspectLang.g:912:1: ( ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) ) )
            // InternalAspectLang.g:912:2: ( (lv_query_0_0= ruleLocationQuery ) )? ( (lv_property_1_0= ruleProperty ) )
            {
            // InternalAspectLang.g:912:2: ( (lv_query_0_0= ruleLocationQuery ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=35 && LA16_0<=37)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:913:1: (lv_query_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:913:1: (lv_query_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:914:3: lv_query_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalAspectLang.g:930:3: ( (lv_property_1_0= ruleProperty ) )
            // InternalAspectLang.g:931:1: (lv_property_1_0= ruleProperty )
            {
            // InternalAspectLang.g:931:1: (lv_property_1_0= ruleProperty )
            // InternalAspectLang.g:932:3: lv_property_1_0= ruleProperty
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
    // InternalAspectLang.g:956:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAspectLang.g:957:2: (iv_ruleProperty= ruleProperty EOF )
            // InternalAspectLang.g:958:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAspectLang.g:965:1: ruleProperty returns [EObject current=null] : (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_RuntimeProperty_0 = null;

        EObject this_ReflectionProperty_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:968:28: ( (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty ) )
            // InternalAspectLang.g:969:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            {
            // InternalAspectLang.g:969:1: (this_RuntimeProperty_0= ruleRuntimeProperty | this_ReflectionProperty_1= ruleReflectionProperty )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
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
                    // InternalAspectLang.g:970:2: this_RuntimeProperty_0= ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getRuntimePropertyParserRuleCall_0()); 
                          
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
                    // InternalAspectLang.g:983:2: this_ReflectionProperty_1= ruleReflectionProperty
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
    // InternalAspectLang.g:1002:1: entryRuleInternalFunctionProperty returns [EObject current=null] : iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF ;
    public final EObject entryRuleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternalFunctionProperty = null;


        try {
            // InternalAspectLang.g:1003:2: (iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF )
            // InternalAspectLang.g:1004:2: iv_ruleInternalFunctionProperty= ruleInternalFunctionProperty EOF
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
    // InternalAspectLang.g:1011:1: ruleInternalFunctionProperty returns [EObject current=null] : ( (lv_function_0_0= ruleInternalFunction ) ) ;
    public final EObject ruleInternalFunctionProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_function_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1014:28: ( ( (lv_function_0_0= ruleInternalFunction ) ) )
            // InternalAspectLang.g:1015:1: ( (lv_function_0_0= ruleInternalFunction ) )
            {
            // InternalAspectLang.g:1015:1: ( (lv_function_0_0= ruleInternalFunction ) )
            // InternalAspectLang.g:1016:1: (lv_function_0_0= ruleInternalFunction )
            {
            // InternalAspectLang.g:1016:1: (lv_function_0_0= ruleInternalFunction )
            // InternalAspectLang.g:1017:3: lv_function_0_0= ruleInternalFunction
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
    // InternalAspectLang.g:1041:1: entryRuleReflectionProperty returns [EObject current=null] : iv_ruleReflectionProperty= ruleReflectionProperty EOF ;
    public final EObject entryRuleReflectionProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflectionProperty = null;


        try {
            // InternalAspectLang.g:1042:2: (iv_ruleReflectionProperty= ruleReflectionProperty EOF )
            // InternalAspectLang.g:1043:2: iv_ruleReflectionProperty= ruleReflectionProperty EOF
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
    // InternalAspectLang.g:1050:1: ruleReflectionProperty returns [EObject current=null] : (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) ;
    public final EObject ruleReflectionProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1053:28: ( (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) ) )
            // InternalAspectLang.g:1054:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            {
            // InternalAspectLang.g:1054:1: (otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) ) )
            // InternalAspectLang.g:1054:3: otherlv_0= '$' ( (lv_function_1_0= ruleReflectionFunction ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0());
                  
            }
            // InternalAspectLang.g:1058:1: ( (lv_function_1_0= ruleReflectionFunction ) )
            // InternalAspectLang.g:1059:1: (lv_function_1_0= ruleReflectionFunction )
            {
            // InternalAspectLang.g:1059:1: (lv_function_1_0= ruleReflectionFunction )
            // InternalAspectLang.g:1060:3: lv_function_1_0= ruleReflectionFunction
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


    // $ANTLR start "entryRuleRuntimeProperty"
    // InternalAspectLang.g:1084:1: entryRuleRuntimeProperty returns [EObject current=null] : iv_ruleRuntimeProperty= ruleRuntimeProperty EOF ;
    public final EObject entryRuleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuntimeProperty = null;


        try {
            // InternalAspectLang.g:1085:2: (iv_ruleRuntimeProperty= ruleRuntimeProperty EOF )
            // InternalAspectLang.g:1086:2: iv_ruleRuntimeProperty= ruleRuntimeProperty EOF
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
    // InternalAspectLang.g:1093:1: ruleRuntimeProperty returns [EObject current=null] : ( () otherlv_1= '#' ) ;
    public final EObject ruleRuntimeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1096:28: ( ( () otherlv_1= '#' ) )
            // InternalAspectLang.g:1097:1: ( () otherlv_1= '#' )
            {
            // InternalAspectLang.g:1097:1: ( () otherlv_1= '#' )
            // InternalAspectLang.g:1097:2: () otherlv_1= '#'
            {
            // InternalAspectLang.g:1097:2: ()
            // InternalAspectLang.g:1098:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuntimePropertyAccess().getRuntimePropertyAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_1());
                  
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


    // $ANTLR start "entryRuleAdviceParameter"
    // InternalAspectLang.g:1118:1: entryRuleAdviceParameter returns [EObject current=null] : iv_ruleAdviceParameter= ruleAdviceParameter EOF ;
    public final EObject entryRuleAdviceParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdviceParameter = null;


        try {
            // InternalAspectLang.g:1119:2: (iv_ruleAdviceParameter= ruleAdviceParameter EOF )
            // InternalAspectLang.g:1120:2: iv_ruleAdviceParameter= ruleAdviceParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdviceParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdviceParameter=ruleAdviceParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdviceParameter; 
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
    // $ANTLR end "entryRuleAdviceParameter"


    // $ANTLR start "ruleAdviceParameter"
    // InternalAspectLang.g:1127:1: ruleAdviceParameter returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleAdviceParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_collection_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1130:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )? ) )
            // InternalAspectLang.g:1131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )? )
            {
            // InternalAspectLang.g:1131:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )? )
            // InternalAspectLang.g:1131:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )?
            {
            // InternalAspectLang.g:1131:2: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:1132:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:1132:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:1133:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAdviceParameterRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalAspectLang.g:1147:2: (otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAspectLang.g:1147:4: otherlv_1= '[' ( (lv_collection_2_0= ruleValue ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAdviceParameterAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:1151:1: ( (lv_collection_2_0= ruleValue ) )
                    // InternalAspectLang.g:1152:1: (lv_collection_2_0= ruleValue )
                    {
                    // InternalAspectLang.g:1152:1: (lv_collection_2_0= ruleValue )
                    // InternalAspectLang.g:1153:3: lv_collection_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdviceParameterAccess().getCollectionValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_24);
                    lv_collection_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdviceParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"collection",
                              		lv_collection_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAdviceParameterAccess().getRightSquareBracketKeyword_1_2());
                          
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
    // $ANTLR end "ruleAdviceParameter"


    // $ANTLR start "entryRulePointcut"
    // InternalAspectLang.g:1181:1: entryRulePointcut returns [EObject current=null] : iv_rulePointcut= rulePointcut EOF ;
    public final EObject entryRulePointcut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointcut = null;


        try {
            // InternalAspectLang.g:1182:2: (iv_rulePointcut= rulePointcut EOF )
            // InternalAspectLang.g:1183:2: iv_rulePointcut= rulePointcut EOF
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
    // InternalAspectLang.g:1190:1: rulePointcut returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_location_6_0= ruleLocationQuery ) ) (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )? ) ;
    public final EObject rulePointcut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_location_6_0 = null;

        EObject lv_operation_8_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1193:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_location_6_0= ruleLocationQuery ) ) (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )? ) )
            // InternalAspectLang.g:1194:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_location_6_0= ruleLocationQuery ) ) (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )? )
            {
            // InternalAspectLang.g:1194:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_location_6_0= ruleLocationQuery ) ) (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )? )
            // InternalAspectLang.g:1194:2: ( (lv_annotation_0_0= ruleAnnotation ) )? otherlv_1= 'pointcut' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'class' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_location_6_0= ruleLocationQuery ) ) (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )?
            {
            // InternalAspectLang.g:1194:2: ( (lv_annotation_0_0= ruleAnnotation ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAspectLang.g:1195:1: (lv_annotation_0_0= ruleAnnotation )
                    {
                    // InternalAspectLang.g:1195:1: (lv_annotation_0_0= ruleAnnotation )
                    // InternalAspectLang.g:1196:3: lv_annotation_0_0= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_25);
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

            otherlv_1=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPointcutAccess().getPointcutKeyword_1());
                  
            }
            // InternalAspectLang.g:1216:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAspectLang.g:1217:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAspectLang.g:1217:1: (lv_name_2_0= RULE_ID )
            // InternalAspectLang.g:1218:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPointcutAccess().getClassKeyword_3());
                  
            }
            // InternalAspectLang.g:1238:1: ( (otherlv_4= RULE_ID ) )
            // InternalAspectLang.g:1239:1: (otherlv_4= RULE_ID )
            {
            // InternalAspectLang.g:1239:1: (otherlv_4= RULE_ID )
            // InternalAspectLang.g:1240:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPointcutRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getPointcutAccess().getModelApplicationModelCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPointcutAccess().getFullStopKeyword_5());
                  
            }
            // InternalAspectLang.g:1258:1: ( (lv_location_6_0= ruleLocationQuery ) )
            // InternalAspectLang.g:1259:1: (lv_location_6_0= ruleLocationQuery )
            {
            // InternalAspectLang.g:1259:1: (lv_location_6_0= ruleLocationQuery )
            // InternalAspectLang.g:1260:3: lv_location_6_0= ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_location_6_0=ruleLocationQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPointcutRule());
              	        }
                     		set(
                     			current, 
                     			"location",
                      		lv_location_6_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.LocationQuery");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:1276:2: (otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAspectLang.g:1276:4: otherlv_7= 'operation' ( (lv_operation_8_0= ruleOperationQuery ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPointcutAccess().getOperationKeyword_7_0());
                          
                    }
                    // InternalAspectLang.g:1280:1: ( (lv_operation_8_0= ruleOperationQuery ) )
                    // InternalAspectLang.g:1281:1: (lv_operation_8_0= ruleOperationQuery )
                    {
                    // InternalAspectLang.g:1281:1: (lv_operation_8_0= ruleOperationQuery )
                    // InternalAspectLang.g:1282:3: lv_operation_8_0= ruleOperationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_operation_8_0=ruleOperationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPointcutRule());
                      	        }
                             		set(
                             			current, 
                             			"operation",
                              		lv_operation_8_0, 
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
    // InternalAspectLang.g:1306:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAspectLang.g:1307:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAspectLang.g:1308:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalAspectLang.g:1315:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= 'technology' ) ) ( (lv_technologies_2_0= ruleTechnology ) ) (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Enumerator lv_technologies_2_0 = null;

        Enumerator lv_technologies_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1318:28: ( (otherlv_0= '@' ( (lv_name_1_0= 'technology' ) ) ( (lv_technologies_2_0= ruleTechnology ) ) (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) ) ) )
            // InternalAspectLang.g:1319:1: (otherlv_0= '@' ( (lv_name_1_0= 'technology' ) ) ( (lv_technologies_2_0= ruleTechnology ) ) (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) ) )
            {
            // InternalAspectLang.g:1319:1: (otherlv_0= '@' ( (lv_name_1_0= 'technology' ) ) ( (lv_technologies_2_0= ruleTechnology ) ) (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) ) )
            // InternalAspectLang.g:1319:3: otherlv_0= '@' ( (lv_name_1_0= 'technology' ) ) ( (lv_technologies_2_0= ruleTechnology ) ) (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // InternalAspectLang.g:1323:1: ( (lv_name_1_0= 'technology' ) )
            // InternalAspectLang.g:1324:1: (lv_name_1_0= 'technology' )
            {
            // InternalAspectLang.g:1324:1: (lv_name_1_0= 'technology' )
            // InternalAspectLang.g:1325:3: lv_name_1_0= 'technology'
            {
            lv_name_1_0=(Token)match(input,34,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_1_0, grammarAccess.getAnnotationAccess().getNameTechnologyKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAnnotationRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_1_0, "technology");
              	    
            }

            }


            }

            // InternalAspectLang.g:1338:2: ( (lv_technologies_2_0= ruleTechnology ) )
            // InternalAspectLang.g:1339:1: (lv_technologies_2_0= ruleTechnology )
            {
            // InternalAspectLang.g:1339:1: (lv_technologies_2_0= ruleTechnology )
            // InternalAspectLang.g:1340:3: lv_technologies_2_0= ruleTechnology
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_33);
            lv_technologies_2_0=ruleTechnology();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"technologies",
                      		lv_technologies_2_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.Technology");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:1356:2: (otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) ) )
            // InternalAspectLang.g:1356:4: otherlv_3= ',' ( (lv_technologies_4_0= ruleTechnology ) )
            {
            otherlv_3=(Token)match(input,19,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAnnotationAccess().getCommaKeyword_3_0());
                  
            }
            // InternalAspectLang.g:1360:1: ( (lv_technologies_4_0= ruleTechnology ) )
            // InternalAspectLang.g:1361:1: (lv_technologies_4_0= ruleTechnology )
            {
            // InternalAspectLang.g:1361:1: (lv_technologies_4_0= ruleTechnology )
            // InternalAspectLang.g:1362:3: lv_technologies_4_0= ruleTechnology
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_technologies_4_0=ruleTechnology();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		add(
                     			current, 
                     			"technologies",
                      		lv_technologies_4_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.Technology");
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleLocationQuery"
    // InternalAspectLang.g:1386:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // InternalAspectLang.g:1387:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // InternalAspectLang.g:1388:2: iv_ruleLocationQuery= ruleLocationQuery EOF
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
    // InternalAspectLang.g:1395:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_node_0_0 = null;

        EObject lv_specialization_2_0 = null;

        EObject lv_composition_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1398:28: ( ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? ) )
            // InternalAspectLang.g:1399:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            {
            // InternalAspectLang.g:1399:1: ( ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )? )
            // InternalAspectLang.g:1399:2: ( (lv_node_0_0= ruleNode ) ) ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            {
            // InternalAspectLang.g:1399:2: ( (lv_node_0_0= ruleNode ) )
            // InternalAspectLang.g:1400:1: (lv_node_0_0= ruleNode )
            {
            // InternalAspectLang.g:1400:1: (lv_node_0_0= ruleNode )
            // InternalAspectLang.g:1401:3: lv_node_0_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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

            // InternalAspectLang.g:1417:2: ( (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) ) | ( (lv_composition_3_0= ruleCompositionQuery ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            else if ( (LA21_0==23||(LA21_0>=53 && LA21_0<=54)) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:1417:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    {
                    // InternalAspectLang.g:1417:3: (otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) ) )
                    // InternalAspectLang.g:1417:5: otherlv_1= '.' ( (lv_specialization_2_0= ruleLocationQuery ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0());
                          
                    }
                    // InternalAspectLang.g:1421:1: ( (lv_specialization_2_0= ruleLocationQuery ) )
                    // InternalAspectLang.g:1422:1: (lv_specialization_2_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:1422:1: (lv_specialization_2_0= ruleLocationQuery )
                    // InternalAspectLang.g:1423:3: lv_specialization_2_0= ruleLocationQuery
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
                    // InternalAspectLang.g:1440:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    {
                    // InternalAspectLang.g:1440:6: ( (lv_composition_3_0= ruleCompositionQuery ) )
                    // InternalAspectLang.g:1441:1: (lv_composition_3_0= ruleCompositionQuery )
                    {
                    // InternalAspectLang.g:1441:1: (lv_composition_3_0= ruleCompositionQuery )
                    // InternalAspectLang.g:1442:3: lv_composition_3_0= ruleCompositionQuery
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
    // InternalAspectLang.g:1466:1: entryRuleCompositionQuery returns [EObject current=null] : iv_ruleCompositionQuery= ruleCompositionQuery EOF ;
    public final EObject entryRuleCompositionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionQuery = null;


        try {
            // InternalAspectLang.g:1467:2: (iv_ruleCompositionQuery= ruleCompositionQuery EOF )
            // InternalAspectLang.g:1468:2: iv_ruleCompositionQuery= ruleCompositionQuery EOF
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
    // InternalAspectLang.g:1475:1: ruleCompositionQuery returns [EObject current=null] : ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) ;
    public final EObject ruleCompositionQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_subQueries_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1478:28: ( ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' ) )
            // InternalAspectLang.g:1479:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            {
            // InternalAspectLang.g:1479:1: ( () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}' )
            // InternalAspectLang.g:1479:2: () ( (lv_modifier_1_0= ruleQueryModifier ) )? otherlv_2= '{' ( (lv_subQueries_3_0= ruleLocationQuery ) )* otherlv_4= '}'
            {
            // InternalAspectLang.g:1479:2: ()
            // InternalAspectLang.g:1480:2: 
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

            // InternalAspectLang.g:1488:2: ( (lv_modifier_1_0= ruleQueryModifier ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=53 && LA22_0<=54)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:1489:1: (lv_modifier_1_0= ruleQueryModifier )
                    {
                    // InternalAspectLang.g:1489:1: (lv_modifier_1_0= ruleQueryModifier )
                    // InternalAspectLang.g:1490:3: lv_modifier_1_0= ruleQueryModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalAspectLang.g:1510:1: ( (lv_subQueries_3_0= ruleLocationQuery ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=35 && LA23_0<=37)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAspectLang.g:1511:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    {
            	    // InternalAspectLang.g:1511:1: (lv_subQueries_3_0= ruleLocationQuery )
            	    // InternalAspectLang.g:1512:3: lv_subQueries_3_0= ruleLocationQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop23;
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
    // InternalAspectLang.g:1540:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalAspectLang.g:1541:2: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalAspectLang.g:1542:2: iv_ruleOperationQuery= ruleOperationQuery EOF
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
    // InternalAspectLang.g:1549:1: ruleOperationQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) ;
    public final EObject ruleOperationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_returnType_2_0 = null;

        EObject lv_parameterQueries_5_0 = null;

        EObject lv_parameterQueries_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1552:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) )
            // InternalAspectLang.g:1553:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            {
            // InternalAspectLang.g:1553:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            // InternalAspectLang.g:1553:2: () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            {
            // InternalAspectLang.g:1553:2: ()
            // InternalAspectLang.g:1554:2: 
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

            // InternalAspectLang.g:1562:2: ( (otherlv_1= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID||LA24_1==35) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalAspectLang.g:1563:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1563:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1564:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationQueryRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1578:3: ( (lv_returnType_2_0= ruleTypeReference ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==31) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalAspectLang.g:1579:1: (lv_returnType_2_0= ruleTypeReference )
                    {
                    // InternalAspectLang.g:1579:1: (lv_returnType_2_0= ruleTypeReference )
                    // InternalAspectLang.g:1580:3: lv_returnType_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationQueryAccess().getReturnTypeTypeReferenceParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_30);
                    lv_returnType_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"returnType",
                              		lv_returnType_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1596:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==35) ) {
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
                    // InternalAspectLang.g:1596:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalAspectLang.g:1596:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    // InternalAspectLang.g:1596:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    {
                    // InternalAspectLang.g:1596:5: ( (otherlv_3= RULE_ID ) )
                    // InternalAspectLang.g:1597:1: (otherlv_3= RULE_ID )
                    {
                    // InternalAspectLang.g:1597:1: (otherlv_3= RULE_ID )
                    // InternalAspectLang.g:1598:3: otherlv_3= RULE_ID
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

                    // InternalAspectLang.g:1612:2: (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==20) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAspectLang.g:1612:4: otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0());
                                  
                            }
                            // InternalAspectLang.g:1616:1: ( (lv_parameterQueries_5_0= ruleParameterQuery ) )
                            // InternalAspectLang.g:1617:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            {
                            // InternalAspectLang.g:1617:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            // InternalAspectLang.g:1618:3: lv_parameterQueries_5_0= ruleParameterQuery
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

                            // InternalAspectLang.g:1634:2: (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==19) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalAspectLang.g:1634:4: otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    {
                            	    otherlv_6=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:1638:1: ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    // InternalAspectLang.g:1639:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    {
                            	    // InternalAspectLang.g:1639:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    // InternalAspectLang.g:1640:3: lv_parameterQueries_7_0= ruleParameterQuery
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
                            	    break loop26;
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
                    // InternalAspectLang.g:1661:7: otherlv_9= '*'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1673:1: entryRuleParameterQuery returns [EObject current=null] : iv_ruleParameterQuery= ruleParameterQuery EOF ;
    public final EObject entryRuleParameterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterQuery = null;


        try {
            // InternalAspectLang.g:1674:2: (iv_ruleParameterQuery= ruleParameterQuery EOF )
            // InternalAspectLang.g:1675:2: iv_ruleParameterQuery= ruleParameterQuery EOF
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
    // InternalAspectLang.g:1682:1: ruleParameterQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) ;
    public final EObject ruleParameterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1685:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) )
            // InternalAspectLang.g:1686:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            {
            // InternalAspectLang.g:1686:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            // InternalAspectLang.g:1686:2: () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )?
            {
            // InternalAspectLang.g:1686:2: ()
            // InternalAspectLang.g:1687:2: 
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

            // InternalAspectLang.g:1695:2: ( (otherlv_1= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_ID||LA29_1==35) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:1696:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1696:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1697:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getParameterQueryRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1711:3: ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==35) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAspectLang.g:1711:4: ( (lv_type_2_0= ruleTypeReference ) )
                    {
                    // InternalAspectLang.g:1711:4: ( (lv_type_2_0= ruleTypeReference ) )
                    // InternalAspectLang.g:1712:1: (lv_type_2_0= ruleTypeReference )
                    {
                    // InternalAspectLang.g:1712:1: (lv_type_2_0= ruleTypeReference )
                    // InternalAspectLang.g:1713:3: lv_type_2_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterQueryAccess().getTypeTypeReferenceParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_19);
                    lv_type_2_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"de.cau.cs.se.instrumentation.al.AspectLang.TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1730:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterQueryAccess().getAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // InternalAspectLang.g:1734:2: ( (otherlv_4= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:1735:1: (otherlv_4= RULE_ID )
                    {
                    // InternalAspectLang.g:1735:1: (otherlv_4= RULE_ID )
                    // InternalAspectLang.g:1736:3: otherlv_4= RULE_ID
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
    // InternalAspectLang.g:1758:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAspectLang.g:1759:2: (iv_ruleNode= ruleNode EOF )
            // InternalAspectLang.g:1760:2: iv_ruleNode= ruleNode EOF
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
    // InternalAspectLang.g:1767:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) ;
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
            // InternalAspectLang.g:1770:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) )
            // InternalAspectLang.g:1771:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            {
            // InternalAspectLang.g:1771:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            // InternalAspectLang.g:1771:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            {
            // InternalAspectLang.g:1771:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt32=1;
                }
                break;
            case 35:
                {
                alt32=2;
                }
                break;
            case 37:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
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
                    // InternalAspectLang.g:1772:2: this_SubPathNode_0= ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_23);
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
                    // InternalAspectLang.g:1785:2: this_WildcardNode_1= ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_23);
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
                    // InternalAspectLang.g:1798:2: this_ParentNode_2= ruleParentNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_23);
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
                    // InternalAspectLang.g:1811:2: this_ContainerNode_3= ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_23);
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

            // InternalAspectLang.g:1822:2: (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:1822:4: otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:1826:1: ( (lv_constraint_5_0= rulePropertyConstraint ) )
                    // InternalAspectLang.g:1827:1: (lv_constraint_5_0= rulePropertyConstraint )
                    {
                    // InternalAspectLang.g:1827:1: (lv_constraint_5_0= rulePropertyConstraint )
                    // InternalAspectLang.g:1828:3: lv_constraint_5_0= rulePropertyConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodeAccess().getConstraintPropertyConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_24);
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

                    otherlv_6=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1856:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // InternalAspectLang.g:1857:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // InternalAspectLang.g:1858:2: iv_ruleContainerNode= ruleContainerNode EOF
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
    // InternalAspectLang.g:1865:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1868:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAspectLang.g:1869:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAspectLang.g:1869:1: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:1870:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:1870:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:1871:3: otherlv_0= RULE_ID
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

              		newLeafNode(otherlv_0, grammarAccess.getContainerNodeAccess().getContainerFeatureCrossReference_0()); 
              	
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
    // InternalAspectLang.g:1893:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // InternalAspectLang.g:1894:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // InternalAspectLang.g:1895:2: iv_ruleWildcardNode= ruleWildcardNode EOF
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
    // InternalAspectLang.g:1902:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1905:28: ( ( () otherlv_1= '*' ) )
            // InternalAspectLang.g:1906:1: ( () otherlv_1= '*' )
            {
            // InternalAspectLang.g:1906:1: ( () otherlv_1= '*' )
            // InternalAspectLang.g:1906:2: () otherlv_1= '*'
            {
            // InternalAspectLang.g:1906:2: ()
            // InternalAspectLang.g:1907:2: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:1927:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // InternalAspectLang.g:1928:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // InternalAspectLang.g:1929:2: iv_ruleSubPathNode= ruleSubPathNode EOF
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
    // InternalAspectLang.g:1936:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1939:28: ( ( () otherlv_1= '**' ) )
            // InternalAspectLang.g:1940:1: ( () otherlv_1= '**' )
            {
            // InternalAspectLang.g:1940:1: ( () otherlv_1= '**' )
            // InternalAspectLang.g:1940:2: () otherlv_1= '**'
            {
            // InternalAspectLang.g:1940:2: ()
            // InternalAspectLang.g:1941:2: 
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
    // InternalAspectLang.g:1961:1: entryRuleParentNode returns [EObject current=null] : iv_ruleParentNode= ruleParentNode EOF ;
    public final EObject entryRuleParentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentNode = null;


        try {
            // InternalAspectLang.g:1962:2: (iv_ruleParentNode= ruleParentNode EOF )
            // InternalAspectLang.g:1963:2: iv_ruleParentNode= ruleParentNode EOF
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
    // InternalAspectLang.g:1970:1: ruleParentNode returns [EObject current=null] : ( () otherlv_1= 'up' ) ;
    public final EObject ruleParentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1973:28: ( ( () otherlv_1= 'up' ) )
            // InternalAspectLang.g:1974:1: ( () otherlv_1= 'up' )
            {
            // InternalAspectLang.g:1974:1: ( () otherlv_1= 'up' )
            // InternalAspectLang.g:1974:2: () otherlv_1= 'up'
            {
            // InternalAspectLang.g:1974:2: ()
            // InternalAspectLang.g:1975:2: 
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
    // InternalAspectLang.g:1995:1: entryRulePropertyConstraint returns [EObject current=null] : iv_rulePropertyConstraint= rulePropertyConstraint EOF ;
    public final EObject entryRulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraint = null;


        try {
            // InternalAspectLang.g:1996:2: (iv_rulePropertyConstraint= rulePropertyConstraint EOF )
            // InternalAspectLang.g:1997:2: iv_rulePropertyConstraint= rulePropertyConstraint EOF
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
    // InternalAspectLang.g:2004:1: rulePropertyConstraint returns [EObject current=null] : (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) ;
    public final EObject rulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyConstraintCompare_0 = null;

        Enumerator lv_logic_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2007:28: ( (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) )
            // InternalAspectLang.g:2008:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            {
            // InternalAspectLang.g:2008:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            // InternalAspectLang.g:2009:2: this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintCompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_37);
            this_PropertyConstraintCompare_0=rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PropertyConstraintCompare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:2020:1: ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=55 && LA34_0<=56)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:2020:2: () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    {
                    // InternalAspectLang.g:2020:2: ()
                    // InternalAspectLang.g:2021:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:2029:2: ( (lv_logic_2_0= ruleLogicOperator ) )
                    // InternalAspectLang.g:2030:1: (lv_logic_2_0= ruleLogicOperator )
                    {
                    // InternalAspectLang.g:2030:1: (lv_logic_2_0= ruleLogicOperator )
                    // InternalAspectLang.g:2031:3: lv_logic_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalAspectLang.g:2047:2: ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    // InternalAspectLang.g:2048:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    {
                    // InternalAspectLang.g:2048:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    // InternalAspectLang.g:2049:3: lv_right_3_0= rulePropertyConstraintCompare
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
    // InternalAspectLang.g:2073:1: entryRulePropertyConstraintCompare returns [EObject current=null] : iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF ;
    public final EObject entryRulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraintCompare = null;


        try {
            // InternalAspectLang.g:2074:2: (iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:2075:2: iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF
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
    // InternalAspectLang.g:2082:1: rulePropertyConstraintCompare returns [EObject current=null] : (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) ;
    public final EObject rulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ConstraintElement_0 = null;

        Enumerator lv_compare_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2085:28: ( (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) )
            // InternalAspectLang.g:2086:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            {
            // InternalAspectLang.g:2086:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            // InternalAspectLang.g:2087:2: this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyConstraintCompareAccess().getConstraintElementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_38);
            this_ConstraintElement_0=ruleConstraintElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ConstraintElement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:2098:1: ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=57 && LA35_0<=63)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:2098:2: () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) )
                    {
                    // InternalAspectLang.g:2098:2: ()
                    // InternalAspectLang.g:2099:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintCompareLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAspectLang.g:2107:2: ( (lv_compare_2_0= ruleCompareOperator ) )
                    // InternalAspectLang.g:2108:1: (lv_compare_2_0= ruleCompareOperator )
                    {
                    // InternalAspectLang.g:2108:1: (lv_compare_2_0= ruleCompareOperator )
                    // InternalAspectLang.g:2109:3: lv_compare_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstraintCompareAccess().getCompareCompareOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
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

                    // InternalAspectLang.g:2125:2: ( (lv_right_3_0= ruleConstraintElement ) )
                    // InternalAspectLang.g:2126:1: (lv_right_3_0= ruleConstraintElement )
                    {
                    // InternalAspectLang.g:2126:1: (lv_right_3_0= ruleConstraintElement )
                    // InternalAspectLang.g:2127:3: lv_right_3_0= ruleConstraintElement
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
    // InternalAspectLang.g:2151:1: entryRuleConstraintElement returns [EObject current=null] : iv_ruleConstraintElement= ruleConstraintElement EOF ;
    public final EObject entryRuleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintElement = null;


        try {
            // InternalAspectLang.g:2152:2: (iv_ruleConstraintElement= ruleConstraintElement EOF )
            // InternalAspectLang.g:2153:2: iv_ruleConstraintElement= ruleConstraintElement EOF
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
    // InternalAspectLang.g:2160:1: ruleConstraintElement returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) ;
    public final EObject ruleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_LocalQuery_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2163:28: ( (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) )
            // InternalAspectLang.g:2164:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            {
            // InternalAspectLang.g:2164:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_INT)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID||LA36_0==26||(LA36_0>=35 && LA36_0<=38)) ) {
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
                    // InternalAspectLang.g:2165:2: this_Literal_0= ruleLiteral
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
                    // InternalAspectLang.g:2178:2: this_LocalQuery_1= ruleLocalQuery
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
    // InternalAspectLang.g:2197:1: entryRuleLocalQuery returns [EObject current=null] : iv_ruleLocalQuery= ruleLocalQuery EOF ;
    public final EObject entryRuleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalQuery = null;


        try {
            // InternalAspectLang.g:2198:2: (iv_ruleLocalQuery= ruleLocalQuery EOF )
            // InternalAspectLang.g:2199:2: iv_ruleLocalQuery= ruleLocalQuery EOF
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
    // InternalAspectLang.g:2206:1: ruleLocalQuery returns [EObject current=null] : ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) ;
    public final EObject ruleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_locationQuery_0_0 = null;

        EObject lv_property_1_0 = null;

        EObject lv_typeof_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2209:28: ( ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) )
            // InternalAspectLang.g:2210:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            {
            // InternalAspectLang.g:2210:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            // InternalAspectLang.g:2210:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
            {
            // InternalAspectLang.g:2210:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=35 && LA37_0<=37)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAspectLang.g:2211:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:2211:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:2212:3: lv_locationQuery_0_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalQueryAccess().getLocationQueryLocationQueryParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
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

            // InternalAspectLang.g:2228:3: ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            else if ( (LA38_0==38) ) {
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
                    // InternalAspectLang.g:2228:4: ( (lv_property_1_0= ruleModelProperty ) )
                    {
                    // InternalAspectLang.g:2228:4: ( (lv_property_1_0= ruleModelProperty ) )
                    // InternalAspectLang.g:2229:1: (lv_property_1_0= ruleModelProperty )
                    {
                    // InternalAspectLang.g:2229:1: (lv_property_1_0= ruleModelProperty )
                    // InternalAspectLang.g:2230:3: lv_property_1_0= ruleModelProperty
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
                    // InternalAspectLang.g:2247:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    {
                    // InternalAspectLang.g:2247:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    // InternalAspectLang.g:2248:1: (lv_typeof_2_0= ruleTypeof )
                    {
                    // InternalAspectLang.g:2248:1: (lv_typeof_2_0= ruleTypeof )
                    // InternalAspectLang.g:2249:3: lv_typeof_2_0= ruleTypeof
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
    // InternalAspectLang.g:2273:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // InternalAspectLang.g:2274:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // InternalAspectLang.g:2275:2: iv_ruleModelProperty= ruleModelProperty EOF
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
    // InternalAspectLang.g:2282:1: ruleModelProperty returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2285:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAspectLang.g:2286:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAspectLang.g:2286:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            // InternalAspectLang.g:2286:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0());
                  
            }
            // InternalAspectLang.g:2290:1: ( (otherlv_1= RULE_ID ) )
            // InternalAspectLang.g:2291:1: (otherlv_1= RULE_ID )
            {
            // InternalAspectLang.g:2291:1: (otherlv_1= RULE_ID )
            // InternalAspectLang.g:2292:3: otherlv_1= RULE_ID
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
    // InternalAspectLang.g:2314:1: entryRuleTypeof returns [EObject current=null] : iv_ruleTypeof= ruleTypeof EOF ;
    public final EObject entryRuleTypeof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeof = null;


        try {
            // InternalAspectLang.g:2315:2: (iv_ruleTypeof= ruleTypeof EOF )
            // InternalAspectLang.g:2316:2: iv_ruleTypeof= ruleTypeof EOF
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
    // InternalAspectLang.g:2323:1: ruleTypeof returns [EObject current=null] : (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2326:28: ( (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' ) )
            // InternalAspectLang.g:2327:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' )
            {
            // InternalAspectLang.g:2327:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' )
            // InternalAspectLang.g:2327:3: otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeofAccess().getIstypeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalAspectLang.g:2335:1: ( (lv_reference_2_0= ruleTypeReference ) )
            // InternalAspectLang.g:2336:1: (lv_reference_2_0= ruleTypeReference )
            {
            // InternalAspectLang.g:2336:1: (lv_reference_2_0= ruleTypeReference )
            // InternalAspectLang.g:2337:3: lv_reference_2_0= ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeofAccess().getReferenceTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_reference_2_0=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeofRule());
              	        }
                     		set(
                     			current, 
                     			"reference",
                      		lv_reference_2_0, 
                      		"de.cau.cs.se.instrumentation.al.AspectLang.TypeReference");
              	        afterParserOrEnumRuleCall();
              	    
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
    // InternalAspectLang.g:2365:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAspectLang.g:2366:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAspectLang.g:2367:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalAspectLang.g:2374:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2377:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) )
            // InternalAspectLang.g:2378:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
            {
            // InternalAspectLang.g:2378:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt39=1;
                }
                break;
            case RULE_INT:
                {
                alt39=2;
                }
                break;
            case RULE_FLOAT:
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
                    // InternalAspectLang.g:2379:2: this_StringLiteral_0= ruleStringLiteral
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
                    // InternalAspectLang.g:2392:2: this_IntLiteral_1= ruleIntLiteral
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
                    // InternalAspectLang.g:2405:2: this_FloatLiteral_2= ruleFloatLiteral
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
    // InternalAspectLang.g:2424:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalAspectLang.g:2425:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalAspectLang.g:2426:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
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
    // InternalAspectLang.g:2433:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2436:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAspectLang.g:2437:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAspectLang.g:2437:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAspectLang.g:2438:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAspectLang.g:2438:1: (lv_value_0_0= RULE_FLOAT )
            // InternalAspectLang.g:2439:3: lv_value_0_0= RULE_FLOAT
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
    // InternalAspectLang.g:2463:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalAspectLang.g:2464:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalAspectLang.g:2465:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalAspectLang.g:2472:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2475:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAspectLang.g:2476:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAspectLang.g:2476:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalAspectLang.g:2477:1: (lv_value_0_0= RULE_INT )
            {
            // InternalAspectLang.g:2477:1: (lv_value_0_0= RULE_INT )
            // InternalAspectLang.g:2478:3: lv_value_0_0= RULE_INT
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
    // InternalAspectLang.g:2502:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAspectLang.g:2503:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAspectLang.g:2504:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalAspectLang.g:2511:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2514:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAspectLang.g:2515:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAspectLang.g:2515:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAspectLang.g:2516:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalAspectLang.g:2516:1: (lv_value_0_0= RULE_STRING )
            // InternalAspectLang.g:2517:3: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalAspectLang.g:2541:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAspectLang.g:2542:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAspectLang.g:2543:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalAspectLang.g:2550:1: ruleTypeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_collection_3_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2553:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? ) )
            // InternalAspectLang.g:2554:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? )
            {
            // InternalAspectLang.g:2554:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? )
            // InternalAspectLang.g:2554:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )?
            {
            // InternalAspectLang.g:2554:2: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:2555:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:2555:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:2556:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getContextApplicationModelCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1());
                  
            }
            // InternalAspectLang.g:2574:1: ( (otherlv_2= RULE_ID ) )
            // InternalAspectLang.g:2575:1: (otherlv_2= RULE_ID )
            {
            // InternalAspectLang.g:2575:1: (otherlv_2= RULE_ID )
            // InternalAspectLang.g:2576:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_2_0()); 
              	
            }

            }


            }

            // InternalAspectLang.g:2590:2: ( (lv_collection_3_0= '[]' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:2591:1: (lv_collection_3_0= '[]' )
                    {
                    // InternalAspectLang.g:2591:1: (lv_collection_3_0= '[]' )
                    // InternalAspectLang.g:2592:3: lv_collection_3_0= '[]'
                    {
                    lv_collection_3_0=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_3_0, grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeReferenceRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[]");
                      	    
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
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAspectLang.g:2613:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAspectLang.g:2614:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAspectLang.g:2615:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAspectLang.g:2622:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2625:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalAspectLang.g:2626:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalAspectLang.g:2626:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalAspectLang.g:2626:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalAspectLang.g:2633:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==RULE_ID) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // InternalAspectLang.g:2633:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalAspectLang.g:2633:2: ( ( '.' )=>kw= '.' )
            	    // InternalAspectLang.g:2633:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAspectLang.g:2656:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAspectLang.g:2657:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:2658:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:2665:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2668:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalAspectLang.g:2669:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalAspectLang.g:2669:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalAspectLang.g:2670:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_41);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAspectLang.g:2680:1: (kw= '.' kw= '*' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:2681:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2700:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2702:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) ) )
            // InternalAspectLang.g:2703:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            {
            // InternalAspectLang.g:2703:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            else if ( (LA43_0==41) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAspectLang.g:2703:2: (enumLiteral_0= 'before' )
                    {
                    // InternalAspectLang.g:2703:2: (enumLiteral_0= 'before' )
                    // InternalAspectLang.g:2703:4: enumLiteral_0= 'before'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2709:6: (enumLiteral_1= 'after' )
                    {
                    // InternalAspectLang.g:2709:6: (enumLiteral_1= 'after' )
                    // InternalAspectLang.g:2709:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2719:1: ruleInternalFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) ;
    public final Enumerator ruleInternalFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2721:28: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) )
            // InternalAspectLang.g:2722:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            {
            // InternalAspectLang.g:2722:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt44=1;
                }
                break;
            case 43:
                {
                alt44=2;
                }
                break;
            case 44:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalAspectLang.g:2722:2: (enumLiteral_0= 'time' )
                    {
                    // InternalAspectLang.g:2722:2: (enumLiteral_0= 'time' )
                    // InternalAspectLang.g:2722:4: enumLiteral_0= 'time'
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
                    // InternalAspectLang.g:2728:6: (enumLiteral_1= 'traceId' )
                    {
                    // InternalAspectLang.g:2728:6: (enumLiteral_1= 'traceId' )
                    // InternalAspectLang.g:2728:8: enumLiteral_1= 'traceId'
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
                    // InternalAspectLang.g:2734:6: (enumLiteral_2= 'orderIndex' )
                    {
                    // InternalAspectLang.g:2734:6: (enumLiteral_2= 'orderIndex' )
                    // InternalAspectLang.g:2734:8: enumLiteral_2= 'orderIndex'
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
    // InternalAspectLang.g:2744:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2746:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) )
            // InternalAspectLang.g:2747:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            {
            // InternalAspectLang.g:2747:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt45=1;
                }
                break;
            case 46:
                {
                alt45=2;
                }
                break;
            case 47:
                {
                alt45=3;
                }
                break;
            case 48:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalAspectLang.g:2747:2: (enumLiteral_0= 'name' )
                    {
                    // InternalAspectLang.g:2747:2: (enumLiteral_0= 'name' )
                    // InternalAspectLang.g:2747:4: enumLiteral_0= 'name'
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
                    // InternalAspectLang.g:2753:6: (enumLiteral_1= 'signature' )
                    {
                    // InternalAspectLang.g:2753:6: (enumLiteral_1= 'signature' )
                    // InternalAspectLang.g:2753:8: enumLiteral_1= 'signature'
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
                    // InternalAspectLang.g:2759:6: (enumLiteral_2= 'classname' )
                    {
                    // InternalAspectLang.g:2759:6: (enumLiteral_2= 'classname' )
                    // InternalAspectLang.g:2759:8: enumLiteral_2= 'classname'
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
                    // InternalAspectLang.g:2765:6: (enumLiteral_3= 'return-type' )
                    {
                    // InternalAspectLang.g:2765:6: (enumLiteral_3= 'return-type' )
                    // InternalAspectLang.g:2765:8: enumLiteral_3= 'return-type'
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


    // $ANTLR start "ruleTechnology"
    // InternalAspectLang.g:2775:1: ruleTechnology returns [Enumerator current=null] : ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) ) ;
    public final Enumerator ruleTechnology() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2777:28: ( ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) ) )
            // InternalAspectLang.g:2778:1: ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) )
            {
            // InternalAspectLang.g:2778:1: ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt46=1;
                }
                break;
            case 50:
                {
                alt46=2;
                }
                break;
            case 51:
                {
                alt46=3;
                }
                break;
            case 52:
                {
                alt46=4;
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
                    // InternalAspectLang.g:2778:2: (enumLiteral_0= 'javaee' )
                    {
                    // InternalAspectLang.g:2778:2: (enumLiteral_0= 'javaee' )
                    // InternalAspectLang.g:2778:4: enumLiteral_0= 'javaee'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2784:6: (enumLiteral_1= 'servlet' )
                    {
                    // InternalAspectLang.g:2784:6: (enumLiteral_1= 'servlet' )
                    // InternalAspectLang.g:2784:8: enumLiteral_1= 'servlet'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2790:6: (enumLiteral_2= 'spring' )
                    {
                    // InternalAspectLang.g:2790:6: (enumLiteral_2= 'spring' )
                    // InternalAspectLang.g:2790:8: enumLiteral_2= 'spring'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2796:6: (enumLiteral_3= 'aspectj' )
                    {
                    // InternalAspectLang.g:2796:6: (enumLiteral_3= 'aspectj' )
                    // InternalAspectLang.g:2796:8: enumLiteral_3= 'aspectj'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getASPECT_JEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTechnologyAccess().getASPECT_JEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:2806:1: ruleQueryModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) ;
    public final Enumerator ruleQueryModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2808:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) )
            // InternalAspectLang.g:2809:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            {
            // InternalAspectLang.g:2809:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            else if ( (LA47_0==54) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAspectLang.g:2809:2: (enumLiteral_0= 'include' )
                    {
                    // InternalAspectLang.g:2809:2: (enumLiteral_0= 'include' )
                    // InternalAspectLang.g:2809:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2815:6: (enumLiteral_1= 'exclude' )
                    {
                    // InternalAspectLang.g:2815:6: (enumLiteral_1= 'exclude' )
                    // InternalAspectLang.g:2815:8: enumLiteral_1= 'exclude'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2825:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2827:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalAspectLang.g:2828:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalAspectLang.g:2828:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            else if ( (LA48_0==56) ) {
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
                    // InternalAspectLang.g:2828:2: (enumLiteral_0= '&&' )
                    {
                    // InternalAspectLang.g:2828:2: (enumLiteral_0= '&&' )
                    // InternalAspectLang.g:2828:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2834:6: (enumLiteral_1= '||' )
                    {
                    // InternalAspectLang.g:2834:6: (enumLiteral_1= '||' )
                    // InternalAspectLang.g:2834:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2844:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
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
            // InternalAspectLang.g:2846:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // InternalAspectLang.g:2847:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // InternalAspectLang.g:2847:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt49=1;
                }
                break;
            case 58:
                {
                alt49=2;
                }
                break;
            case 59:
                {
                alt49=3;
                }
                break;
            case 60:
                {
                alt49=4;
                }
                break;
            case 61:
                {
                alt49=5;
                }
                break;
            case 62:
                {
                alt49=6;
                }
                break;
            case 63:
                {
                alt49=7;
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
                    // InternalAspectLang.g:2847:2: (enumLiteral_0= '=' )
                    {
                    // InternalAspectLang.g:2847:2: (enumLiteral_0= '=' )
                    // InternalAspectLang.g:2847:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2853:6: (enumLiteral_1= '~' )
                    {
                    // InternalAspectLang.g:2853:6: (enumLiteral_1= '~' )
                    // InternalAspectLang.g:2853:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2859:6: (enumLiteral_2= '!=' )
                    {
                    // InternalAspectLang.g:2859:6: (enumLiteral_2= '!=' )
                    // InternalAspectLang.g:2859:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2865:6: (enumLiteral_3= '>' )
                    {
                    // InternalAspectLang.g:2865:6: (enumLiteral_3= '>' )
                    // InternalAspectLang.g:2865:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAspectLang.g:2871:6: (enumLiteral_4= '<' )
                    {
                    // InternalAspectLang.g:2871:6: (enumLiteral_4= '<' )
                    // InternalAspectLang.g:2871:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAspectLang.g:2877:6: (enumLiteral_5= '>=' )
                    {
                    // InternalAspectLang.g:2877:6: (enumLiteral_5= '>=' )
                    // InternalAspectLang.g:2877:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAspectLang.g:2883:6: (enumLiteral_6= '<=' )
                    {
                    // InternalAspectLang.g:2883:6: (enumLiteral_6= '<=' )
                    // InternalAspectLang.g:2883:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred18_InternalAspectLang
    public final void synpred18_InternalAspectLang_fragment() throws RecognitionException {   
        EObject this_ReferenceValue_1 = null;


        // InternalAspectLang.g:854:2: (this_ReferenceValue_1= ruleReferenceValue )
        // InternalAspectLang.g:854:2: this_ReferenceValue_1= ruleReferenceValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_2);
        this_ReferenceValue_1=ruleReferenceValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalAspectLang

    // Delegated rules

    public final boolean synpred18_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\6\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\54\6\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\5\uffff\1\3\2\uffff\1\4";
    static final String dfa_5s = "\7\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\3\1\21\uffff\2\4\10\uffff\3\4\4\uffff\3\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "840:1: (this_Literal_0= ruleLiteral | this_ReferenceValue_1= ruleReferenceValue | this_InternalFunctionProperty_2= ruleInternalFunctionProperty | this_AdviceParameter_3= ruleAdviceParameter )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAspectLang()) ) {s = 4;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000022042C002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000220428002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000220420002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001C38062000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001C38060000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000030001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003806000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003800000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0060000080800002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003801000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000078040000F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFE00000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});

}
package kieker.develop.al.parser.antlr.internal; 

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
import kieker.develop.al.services.AspectLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAspectLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'$'", "'#'", "'['", "']'", "'pointcut'", "'class'", "'.'", "'operation'", "'@'", "'technology'", "'*'", "'**'", "'up'", "'istypeof'", "'[]'", "'before'", "'after'", "'exception'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'javaee'", "'servlet'", "'spring'", "'aspectj'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='"
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
    public static final int T__64=64;
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
                      		"kieker.develop.al.AspectLang.QualifiedName");
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
            	              		"kieker.develop.al.AspectLang.Import");
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
            	              		"kieker.develop.al.AspectLang.ApplicationModel");
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
            	              		"kieker.develop.al.AspectLang.Advice");
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
            	              		"kieker.develop.al.AspectLang.Pointcut");
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
            	              		"kieker.develop.al.AspectLang.Aspect");
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
                      		"kieker.develop.al.AspectLang.QualifiedNameWithWildcard");
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
                      		"kieker.develop.al.AspectLang.UtilizeAdvice");
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
            	              		"kieker.develop.al.AspectLang.UtilizeAdvice");
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

                    if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||(LA6_0>=25 && LA6_0<=26)||(LA6_0>=35 && LA6_0<=37)||(LA6_0>=43 && LA6_0<=45)||(LA6_0>=54 && LA6_0<=55)) ) {
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
                                      		"kieker.develop.al.AspectLang.Value");
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
                            	              		"kieker.develop.al.AspectLang.Value");
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
                                      		"kieker.develop.al.AspectLang.AdviceParameterDeclaration");
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
                            	              		"kieker.develop.al.AspectLang.AdviceParameterDeclaration");
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

                if ( ((LA11_0>=40 && LA11_0<=42)) ) {
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
            	              		"kieker.develop.al.AspectLang.Collector");
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
                      		"kieker.develop.al.AspectLang.TypeReference");
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
                      		"kieker.develop.al.AspectLang.InsertionPoint");
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
            	              		"kieker.develop.al.AspectLang.Event");
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

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||(LA14_0>=25 && LA14_0<=26)||(LA14_0>=35 && LA14_0<=37)||(LA14_0>=43 && LA14_0<=45)||(LA14_0>=54 && LA14_0<=55)) ) {
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
                              		"kieker.develop.al.AspectLang.Value");
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
                    	              		"kieker.develop.al.AspectLang.Value");
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

            if ( (LA16_0==RULE_ID||(LA16_0>=35 && LA16_0<=37)||(LA16_0>=54 && LA16_0<=55)) ) {
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
                              		"kieker.develop.al.AspectLang.LocationQuery");
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
                      		"kieker.develop.al.AspectLang.Property");
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
                      		"kieker.develop.al.AspectLang.InternalFunction");
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
                      		"kieker.develop.al.AspectLang.ReflectionFunction");
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
                              		"kieker.develop.al.AspectLang.Value");
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
                              		"kieker.develop.al.AspectLang.Annotation");
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
                      		"kieker.develop.al.AspectLang.LocationQuery");
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
                              		"kieker.develop.al.AspectLang.OperationQuery");
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
                      		"kieker.develop.al.AspectLang.Technology");
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
                      		"kieker.develop.al.AspectLang.Technology");
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
    // InternalAspectLang.g:1388:1: entryRuleLocationQuery returns [EObject current=null] : iv_ruleLocationQuery= ruleLocationQuery EOF ;
    public final EObject entryRuleLocationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationQuery = null;


        try {
            // InternalAspectLang.g:1389:2: (iv_ruleLocationQuery= ruleLocationQuery EOF )
            // InternalAspectLang.g:1390:2: iv_ruleLocationQuery= ruleLocationQuery EOF
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
    // InternalAspectLang.g:1397:1: ruleLocationQuery returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleQueryModifier ) )? ( (lv_node_1_0= ruleNode ) ) ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )? ) ;
    public final EObject ruleLocationQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_node_1_0 = null;

        EObject lv_specialization_3_0 = null;

        EObject lv_composition_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1400:28: ( ( ( (lv_modifier_0_0= ruleQueryModifier ) )? ( (lv_node_1_0= ruleNode ) ) ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )? ) )
            // InternalAspectLang.g:1401:1: ( ( (lv_modifier_0_0= ruleQueryModifier ) )? ( (lv_node_1_0= ruleNode ) ) ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )? )
            {
            // InternalAspectLang.g:1401:1: ( ( (lv_modifier_0_0= ruleQueryModifier ) )? ( (lv_node_1_0= ruleNode ) ) ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )? )
            // InternalAspectLang.g:1401:2: ( (lv_modifier_0_0= ruleQueryModifier ) )? ( (lv_node_1_0= ruleNode ) ) ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )?
            {
            // InternalAspectLang.g:1401:2: ( (lv_modifier_0_0= ruleQueryModifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=54 && LA21_0<=55)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:1402:1: (lv_modifier_0_0= ruleQueryModifier )
                    {
                    // InternalAspectLang.g:1402:1: (lv_modifier_0_0= ruleQueryModifier )
                    // InternalAspectLang.g:1403:3: lv_modifier_0_0= ruleQueryModifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getModifierQueryModifierEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_28);
                    lv_modifier_0_0=ruleQueryModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_0_0, 
                              		"kieker.develop.al.AspectLang.QueryModifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1419:3: ( (lv_node_1_0= ruleNode ) )
            // InternalAspectLang.g:1420:1: (lv_node_1_0= ruleNode )
            {
            // InternalAspectLang.g:1420:1: (lv_node_1_0= ruleNode )
            // InternalAspectLang.g:1421:3: lv_node_1_0= ruleNode
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_node_1_0=ruleNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
              	        }
                     		set(
                     			current, 
                     			"node",
                      		lv_node_1_0, 
                      		"kieker.develop.al.AspectLang.Node");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAspectLang.g:1437:2: ( (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) ) | ( (lv_composition_4_0= ruleCompositionQuery ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==23) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:1437:3: (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) )
                    {
                    // InternalAspectLang.g:1437:3: (otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) ) )
                    // InternalAspectLang.g:1437:5: otherlv_2= '.' ( (lv_specialization_3_0= ruleLocationQuery ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocationQueryAccess().getFullStopKeyword_2_0_0());
                          
                    }
                    // InternalAspectLang.g:1441:1: ( (lv_specialization_3_0= ruleLocationQuery ) )
                    // InternalAspectLang.g:1442:1: (lv_specialization_3_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:1442:1: (lv_specialization_3_0= ruleLocationQuery )
                    // InternalAspectLang.g:1443:3: lv_specialization_3_0= ruleLocationQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_specialization_3_0=ruleLocationQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"specialization",
                              		lv_specialization_3_0, 
                              		"kieker.develop.al.AspectLang.LocationQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1460:6: ( (lv_composition_4_0= ruleCompositionQuery ) )
                    {
                    // InternalAspectLang.g:1460:6: ( (lv_composition_4_0= ruleCompositionQuery ) )
                    // InternalAspectLang.g:1461:1: (lv_composition_4_0= ruleCompositionQuery )
                    {
                    // InternalAspectLang.g:1461:1: (lv_composition_4_0= ruleCompositionQuery )
                    // InternalAspectLang.g:1462:3: lv_composition_4_0= ruleCompositionQuery
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_composition_4_0=ruleCompositionQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationQueryRule());
                      	        }
                             		set(
                             			current, 
                             			"composition",
                              		lv_composition_4_0, 
                              		"kieker.develop.al.AspectLang.CompositionQuery");
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
    // InternalAspectLang.g:1486:1: entryRuleCompositionQuery returns [EObject current=null] : iv_ruleCompositionQuery= ruleCompositionQuery EOF ;
    public final EObject entryRuleCompositionQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionQuery = null;


        try {
            // InternalAspectLang.g:1487:2: (iv_ruleCompositionQuery= ruleCompositionQuery EOF )
            // InternalAspectLang.g:1488:2: iv_ruleCompositionQuery= ruleCompositionQuery EOF
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
    // InternalAspectLang.g:1495:1: ruleCompositionQuery returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_subQueries_2_0= ruleLocationQuery ) )* otherlv_3= '}' ) ;
    public final EObject ruleCompositionQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_subQueries_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1498:28: ( ( () otherlv_1= '{' ( (lv_subQueries_2_0= ruleLocationQuery ) )* otherlv_3= '}' ) )
            // InternalAspectLang.g:1499:1: ( () otherlv_1= '{' ( (lv_subQueries_2_0= ruleLocationQuery ) )* otherlv_3= '}' )
            {
            // InternalAspectLang.g:1499:1: ( () otherlv_1= '{' ( (lv_subQueries_2_0= ruleLocationQuery ) )* otherlv_3= '}' )
            // InternalAspectLang.g:1499:2: () otherlv_1= '{' ( (lv_subQueries_2_0= ruleLocationQuery ) )* otherlv_3= '}'
            {
            // InternalAspectLang.g:1499:2: ()
            // InternalAspectLang.g:1500:2: 
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

            otherlv_1=(Token)match(input,23,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalAspectLang.g:1512:1: ( (lv_subQueries_2_0= ruleLocationQuery ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=35 && LA23_0<=37)||(LA23_0>=54 && LA23_0<=55)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAspectLang.g:1513:1: (lv_subQueries_2_0= ruleLocationQuery )
            	    {
            	    // InternalAspectLang.g:1513:1: (lv_subQueries_2_0= ruleLocationQuery )
            	    // InternalAspectLang.g:1514:3: lv_subQueries_2_0= ruleLocationQuery
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_subQueries_2_0=ruleLocationQuery();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositionQueryRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subQueries",
            	              		lv_subQueries_2_0, 
            	              		"kieker.develop.al.AspectLang.LocationQuery");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_3());
                  
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
    // InternalAspectLang.g:1542:1: entryRuleOperationQuery returns [EObject current=null] : iv_ruleOperationQuery= ruleOperationQuery EOF ;
    public final EObject entryRuleOperationQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationQuery = null;


        try {
            // InternalAspectLang.g:1543:2: (iv_ruleOperationQuery= ruleOperationQuery EOF )
            // InternalAspectLang.g:1544:2: iv_ruleOperationQuery= ruleOperationQuery EOF
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
    // InternalAspectLang.g:1551:1: ruleOperationQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) ;
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
            // InternalAspectLang.g:1554:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) ) )
            // InternalAspectLang.g:1555:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            {
            // InternalAspectLang.g:1555:1: ( () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' ) )
            // InternalAspectLang.g:1555:2: () ( (otherlv_1= RULE_ID ) )? ( (lv_returnType_2_0= ruleTypeReference ) )? ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
            {
            // InternalAspectLang.g:1555:2: ()
            // InternalAspectLang.g:1556:2: 
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

            // InternalAspectLang.g:1564:2: ( (otherlv_1= RULE_ID ) )?
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
                    // InternalAspectLang.g:1565:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1565:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1566:3: otherlv_1= RULE_ID
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

            // InternalAspectLang.g:1580:3: ( (lv_returnType_2_0= ruleTypeReference ) )?
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
                    // InternalAspectLang.g:1581:1: (lv_returnType_2_0= ruleTypeReference )
                    {
                    // InternalAspectLang.g:1581:1: (lv_returnType_2_0= ruleTypeReference )
                    // InternalAspectLang.g:1582:3: lv_returnType_2_0= ruleTypeReference
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
                              		"kieker.develop.al.AspectLang.TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:1598:3: ( ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? ) | otherlv_9= '*' )
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
                    // InternalAspectLang.g:1598:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalAspectLang.g:1598:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )? )
                    // InternalAspectLang.g:1598:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    {
                    // InternalAspectLang.g:1598:5: ( (otherlv_3= RULE_ID ) )
                    // InternalAspectLang.g:1599:1: (otherlv_3= RULE_ID )
                    {
                    // InternalAspectLang.g:1599:1: (otherlv_3= RULE_ID )
                    // InternalAspectLang.g:1600:3: otherlv_3= RULE_ID
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

                    // InternalAspectLang.g:1614:2: (otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==20) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalAspectLang.g:1614:4: otherlv_4= '(' ( (lv_parameterQueries_5_0= ruleParameterQuery ) ) (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0());
                                  
                            }
                            // InternalAspectLang.g:1618:1: ( (lv_parameterQueries_5_0= ruleParameterQuery ) )
                            // InternalAspectLang.g:1619:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            {
                            // InternalAspectLang.g:1619:1: (lv_parameterQueries_5_0= ruleParameterQuery )
                            // InternalAspectLang.g:1620:3: lv_parameterQueries_5_0= ruleParameterQuery
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
                                      		"kieker.develop.al.AspectLang.ParameterQuery");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // InternalAspectLang.g:1636:2: (otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==19) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalAspectLang.g:1636:4: otherlv_6= ',' ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    {
                            	    otherlv_6=(Token)match(input,19,FOLLOW_30); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_6, grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0());
                            	          
                            	    }
                            	    // InternalAspectLang.g:1640:1: ( (lv_parameterQueries_7_0= ruleParameterQuery ) )
                            	    // InternalAspectLang.g:1641:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    {
                            	    // InternalAspectLang.g:1641:1: (lv_parameterQueries_7_0= ruleParameterQuery )
                            	    // InternalAspectLang.g:1642:3: lv_parameterQueries_7_0= ruleParameterQuery
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
                            	              		"kieker.develop.al.AspectLang.ParameterQuery");
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
                    // InternalAspectLang.g:1663:7: otherlv_9= '*'
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
    // InternalAspectLang.g:1675:1: entryRuleParameterQuery returns [EObject current=null] : iv_ruleParameterQuery= ruleParameterQuery EOF ;
    public final EObject entryRuleParameterQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterQuery = null;


        try {
            // InternalAspectLang.g:1676:2: (iv_ruleParameterQuery= ruleParameterQuery EOF )
            // InternalAspectLang.g:1677:2: iv_ruleParameterQuery= ruleParameterQuery EOF
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
    // InternalAspectLang.g:1684:1: ruleParameterQuery returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) ;
    public final EObject ruleParameterQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:1687:28: ( ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? ) )
            // InternalAspectLang.g:1688:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            {
            // InternalAspectLang.g:1688:1: ( () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )? )
            // InternalAspectLang.g:1688:2: () ( (otherlv_1= RULE_ID ) )? ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' ) ( (otherlv_4= RULE_ID ) )?
            {
            // InternalAspectLang.g:1688:2: ()
            // InternalAspectLang.g:1689:2: 
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

            // InternalAspectLang.g:1697:2: ( (otherlv_1= RULE_ID ) )?
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
                    // InternalAspectLang.g:1698:1: (otherlv_1= RULE_ID )
                    {
                    // InternalAspectLang.g:1698:1: (otherlv_1= RULE_ID )
                    // InternalAspectLang.g:1699:3: otherlv_1= RULE_ID
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

            // InternalAspectLang.g:1713:3: ( ( (lv_type_2_0= ruleTypeReference ) ) | otherlv_3= '*' )
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
                    // InternalAspectLang.g:1713:4: ( (lv_type_2_0= ruleTypeReference ) )
                    {
                    // InternalAspectLang.g:1713:4: ( (lv_type_2_0= ruleTypeReference ) )
                    // InternalAspectLang.g:1714:1: (lv_type_2_0= ruleTypeReference )
                    {
                    // InternalAspectLang.g:1714:1: (lv_type_2_0= ruleTypeReference )
                    // InternalAspectLang.g:1715:3: lv_type_2_0= ruleTypeReference
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
                              		"kieker.develop.al.AspectLang.TypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1732:7: otherlv_3= '*'
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterQueryAccess().getAsteriskKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // InternalAspectLang.g:1736:2: ( (otherlv_4= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:1737:1: (otherlv_4= RULE_ID )
                    {
                    // InternalAspectLang.g:1737:1: (otherlv_4= RULE_ID )
                    // InternalAspectLang.g:1738:3: otherlv_4= RULE_ID
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
    // InternalAspectLang.g:1760:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAspectLang.g:1761:2: (iv_ruleNode= ruleNode EOF )
            // InternalAspectLang.g:1762:2: iv_ruleNode= ruleNode EOF
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
    // InternalAspectLang.g:1769:1: ruleNode returns [EObject current=null] : ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) ;
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
            // InternalAspectLang.g:1772:28: ( ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? ) )
            // InternalAspectLang.g:1773:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            {
            // InternalAspectLang.g:1773:1: ( (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )? )
            // InternalAspectLang.g:1773:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode ) (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            {
            // InternalAspectLang.g:1773:2: (this_SubPathNode_0= ruleSubPathNode | this_WildcardNode_1= ruleWildcardNode | this_ParentNode_2= ruleParentNode | this_ContainerNode_3= ruleContainerNode )
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
                    // InternalAspectLang.g:1774:2: this_SubPathNode_0= ruleSubPathNode
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
                    // InternalAspectLang.g:1787:2: this_WildcardNode_1= ruleWildcardNode
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
                    // InternalAspectLang.g:1800:2: this_ParentNode_2= ruleParentNode
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
                    // InternalAspectLang.g:1813:2: this_ContainerNode_3= ruleContainerNode
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

            // InternalAspectLang.g:1824:2: (otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:1824:4: otherlv_4= '[' ( (lv_constraint_5_0= rulePropertyConstraint ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalAspectLang.g:1828:1: ( (lv_constraint_5_0= rulePropertyConstraint ) )
                    // InternalAspectLang.g:1829:1: (lv_constraint_5_0= rulePropertyConstraint )
                    {
                    // InternalAspectLang.g:1829:1: (lv_constraint_5_0= rulePropertyConstraint )
                    // InternalAspectLang.g:1830:3: lv_constraint_5_0= rulePropertyConstraint
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
                              		"kieker.develop.al.AspectLang.PropertyConstraint");
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
    // InternalAspectLang.g:1858:1: entryRuleContainerNode returns [EObject current=null] : iv_ruleContainerNode= ruleContainerNode EOF ;
    public final EObject entryRuleContainerNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNode = null;


        try {
            // InternalAspectLang.g:1859:2: (iv_ruleContainerNode= ruleContainerNode EOF )
            // InternalAspectLang.g:1860:2: iv_ruleContainerNode= ruleContainerNode EOF
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
    // InternalAspectLang.g:1867:1: ruleContainerNode returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleContainerNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1870:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAspectLang.g:1871:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAspectLang.g:1871:1: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:1872:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:1872:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:1873:3: otherlv_0= RULE_ID
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
    // InternalAspectLang.g:1895:1: entryRuleWildcardNode returns [EObject current=null] : iv_ruleWildcardNode= ruleWildcardNode EOF ;
    public final EObject entryRuleWildcardNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcardNode = null;


        try {
            // InternalAspectLang.g:1896:2: (iv_ruleWildcardNode= ruleWildcardNode EOF )
            // InternalAspectLang.g:1897:2: iv_ruleWildcardNode= ruleWildcardNode EOF
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
    // InternalAspectLang.g:1904:1: ruleWildcardNode returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleWildcardNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1907:28: ( ( () otherlv_1= '*' ) )
            // InternalAspectLang.g:1908:1: ( () otherlv_1= '*' )
            {
            // InternalAspectLang.g:1908:1: ( () otherlv_1= '*' )
            // InternalAspectLang.g:1908:2: () otherlv_1= '*'
            {
            // InternalAspectLang.g:1908:2: ()
            // InternalAspectLang.g:1909:2: 
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
    // InternalAspectLang.g:1929:1: entryRuleSubPathNode returns [EObject current=null] : iv_ruleSubPathNode= ruleSubPathNode EOF ;
    public final EObject entryRuleSubPathNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubPathNode = null;


        try {
            // InternalAspectLang.g:1930:2: (iv_ruleSubPathNode= ruleSubPathNode EOF )
            // InternalAspectLang.g:1931:2: iv_ruleSubPathNode= ruleSubPathNode EOF
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
    // InternalAspectLang.g:1938:1: ruleSubPathNode returns [EObject current=null] : ( () otherlv_1= '**' ) ;
    public final EObject ruleSubPathNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1941:28: ( ( () otherlv_1= '**' ) )
            // InternalAspectLang.g:1942:1: ( () otherlv_1= '**' )
            {
            // InternalAspectLang.g:1942:1: ( () otherlv_1= '**' )
            // InternalAspectLang.g:1942:2: () otherlv_1= '**'
            {
            // InternalAspectLang.g:1942:2: ()
            // InternalAspectLang.g:1943:2: 
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
    // InternalAspectLang.g:1963:1: entryRuleParentNode returns [EObject current=null] : iv_ruleParentNode= ruleParentNode EOF ;
    public final EObject entryRuleParentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentNode = null;


        try {
            // InternalAspectLang.g:1964:2: (iv_ruleParentNode= ruleParentNode EOF )
            // InternalAspectLang.g:1965:2: iv_ruleParentNode= ruleParentNode EOF
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
    // InternalAspectLang.g:1972:1: ruleParentNode returns [EObject current=null] : ( () otherlv_1= 'up' ) ;
    public final EObject ruleParentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:1975:28: ( ( () otherlv_1= 'up' ) )
            // InternalAspectLang.g:1976:1: ( () otherlv_1= 'up' )
            {
            // InternalAspectLang.g:1976:1: ( () otherlv_1= 'up' )
            // InternalAspectLang.g:1976:2: () otherlv_1= 'up'
            {
            // InternalAspectLang.g:1976:2: ()
            // InternalAspectLang.g:1977:2: 
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
    // InternalAspectLang.g:1997:1: entryRulePropertyConstraint returns [EObject current=null] : iv_rulePropertyConstraint= rulePropertyConstraint EOF ;
    public final EObject entryRulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraint = null;


        try {
            // InternalAspectLang.g:1998:2: (iv_rulePropertyConstraint= rulePropertyConstraint EOF )
            // InternalAspectLang.g:1999:2: iv_rulePropertyConstraint= rulePropertyConstraint EOF
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
    // InternalAspectLang.g:2006:1: rulePropertyConstraint returns [EObject current=null] : (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) ;
    public final EObject rulePropertyConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyConstraintCompare_0 = null;

        Enumerator lv_logic_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2009:28: ( (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? ) )
            // InternalAspectLang.g:2010:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            {
            // InternalAspectLang.g:2010:1: (this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )? )
            // InternalAspectLang.g:2011:2: this_PropertyConstraintCompare_0= rulePropertyConstraintCompare ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
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
            // InternalAspectLang.g:2022:1: ( () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=56 && LA34_0<=57)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:2022:2: () ( (lv_logic_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    {
                    // InternalAspectLang.g:2022:2: ()
                    // InternalAspectLang.g:2023:2: 
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

                    // InternalAspectLang.g:2031:2: ( (lv_logic_2_0= ruleLogicOperator ) )
                    // InternalAspectLang.g:2032:1: (lv_logic_2_0= ruleLogicOperator )
                    {
                    // InternalAspectLang.g:2032:1: (lv_logic_2_0= ruleLogicOperator )
                    // InternalAspectLang.g:2033:3: lv_logic_2_0= ruleLogicOperator
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
                              		"kieker.develop.al.AspectLang.LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:2049:2: ( (lv_right_3_0= rulePropertyConstraintCompare ) )
                    // InternalAspectLang.g:2050:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    {
                    // InternalAspectLang.g:2050:1: (lv_right_3_0= rulePropertyConstraintCompare )
                    // InternalAspectLang.g:2051:3: lv_right_3_0= rulePropertyConstraintCompare
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
                              		"kieker.develop.al.AspectLang.PropertyConstraintCompare");
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
    // InternalAspectLang.g:2075:1: entryRulePropertyConstraintCompare returns [EObject current=null] : iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF ;
    public final EObject entryRulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstraintCompare = null;


        try {
            // InternalAspectLang.g:2076:2: (iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:2077:2: iv_rulePropertyConstraintCompare= rulePropertyConstraintCompare EOF
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
    // InternalAspectLang.g:2084:1: rulePropertyConstraintCompare returns [EObject current=null] : (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) ;
    public final EObject rulePropertyConstraintCompare() throws RecognitionException {
        EObject current = null;

        EObject this_ConstraintElement_0 = null;

        Enumerator lv_compare_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2087:28: ( (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? ) )
            // InternalAspectLang.g:2088:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            {
            // InternalAspectLang.g:2088:1: (this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )? )
            // InternalAspectLang.g:2089:2: this_ConstraintElement_0= ruleConstraintElement ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
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
            // InternalAspectLang.g:2100:1: ( () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=58 && LA35_0<=64)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:2100:2: () ( (lv_compare_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleConstraintElement ) )
                    {
                    // InternalAspectLang.g:2100:2: ()
                    // InternalAspectLang.g:2101:2: 
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

                    // InternalAspectLang.g:2109:2: ( (lv_compare_2_0= ruleCompareOperator ) )
                    // InternalAspectLang.g:2110:1: (lv_compare_2_0= ruleCompareOperator )
                    {
                    // InternalAspectLang.g:2110:1: (lv_compare_2_0= ruleCompareOperator )
                    // InternalAspectLang.g:2111:3: lv_compare_2_0= ruleCompareOperator
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
                              		"kieker.develop.al.AspectLang.CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAspectLang.g:2127:2: ( (lv_right_3_0= ruleConstraintElement ) )
                    // InternalAspectLang.g:2128:1: (lv_right_3_0= ruleConstraintElement )
                    {
                    // InternalAspectLang.g:2128:1: (lv_right_3_0= ruleConstraintElement )
                    // InternalAspectLang.g:2129:3: lv_right_3_0= ruleConstraintElement
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
                              		"kieker.develop.al.AspectLang.ConstraintElement");
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
    // InternalAspectLang.g:2153:1: entryRuleConstraintElement returns [EObject current=null] : iv_ruleConstraintElement= ruleConstraintElement EOF ;
    public final EObject entryRuleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintElement = null;


        try {
            // InternalAspectLang.g:2154:2: (iv_ruleConstraintElement= ruleConstraintElement EOF )
            // InternalAspectLang.g:2155:2: iv_ruleConstraintElement= ruleConstraintElement EOF
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
    // InternalAspectLang.g:2162:1: ruleConstraintElement returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) ;
    public final EObject ruleConstraintElement() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_LocalQuery_1 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2165:28: ( (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery ) )
            // InternalAspectLang.g:2166:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            {
            // InternalAspectLang.g:2166:1: (this_Literal_0= ruleLiteral | this_LocalQuery_1= ruleLocalQuery )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_INT)) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID||LA36_0==26||(LA36_0>=35 && LA36_0<=38)||(LA36_0>=54 && LA36_0<=55)) ) {
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
                    // InternalAspectLang.g:2167:2: this_Literal_0= ruleLiteral
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
                    // InternalAspectLang.g:2180:2: this_LocalQuery_1= ruleLocalQuery
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
    // InternalAspectLang.g:2199:1: entryRuleLocalQuery returns [EObject current=null] : iv_ruleLocalQuery= ruleLocalQuery EOF ;
    public final EObject entryRuleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalQuery = null;


        try {
            // InternalAspectLang.g:2200:2: (iv_ruleLocalQuery= ruleLocalQuery EOF )
            // InternalAspectLang.g:2201:2: iv_ruleLocalQuery= ruleLocalQuery EOF
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
    // InternalAspectLang.g:2208:1: ruleLocalQuery returns [EObject current=null] : ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) ;
    public final EObject ruleLocalQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_locationQuery_0_0 = null;

        EObject lv_property_1_0 = null;

        EObject lv_typeof_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2211:28: ( ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) ) )
            // InternalAspectLang.g:2212:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            {
            // InternalAspectLang.g:2212:1: ( ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) ) )
            // InternalAspectLang.g:2212:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )? ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
            {
            // InternalAspectLang.g:2212:2: ( (lv_locationQuery_0_0= ruleLocationQuery ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=35 && LA37_0<=37)||(LA37_0>=54 && LA37_0<=55)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAspectLang.g:2213:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    {
                    // InternalAspectLang.g:2213:1: (lv_locationQuery_0_0= ruleLocationQuery )
                    // InternalAspectLang.g:2214:3: lv_locationQuery_0_0= ruleLocationQuery
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
                              		"kieker.develop.al.AspectLang.LocationQuery");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAspectLang.g:2230:3: ( ( (lv_property_1_0= ruleModelProperty ) ) | ( (lv_typeof_2_0= ruleTypeof ) ) )
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
                    // InternalAspectLang.g:2230:4: ( (lv_property_1_0= ruleModelProperty ) )
                    {
                    // InternalAspectLang.g:2230:4: ( (lv_property_1_0= ruleModelProperty ) )
                    // InternalAspectLang.g:2231:1: (lv_property_1_0= ruleModelProperty )
                    {
                    // InternalAspectLang.g:2231:1: (lv_property_1_0= ruleModelProperty )
                    // InternalAspectLang.g:2232:3: lv_property_1_0= ruleModelProperty
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
                              		"kieker.develop.al.AspectLang.ModelProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2249:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    {
                    // InternalAspectLang.g:2249:6: ( (lv_typeof_2_0= ruleTypeof ) )
                    // InternalAspectLang.g:2250:1: (lv_typeof_2_0= ruleTypeof )
                    {
                    // InternalAspectLang.g:2250:1: (lv_typeof_2_0= ruleTypeof )
                    // InternalAspectLang.g:2251:3: lv_typeof_2_0= ruleTypeof
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
                              		"kieker.develop.al.AspectLang.Typeof");
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
    // InternalAspectLang.g:2275:1: entryRuleModelProperty returns [EObject current=null] : iv_ruleModelProperty= ruleModelProperty EOF ;
    public final EObject entryRuleModelProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelProperty = null;


        try {
            // InternalAspectLang.g:2276:2: (iv_ruleModelProperty= ruleModelProperty EOF )
            // InternalAspectLang.g:2277:2: iv_ruleModelProperty= ruleModelProperty EOF
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
    // InternalAspectLang.g:2284:1: ruleModelProperty returns [EObject current=null] : (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2287:28: ( (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAspectLang.g:2288:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAspectLang.g:2288:1: (otherlv_0= '#' ( (otherlv_1= RULE_ID ) ) )
            // InternalAspectLang.g:2288:3: otherlv_0= '#' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0());
                  
            }
            // InternalAspectLang.g:2292:1: ( (otherlv_1= RULE_ID ) )
            // InternalAspectLang.g:2293:1: (otherlv_1= RULE_ID )
            {
            // InternalAspectLang.g:2293:1: (otherlv_1= RULE_ID )
            // InternalAspectLang.g:2294:3: otherlv_1= RULE_ID
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
    // InternalAspectLang.g:2316:1: entryRuleTypeof returns [EObject current=null] : iv_ruleTypeof= ruleTypeof EOF ;
    public final EObject entryRuleTypeof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeof = null;


        try {
            // InternalAspectLang.g:2317:2: (iv_ruleTypeof= ruleTypeof EOF )
            // InternalAspectLang.g:2318:2: iv_ruleTypeof= ruleTypeof EOF
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
    // InternalAspectLang.g:2325:1: ruleTypeof returns [EObject current=null] : (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' ) ;
    public final EObject ruleTypeof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_reference_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2328:28: ( (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' ) )
            // InternalAspectLang.g:2329:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' )
            {
            // InternalAspectLang.g:2329:1: (otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')' )
            // InternalAspectLang.g:2329:3: otherlv_0= 'istypeof' otherlv_1= '(' ( (lv_reference_2_0= ruleTypeReference ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeofAccess().getIstypeofKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalAspectLang.g:2337:1: ( (lv_reference_2_0= ruleTypeReference ) )
            // InternalAspectLang.g:2338:1: (lv_reference_2_0= ruleTypeReference )
            {
            // InternalAspectLang.g:2338:1: (lv_reference_2_0= ruleTypeReference )
            // InternalAspectLang.g:2339:3: lv_reference_2_0= ruleTypeReference
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
                      		"kieker.develop.al.AspectLang.TypeReference");
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
    // InternalAspectLang.g:2367:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalAspectLang.g:2368:2: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalAspectLang.g:2369:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalAspectLang.g:2376:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2379:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral ) )
            // InternalAspectLang.g:2380:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
            {
            // InternalAspectLang.g:2380:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral )
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
                    // InternalAspectLang.g:2381:2: this_StringLiteral_0= ruleStringLiteral
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
                    // InternalAspectLang.g:2394:2: this_IntLiteral_1= ruleIntLiteral
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
                    // InternalAspectLang.g:2407:2: this_FloatLiteral_2= ruleFloatLiteral
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
    // InternalAspectLang.g:2426:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalAspectLang.g:2427:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalAspectLang.g:2428:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
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
    // InternalAspectLang.g:2435:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2438:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalAspectLang.g:2439:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalAspectLang.g:2439:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalAspectLang.g:2440:1: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalAspectLang.g:2440:1: (lv_value_0_0= RULE_FLOAT )
            // InternalAspectLang.g:2441:3: lv_value_0_0= RULE_FLOAT
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
                      		"kieker.develop.al.AspectLang.FLOAT");
              	    
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
    // InternalAspectLang.g:2465:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalAspectLang.g:2466:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalAspectLang.g:2467:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalAspectLang.g:2474:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2477:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAspectLang.g:2478:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAspectLang.g:2478:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalAspectLang.g:2479:1: (lv_value_0_0= RULE_INT )
            {
            // InternalAspectLang.g:2479:1: (lv_value_0_0= RULE_INT )
            // InternalAspectLang.g:2480:3: lv_value_0_0= RULE_INT
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
                      		"kieker.develop.al.AspectLang.INT");
              	    
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
    // InternalAspectLang.g:2504:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAspectLang.g:2505:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAspectLang.g:2506:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalAspectLang.g:2513:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2516:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAspectLang.g:2517:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAspectLang.g:2517:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAspectLang.g:2518:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalAspectLang.g:2518:1: (lv_value_0_0= RULE_STRING )
            // InternalAspectLang.g:2519:3: lv_value_0_0= RULE_STRING
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
    // InternalAspectLang.g:2543:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalAspectLang.g:2544:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalAspectLang.g:2545:2: iv_ruleTypeReference= ruleTypeReference EOF
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
    // InternalAspectLang.g:2552:1: ruleTypeReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_collection_3_0=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2555:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? ) )
            // InternalAspectLang.g:2556:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? )
            {
            // InternalAspectLang.g:2556:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )? )
            // InternalAspectLang.g:2556:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_collection_3_0= '[]' ) )?
            {
            // InternalAspectLang.g:2556:2: ( (otherlv_0= RULE_ID ) )
            // InternalAspectLang.g:2557:1: (otherlv_0= RULE_ID )
            {
            // InternalAspectLang.g:2557:1: (otherlv_0= RULE_ID )
            // InternalAspectLang.g:2558:3: otherlv_0= RULE_ID
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
            // InternalAspectLang.g:2576:1: ( (otherlv_2= RULE_ID ) )
            // InternalAspectLang.g:2577:1: (otherlv_2= RULE_ID )
            {
            // InternalAspectLang.g:2577:1: (otherlv_2= RULE_ID )
            // InternalAspectLang.g:2578:3: otherlv_2= RULE_ID
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

            // InternalAspectLang.g:2592:2: ( (lv_collection_3_0= '[]' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:2593:1: (lv_collection_3_0= '[]' )
                    {
                    // InternalAspectLang.g:2593:1: (lv_collection_3_0= '[]' )
                    // InternalAspectLang.g:2594:3: lv_collection_3_0= '[]'
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
    // InternalAspectLang.g:2615:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAspectLang.g:2616:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAspectLang.g:2617:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAspectLang.g:2624:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalAspectLang.g:2627:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalAspectLang.g:2628:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalAspectLang.g:2628:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalAspectLang.g:2628:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // InternalAspectLang.g:2635:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
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
            	    // InternalAspectLang.g:2635:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalAspectLang.g:2635:2: ( ( '.' )=>kw= '.' )
            	    // InternalAspectLang.g:2635:3: ( '.' )=>kw= '.'
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
    // InternalAspectLang.g:2658:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalAspectLang.g:2659:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:2660:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:2667:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // InternalAspectLang.g:2670:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // InternalAspectLang.g:2671:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // InternalAspectLang.g:2671:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // InternalAspectLang.g:2672:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
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
            // InternalAspectLang.g:2682:1: (kw= '.' kw= '*' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==31) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:2683:2: kw= '.' kw= '*'
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
    // InternalAspectLang.g:2702:1: ruleInsertionPoint returns [Enumerator current=null] : ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) | (enumLiteral_2= 'exception' ) ) ;
    public final Enumerator ruleInsertionPoint() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2704:28: ( ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) | (enumLiteral_2= 'exception' ) ) )
            // InternalAspectLang.g:2705:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) | (enumLiteral_2= 'exception' ) )
            {
            // InternalAspectLang.g:2705:1: ( (enumLiteral_0= 'before' ) | (enumLiteral_1= 'after' ) | (enumLiteral_2= 'exception' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt43=1;
                }
                break;
            case 41:
                {
                alt43=2;
                }
                break;
            case 42:
                {
                alt43=3;
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
                    // InternalAspectLang.g:2705:2: (enumLiteral_0= 'before' )
                    {
                    // InternalAspectLang.g:2705:2: (enumLiteral_0= 'before' )
                    // InternalAspectLang.g:2705:4: enumLiteral_0= 'before'
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
                    // InternalAspectLang.g:2711:6: (enumLiteral_1= 'after' )
                    {
                    // InternalAspectLang.g:2711:6: (enumLiteral_1= 'after' )
                    // InternalAspectLang.g:2711:8: enumLiteral_1= 'after'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2717:6: (enumLiteral_2= 'exception' )
                    {
                    // InternalAspectLang.g:2717:6: (enumLiteral_2= 'exception' )
                    // InternalAspectLang.g:2717:8: enumLiteral_2= 'exception'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInsertionPointAccess().getAFTER_EXCEPTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getInsertionPointAccess().getAFTER_EXCEPTIONEnumLiteralDeclaration_2()); 
                          
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
    // InternalAspectLang.g:2727:1: ruleInternalFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) ;
    public final Enumerator ruleInternalFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2729:28: ( ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) ) )
            // InternalAspectLang.g:2730:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            {
            // InternalAspectLang.g:2730:1: ( (enumLiteral_0= 'time' ) | (enumLiteral_1= 'traceId' ) | (enumLiteral_2= 'orderIndex' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt44=1;
                }
                break;
            case 44:
                {
                alt44=2;
                }
                break;
            case 45:
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
                    // InternalAspectLang.g:2730:2: (enumLiteral_0= 'time' )
                    {
                    // InternalAspectLang.g:2730:2: (enumLiteral_0= 'time' )
                    // InternalAspectLang.g:2730:4: enumLiteral_0= 'time'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2736:6: (enumLiteral_1= 'traceId' )
                    {
                    // InternalAspectLang.g:2736:6: (enumLiteral_1= 'traceId' )
                    // InternalAspectLang.g:2736:8: enumLiteral_1= 'traceId'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2742:6: (enumLiteral_2= 'orderIndex' )
                    {
                    // InternalAspectLang.g:2742:6: (enumLiteral_2= 'orderIndex' )
                    // InternalAspectLang.g:2742:8: enumLiteral_2= 'orderIndex'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2752:1: ruleReflectionFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) ;
    public final Enumerator ruleReflectionFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2754:28: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) ) )
            // InternalAspectLang.g:2755:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            {
            // InternalAspectLang.g:2755:1: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'signature' ) | (enumLiteral_2= 'classname' ) | (enumLiteral_3= 'return-type' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt45=1;
                }
                break;
            case 47:
                {
                alt45=2;
                }
                break;
            case 48:
                {
                alt45=3;
                }
                break;
            case 49:
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
                    // InternalAspectLang.g:2755:2: (enumLiteral_0= 'name' )
                    {
                    // InternalAspectLang.g:2755:2: (enumLiteral_0= 'name' )
                    // InternalAspectLang.g:2755:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2761:6: (enumLiteral_1= 'signature' )
                    {
                    // InternalAspectLang.g:2761:6: (enumLiteral_1= 'signature' )
                    // InternalAspectLang.g:2761:8: enumLiteral_1= 'signature'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2767:6: (enumLiteral_2= 'classname' )
                    {
                    // InternalAspectLang.g:2767:6: (enumLiteral_2= 'classname' )
                    // InternalAspectLang.g:2767:8: enumLiteral_2= 'classname'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2773:6: (enumLiteral_3= 'return-type' )
                    {
                    // InternalAspectLang.g:2773:6: (enumLiteral_3= 'return-type' )
                    // InternalAspectLang.g:2773:8: enumLiteral_3= 'return-type'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2783:1: ruleTechnology returns [Enumerator current=null] : ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) ) ;
    public final Enumerator ruleTechnology() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2785:28: ( ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) ) )
            // InternalAspectLang.g:2786:1: ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) )
            {
            // InternalAspectLang.g:2786:1: ( (enumLiteral_0= 'javaee' ) | (enumLiteral_1= 'servlet' ) | (enumLiteral_2= 'spring' ) | (enumLiteral_3= 'aspectj' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt46=1;
                }
                break;
            case 51:
                {
                alt46=2;
                }
                break;
            case 52:
                {
                alt46=3;
                }
                break;
            case 53:
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
                    // InternalAspectLang.g:2786:2: (enumLiteral_0= 'javaee' )
                    {
                    // InternalAspectLang.g:2786:2: (enumLiteral_0= 'javaee' )
                    // InternalAspectLang.g:2786:4: enumLiteral_0= 'javaee'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2792:6: (enumLiteral_1= 'servlet' )
                    {
                    // InternalAspectLang.g:2792:6: (enumLiteral_1= 'servlet' )
                    // InternalAspectLang.g:2792:8: enumLiteral_1= 'servlet'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2798:6: (enumLiteral_2= 'spring' )
                    {
                    // InternalAspectLang.g:2798:6: (enumLiteral_2= 'spring' )
                    // InternalAspectLang.g:2798:8: enumLiteral_2= 'spring'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2804:6: (enumLiteral_3= 'aspectj' )
                    {
                    // InternalAspectLang.g:2804:6: (enumLiteral_3= 'aspectj' )
                    // InternalAspectLang.g:2804:8: enumLiteral_3= 'aspectj'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2814:1: ruleQueryModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) ;
    public final Enumerator ruleQueryModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2816:28: ( ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) ) )
            // InternalAspectLang.g:2817:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            {
            // InternalAspectLang.g:2817:1: ( (enumLiteral_0= 'include' ) | (enumLiteral_1= 'exclude' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            else if ( (LA47_0==55) ) {
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
                    // InternalAspectLang.g:2817:2: (enumLiteral_0= 'include' )
                    {
                    // InternalAspectLang.g:2817:2: (enumLiteral_0= 'include' )
                    // InternalAspectLang.g:2817:4: enumLiteral_0= 'include'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2823:6: (enumLiteral_1= 'exclude' )
                    {
                    // InternalAspectLang.g:2823:6: (enumLiteral_1= 'exclude' )
                    // InternalAspectLang.g:2823:8: enumLiteral_1= 'exclude'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2833:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAspectLang.g:2835:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // InternalAspectLang.g:2836:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // InternalAspectLang.g:2836:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            else if ( (LA48_0==57) ) {
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
                    // InternalAspectLang.g:2836:2: (enumLiteral_0= '&&' )
                    {
                    // InternalAspectLang.g:2836:2: (enumLiteral_0= '&&' )
                    // InternalAspectLang.g:2836:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2842:6: (enumLiteral_1= '||' )
                    {
                    // InternalAspectLang.g:2842:6: (enumLiteral_1= '||' )
                    // InternalAspectLang.g:2842:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
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
    // InternalAspectLang.g:2852:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) ;
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
            // InternalAspectLang.g:2854:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) ) )
            // InternalAspectLang.g:2855:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            {
            // InternalAspectLang.g:2855:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '~' ) | (enumLiteral_2= '!=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<' ) | (enumLiteral_5= '>=' ) | (enumLiteral_6= '<=' ) )
            int alt49=7;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt49=1;
                }
                break;
            case 59:
                {
                alt49=2;
                }
                break;
            case 60:
                {
                alt49=3;
                }
                break;
            case 61:
                {
                alt49=4;
                }
                break;
            case 62:
                {
                alt49=5;
                }
                break;
            case 63:
                {
                alt49=6;
                }
                break;
            case 64:
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
                    // InternalAspectLang.g:2855:2: (enumLiteral_0= '=' )
                    {
                    // InternalAspectLang.g:2855:2: (enumLiteral_0= '=' )
                    // InternalAspectLang.g:2855:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:2861:6: (enumLiteral_1= '~' )
                    {
                    // InternalAspectLang.g:2861:6: (enumLiteral_1= '~' )
                    // InternalAspectLang.g:2861:8: enumLiteral_1= '~'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:2867:6: (enumLiteral_2= '!=' )
                    {
                    // InternalAspectLang.g:2867:6: (enumLiteral_2= '!=' )
                    // InternalAspectLang.g:2867:8: enumLiteral_2= '!='
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:2873:6: (enumLiteral_3= '>' )
                    {
                    // InternalAspectLang.g:2873:6: (enumLiteral_3= '>' )
                    // InternalAspectLang.g:2873:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAspectLang.g:2879:6: (enumLiteral_4= '<' )
                    {
                    // InternalAspectLang.g:2879:6: (enumLiteral_4= '<' )
                    // InternalAspectLang.g:2879:8: enumLiteral_4= '<'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAspectLang.g:2885:6: (enumLiteral_5= '>=' )
                    {
                    // InternalAspectLang.g:2885:6: (enumLiteral_5= '>=' )
                    // InternalAspectLang.g:2885:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAspectLang.g:2891:6: (enumLiteral_6= '<=' )
                    {
                    // InternalAspectLang.g:2891:6: (enumLiteral_6= '<=' )
                    // InternalAspectLang.g:2891:8: enumLiteral_6= '<='
                    {
                    enumLiteral_6=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\4\10\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\67\10\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\7\uffff\1\3\2\uffff\1\4";
    static final String dfa_5s = "\11\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\3\1\21\uffff\2\4\10\uffff\3\4\5\uffff\3\14\10\uffff\2\4",
            "",
            "",
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
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalAspectLang()) ) {s = 4;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index15_9);
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00C03838062000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00C03838060000F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000070001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00C0003806000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00C0003800000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080800002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00C0003801000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C00078040000F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFC00000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});

}
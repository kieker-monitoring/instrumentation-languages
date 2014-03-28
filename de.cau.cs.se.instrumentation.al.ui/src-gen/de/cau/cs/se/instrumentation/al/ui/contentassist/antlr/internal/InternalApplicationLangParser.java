package de.cau.cs.se.instrumentation.al.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.se.instrumentation.al.services.ApplicationLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalApplicationLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'", "'package'", "'register'", "'use'", "'on'", "','", "'.'", "'aspect'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'#'", "'$'", "'**'"
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
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g"; }


     
     	private ApplicationLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ApplicationLangGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:89:1: entryRuleRegisteredPackage : ruleRegisteredPackage EOF ;
    public final void entryRuleRegisteredPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:90:1: ( ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:91:1: ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage127);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegisteredPackage"


    // $ANTLR start "ruleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:98:1: ruleRegisteredPackage : ( ( rule__RegisteredPackage__Group__0 ) ) ;
    public final void ruleRegisteredPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:102:2: ( ( ( rule__RegisteredPackage__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__RegisteredPackage__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__RegisteredPackage__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:104:1: ( rule__RegisteredPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:1: ( rule__RegisteredPackage__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:2: rule__RegisteredPackage__Group__0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage160);
            rule__RegisteredPackage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisteredPackage"


    // $ANTLR start "entryRuleApplicationModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:117:1: entryRuleApplicationModel : ruleApplicationModel EOF ;
    public final void entryRuleApplicationModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:118:1: ( ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:119:1: ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel187);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplicationModel"


    // $ANTLR start "ruleApplicationModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:126:1: ruleApplicationModel : ( ( rule__ApplicationModel__Group__0 ) ) ;
    public final void ruleApplicationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:130:2: ( ( ( rule__ApplicationModel__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__ApplicationModel__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__ApplicationModel__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:132:1: ( rule__ApplicationModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:1: ( rule__ApplicationModel__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:2: rule__ApplicationModel__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel220);
            rule__ApplicationModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicationModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:146:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAspect"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:175:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:176:1: ( ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:177:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect309);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect316); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:184:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:188:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:1: ( ( rule__Aspect__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:190:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:191:1: ( rule__Aspect__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:191:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0_in_ruleAspect342);
            rule__Aspect__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:203:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:204:1: ( ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:205:1: ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery369);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery376); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:212:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:216:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:1: ( ( rule__Query__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:218:1: ( rule__Query__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:219:1: ( rule__Query__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:219:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery402);
            rule__Query__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParameterPattern"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:231:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:232:1: ( ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:233:1: ruleParameterPattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternRule()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern429);
            ruleParameterPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterPattern436); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterPattern"


    // $ANTLR start "ruleParameterPattern"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:240:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:244:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:1: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:1: ( ( rule__ParameterPattern__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:246:1: ( rule__ParameterPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:247:1: ( rule__ParameterPattern__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:247:2: rule__ParameterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern462);
            rule__ParameterPattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPattern"


    // $ANTLR start "entryRuleLocationQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:259:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:260:1: ( ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:261:1: ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery489);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery496); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocationQuery"


    // $ANTLR start "ruleLocationQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:268:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:272:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:1: ( ( rule__LocationQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:274:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:275:1: ( rule__LocationQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:275:2: rule__LocationQuery__Group__0
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery522);
            rule__LocationQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocationQuery"


    // $ANTLR start "entryRuleNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:287:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:288:1: ( ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:289:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode549);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode556); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:296:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:300:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:1: ( ( rule__Node__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:1: ( ( rule__Node__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:302:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:303:1: ( rule__Node__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:303:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode582);
            rule__Node__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleParamQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:315:1: entryRuleParamQuery : ruleParamQuery EOF ;
    public final void entryRuleParamQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:316:1: ( ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:317:1: ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery609);
            ruleParamQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery616); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamQuery"


    // $ANTLR start "ruleParamQuery"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:324:1: ruleParamQuery : ( ( rule__ParamQuery__Group__0 ) ) ;
    public final void ruleParamQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:328:2: ( ( ( rule__ParamQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:1: ( ( rule__ParamQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:1: ( ( rule__ParamQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:330:1: ( rule__ParamQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:331:1: ( rule__ParamQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:331:2: rule__ParamQuery__Group__0
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery642);
            rule__ParamQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamQuery"


    // $ANTLR start "entryRuleParamCompare"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:343:1: entryRuleParamCompare : ruleParamCompare EOF ;
    public final void entryRuleParamCompare() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:344:1: ( ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:345:1: ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare669);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare676); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamCompare"


    // $ANTLR start "ruleParamCompare"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:352:1: ruleParamCompare : ( ( rule__ParamCompare__Group__0 ) ) ;
    public final void ruleParamCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:356:2: ( ( ( rule__ParamCompare__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:1: ( ( rule__ParamCompare__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:1: ( ( rule__ParamCompare__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:358:1: ( rule__ParamCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:359:1: ( rule__ParamCompare__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:359:2: rule__ParamCompare__Group__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare702);
            rule__ParamCompare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamCompare"


    // $ANTLR start "entryRuleValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:371:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:372:1: ( ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:373:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue729);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue736); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:380:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:384:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:1: ( ( rule__Value__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:386:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:387:1: ( rule__Value__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:387:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue762);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloatValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:399:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:400:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:401:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue789);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue796); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:408:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:412:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:414:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:415:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:415:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue822);
            rule__FloatValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleIntValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:427:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:428:1: ( ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:429:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue849);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue856); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:436:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:440:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:442:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:443:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:443:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue882);
            rule__IntValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:455:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:456:1: ( ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:457:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue909);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue916); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:464:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:468:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:470:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:471:1: ( rule__StringValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:471:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue942);
            rule__StringValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleReferenceValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:483:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:484:1: ( ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:485:1: ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue969);
            ruleReferenceValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue976); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReferenceValue"


    // $ANTLR start "ruleReferenceValue"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:492:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:496:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:1: ( ( rule__ReferenceValue__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:498:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:499:1: ( rule__ReferenceValue__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:499:2: rule__ReferenceValue__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1002);
            rule__ReferenceValue__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceValue"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:511:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:512:1: ( ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:513:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1029);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1036); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:520:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:524:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:1: ( ( rule__Parameter__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:526:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:527:1: ( rule__Parameter__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:527:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1062);
            rule__Parameter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:539:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:540:1: ( ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:541:1: ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1089);
            ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty1096); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuntimeProperty"


    // $ANTLR start "ruleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:548:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:552:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:554:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:555:1: ( rule__RuntimeProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:555:2: rule__RuntimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1122);
            rule__RuntimeProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuntimeProperty"


    // $ANTLR start "entryRuleReflectionProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:567:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:568:1: ( ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:569:1: ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1149);
            ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty1156); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReflectionProperty"


    // $ANTLR start "ruleReflectionProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:576:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:580:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:582:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:583:1: ( rule__ReflectionProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:583:2: rule__ReflectionProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1182);
            rule__ReflectionProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflectionProperty"


    // $ANTLR start "entryRuleContainerNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:595:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:596:1: ( ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:597:1: ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode1209);
            ruleContainerNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode1216); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContainerNode"


    // $ANTLR start "ruleContainerNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:604:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:608:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:610:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:611:1: ( rule__ContainerNode__ContainerAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:611:2: rule__ContainerNode__ContainerAssignment
            {
            pushFollow(FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1242);
            rule__ContainerNode__ContainerAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContainerNode"


    // $ANTLR start "entryRuleWildcardNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:623:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:624:1: ( ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:625:1: ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1269);
            ruleWildcardNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode1276); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWildcardNode"


    // $ANTLR start "ruleWildcardNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:632:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:636:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:1: ( ( rule__WildcardNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:638:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:639:1: ( rule__WildcardNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:639:2: rule__WildcardNode__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1302);
            rule__WildcardNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWildcardNode"


    // $ANTLR start "entryRuleSubPathNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:651:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:652:1: ( ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:653:1: ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1329);
            ruleSubPathNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode1336); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubPathNode"


    // $ANTLR start "ruleSubPathNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:660:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:664:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:1: ( ( rule__SubPathNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:666:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:667:1: ( rule__SubPathNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:667:2: rule__SubPathNode__Group__0
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1362);
            rule__SubPathNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubPathNode"


    // $ANTLR start "entryRuleCollector"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:679:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:680:1: ( ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:681:1: ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector1389);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector1396); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollector"


    // $ANTLR start "ruleCollector"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:688:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:692:2: ( ( ( rule__Collector__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:1: ( ( rule__Collector__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:1: ( ( rule__Collector__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:694:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:695:1: ( rule__Collector__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:695:2: rule__Collector__Group__0
            {
            pushFollow(FOLLOW_rule__Collector__Group__0_in_ruleCollector1422);
            rule__Collector__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollector"


    // $ANTLR start "ruleReflectionFunction"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:708:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:712:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:713:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:713:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:714:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:715:1: ( rule__ReflectionFunction__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:715:2: rule__ReflectionFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction1459);
            rule__ReflectionFunction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflectionFunction"


    // $ANTLR start "ruleOperator"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:727:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:731:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:732:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:732:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:733:1: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:734:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:734:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1495);
            rule__Operator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleInsertionPoint"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:746:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:750:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:751:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:751:1: ( ( rule__InsertionPoint__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:752:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:753:1: ( rule__InsertionPoint__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:753:2: rule__InsertionPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint1531);
            rule__InsertionPoint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertionPoint"


    // $ANTLR start "rule__Query__Alternatives_1_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:764:1: rule__Query__Alternatives_1_0 : ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:768:1: ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:769:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:769:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:770:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:771:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:771:2: rule__Query__ModifierAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_01566);
                    rule__Query__ModifierAssignment_1_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:775:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:775:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:776:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Query__Alternatives_1_01585); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives_1_0"


    // $ANTLR start "rule__Query__Alternatives_1_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:788:1: rule__Query__Alternatives_1_1 : ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:792:1: ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:793:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:793:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:794:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:795:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:795:2: rule__Query__ReturnTypeAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_11619);
                    rule__Query__ReturnTypeAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:799:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:799:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:800:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Query__Alternatives_1_11638); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives_1_1"


    // $ANTLR start "rule__Node__Alternatives_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:812:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:816:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt3=1;
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:817:1: ( ruleSubPathNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:817:1: ( ruleSubPathNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:818:1: ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_01672);
                    ruleSubPathNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:823:6: ( ruleWildcardNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:823:6: ( ruleWildcardNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:824:1: ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_01689);
                    ruleWildcardNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:829:6: ( ruleContainerNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:829:6: ( ruleContainerNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:830:1: ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_01706);
                    ruleContainerNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:840:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:844:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred6_InternalApplicationLang()) ) {
                    alt4=2;
                }
                else if ( (synpred7_InternalApplicationLang()) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 11:
            case 40:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:845:1: ( ruleStringValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:845:1: ( ruleStringValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:846:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives1738);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:851:6: ( ruleIntValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:851:6: ( ruleIntValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:852:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives1755);
                    ruleIntValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:857:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:857:6: ( ruleFloatValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:858:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__Alternatives1772);
                    ruleFloatValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:863:6: ( ruleReferenceValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:863:6: ( ruleReferenceValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:864:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives1789);
                    ruleReferenceValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:874:1: rule__Parameter__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:878:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:879:1: ( ruleRuntimeProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:879:1: ( ruleRuntimeProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:880:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives1821);
                    ruleRuntimeProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:885:6: ( ruleReflectionProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:885:6: ( ruleReflectionProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:886:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives1838);
                    ruleReflectionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__ReflectionFunction__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:896:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:900:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:901:1: ( ( 'name' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:901:1: ( ( 'name' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:902:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:903:1: ( 'name' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:903:3: 'name'
                    {
                    match(input,12,FOLLOW_12_in_rule__ReflectionFunction__Alternatives1871); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:908:6: ( ( 'signature' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:908:6: ( ( 'signature' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:909:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:910:1: ( 'signature' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:910:3: 'signature'
                    {
                    match(input,13,FOLLOW_13_in_rule__ReflectionFunction__Alternatives1892); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:915:6: ( ( 'class' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:915:6: ( ( 'class' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:916:1: ( 'class' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:917:1: ( 'class' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:917:3: 'class'
                    {
                    match(input,14,FOLLOW_14_in_rule__ReflectionFunction__Alternatives1913); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:922:6: ( ( 'return-type' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:922:6: ( ( 'return-type' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:923:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:924:1: ( 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:924:3: 'return-type'
                    {
                    match(input,15,FOLLOW_15_in_rule__ReflectionFunction__Alternatives1934); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionFunction__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:934:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:938:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:939:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:939:1: ( ( '=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:940:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:941:1: ( '=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:941:3: '='
                    {
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives1970); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:946:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:946:6: ( ( '~' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:947:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:948:1: ( '~' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:948:3: '~'
                    {
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives1991); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:953:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:953:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:954:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:955:1: ( '!=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:955:3: '!='
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives2012); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:960:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:960:6: ( ( '>' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:961:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:962:1: ( '>' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:962:3: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives2033); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:967:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:967:6: ( ( '<' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:968:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:969:1: ( '<' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:969:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives2054); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:974:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:974:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:975:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:976:1: ( '>=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:976:3: '>='
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives2075); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:981:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:981:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:982:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:983:1: ( '<=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:983:3: '<='
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives2096); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__InsertionPoint__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:993:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:997:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:998:1: ( ( 'before' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:998:1: ( ( 'before' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:999:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1000:1: ( 'before' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1000:3: 'before'
                    {
                    match(input,23,FOLLOW_23_in_rule__InsertionPoint__Alternatives2132); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1005:6: ( ( 'after' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1005:6: ( ( 'after' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1006:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1007:1: ( 'after' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1007:3: 'after'
                    {
                    match(input,24,FOLLOW_24_in_rule__InsertionPoint__Alternatives2153); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertionPoint__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1019:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1023:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1024:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02186);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02189);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1031:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1035:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1036:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1036:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1037:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Model__Group__0__Impl2217); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1050:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1054:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1055:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12248);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12251);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1062:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1066:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1067:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1067:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1068:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1069:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1069:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2278);
            rule__Model__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1079:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1083:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1084:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22308);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22311);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1091:1: rule__Model__Group__2__Impl : ( ( rule__Model__MetamodelsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1095:1: ( ( ( rule__Model__MetamodelsAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1096:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1096:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1097:1: ( rule__Model__MetamodelsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1098:1: ( rule__Model__MetamodelsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1098:2: rule__Model__MetamodelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl2338);
            	    rule__Model__MetamodelsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1108:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1112:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1113:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32369);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32372);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1120:1: rule__Model__Group__3__Impl : ( ( rule__Model__SourcesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1124:1: ( ( ( rule__Model__SourcesAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1125:1: ( ( rule__Model__SourcesAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1125:1: ( ( rule__Model__SourcesAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1126:1: ( rule__Model__SourcesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1127:1: ( rule__Model__SourcesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1127:2: rule__Model__SourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__SourcesAssignment_3_in_rule__Model__Group__3__Impl2399);
            	    rule__Model__SourcesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSourcesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1137:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1141:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1142:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42430);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1148:1: rule__Model__Group__4__Impl : ( ( rule__Model__AspectsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1152:1: ( ( ( rule__Model__AspectsAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1153:1: ( ( rule__Model__AspectsAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1153:1: ( ( rule__Model__AspectsAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1154:1: ( rule__Model__AspectsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1155:1: ( rule__Model__AspectsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1155:2: rule__Model__AspectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__AspectsAssignment_4_in_rule__Model__Group__4__Impl2457);
            	    rule__Model__AspectsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAspectsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1175:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1179:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1180:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__02498);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__02501);
            rule__RegisteredPackage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__0"


    // $ANTLR start "rule__RegisteredPackage__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1187:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1191:1: ( ( 'register' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1192:1: ( 'register' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1192:1: ( 'register' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1193:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__RegisteredPackage__Group__0__Impl2529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__0__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1206:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1210:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1211:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__12560);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__12563);
            rule__RegisteredPackage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__1"


    // $ANTLR start "rule__RegisteredPackage__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1218:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1222:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1224:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1225:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1225:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl2590);
            rule__RegisteredPackage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__1__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1235:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1239:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1240:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__22620);
            rule__RegisteredPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__2"


    // $ANTLR start "rule__RegisteredPackage__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1246:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1250:1: ( ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1251:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1251:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1252:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1253:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1253:2: rule__RegisteredPackage__EPackageAssignment_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl2647);
            rule__RegisteredPackage__EPackageAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getEPackageAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__2__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1269:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1273:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1274:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__02683);
            rule__ApplicationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02686);
            rule__ApplicationModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__0"


    // $ANTLR start "rule__ApplicationModel__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1281:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1285:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1286:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1286:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1287:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__ApplicationModel__Group__0__Impl2714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__0__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1300:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1304:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1305:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__12745);
            rule__ApplicationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12748);
            rule__ApplicationModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__1"


    // $ANTLR start "rule__ApplicationModel__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1312:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1316:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1317:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1317:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1318:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:2: rule__ApplicationModel__UsePackagesAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl2775);
            rule__ApplicationModel__UsePackagesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__1__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1329:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1333:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1334:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__22805);
            rule__ApplicationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22808);
            rule__ApplicationModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__2"


    // $ANTLR start "rule__ApplicationModel__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1341:1: rule__ApplicationModel__Group__2__Impl : ( ( rule__ApplicationModel__Group_2__0 )* ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1345:1: ( ( ( rule__ApplicationModel__Group_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1346:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1346:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1347:1: ( rule__ApplicationModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1348:1: ( rule__ApplicationModel__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1348:2: rule__ApplicationModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl2835);
            	    rule__ApplicationModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__2__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1358:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1362:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1363:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__32866);
            rule__ApplicationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32869);
            rule__ApplicationModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__3"


    // $ANTLR start "rule__ApplicationModel__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1370:1: rule__ApplicationModel__Group__3__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1374:1: ( ( 'on' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1375:1: ( 'on' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1375:1: ( 'on' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1376:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__ApplicationModel__Group__3__Impl2897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getOnKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__3__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1389:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1393:1: ( rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1394:2: rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__42928);
            rule__ApplicationModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42931);
            rule__ApplicationModel__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__4"


    // $ANTLR start "rule__ApplicationModel__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1401:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__NameAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1405:1: ( ( ( rule__ApplicationModel__NameAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1406:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1406:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1407:1: ( rule__ApplicationModel__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1408:1: ( rule__ApplicationModel__NameAssignment_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1408:2: rule__ApplicationModel__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl2958);
            rule__ApplicationModel__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getNameAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__4__Impl"


    // $ANTLR start "rule__ApplicationModel__Group__5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1418:1: rule__ApplicationModel__Group__5 : rule__ApplicationModel__Group__5__Impl ;
    public final void rule__ApplicationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1422:1: ( rule__ApplicationModel__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1423:2: rule__ApplicationModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__52988);
            rule__ApplicationModel__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__5"


    // $ANTLR start "rule__ApplicationModel__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1429:1: rule__ApplicationModel__Group__5__Impl : ( ( rule__ApplicationModel__ModelAssignment_5 ) ) ;
    public final void rule__ApplicationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1433:1: ( ( ( rule__ApplicationModel__ModelAssignment_5 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1434:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1434:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1435:1: ( rule__ApplicationModel__ModelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1436:1: ( rule__ApplicationModel__ModelAssignment_5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1436:2: rule__ApplicationModel__ModelAssignment_5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl3015);
            rule__ApplicationModel__ModelAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getModelAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group__5__Impl"


    // $ANTLR start "rule__ApplicationModel__Group_2__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1458:1: rule__ApplicationModel__Group_2__0 : rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 ;
    public final void rule__ApplicationModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1462:1: ( rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1463:2: rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__03057);
            rule__ApplicationModel__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__03060);
            rule__ApplicationModel__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group_2__0"


    // $ANTLR start "rule__ApplicationModel__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1470:1: rule__ApplicationModel__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1474:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1475:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1475:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1476:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ApplicationModel__Group_2__0__Impl3088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group_2__0__Impl"


    // $ANTLR start "rule__ApplicationModel__Group_2__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1489:1: rule__ApplicationModel__Group_2__1 : rule__ApplicationModel__Group_2__1__Impl ;
    public final void rule__ApplicationModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1493:1: ( rule__ApplicationModel__Group_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1494:2: rule__ApplicationModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__13119);
            rule__ApplicationModel__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group_2__1"


    // $ANTLR start "rule__ApplicationModel__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1500:1: rule__ApplicationModel__Group_2__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) ;
    public final void rule__ApplicationModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1504:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1506:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1507:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1507:2: rule__ApplicationModel__UsePackagesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl3146);
            rule__ApplicationModel__UsePackagesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1521:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1525:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1526:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03180);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03183);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1533:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1537:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1538:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1538:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1539:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1550:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1554:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1555:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13239);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1561:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1565:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1566:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1566:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1567:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1568:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1568:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3266);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1582:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1586:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1587:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03301);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03304);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1594:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1598:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1599:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1599:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1600:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1601:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1602:2: '.'
            {
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl3333); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1613:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1617:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1618:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13365);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1624:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1628:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1629:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1629:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1630:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Aspect__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1647:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1651:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1652:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__03427);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__03430);
            rule__Aspect__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0"


    // $ANTLR start "rule__Aspect__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1659:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1663:1: ( ( 'aspect' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1664:1: ( 'aspect' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1664:1: ( 'aspect' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1665:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Aspect__Group__0__Impl3458); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0__Impl"


    // $ANTLR start "rule__Aspect__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1678:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1682:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1683:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__13489);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__13492);
            rule__Aspect__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1"


    // $ANTLR start "rule__Aspect__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1690:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__QueryAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1694:1: ( ( ( rule__Aspect__QueryAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1695:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1695:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1696:1: ( rule__Aspect__QueryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1697:1: ( rule__Aspect__QueryAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1697:2: rule__Aspect__QueryAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl3519);
            rule__Aspect__QueryAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getQueryAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1__Impl"


    // $ANTLR start "rule__Aspect__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1707:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1711:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1712:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__23549);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__23552);
            rule__Aspect__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__2"


    // $ANTLR start "rule__Aspect__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1719:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1723:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1724:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1724:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1725:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__Aspect__Group__2__Impl3580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__2__Impl"


    // $ANTLR start "rule__Aspect__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1738:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1742:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1743:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__33611);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__33614);
            rule__Aspect__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__3"


    // $ANTLR start "rule__Aspect__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1750:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__CollectorsAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1754:1: ( ( ( rule__Aspect__CollectorsAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1755:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1755:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1756:1: ( rule__Aspect__CollectorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1757:1: ( rule__Aspect__CollectorsAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1757:2: rule__Aspect__CollectorsAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl3641);
            rule__Aspect__CollectorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getCollectorsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__3__Impl"


    // $ANTLR start "rule__Aspect__Group__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1767:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1771:1: ( rule__Aspect__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1772:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__43671);
            rule__Aspect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__4"


    // $ANTLR start "rule__Aspect__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1778:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1782:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1783:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1783:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1784:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__Aspect__Group__4__Impl3699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1807:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1811:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1812:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__03740);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03743);
            rule__Query__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1819:1: rule__Query__Group__0__Impl : ( ( rule__Query__LocationAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1823:1: ( ( ( rule__Query__LocationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1824:1: ( ( rule__Query__LocationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1824:1: ( ( rule__Query__LocationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1825:1: ( rule__Query__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1826:1: ( rule__Query__LocationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1826:2: rule__Query__LocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl3770);
            rule__Query__LocationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1836:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1840:1: ( rule__Query__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1841:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__13800);
            rule__Query__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1847:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1851:1: ( ( ( rule__Query__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1852:1: ( ( rule__Query__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1852:1: ( ( rule__Query__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1853:1: ( rule__Query__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1854:1: ( rule__Query__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1854:2: rule__Query__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl3827);
                    rule__Query__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1868:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1872:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1873:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__03862);
            rule__Query__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__03865);
            rule__Query__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0"


    // $ANTLR start "rule__Query__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1880:1: rule__Query__Group_1__0__Impl : ( ( rule__Query__Alternatives_1_0 ) ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1884:1: ( ( ( rule__Query__Alternatives_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1885:1: ( ( rule__Query__Alternatives_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1885:1: ( ( rule__Query__Alternatives_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1886:1: ( rule__Query__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1887:1: ( rule__Query__Alternatives_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1887:2: rule__Query__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl3892);
            rule__Query__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__0__Impl"


    // $ANTLR start "rule__Query__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1897:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl rule__Query__Group_1__2 ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1901:1: ( rule__Query__Group_1__1__Impl rule__Query__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1902:2: rule__Query__Group_1__1__Impl rule__Query__Group_1__2
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__13922);
            rule__Query__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__13925);
            rule__Query__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1"


    // $ANTLR start "rule__Query__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1909:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__Alternatives_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1913:1: ( ( ( rule__Query__Alternatives_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1914:1: ( ( rule__Query__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1914:1: ( ( rule__Query__Alternatives_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1915:1: ( rule__Query__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1916:1: ( rule__Query__Alternatives_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1916:2: rule__Query__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl3952);
            rule__Query__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__1__Impl"


    // $ANTLR start "rule__Query__Group_1__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1926:1: rule__Query__Group_1__2 : rule__Query__Group_1__2__Impl rule__Query__Group_1__3 ;
    public final void rule__Query__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1930:1: ( rule__Query__Group_1__2__Impl rule__Query__Group_1__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1931:2: rule__Query__Group_1__2__Impl rule__Query__Group_1__3
            {
            pushFollow(FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__23982);
            rule__Query__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__23985);
            rule__Query__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__2"


    // $ANTLR start "rule__Query__Group_1__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1938:1: rule__Query__Group_1__2__Impl : ( ( rule__Query__MethodAssignment_1_2 ) ) ;
    public final void rule__Query__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1942:1: ( ( ( rule__Query__MethodAssignment_1_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1943:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1943:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1944:1: ( rule__Query__MethodAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1945:1: ( rule__Query__MethodAssignment_1_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1945:2: rule__Query__MethodAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4012);
            rule__Query__MethodAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__2__Impl"


    // $ANTLR start "rule__Query__Group_1__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1955:1: rule__Query__Group_1__3 : rule__Query__Group_1__3__Impl rule__Query__Group_1__4 ;
    public final void rule__Query__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1959:1: ( rule__Query__Group_1__3__Impl rule__Query__Group_1__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1960:2: rule__Query__Group_1__3__Impl rule__Query__Group_1__4
            {
            pushFollow(FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34042);
            rule__Query__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34045);
            rule__Query__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__3"


    // $ANTLR start "rule__Query__Group_1__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1967:1: rule__Query__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Query__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1971:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1972:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1972:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1973:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__Query__Group_1__3__Impl4073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__3__Impl"


    // $ANTLR start "rule__Query__Group_1__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1986:1: rule__Query__Group_1__4 : rule__Query__Group_1__4__Impl rule__Query__Group_1__5 ;
    public final void rule__Query__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1990:1: ( rule__Query__Group_1__4__Impl rule__Query__Group_1__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1991:2: rule__Query__Group_1__4__Impl rule__Query__Group_1__5
            {
            pushFollow(FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44104);
            rule__Query__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44107);
            rule__Query__Group_1__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__4"


    // $ANTLR start "rule__Query__Group_1__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1998:1: rule__Query__Group_1__4__Impl : ( ( rule__Query__ParameterAssignment_1_4 ) ) ;
    public final void rule__Query__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2002:1: ( ( ( rule__Query__ParameterAssignment_1_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2003:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2003:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2004:1: ( rule__Query__ParameterAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2005:1: ( rule__Query__ParameterAssignment_1_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2005:2: rule__Query__ParameterAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4134);
            rule__Query__ParameterAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__4__Impl"


    // $ANTLR start "rule__Query__Group_1__5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2015:1: rule__Query__Group_1__5 : rule__Query__Group_1__5__Impl rule__Query__Group_1__6 ;
    public final void rule__Query__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2019:1: ( rule__Query__Group_1__5__Impl rule__Query__Group_1__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2020:2: rule__Query__Group_1__5__Impl rule__Query__Group_1__6
            {
            pushFollow(FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54164);
            rule__Query__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54167);
            rule__Query__Group_1__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__5"


    // $ANTLR start "rule__Query__Group_1__5__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2027:1: rule__Query__Group_1__5__Impl : ( ( rule__Query__Group_1_5__0 )* ) ;
    public final void rule__Query__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2031:1: ( ( ( rule__Query__Group_1_5__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2032:1: ( ( rule__Query__Group_1_5__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2032:1: ( ( rule__Query__Group_1_5__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2033:1: ( rule__Query__Group_1_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2034:1: ( rule__Query__Group_1_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2034:2: rule__Query__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4194);
            	    rule__Query__Group_1_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__5__Impl"


    // $ANTLR start "rule__Query__Group_1__6"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2044:1: rule__Query__Group_1__6 : rule__Query__Group_1__6__Impl ;
    public final void rule__Query__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2048:1: ( rule__Query__Group_1__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2049:2: rule__Query__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64225);
            rule__Query__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__6"


    // $ANTLR start "rule__Query__Group_1__6__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2055:1: rule__Query__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Query__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2059:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2060:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2060:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2061:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,35,FOLLOW_35_in_rule__Query__Group_1__6__Impl4253); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1__6__Impl"


    // $ANTLR start "rule__Query__Group_1_5__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2088:1: rule__Query__Group_1_5__0 : rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 ;
    public final void rule__Query__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2092:1: ( rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2093:2: rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04298);
            rule__Query__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04301);
            rule__Query__Group_1_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1_5__0"


    // $ANTLR start "rule__Query__Group_1_5__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2100:1: rule__Query__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2104:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2105:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2105:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2106:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Query__Group_1_5__0__Impl4329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1_5__0__Impl"


    // $ANTLR start "rule__Query__Group_1_5__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2119:1: rule__Query__Group_1_5__1 : rule__Query__Group_1_5__1__Impl ;
    public final void rule__Query__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2123:1: ( rule__Query__Group_1_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2124:2: rule__Query__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14360);
            rule__Query__Group_1_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1_5__1"


    // $ANTLR start "rule__Query__Group_1_5__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2130:1: rule__Query__Group_1_5__1__Impl : ( ( rule__Query__ParameterAssignment_1_5_1 ) ) ;
    public final void rule__Query__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2134:1: ( ( ( rule__Query__ParameterAssignment_1_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2135:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2135:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2136:1: ( rule__Query__ParameterAssignment_1_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2137:1: ( rule__Query__ParameterAssignment_1_5_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2137:2: rule__Query__ParameterAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4387);
            rule__Query__ParameterAssignment_1_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_1_5__1__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2151:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2155:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2156:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__04421);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__04424);
            rule__ParameterPattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__0"


    // $ANTLR start "rule__ParameterPattern__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2163:1: rule__ParameterPattern__Group__0__Impl : ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2167:1: ( ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2168:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2168:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2169:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2170:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2170:2: rule__ParameterPattern__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl4451);
            rule__ParameterPattern__ModifierAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__0__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2180:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2184:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2185:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__14481);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__14484);
            rule__ParameterPattern__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__1"


    // $ANTLR start "rule__ParameterPattern__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2192:1: rule__ParameterPattern__Group__1__Impl : ( ( rule__ParameterPattern__TypeAssignment_1 ) ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2196:1: ( ( ( rule__ParameterPattern__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2197:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2197:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2198:1: ( rule__ParameterPattern__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2199:1: ( rule__ParameterPattern__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2199:2: rule__ParameterPattern__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl4511);
            rule__ParameterPattern__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__1__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2209:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2213:1: ( rule__ParameterPattern__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2214:2: rule__ParameterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__24541);
            rule__ParameterPattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__2"


    // $ANTLR start "rule__ParameterPattern__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2220:1: rule__ParameterPattern__Group__2__Impl : ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2224:1: ( ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2225:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2225:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2226:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2227:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2227:2: rule__ParameterPattern__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl4568);
            rule__ParameterPattern__ParameterAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__2__Impl"


    // $ANTLR start "rule__LocationQuery__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2243:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2247:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2248:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__04604);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__04607);
            rule__LocationQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__0"


    // $ANTLR start "rule__LocationQuery__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2255:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2259:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2260:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2260:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2261:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2262:1: ( rule__LocationQuery__NodeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2262:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl4634);
            rule__LocationQuery__NodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__0__Impl"


    // $ANTLR start "rule__LocationQuery__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2272:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2276:1: ( rule__LocationQuery__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2277:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__14664);
            rule__LocationQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__1"


    // $ANTLR start "rule__LocationQuery__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2283:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Group_1__0 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2287:1: ( ( ( rule__LocationQuery__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2288:1: ( ( rule__LocationQuery__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2288:1: ( ( rule__LocationQuery__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2289:1: ( rule__LocationQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2290:1: ( rule__LocationQuery__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2290:2: rule__LocationQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl4691);
                    rule__LocationQuery__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__1__Impl"


    // $ANTLR start "rule__LocationQuery__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2304:1: rule__LocationQuery__Group_1__0 : rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 ;
    public final void rule__LocationQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2308:1: ( rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2309:2: rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__04726);
            rule__LocationQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__04729);
            rule__LocationQuery__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1__0"


    // $ANTLR start "rule__LocationQuery__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2316:1: rule__LocationQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2320:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2321:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2321:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2322:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__LocationQuery__Group_1__0__Impl4757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1__0__Impl"


    // $ANTLR start "rule__LocationQuery__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2335:1: rule__LocationQuery__Group_1__1 : rule__LocationQuery__Group_1__1__Impl ;
    public final void rule__LocationQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2339:1: ( rule__LocationQuery__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2340:2: rule__LocationQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__14788);
            rule__LocationQuery__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1__1"


    // $ANTLR start "rule__LocationQuery__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2346:1: rule__LocationQuery__Group_1__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) ;
    public final void rule__LocationQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2350:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2351:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2351:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2352:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2353:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2353:2: rule__LocationQuery__SpecializationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl4815);
            rule__LocationQuery__SpecializationAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1__1__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2367:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2371:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2372:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__04849);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__04852);
            rule__Node__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2379:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2383:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2384:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2384:1: ( ( rule__Node__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2385:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2386:1: ( rule__Node__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2386:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl4879);
            rule__Node__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2396:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2400:1: ( rule__Node__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2401:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__14909);
            rule__Node__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2407:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2411:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2412:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2412:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2413:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2414:1: ( rule__Node__ParameterAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2414:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl4936);
                    rule__Node__ParameterAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__ParamQuery__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2428:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2432:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2433:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__04971);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__04974);
            rule__ParamQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__0"


    // $ANTLR start "rule__ParamQuery__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2440:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2444:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2445:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2445:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2446:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ParamQuery__Group__0__Impl5002); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__0__Impl"


    // $ANTLR start "rule__ParamQuery__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2459:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2463:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2464:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15033);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15036);
            rule__ParamQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__1"


    // $ANTLR start "rule__ParamQuery__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2471:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2475:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2476:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2476:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2477:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2477:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2478:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2479:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2479:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5065);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2482:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2483:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2484:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==11||LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2484:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5077);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__1__Impl"


    // $ANTLR start "rule__ParamQuery__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2495:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2499:1: ( rule__ParamQuery__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2500:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25110);
            rule__ParamQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__2"


    // $ANTLR start "rule__ParamQuery__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2506:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2510:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2511:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2511:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2512:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParamQuery__Group__2__Impl5138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__Group__2__Impl"


    // $ANTLR start "rule__ParamCompare__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2531:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2535:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2536:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05175);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05178);
            rule__ParamCompare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group__0"


    // $ANTLR start "rule__ParamCompare__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2543:1: rule__ParamCompare__Group__0__Impl : ( ( rule__ParamCompare__LeftAssignment_0 ) ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2547:1: ( ( ( rule__ParamCompare__LeftAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2548:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2548:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2549:1: ( rule__ParamCompare__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2550:1: ( rule__ParamCompare__LeftAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2550:2: rule__ParamCompare__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5205);
            rule__ParamCompare__LeftAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group__0__Impl"


    // $ANTLR start "rule__ParamCompare__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2560:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2564:1: ( rule__ParamCompare__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2565:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15235);
            rule__ParamCompare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group__1"


    // $ANTLR start "rule__ParamCompare__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2571:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 ) ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2575:1: ( ( ( rule__ParamCompare__Group_1__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ParamCompare__Group_1__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ParamCompare__Group_1__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2577:1: ( rule__ParamCompare__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:1: ( rule__ParamCompare__Group_1__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:2: rule__ParamCompare__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5262);
            rule__ParamCompare__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group__1__Impl"


    // $ANTLR start "rule__ParamCompare__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2592:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2596:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2597:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05296);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05299);
            rule__ParamCompare__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__0"


    // $ANTLR start "rule__ParamCompare__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2604:1: rule__ParamCompare__Group_1__0__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2608:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2609:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2609:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2610:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2611:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2611:2: rule__ParamCompare__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5326);
            rule__ParamCompare__OperatorAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__0__Impl"


    // $ANTLR start "rule__ParamCompare__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2621:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2625:1: ( rule__ParamCompare__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2626:2: rule__ParamCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15356);
            rule__ParamCompare__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__1"


    // $ANTLR start "rule__ParamCompare__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2632:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__RightAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2636:1: ( ( ( rule__ParamCompare__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2637:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2637:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2638:1: ( rule__ParamCompare__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2639:1: ( rule__ParamCompare__RightAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2639:2: rule__ParamCompare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5383);
            rule__ParamCompare__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__1__Impl"


    // $ANTLR start "rule__ReferenceValue__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2653:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2657:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2658:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__05417);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__05420);
            rule__ReferenceValue__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__Group__0"


    // $ANTLR start "rule__ReferenceValue__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2665:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 ) ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2669:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2670:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2670:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2671:1: ( rule__ReferenceValue__QueryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2672:1: ( rule__ReferenceValue__QueryAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2672:2: rule__ReferenceValue__QueryAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl5447);
            rule__ReferenceValue__QueryAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__Group__0__Impl"


    // $ANTLR start "rule__ReferenceValue__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2682:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2686:1: ( rule__ReferenceValue__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2687:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__15477);
            rule__ReferenceValue__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__Group__1"


    // $ANTLR start "rule__ReferenceValue__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2693:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2697:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2698:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2698:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2699:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2700:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2700:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl5504);
            rule__ReferenceValue__ParameterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__Group__1__Impl"


    // $ANTLR start "rule__RuntimeProperty__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2714:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2718:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2719:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__05538);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__05541);
            rule__RuntimeProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__Group__0"


    // $ANTLR start "rule__RuntimeProperty__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2726:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2730:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2731:1: ( '#' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2731:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2732:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RuntimeProperty__Group__0__Impl5569); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__Group__0__Impl"


    // $ANTLR start "rule__RuntimeProperty__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2745:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2749:1: ( rule__RuntimeProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2750:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__15600);
            rule__RuntimeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__Group__1"


    // $ANTLR start "rule__RuntimeProperty__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2756:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2760:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2761:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2761:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2762:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl5627);
            rule__RuntimeProperty__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__Group__1__Impl"


    // $ANTLR start "rule__ReflectionProperty__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2777:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2781:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2782:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__05661);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__05664);
            rule__ReflectionProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionProperty__Group__0"


    // $ANTLR start "rule__ReflectionProperty__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2789:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2793:1: ( ( '$' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2794:1: ( '$' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2794:1: ( '$' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2795:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ReflectionProperty__Group__0__Impl5692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionProperty__Group__0__Impl"


    // $ANTLR start "rule__ReflectionProperty__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2808:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2812:1: ( rule__ReflectionProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2813:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__15723);
            rule__ReflectionProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionProperty__Group__1"


    // $ANTLR start "rule__ReflectionProperty__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2819:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2823:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2824:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2824:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2825:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2826:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2826:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl5750);
            rule__ReflectionProperty__FunctionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionProperty__Group__1__Impl"


    // $ANTLR start "rule__WildcardNode__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2840:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2844:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2845:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__05784);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__05787);
            rule__WildcardNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildcardNode__Group__0"


    // $ANTLR start "rule__WildcardNode__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2852:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2856:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2857:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2857:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2858:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2859:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2861:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildcardNode__Group__0__Impl"


    // $ANTLR start "rule__WildcardNode__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2871:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2875:1: ( rule__WildcardNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2876:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__15845);
            rule__WildcardNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildcardNode__Group__1"


    // $ANTLR start "rule__WildcardNode__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2882:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2886:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2887:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2887:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2888:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__WildcardNode__Group__1__Impl5873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WildcardNode__Group__1__Impl"


    // $ANTLR start "rule__SubPathNode__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2905:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2909:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2910:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__05908);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__05911);
            rule__SubPathNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPathNode__Group__0"


    // $ANTLR start "rule__SubPathNode__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2917:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2921:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2923:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2924:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2926:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPathNode__Group__0__Impl"


    // $ANTLR start "rule__SubPathNode__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2936:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2940:1: ( rule__SubPathNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2941:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__15969);
            rule__SubPathNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPathNode__Group__1"


    // $ANTLR start "rule__SubPathNode__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2947:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2951:1: ( ( '**' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2952:1: ( '**' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2952:1: ( '**' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2953:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__SubPathNode__Group__1__Impl5997); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubPathNode__Group__1__Impl"


    // $ANTLR start "rule__Collector__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2970:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2974:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2975:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06032);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06035);
            rule__Collector__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__0"


    // $ANTLR start "rule__Collector__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2982:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2986:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2987:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2987:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2988:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2989:1: ( rule__Collector__InsertionPointAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2989:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6062);
            rule__Collector__InsertionPointAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__0__Impl"


    // $ANTLR start "rule__Collector__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2999:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl rule__Collector__Group__2 ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3003:1: ( rule__Collector__Group__1__Impl rule__Collector__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3004:2: rule__Collector__Group__1__Impl rule__Collector__Group__2
            {
            pushFollow(FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16092);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16095);
            rule__Collector__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__1"


    // $ANTLR start "rule__Collector__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3011:1: rule__Collector__Group__1__Impl : ( ( rule__Collector__TypeAssignment_1 ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3015:1: ( ( ( rule__Collector__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3016:1: ( ( rule__Collector__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3016:1: ( ( rule__Collector__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3017:1: ( rule__Collector__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3018:1: ( rule__Collector__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3018:2: rule__Collector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6122);
            rule__Collector__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__1__Impl"


    // $ANTLR start "rule__Collector__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3028:1: rule__Collector__Group__2 : rule__Collector__Group__2__Impl rule__Collector__Group__3 ;
    public final void rule__Collector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3032:1: ( rule__Collector__Group__2__Impl rule__Collector__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3033:2: rule__Collector__Group__2__Impl rule__Collector__Group__3
            {
            pushFollow(FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26152);
            rule__Collector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26155);
            rule__Collector__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__2"


    // $ANTLR start "rule__Collector__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3040:1: rule__Collector__Group__2__Impl : ( '(' ) ;
    public final void rule__Collector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3044:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3045:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3045:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3046:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,34,FOLLOW_34_in_rule__Collector__Group__2__Impl6183); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__2__Impl"


    // $ANTLR start "rule__Collector__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3059:1: rule__Collector__Group__3 : rule__Collector__Group__3__Impl rule__Collector__Group__4 ;
    public final void rule__Collector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3063:1: ( rule__Collector__Group__3__Impl rule__Collector__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3064:2: rule__Collector__Group__3__Impl rule__Collector__Group__4
            {
            pushFollow(FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36214);
            rule__Collector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36217);
            rule__Collector__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__3"


    // $ANTLR start "rule__Collector__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3071:1: rule__Collector__Group__3__Impl : ( ( rule__Collector__Group_3__0 )? ) ;
    public final void rule__Collector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3075:1: ( ( ( rule__Collector__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3076:1: ( ( rule__Collector__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3076:1: ( ( rule__Collector__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3077:1: ( rule__Collector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3078:1: ( rule__Collector__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==11||LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3078:2: rule__Collector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6244);
                    rule__Collector__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__3__Impl"


    // $ANTLR start "rule__Collector__Group__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3088:1: rule__Collector__Group__4 : rule__Collector__Group__4__Impl ;
    public final void rule__Collector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3092:1: ( rule__Collector__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3093:2: rule__Collector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46275);
            rule__Collector__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__4"


    // $ANTLR start "rule__Collector__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3099:1: rule__Collector__Group__4__Impl : ( ')' ) ;
    public final void rule__Collector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3103:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3104:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3104:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3105:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__Collector__Group__4__Impl6303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group__4__Impl"


    // $ANTLR start "rule__Collector__Group_3__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3128:1: rule__Collector__Group_3__0 : rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 ;
    public final void rule__Collector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3132:1: ( rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3133:2: rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06344);
            rule__Collector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06347);
            rule__Collector__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3__0"


    // $ANTLR start "rule__Collector__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3140:1: rule__Collector__Group_3__0__Impl : ( ( rule__Collector__InitializationsAssignment_3_0 ) ) ;
    public final void rule__Collector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3144:1: ( ( ( rule__Collector__InitializationsAssignment_3_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3145:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3145:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3146:1: ( rule__Collector__InitializationsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3147:1: ( rule__Collector__InitializationsAssignment_3_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3147:2: rule__Collector__InitializationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6374);
            rule__Collector__InitializationsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3__0__Impl"


    // $ANTLR start "rule__Collector__Group_3__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3157:1: rule__Collector__Group_3__1 : rule__Collector__Group_3__1__Impl ;
    public final void rule__Collector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3161:1: ( rule__Collector__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3162:2: rule__Collector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__16404);
            rule__Collector__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3__1"


    // $ANTLR start "rule__Collector__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3168:1: rule__Collector__Group_3__1__Impl : ( ( rule__Collector__Group_3_1__0 )* ) ;
    public final void rule__Collector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3172:1: ( ( ( rule__Collector__Group_3_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3173:1: ( ( rule__Collector__Group_3_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3173:1: ( ( rule__Collector__Group_3_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3174:1: ( rule__Collector__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3175:1: ( rule__Collector__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3175:2: rule__Collector__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl6431);
            	    rule__Collector__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3__1__Impl"


    // $ANTLR start "rule__Collector__Group_3_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3189:1: rule__Collector__Group_3_1__0 : rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 ;
    public final void rule__Collector__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3193:1: ( rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3194:2: rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__06466);
            rule__Collector__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__06469);
            rule__Collector__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3_1__0"


    // $ANTLR start "rule__Collector__Group_3_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3201:1: rule__Collector__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Collector__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3205:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3206:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3206:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3207:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Collector__Group_3_1__0__Impl6497); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3_1__0__Impl"


    // $ANTLR start "rule__Collector__Group_3_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3220:1: rule__Collector__Group_3_1__1 : rule__Collector__Group_3_1__1__Impl ;
    public final void rule__Collector__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3224:1: ( rule__Collector__Group_3_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3225:2: rule__Collector__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__16528);
            rule__Collector__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3_1__1"


    // $ANTLR start "rule__Collector__Group_3_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3231:1: rule__Collector__Group_3_1__1__Impl : ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) ;
    public final void rule__Collector__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3235:1: ( ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3236:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3236:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3237:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3238:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3238:2: rule__Collector__InitializationsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl6555);
            rule__Collector__InitializationsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__Group_3_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3253:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3257:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3258:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3258:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3259:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16594);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__MetamodelsAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3268:1: rule__Model__MetamodelsAssignment_2 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3272:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3273:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3273:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3274:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsRegisteredPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_26625);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsRegisteredPackageParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelsAssignment_2"


    // $ANTLR start "rule__Model__SourcesAssignment_3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3283:1: rule__Model__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__Model__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3287:1: ( ( ruleApplicationModel ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3288:1: ( ruleApplicationModel )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3288:1: ( ruleApplicationModel )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3289:1: ruleApplicationModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_36656);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SourcesAssignment_3"


    // $ANTLR start "rule__Model__AspectsAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3298:1: rule__Model__AspectsAssignment_4 : ( ruleAspect ) ;
    public final void rule__Model__AspectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3302:1: ( ( ruleAspect ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3303:1: ( ruleAspect )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3303:1: ( ruleAspect )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3304:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_46687);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AspectsAssignment_4"


    // $ANTLR start "rule__RegisteredPackage__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3313:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3317:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3318:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3318:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3319:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_16718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__NameAssignment_1"


    // $ANTLR start "rule__RegisteredPackage__EPackageAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3328:1: rule__RegisteredPackage__EPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__RegisteredPackage__EPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3332:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3333:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3333:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3334:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3335:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3336:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_26753); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__EPackageAssignment_2"


    // $ANTLR start "rule__ApplicationModel__UsePackagesAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3347:1: rule__ApplicationModel__UsePackagesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3351:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3352:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3352:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3353:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3354:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_16792); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__UsePackagesAssignment_1"


    // $ANTLR start "rule__ApplicationModel__UsePackagesAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3366:1: rule__ApplicationModel__UsePackagesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3370:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3371:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3371:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3372:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3373:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3374:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_16831); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__UsePackagesAssignment_2_1"


    // $ANTLR start "rule__ApplicationModel__NameAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3385:1: rule__ApplicationModel__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3389:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3390:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3390:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3391:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_46866); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__NameAssignment_4"


    // $ANTLR start "rule__ApplicationModel__ModelAssignment_5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3400:1: rule__ApplicationModel__ModelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3404:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3405:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3405:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3406:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_56897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__ModelAssignment_5"


    // $ANTLR start "rule__Aspect__QueryAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3415:1: rule__Aspect__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Aspect__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3419:1: ( ( ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3420:1: ( ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3420:1: ( ruleQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3421:1: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_16928);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__QueryAssignment_1"


    // $ANTLR start "rule__Aspect__CollectorsAssignment_3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3430:1: rule__Aspect__CollectorsAssignment_3 : ( ruleCollector ) ;
    public final void rule__Aspect__CollectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3434:1: ( ( ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3435:1: ( ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3435:1: ( ruleCollector )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3436:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_36959);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__CollectorsAssignment_3"


    // $ANTLR start "rule__Query__LocationAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3445:1: rule__Query__LocationAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__Query__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3449:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3450:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3450:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3451:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_06990);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__LocationAssignment_0"


    // $ANTLR start "rule__Query__ModifierAssignment_1_0_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3460:1: rule__Query__ModifierAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ModifierAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3464:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3465:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3465:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3466:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3467:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3468:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_07025); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ModifierAssignment_1_0_0"


    // $ANTLR start "rule__Query__ReturnTypeAssignment_1_1_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3479:1: rule__Query__ReturnTypeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ReturnTypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3483:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3484:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3484:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3485:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3486:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3487:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_07064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ReturnTypeAssignment_1_1_0"


    // $ANTLR start "rule__Query__MethodAssignment_1_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3498:1: rule__Query__MethodAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Query__MethodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3502:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3503:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3503:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3504:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3505:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3506:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_27103); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__MethodAssignment_1_2"


    // $ANTLR start "rule__Query__ParameterAssignment_1_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3517:1: rule__Query__ParameterAssignment_1_4 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3521:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3522:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3522:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3523:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_47138);
            ruleParameterPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ParameterAssignment_1_4"


    // $ANTLR start "rule__Query__ParameterAssignment_1_5_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3532:1: rule__Query__ParameterAssignment_1_5_1 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3536:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3537:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3537:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3538:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_17169);
            ruleParameterPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ParameterAssignment_1_5_1"


    // $ANTLR start "rule__ParameterPattern__ModifierAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3547:1: rule__ParameterPattern__ModifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3551:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3552:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3552:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3553:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3554:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3555:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_07204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__ModifierAssignment_0"


    // $ANTLR start "rule__ParameterPattern__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3566:1: rule__ParameterPattern__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3570:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3571:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3571:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3572:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3573:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3574:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__TypeAssignment_1"


    // $ANTLR start "rule__ParameterPattern__ParameterAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3585:1: rule__ParameterPattern__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3589:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3590:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3590:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3591:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3592:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3593:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27282); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__ParameterAssignment_2"


    // $ANTLR start "rule__LocationQuery__NodeAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3604:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3608:1: ( ( ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3609:1: ( ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3609:1: ( ruleNode )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3610:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07317);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__NodeAssignment_0"


    // $ANTLR start "rule__LocationQuery__SpecializationAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3619:1: rule__LocationQuery__SpecializationAssignment_1_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3623:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3624:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3624:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3625:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_17348);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__SpecializationAssignment_1_1"


    // $ANTLR start "rule__Node__ParameterAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3634:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3638:1: ( ( ruleParamQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3639:1: ( ruleParamQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3639:1: ( ruleParamQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3640:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_17379);
            ruleParamQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ParameterAssignment_1"


    // $ANTLR start "rule__ParamQuery__QueriesAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3649:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamCompare ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3653:1: ( ( ruleParamCompare ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3654:1: ( ruleParamCompare )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3654:1: ( ruleParamCompare )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3655:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_17410);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamQuery__QueriesAssignment_1"


    // $ANTLR start "rule__ParamCompare__LeftAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3664:1: rule__ParamCompare__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__ParamCompare__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3668:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3669:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3669:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3670:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_07441);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__LeftAssignment_0"


    // $ANTLR start "rule__ParamCompare__OperatorAssignment_1_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3679:1: rule__ParamCompare__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3683:1: ( ( ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3684:1: ( ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3684:1: ( ruleOperator )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3685:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_07472);
            ruleOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__OperatorAssignment_1_0"


    // $ANTLR start "rule__ParamCompare__RightAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3694:1: rule__ParamCompare__RightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3698:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3699:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3699:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3700:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_17503);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__RightAssignment_1_1"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3709:1: rule__FloatValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3713:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3714:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3714:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3715:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment7534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatValue__ValueAssignment"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3724:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3728:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3729:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3729:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3730:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7565); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3739:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3743:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3744:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3744:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3745:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment7596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__ReferenceValue__QueryAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3754:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3758:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3759:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3759:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3760:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_07627);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__QueryAssignment_0"


    // $ANTLR start "rule__ReferenceValue__ParameterAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3769:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3773:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3774:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3774:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3775:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_17658);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__ParameterAssignment_1"


    // $ANTLR start "rule__RuntimeProperty__ReferenceAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3784:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3788:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3789:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3789:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3790:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_17689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__ReferenceAssignment_1"


    // $ANTLR start "rule__ReflectionProperty__FunctionAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3799:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3803:1: ( ( ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3804:1: ( ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3804:1: ( ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3805:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_17720);
            ruleReflectionFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReflectionProperty__FunctionAssignment_1"


    // $ANTLR start "rule__ContainerNode__ContainerAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3814:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3818:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3819:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3819:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3820:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3821:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3822:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment7755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContainerNode__ContainerAssignment"


    // $ANTLR start "rule__Collector__InsertionPointAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3833:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3837:1: ( ( ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3838:1: ( ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3838:1: ( ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3839:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_07790);
            ruleInsertionPoint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__InsertionPointAssignment_0"


    // $ANTLR start "rule__Collector__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3848:1: rule__Collector__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Collector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3852:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3853:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3853:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3854:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3855:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3856:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_17825);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__TypeAssignment_1"


    // $ANTLR start "rule__Collector__InitializationsAssignment_3_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3867:1: rule__Collector__InitializationsAssignment_3_0 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3871:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3872:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3872:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3873:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_07860);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__InitializationsAssignment_3_0"


    // $ANTLR start "rule__Collector__InitializationsAssignment_3_1_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3882:1: rule__Collector__InitializationsAssignment_3_1_1 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3886:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3887:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3887:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3888:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_17891);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__InitializationsAssignment_3_1_1"

    // $ANTLR start synpred6_InternalApplicationLang
    public final void synpred6_InternalApplicationLang_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:851:6: ( ( ruleIntValue ) )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:851:6: ( ruleIntValue )
        {
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:851:6: ( ruleIntValue )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:852:1: ruleIntValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleIntValue_in_synpred6_InternalApplicationLang1755);
        ruleIntValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalApplicationLang

    // $ANTLR start synpred7_InternalApplicationLang
    public final void synpred7_InternalApplicationLang_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:857:6: ( ( ruleFloatValue ) )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:857:6: ( ruleFloatValue )
        {
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:857:6: ( ruleFloatValue )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:858:1: ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleFloatValue_in_synpred7_InternalApplicationLang1772);
        ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalApplicationLang

    // Delegated rules

    public final boolean synpred6_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalApplicationLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalApplicationLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0_in_ruleAspect342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterPattern436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode1209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0_in_ruleCollector1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_01566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Query__Alternatives_1_01585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Query__Alternatives_1_11638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_01672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__Alternatives1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ReflectionFunction__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReflectionFunction__Alternatives1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReflectionFunction__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReflectionFunction__Alternatives1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InsertionPoint__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InsertionPoint__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__0__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12248 = new BitSet(new long[]{0x000000008C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22308 = new BitSet(new long[]{0x000000008C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl2338 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32369 = new BitSet(new long[]{0x000000008C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SourcesAssignment_3_in_rule__Model__Group__3__Impl2399 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectsAssignment_4_in_rule__Model__Group__4__Impl2457 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__02498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__02501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RegisteredPackage__Group__0__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__12560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__22620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__02683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ApplicationModel__Group__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__12745 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__22805 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl2835 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__32866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ApplicationModel__Group__3__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__42928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__42931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__52988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__03057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__03060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ApplicationModel__Group_2__0__Impl3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03180 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3266 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__03427 = new BitSet(new long[]{0x0000010000000810L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__03430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Aspect__Group__0__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__13489 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__13492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__23549 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__23552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Aspect__Group__2__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__33611 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__33614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__43671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Aspect__Group__4__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__03740 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__03862 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__03865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__13922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__13925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__23982 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__23985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Query__Group_1__3__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44104 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54164 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4194 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_1__6__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Query__Group_1_5__0__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__04421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__04424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__14481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__24541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__04604 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__14664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__04726 = new BitSet(new long[]{0x0000010000000810L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__04729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LocationQuery__Group_1__0__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__04849 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__04852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__04971 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__04974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParamQuery__Group__0__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15033 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5065 = new BitSet(new long[]{0x0000010000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5077 = new BitSet(new long[]{0x0000010000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParamQuery__Group__2__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05175 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05296 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__05417 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__05420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__05538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__05541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RuntimeProperty__Group__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__15600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__05661 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__05664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ReflectionProperty__Group__0__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__15723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__05784 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__05787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__15845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardNode__Group__1__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__05908 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__05911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__15969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SubPathNode__Group__1__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16092 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26152 = new BitSet(new long[]{0x0000010800000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Collector__Group__2__Impl6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36214 = new BitSet(new long[]{0x0000010800000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Collector__Group__4__Impl6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06344 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__16404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl6431 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__06466 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__06469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Collector__Group_3_1__0__Impl6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__16528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_26625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_36656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_46687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_16718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_26753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_16792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_16831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_46866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_56897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_16928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_36959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_06990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_07025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_07064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_27103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_47138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_17169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_07204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_17348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_17379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_17410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_07441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_07472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_17503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_07627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_17658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_17720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment7755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_07790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_17825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_07860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_17891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_synpred6_InternalApplicationLang1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred7_InternalApplicationLang1772 = new BitSet(new long[]{0x0000000000000002L});

}
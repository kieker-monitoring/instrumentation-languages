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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'", "'package'", "'register'", "'use'", "'on'", "'.'", "'aspect'", "'{'", "'}'", "'('", "')'", "','", "'['", "']'", "'#'", "'$'", "'**'"
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


    // $ANTLR start "entryRuleMetaModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:89:1: entryRuleMetaModel : ruleMetaModel EOF ;
    public final void entryRuleMetaModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:90:1: ( ruleMetaModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:91:1: ruleMetaModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelRule()); 
            }
            pushFollow(FOLLOW_ruleMetaModel_in_entryRuleMetaModel127);
            ruleMetaModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaModel134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMetaModel"


    // $ANTLR start "ruleMetaModel"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:98:1: ruleMetaModel : ( ( rule__MetaModel__Group__0 ) ) ;
    public final void ruleMetaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:102:2: ( ( ( rule__MetaModel__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__MetaModel__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__MetaModel__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:104:1: ( rule__MetaModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:1: ( rule__MetaModel__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:2: rule__MetaModel__Group__0
            {
            pushFollow(FOLLOW_rule__MetaModel__Group__0_in_ruleMetaModel160);
            rule__MetaModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getGroup()); 
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
    // $ANTLR end "ruleMetaModel"


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

                if ( (LA11_0==30) ) {
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


    // $ANTLR start "rule__MetaModel__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1175:1: rule__MetaModel__Group__0 : rule__MetaModel__Group__0__Impl rule__MetaModel__Group__1 ;
    public final void rule__MetaModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1179:1: ( rule__MetaModel__Group__0__Impl rule__MetaModel__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1180:2: rule__MetaModel__Group__0__Impl rule__MetaModel__Group__1
            {
            pushFollow(FOLLOW_rule__MetaModel__Group__0__Impl_in_rule__MetaModel__Group__02498);
            rule__MetaModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaModel__Group__1_in_rule__MetaModel__Group__02501);
            rule__MetaModel__Group__1();

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
    // $ANTLR end "rule__MetaModel__Group__0"


    // $ANTLR start "rule__MetaModel__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1187:1: rule__MetaModel__Group__0__Impl : ( 'register' ) ;
    public final void rule__MetaModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1191:1: ( ( 'register' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1192:1: ( 'register' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1192:1: ( 'register' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1193:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getRegisterKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__MetaModel__Group__0__Impl2529); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getRegisterKeyword_0()); 
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
    // $ANTLR end "rule__MetaModel__Group__0__Impl"


    // $ANTLR start "rule__MetaModel__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1206:1: rule__MetaModel__Group__1 : rule__MetaModel__Group__1__Impl rule__MetaModel__Group__2 ;
    public final void rule__MetaModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1210:1: ( rule__MetaModel__Group__1__Impl rule__MetaModel__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1211:2: rule__MetaModel__Group__1__Impl rule__MetaModel__Group__2
            {
            pushFollow(FOLLOW_rule__MetaModel__Group__1__Impl_in_rule__MetaModel__Group__12560);
            rule__MetaModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetaModel__Group__2_in_rule__MetaModel__Group__12563);
            rule__MetaModel__Group__2();

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
    // $ANTLR end "rule__MetaModel__Group__1"


    // $ANTLR start "rule__MetaModel__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1218:1: rule__MetaModel__Group__1__Impl : ( ( rule__MetaModel__NameAssignment_1 ) ) ;
    public final void rule__MetaModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1222:1: ( ( ( rule__MetaModel__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:1: ( ( rule__MetaModel__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:1: ( ( rule__MetaModel__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1224:1: ( rule__MetaModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1225:1: ( rule__MetaModel__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1225:2: rule__MetaModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MetaModel__NameAssignment_1_in_rule__MetaModel__Group__1__Impl2590);
            rule__MetaModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__MetaModel__Group__1__Impl"


    // $ANTLR start "rule__MetaModel__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1235:1: rule__MetaModel__Group__2 : rule__MetaModel__Group__2__Impl ;
    public final void rule__MetaModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1239:1: ( rule__MetaModel__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1240:2: rule__MetaModel__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MetaModel__Group__2__Impl_in_rule__MetaModel__Group__22620);
            rule__MetaModel__Group__2__Impl();

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
    // $ANTLR end "rule__MetaModel__Group__2"


    // $ANTLR start "rule__MetaModel__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1246:1: rule__MetaModel__Group__2__Impl : ( ( rule__MetaModel__PackageAssignment_2 ) ) ;
    public final void rule__MetaModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1250:1: ( ( ( rule__MetaModel__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1251:1: ( ( rule__MetaModel__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1251:1: ( ( rule__MetaModel__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1252:1: ( rule__MetaModel__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1253:1: ( rule__MetaModel__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1253:2: rule__MetaModel__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__MetaModel__PackageAssignment_2_in_rule__MetaModel__Group__2__Impl2647);
            rule__MetaModel__PackageAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getPackageAssignment_2()); 
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
    // $ANTLR end "rule__MetaModel__Group__2__Impl"


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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1312:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__MetamodelAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1316:1: ( ( ( rule__ApplicationModel__MetamodelAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1317:1: ( ( rule__ApplicationModel__MetamodelAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1317:1: ( ( rule__ApplicationModel__MetamodelAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1318:1: ( rule__ApplicationModel__MetamodelAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getMetamodelAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:1: ( rule__ApplicationModel__MetamodelAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:2: rule__ApplicationModel__MetamodelAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__MetamodelAssignment_1_in_rule__ApplicationModel__Group__1__Impl2775);
            rule__ApplicationModel__MetamodelAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getMetamodelAssignment_1()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1341:1: rule__ApplicationModel__Group__2__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1345:1: ( ( 'on' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1346:1: ( 'on' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1346:1: ( 'on' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1347:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_2()); 
            }
            match(input,28,FOLLOW_28_in_rule__ApplicationModel__Group__2__Impl2836); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getOnKeyword_2()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1360:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1364:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1365:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__32867);
            rule__ApplicationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32870);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1372:1: rule__ApplicationModel__Group__3__Impl : ( ( rule__ApplicationModel__NameAssignment_3 ) ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1376:1: ( ( ( rule__ApplicationModel__NameAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1377:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1377:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1378:1: ( rule__ApplicationModel__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1379:1: ( rule__ApplicationModel__NameAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1379:2: rule__ApplicationModel__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_3_in_rule__ApplicationModel__Group__3__Impl2897);
            rule__ApplicationModel__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1389:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1393:1: ( rule__ApplicationModel__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1394:2: rule__ApplicationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__42927);
            rule__ApplicationModel__Group__4__Impl();

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1400:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__ModelAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1404:1: ( ( ( rule__ApplicationModel__ModelAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1405:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1405:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1406:1: ( rule__ApplicationModel__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1407:1: ( rule__ApplicationModel__ModelAssignment_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1407:2: rule__ApplicationModel__ModelAssignment_4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__ModelAssignment_4_in_rule__ApplicationModel__Group__4__Impl2954);
            rule__ApplicationModel__ModelAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1427:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1431:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1432:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02994);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02997);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1439:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1443:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1444:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1444:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1445:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3024); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1456:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1460:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1461:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13053);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1467:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1471:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1472:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1472:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1473:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1474:1: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1474:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3080);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1488:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1492:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1493:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03115);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03118);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1500:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1504:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1506:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1507:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1508:2: '.'
            {
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3147); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1519:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1523:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1524:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13179);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1530:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1534:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1535:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1535:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1536:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3206); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1553:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1557:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1558:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__03241);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__03244);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1565:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1569:1: ( ( 'aspect' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1570:1: ( 'aspect' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1570:1: ( 'aspect' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1571:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Aspect__Group__0__Impl3272); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1584:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1588:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1589:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__13303);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__13306);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1596:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__QueryAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1600:1: ( ( ( rule__Aspect__QueryAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1601:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1601:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1602:1: ( rule__Aspect__QueryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1603:1: ( rule__Aspect__QueryAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1603:2: rule__Aspect__QueryAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl3333);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1613:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1617:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1618:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__23363);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__23366);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1625:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1629:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1630:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1630:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1631:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Aspect__Group__2__Impl3394); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1644:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1648:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1649:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__33425);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__33428);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1656:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__CollectorsAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1660:1: ( ( ( rule__Aspect__CollectorsAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1661:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1661:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1662:1: ( rule__Aspect__CollectorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1663:1: ( rule__Aspect__CollectorsAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1663:2: rule__Aspect__CollectorsAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl3455);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1673:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1677:1: ( rule__Aspect__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1678:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__43485);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1684:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1688:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1689:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1689:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1690:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__Aspect__Group__4__Impl3513); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1713:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1717:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1718:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__03554);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03557);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1725:1: rule__Query__Group__0__Impl : ( ( rule__Query__LocationAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1729:1: ( ( ( rule__Query__LocationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1730:1: ( ( rule__Query__LocationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1730:1: ( ( rule__Query__LocationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1731:1: ( rule__Query__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1732:1: ( rule__Query__LocationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1732:2: rule__Query__LocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl3584);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1742:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1746:1: ( rule__Query__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1747:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__13614);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1753:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1757:1: ( ( ( rule__Query__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1758:1: ( ( rule__Query__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1758:1: ( ( rule__Query__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1759:1: ( rule__Query__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1760:1: ( rule__Query__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==11) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1760:2: rule__Query__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl3641);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1774:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1778:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1779:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__03676);
            rule__Query__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__03679);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1786:1: rule__Query__Group_1__0__Impl : ( ( rule__Query__Alternatives_1_0 ) ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1790:1: ( ( ( rule__Query__Alternatives_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1791:1: ( ( rule__Query__Alternatives_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1791:1: ( ( rule__Query__Alternatives_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1792:1: ( rule__Query__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1793:1: ( rule__Query__Alternatives_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1793:2: rule__Query__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl3706);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1803:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl rule__Query__Group_1__2 ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1807:1: ( rule__Query__Group_1__1__Impl rule__Query__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1808:2: rule__Query__Group_1__1__Impl rule__Query__Group_1__2
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__13736);
            rule__Query__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__13739);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1815:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__Alternatives_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1819:1: ( ( ( rule__Query__Alternatives_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1820:1: ( ( rule__Query__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1820:1: ( ( rule__Query__Alternatives_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1821:1: ( rule__Query__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1822:1: ( rule__Query__Alternatives_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1822:2: rule__Query__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl3766);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1832:1: rule__Query__Group_1__2 : rule__Query__Group_1__2__Impl rule__Query__Group_1__3 ;
    public final void rule__Query__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1836:1: ( rule__Query__Group_1__2__Impl rule__Query__Group_1__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1837:2: rule__Query__Group_1__2__Impl rule__Query__Group_1__3
            {
            pushFollow(FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__23796);
            rule__Query__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__23799);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1844:1: rule__Query__Group_1__2__Impl : ( ( rule__Query__MethodAssignment_1_2 ) ) ;
    public final void rule__Query__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1848:1: ( ( ( rule__Query__MethodAssignment_1_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1849:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1849:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1850:1: ( rule__Query__MethodAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1851:1: ( rule__Query__MethodAssignment_1_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1851:2: rule__Query__MethodAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl3826);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1861:1: rule__Query__Group_1__3 : rule__Query__Group_1__3__Impl rule__Query__Group_1__4 ;
    public final void rule__Query__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1865:1: ( rule__Query__Group_1__3__Impl rule__Query__Group_1__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1866:2: rule__Query__Group_1__3__Impl rule__Query__Group_1__4
            {
            pushFollow(FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__33856);
            rule__Query__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__33859);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1873:1: rule__Query__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Query__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1877:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1878:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1878:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1879:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Query__Group_1__3__Impl3887); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1892:1: rule__Query__Group_1__4 : rule__Query__Group_1__4__Impl rule__Query__Group_1__5 ;
    public final void rule__Query__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1896:1: ( rule__Query__Group_1__4__Impl rule__Query__Group_1__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1897:2: rule__Query__Group_1__4__Impl rule__Query__Group_1__5
            {
            pushFollow(FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__43918);
            rule__Query__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__43921);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1904:1: rule__Query__Group_1__4__Impl : ( ( rule__Query__ParameterAssignment_1_4 ) ) ;
    public final void rule__Query__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1908:1: ( ( ( rule__Query__ParameterAssignment_1_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1909:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1909:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1910:1: ( rule__Query__ParameterAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1911:1: ( rule__Query__ParameterAssignment_1_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1911:2: rule__Query__ParameterAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl3948);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1921:1: rule__Query__Group_1__5 : rule__Query__Group_1__5__Impl rule__Query__Group_1__6 ;
    public final void rule__Query__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1925:1: ( rule__Query__Group_1__5__Impl rule__Query__Group_1__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1926:2: rule__Query__Group_1__5__Impl rule__Query__Group_1__6
            {
            pushFollow(FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__53978);
            rule__Query__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__53981);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1933:1: rule__Query__Group_1__5__Impl : ( ( rule__Query__Group_1_5__0 )* ) ;
    public final void rule__Query__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1937:1: ( ( ( rule__Query__Group_1_5__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1938:1: ( ( rule__Query__Group_1_5__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1938:1: ( ( rule__Query__Group_1_5__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1939:1: ( rule__Query__Group_1_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1940:1: ( rule__Query__Group_1_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1940:2: rule__Query__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4008);
            	    rule__Query__Group_1_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1950:1: rule__Query__Group_1__6 : rule__Query__Group_1__6__Impl ;
    public final void rule__Query__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1954:1: ( rule__Query__Group_1__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1955:2: rule__Query__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64039);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1961:1: rule__Query__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Query__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1965:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1966:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1966:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1967:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__Query__Group_1__6__Impl4067); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1994:1: rule__Query__Group_1_5__0 : rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 ;
    public final void rule__Query__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1998:1: ( rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1999:2: rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04112);
            rule__Query__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04115);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2006:1: rule__Query__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2010:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2011:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2011:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2012:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Query__Group_1_5__0__Impl4143); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2025:1: rule__Query__Group_1_5__1 : rule__Query__Group_1_5__1__Impl ;
    public final void rule__Query__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2029:1: ( rule__Query__Group_1_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2030:2: rule__Query__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14174);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2036:1: rule__Query__Group_1_5__1__Impl : ( ( rule__Query__ParameterAssignment_1_5_1 ) ) ;
    public final void rule__Query__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2040:1: ( ( ( rule__Query__ParameterAssignment_1_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2041:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2041:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2042:1: ( rule__Query__ParameterAssignment_1_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2043:1: ( rule__Query__ParameterAssignment_1_5_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2043:2: rule__Query__ParameterAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4201);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2057:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2061:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2062:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__04235);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__04238);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2069:1: rule__ParameterPattern__Group__0__Impl : ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2073:1: ( ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2074:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2074:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2075:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2076:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2076:2: rule__ParameterPattern__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl4265);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2086:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2090:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2091:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__14295);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__14298);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2098:1: rule__ParameterPattern__Group__1__Impl : ( ( rule__ParameterPattern__TypeAssignment_1 ) ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2102:1: ( ( ( rule__ParameterPattern__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2103:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2103:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2104:1: ( rule__ParameterPattern__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2105:1: ( rule__ParameterPattern__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2105:2: rule__ParameterPattern__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl4325);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2115:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2119:1: ( rule__ParameterPattern__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2120:2: rule__ParameterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__24355);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2126:1: rule__ParameterPattern__Group__2__Impl : ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2130:1: ( ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2131:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2131:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2132:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2133:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2133:2: rule__ParameterPattern__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl4382);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2149:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2153:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2154:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__04418);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__04421);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2161:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2165:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2166:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2166:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2167:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2168:1: ( rule__LocationQuery__NodeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2168:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl4448);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2178:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2182:1: ( rule__LocationQuery__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2183:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__14478);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2189:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Group_1__0 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2193:1: ( ( ( rule__LocationQuery__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2194:1: ( ( rule__LocationQuery__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2194:1: ( ( rule__LocationQuery__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2195:1: ( rule__LocationQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2196:1: ( rule__LocationQuery__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2196:2: rule__LocationQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl4505);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2210:1: rule__LocationQuery__Group_1__0 : rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 ;
    public final void rule__LocationQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2214:1: ( rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2215:2: rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__04540);
            rule__LocationQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__04543);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2222:1: rule__LocationQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2226:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2227:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2227:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2228:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__LocationQuery__Group_1__0__Impl4571); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2241:1: rule__LocationQuery__Group_1__1 : rule__LocationQuery__Group_1__1__Impl ;
    public final void rule__LocationQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2245:1: ( rule__LocationQuery__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2246:2: rule__LocationQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__14602);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2252:1: rule__LocationQuery__Group_1__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) ;
    public final void rule__LocationQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2256:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2257:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2257:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2258:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2259:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2259:2: rule__LocationQuery__SpecializationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl4629);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2273:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2277:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2278:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__04663);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__04666);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2285:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2289:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2290:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2290:1: ( ( rule__Node__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2291:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2292:1: ( rule__Node__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2292:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl4693);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2302:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2306:1: ( rule__Node__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2307:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__14723);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2313:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2317:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2318:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2318:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2319:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2320:1: ( rule__Node__ParameterAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2320:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl4750);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2334:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2338:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2339:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__04785);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__04788);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2346:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2350:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2351:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2351:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2352:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ParamQuery__Group__0__Impl4816); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2365:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2369:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2370:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__14847);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__14850);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2377:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2381:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2382:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2382:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2383:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2383:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2384:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2385:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2385:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl4879);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2388:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2389:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2390:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_INT)||LA17_0==11||LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2390:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl4891);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2401:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2405:1: ( rule__ParamQuery__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2406:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__24924);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2412:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2416:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2417:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2417:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2418:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParamQuery__Group__2__Impl4952); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2437:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2441:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2442:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__04989);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__04992);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2449:1: rule__ParamCompare__Group__0__Impl : ( ( rule__ParamCompare__LeftAssignment_0 ) ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2453:1: ( ( ( rule__ParamCompare__LeftAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2454:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2454:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2455:1: ( rule__ParamCompare__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2456:1: ( rule__ParamCompare__LeftAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2456:2: rule__ParamCompare__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5019);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2466:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2470:1: ( rule__ParamCompare__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2471:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15049);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2477:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 ) ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2481:1: ( ( ( rule__ParamCompare__Group_1__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2482:1: ( ( rule__ParamCompare__Group_1__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2482:1: ( ( rule__ParamCompare__Group_1__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2483:1: ( rule__ParamCompare__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2484:1: ( rule__ParamCompare__Group_1__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2484:2: rule__ParamCompare__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5076);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2498:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2502:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2503:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05110);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05113);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2510:1: rule__ParamCompare__Group_1__0__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2514:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2515:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2515:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2516:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2517:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2517:2: rule__ParamCompare__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5140);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2527:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2531:1: ( rule__ParamCompare__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2532:2: rule__ParamCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15170);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2538:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__RightAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2542:1: ( ( ( rule__ParamCompare__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2543:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2543:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2544:1: ( rule__ParamCompare__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2545:1: ( rule__ParamCompare__RightAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2545:2: rule__ParamCompare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5197);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2559:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2563:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2564:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__05231);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__05234);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2571:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 ) ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2575:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2577:1: ( rule__ReferenceValue__QueryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:1: ( rule__ReferenceValue__QueryAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:2: rule__ReferenceValue__QueryAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl5261);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2588:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2592:1: ( rule__ReferenceValue__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2593:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__15291);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2599:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2603:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2604:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2604:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2605:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2606:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2606:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl5318);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2620:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2624:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2625:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__05352);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__05355);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2632:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2636:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2637:1: ( '#' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2637:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2638:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RuntimeProperty__Group__0__Impl5383); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2651:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2655:1: ( rule__RuntimeProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2656:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__15414);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2662:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2666:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2667:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2667:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2668:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2669:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2669:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl5441);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2683:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2687:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2688:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__05475);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__05478);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2695:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2699:1: ( ( '$' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2700:1: ( '$' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2700:1: ( '$' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2701:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ReflectionProperty__Group__0__Impl5506); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2714:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2718:1: ( rule__ReflectionProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2719:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__15537);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2725:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2729:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2730:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2730:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2731:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2732:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2732:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl5564);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2746:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2750:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2751:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__05598);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__05601);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2758:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2762:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2764:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2765:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2767:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2777:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2781:1: ( rule__WildcardNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2782:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__15659);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2788:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2792:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2793:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2793:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2794:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__WildcardNode__Group__1__Impl5687); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2811:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2815:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2816:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__05722);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__05725);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2823:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2827:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2828:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2828:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2829:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2830:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2832:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2842:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2846:1: ( rule__SubPathNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2847:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__15783);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2853:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2857:1: ( ( '**' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2858:1: ( '**' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2858:1: ( '**' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2859:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__SubPathNode__Group__1__Impl5811); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2876:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2880:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2881:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__05846);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__05849);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2888:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2892:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2893:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2893:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2894:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2895:1: ( rule__Collector__InsertionPointAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2895:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl5876);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2905:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl rule__Collector__Group__2 ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2909:1: ( rule__Collector__Group__1__Impl rule__Collector__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2910:2: rule__Collector__Group__1__Impl rule__Collector__Group__2
            {
            pushFollow(FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__15906);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__15909);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2917:1: rule__Collector__Group__1__Impl : ( ( rule__Collector__TypeAssignment_1 ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2921:1: ( ( ( rule__Collector__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:1: ( ( rule__Collector__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:1: ( ( rule__Collector__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2923:1: ( rule__Collector__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2924:1: ( rule__Collector__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2924:2: rule__Collector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl5936);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2934:1: rule__Collector__Group__2 : rule__Collector__Group__2__Impl rule__Collector__Group__3 ;
    public final void rule__Collector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2938:1: ( rule__Collector__Group__2__Impl rule__Collector__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2939:2: rule__Collector__Group__2__Impl rule__Collector__Group__3
            {
            pushFollow(FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__25966);
            rule__Collector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__25969);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2946:1: rule__Collector__Group__2__Impl : ( '(' ) ;
    public final void rule__Collector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2950:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2951:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2951:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2952:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Collector__Group__2__Impl5997); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2965:1: rule__Collector__Group__3 : rule__Collector__Group__3__Impl rule__Collector__Group__4 ;
    public final void rule__Collector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2969:1: ( rule__Collector__Group__3__Impl rule__Collector__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2970:2: rule__Collector__Group__3__Impl rule__Collector__Group__4
            {
            pushFollow(FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36028);
            rule__Collector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36031);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2977:1: rule__Collector__Group__3__Impl : ( ( rule__Collector__Group_3__0 )? ) ;
    public final void rule__Collector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2981:1: ( ( ( rule__Collector__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2982:1: ( ( rule__Collector__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2982:1: ( ( rule__Collector__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2983:1: ( rule__Collector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2984:1: ( rule__Collector__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||LA18_0==11||LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2984:2: rule__Collector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6058);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2994:1: rule__Collector__Group__4 : rule__Collector__Group__4__Impl ;
    public final void rule__Collector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2998:1: ( rule__Collector__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2999:2: rule__Collector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46089);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3005:1: rule__Collector__Group__4__Impl : ( ')' ) ;
    public final void rule__Collector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3009:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3010:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3010:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3011:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,34,FOLLOW_34_in_rule__Collector__Group__4__Impl6117); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3034:1: rule__Collector__Group_3__0 : rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 ;
    public final void rule__Collector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3038:1: ( rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3039:2: rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06158);
            rule__Collector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06161);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3046:1: rule__Collector__Group_3__0__Impl : ( ( rule__Collector__InitializationsAssignment_3_0 ) ) ;
    public final void rule__Collector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3050:1: ( ( ( rule__Collector__InitializationsAssignment_3_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3051:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3051:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3052:1: ( rule__Collector__InitializationsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3053:1: ( rule__Collector__InitializationsAssignment_3_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3053:2: rule__Collector__InitializationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6188);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3063:1: rule__Collector__Group_3__1 : rule__Collector__Group_3__1__Impl ;
    public final void rule__Collector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3067:1: ( rule__Collector__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3068:2: rule__Collector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__16218);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3074:1: rule__Collector__Group_3__1__Impl : ( ( rule__Collector__Group_3_1__0 )* ) ;
    public final void rule__Collector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3078:1: ( ( ( rule__Collector__Group_3_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3079:1: ( ( rule__Collector__Group_3_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3079:1: ( ( rule__Collector__Group_3_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3080:1: ( rule__Collector__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3081:1: ( rule__Collector__Group_3_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3081:2: rule__Collector__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl6245);
            	    rule__Collector__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3095:1: rule__Collector__Group_3_1__0 : rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 ;
    public final void rule__Collector__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3099:1: ( rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3100:2: rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__06280);
            rule__Collector__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__06283);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3107:1: rule__Collector__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Collector__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3111:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3112:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3112:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3113:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Collector__Group_3_1__0__Impl6311); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3126:1: rule__Collector__Group_3_1__1 : rule__Collector__Group_3_1__1__Impl ;
    public final void rule__Collector__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3130:1: ( rule__Collector__Group_3_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3131:2: rule__Collector__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__16342);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3137:1: rule__Collector__Group_3_1__1__Impl : ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) ;
    public final void rule__Collector__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3141:1: ( ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3142:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3142:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3143:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3144:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3144:2: rule__Collector__InitializationsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl6369);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3159:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3163:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3164:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3164:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3165:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16408);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3174:1: rule__Model__MetamodelsAssignment_2 : ( ruleMetaModel ) ;
    public final void rule__Model__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3178:1: ( ( ruleMetaModel ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3179:1: ( ruleMetaModel )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3179:1: ( ruleMetaModel )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3180:1: ruleMetaModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsMetaModelParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMetaModel_in_rule__Model__MetamodelsAssignment_26439);
            ruleMetaModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsMetaModelParserRuleCall_2_0()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3189:1: rule__Model__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__Model__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3193:1: ( ( ruleApplicationModel ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3194:1: ( ruleApplicationModel )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3194:1: ( ruleApplicationModel )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3195:1: ruleApplicationModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_36470);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3204:1: rule__Model__AspectsAssignment_4 : ( ruleAspect ) ;
    public final void rule__Model__AspectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3208:1: ( ( ruleAspect ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3209:1: ( ruleAspect )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3209:1: ( ruleAspect )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3210:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_46501);
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


    // $ANTLR start "rule__MetaModel__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3219:1: rule__MetaModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MetaModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3223:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3224:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3224:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3225:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetaModel__NameAssignment_16532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__MetaModel__NameAssignment_1"


    // $ANTLR start "rule__MetaModel__PackageAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3234:1: rule__MetaModel__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__MetaModel__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3238:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3239:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3239:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3240:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3241:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3242:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetaModelAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MetaModel__PackageAssignment_26567); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetaModelAccess().getPackageEPackageCrossReference_2_0()); 
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
    // $ANTLR end "rule__MetaModel__PackageAssignment_2"


    // $ANTLR start "rule__ApplicationModel__MetamodelAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3253:1: rule__ApplicationModel__MetamodelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__MetamodelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3257:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3258:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3258:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3259:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getMetamodelMetaModelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3260:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3261:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getMetamodelMetaModelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__MetamodelAssignment_16606); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getMetamodelMetaModelIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getMetamodelMetaModelCrossReference_1_0()); 
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
    // $ANTLR end "rule__ApplicationModel__MetamodelAssignment_1"


    // $ANTLR start "rule__ApplicationModel__NameAssignment_3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3272:1: rule__ApplicationModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3276:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3277:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3277:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3278:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_36641); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__ApplicationModel__NameAssignment_3"


    // $ANTLR start "rule__ApplicationModel__ModelAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3287:1: rule__ApplicationModel__ModelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3291:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3292:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3292:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3293:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_46672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__ApplicationModel__ModelAssignment_4"


    // $ANTLR start "rule__Aspect__QueryAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3302:1: rule__Aspect__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Aspect__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3306:1: ( ( ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3307:1: ( ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3307:1: ( ruleQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3308:1: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_16703);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3317:1: rule__Aspect__CollectorsAssignment_3 : ( ruleCollector ) ;
    public final void rule__Aspect__CollectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3321:1: ( ( ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3322:1: ( ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3322:1: ( ruleCollector )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3323:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_36734);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3332:1: rule__Query__LocationAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__Query__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3336:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3337:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3337:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3338:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_06765);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3347:1: rule__Query__ModifierAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ModifierAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3351:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3352:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3352:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3353:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3354:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_06800); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3366:1: rule__Query__ReturnTypeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ReturnTypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3370:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3371:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3371:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3372:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3373:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3374:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_06839); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3385:1: rule__Query__MethodAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Query__MethodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3389:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3390:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3390:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3391:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3392:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3393:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_26878); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3404:1: rule__Query__ParameterAssignment_1_4 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3408:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3409:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3409:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3410:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_46913);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3419:1: rule__Query__ParameterAssignment_1_5_1 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3423:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3424:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3424:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3425:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_16944);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3434:1: rule__ParameterPattern__ModifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3438:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3439:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3439:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3440:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3441:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3442:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_06979); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3453:1: rule__ParameterPattern__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3457:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3458:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3458:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3459:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3460:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3461:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17018); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3472:1: rule__ParameterPattern__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3476:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3477:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3477:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3478:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3479:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3480:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27057); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3491:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3495:1: ( ( ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3496:1: ( ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3496:1: ( ruleNode )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3497:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07092);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3506:1: rule__LocationQuery__SpecializationAssignment_1_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3510:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3511:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3511:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3512:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_17123);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3521:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3525:1: ( ( ruleParamQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3526:1: ( ruleParamQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3526:1: ( ruleParamQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3527:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_17154);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3536:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamCompare ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3540:1: ( ( ruleParamCompare ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3541:1: ( ruleParamCompare )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3541:1: ( ruleParamCompare )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3542:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_17185);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3551:1: rule__ParamCompare__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__ParamCompare__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3555:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3556:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3556:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3557:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_07216);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3566:1: rule__ParamCompare__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3570:1: ( ( ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3571:1: ( ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3571:1: ( ruleOperator )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3572:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_07247);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3581:1: rule__ParamCompare__RightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3585:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3586:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3586:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3587:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_17278);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3596:1: rule__FloatValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3600:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3601:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3601:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3602:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment7309); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3611:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3615:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3616:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3616:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3617:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7340); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3626:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3630:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3631:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3631:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3632:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment7371); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3641:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3645:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3646:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3646:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3647:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_07402);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3656:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3660:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3661:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3661:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3662:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_17433);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3671:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3675:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3676:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3676:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3677:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_17464); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3686:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3690:1: ( ( ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3691:1: ( ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3691:1: ( ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3692:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_17495);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3701:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3705:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3706:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3706:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3707:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3708:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3709:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment7530); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3720:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3724:1: ( ( ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3725:1: ( ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3725:1: ( ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3726:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_07565);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3735:1: rule__Collector__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Collector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3739:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3740:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3740:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3741:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3742:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3743:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_17600);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3754:1: rule__Collector__InitializationsAssignment_3_0 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3758:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3759:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3759:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3760:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_07635);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3769:1: rule__Collector__InitializationsAssignment_3_1_1 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3773:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3774:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3774:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3775:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_17666);
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
    public static final BitSet FOLLOW_ruleMetaModel_in_entryRuleMetaModel127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaModel134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__0_in_ruleMetaModel160 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12248 = new BitSet(new long[]{0x000000004C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22308 = new BitSet(new long[]{0x000000004C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl2338 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32369 = new BitSet(new long[]{0x000000004C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SourcesAssignment_3_in_rule__Model__Group__3__Impl2399 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectsAssignment_4_in_rule__Model__Group__4__Impl2457 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__0__Impl_in_rule__MetaModel__Group__02498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__1_in_rule__MetaModel__Group__02501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MetaModel__Group__0__Impl2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__1__Impl_in_rule__MetaModel__Group__12560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__2_in_rule__MetaModel__Group__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModel__NameAssignment_1_in_rule__MetaModel__Group__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModel__Group__2__Impl_in_rule__MetaModel__Group__22620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetaModel__PackageAssignment_2_in_rule__MetaModel__Group__2__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__02683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ApplicationModel__Group__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__12745 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__MetamodelAssignment_1_in_rule__ApplicationModel__Group__1__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__22805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__22808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ApplicationModel__Group__2__Impl2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__32867 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__32870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_3_in_rule__ApplicationModel__Group__3__Impl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__42927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ModelAssignment_4_in_rule__ApplicationModel__Group__4__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02994 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3080 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__03241 = new BitSet(new long[]{0x0000010000000810L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__03244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Aspect__Group__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__13303 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__13306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__23363 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__23366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Aspect__Group__2__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__33425 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__33428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__43485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Aspect__Group__4__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__03554 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__03557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__13614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__03676 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__03679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__13736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__23796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__23799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__33856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__33859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Query__Group_1__3__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__43918 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__43921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__53978 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__53981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4008 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Query__Group_1__6__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_1_5__0__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__04235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__04238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__14295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__24355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__04418 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__04540 = new BitSet(new long[]{0x0000010000000810L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LocationQuery__Group_1__0__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__14602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__04663 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__04785 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__04788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParamQuery__Group__0__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__14847 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl4879 = new BitSet(new long[]{0x0000010000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl4891 = new BitSet(new long[]{0x0000010000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__24924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParamQuery__Group__2__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__04989 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05110 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__05231 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__05234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__15291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__05352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__05355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RuntimeProperty__Group__0__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__15414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__05475 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__05478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ReflectionProperty__Group__0__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__15537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__05598 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__05601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__15659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardNode__Group__1__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__05722 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__05725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__15783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SubPathNode__Group__1__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__05846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__05849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__15906 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__25966 = new BitSet(new long[]{0x0000010400000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__25969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Collector__Group__2__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36028 = new BitSet(new long[]{0x0000010400000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Collector__Group__4__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06158 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__16218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl6245 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__06280 = new BitSet(new long[]{0x0000010000000870L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__06283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Collector__Group_3_1__0__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__16342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaModel_in_rule__Model__MetamodelsAssignment_26439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_36470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_46501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetaModel__NameAssignment_16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MetaModel__PackageAssignment_26567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__MetamodelAssignment_16606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_36641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_46672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_16703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_36734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_06765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_06800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_26878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_46913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_16944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_06979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_17154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_17185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_07216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_17278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment7340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_07402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_17433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_17464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_17495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_07565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_17600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_07635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_17666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_synpred6_InternalApplicationLang1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred7_InternalApplicationLang1772 = new BitSet(new long[]{0x0000000000000002L});

}
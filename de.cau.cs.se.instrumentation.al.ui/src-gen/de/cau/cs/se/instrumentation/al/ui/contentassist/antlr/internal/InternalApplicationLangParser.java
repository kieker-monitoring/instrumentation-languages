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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'", "'package'", "'import'", "'register'", "'use'", "'on'", "','", "'.'", "'aspect'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'#'", "'$'", "'**'"
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


    // $ANTLR start "entryRuleImport"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:90:1: ( ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:117:1: entryRuleRegisteredPackage : ruleRegisteredPackage EOF ;
    public final void entryRuleRegisteredPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:118:1: ( ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:119:1: ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage187);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage194); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:126:1: ruleRegisteredPackage : ( ( rule__RegisteredPackage__Group__0 ) ) ;
    public final void ruleRegisteredPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:130:2: ( ( ( rule__RegisteredPackage__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__RegisteredPackage__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__RegisteredPackage__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:132:1: ( rule__RegisteredPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:1: ( rule__RegisteredPackage__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:2: rule__RegisteredPackage__Group__0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage220);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:145:1: entryRuleApplicationModel : ruleApplicationModel EOF ;
    public final void entryRuleApplicationModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:146:1: ( ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:147:1: ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel247);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel254); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:154:1: ruleApplicationModel : ( ( rule__ApplicationModel__Group__0 ) ) ;
    public final void ruleApplicationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:158:2: ( ( ( rule__ApplicationModel__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:159:1: ( ( rule__ApplicationModel__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:159:1: ( ( rule__ApplicationModel__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:160:1: ( rule__ApplicationModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:161:1: ( rule__ApplicationModel__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:161:2: rule__ApplicationModel__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel280);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:173:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:174:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:175:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName307);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName314); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:182:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:186:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:187:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:187:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:188:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName340);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:201:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:202:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:203:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard367);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:210:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:214:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:215:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:215:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:216:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard400);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAspect"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:229:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:230:1: ( ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:231:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect427);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect434); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:238:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:242:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:243:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:243:1: ( ( rule__Aspect__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:244:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:1: ( rule__Aspect__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0_in_ruleAspect460);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:257:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:258:1: ( ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:259:1: ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery487);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery494); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:266:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:270:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:271:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:271:1: ( ( rule__Query__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:272:1: ( rule__Query__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:1: ( rule__Query__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery520);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:285:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:286:1: ( ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:287:1: ruleParameterPattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternRule()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern547);
            ruleParameterPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterPattern554); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:294:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:298:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:299:1: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:299:1: ( ( rule__ParameterPattern__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:300:1: ( rule__ParameterPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:1: ( rule__ParameterPattern__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:2: rule__ParameterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern580);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:313:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:314:1: ( ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:315:1: ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery607);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery614); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:322:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:326:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:327:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:327:1: ( ( rule__LocationQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:328:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:1: ( rule__LocationQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:2: rule__LocationQuery__Group__0
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery640);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:341:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:342:1: ( ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:343:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode667);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode674); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:350:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:354:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:355:1: ( ( rule__Node__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:355:1: ( ( rule__Node__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:356:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:1: ( rule__Node__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode700);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:369:1: entryRuleParamQuery : ruleParamQuery EOF ;
    public final void entryRuleParamQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:370:1: ( ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:371:1: ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery727);
            ruleParamQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:378:1: ruleParamQuery : ( ( rule__ParamQuery__Group__0 ) ) ;
    public final void ruleParamQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:382:2: ( ( ( rule__ParamQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:383:1: ( ( rule__ParamQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:383:1: ( ( rule__ParamQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:384:1: ( rule__ParamQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:1: ( rule__ParamQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:2: rule__ParamQuery__Group__0
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery760);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:397:1: entryRuleParamCompare : ruleParamCompare EOF ;
    public final void entryRuleParamCompare() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:398:1: ( ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:399:1: ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare787);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare794); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:406:1: ruleParamCompare : ( ( rule__ParamCompare__Group__0 ) ) ;
    public final void ruleParamCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:410:2: ( ( ( rule__ParamCompare__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:411:1: ( ( rule__ParamCompare__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:411:1: ( ( rule__ParamCompare__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:412:1: ( rule__ParamCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:1: ( rule__ParamCompare__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:2: rule__ParamCompare__Group__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare820);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:425:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:426:1: ( ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:427:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue847);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue854); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:434:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:438:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:439:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:439:1: ( ( rule__Value__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:440:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:1: ( rule__Value__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue880);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:453:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:454:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:455:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue907);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue914); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:462:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:466:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:467:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:467:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:468:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue940);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:481:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:482:1: ( ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:483:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue967);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue974); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:490:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:494:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:495:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:495:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:496:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1000);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:509:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:510:1: ( ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:511:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1027);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1034); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:518:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:522:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:523:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:523:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:524:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:1: ( rule__StringValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1060);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:537:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:538:1: ( ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:539:1: ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue1087);
            ruleReferenceValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:546:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:550:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:551:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:551:1: ( ( rule__ReferenceValue__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:552:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:1: ( rule__ReferenceValue__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:2: rule__ReferenceValue__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1120);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:565:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:566:1: ( ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:567:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1147);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:574:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:578:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:579:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:579:1: ( ( rule__Parameter__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:580:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:1: ( rule__Parameter__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1180);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:593:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:594:1: ( ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:595:1: ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1207);
            ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:602:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:606:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:607:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:607:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:608:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:1: ( rule__RuntimeProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:2: rule__RuntimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1240);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:621:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:622:1: ( ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:623:1: ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1267);
            ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:630:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:634:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:635:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:635:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:636:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:1: ( rule__ReflectionProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:2: rule__ReflectionProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1300);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:649:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:650:1: ( ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:651:1: ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode1327);
            ruleContainerNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode1334); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:658:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:662:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:663:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:663:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:664:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:1: ( rule__ContainerNode__ContainerAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:2: rule__ContainerNode__ContainerAssignment
            {
            pushFollow(FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1360);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:677:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:678:1: ( ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:679:1: ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1387);
            ruleWildcardNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:686:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:690:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:691:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:691:1: ( ( rule__WildcardNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:692:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:1: ( rule__WildcardNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:2: rule__WildcardNode__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1420);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:705:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:706:1: ( ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:707:1: ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1447);
            ruleSubPathNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:714:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:718:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:719:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:719:1: ( ( rule__SubPathNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:720:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:721:1: ( rule__SubPathNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:721:2: rule__SubPathNode__Group__0
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1480);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:733:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:734:1: ( ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:735:1: ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector1507);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:742:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:746:2: ( ( ( rule__Collector__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:747:1: ( ( rule__Collector__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:747:1: ( ( rule__Collector__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:748:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:749:1: ( rule__Collector__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:749:2: rule__Collector__Group__0
            {
            pushFollow(FOLLOW_rule__Collector__Group__0_in_ruleCollector1540);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:762:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:766:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:767:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:767:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:768:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:769:1: ( rule__ReflectionFunction__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:769:2: rule__ReflectionFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction1577);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:781:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:785:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:786:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:786:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:787:1: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:788:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:788:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator1613);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:800:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:804:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:805:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:805:1: ( ( rule__InsertionPoint__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:806:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:807:1: ( rule__InsertionPoint__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:807:2: rule__InsertionPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint1649);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:818:1: rule__Query__Alternatives_1_0 : ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:822:1: ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) )
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:823:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:823:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:824:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:825:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:825:2: rule__Query__ModifierAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_01684);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:829:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:829:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:830:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Query__Alternatives_1_01703); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:842:1: rule__Query__Alternatives_1_1 : ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:846:1: ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) )
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:847:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:847:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:848:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:849:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:849:2: rule__Query__ReturnTypeAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_11737);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:853:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:853:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:854:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Query__Alternatives_1_11756); if (state.failed) return ;
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


    // $ANTLR start "rule__ParameterPattern__Alternatives_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:866:1: rule__ParameterPattern__Alternatives_0 : ( ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__ParameterPattern__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:870:1: ( ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) ) | ( '*' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:871:1: ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:871:1: ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:872:1: ( rule__ParameterPattern__ModifierAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterPatternAccess().getModifierAssignment_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:873:1: ( rule__ParameterPattern__ModifierAssignment_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:873:2: rule__ParameterPattern__ModifierAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ParameterPattern__ModifierAssignment_0_0_in_rule__ParameterPattern__Alternatives_01790);
                    rule__ParameterPattern__ModifierAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterPatternAccess().getModifierAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:877:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:877:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:878:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterPatternAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__ParameterPattern__Alternatives_01809); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterPatternAccess().getAsteriskKeyword_0_1()); 
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
    // $ANTLR end "rule__ParameterPattern__Alternatives_0"


    // $ANTLR start "rule__Node__Alternatives_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:890:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:894:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:895:1: ( ruleSubPathNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:895:1: ( ruleSubPathNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:896:1: ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_01843);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:901:6: ( ruleWildcardNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:901:6: ( ruleWildcardNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:902:1: ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_01860);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:907:6: ( ruleContainerNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:907:6: ( ruleContainerNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:908:1: ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_01877);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:918:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:922:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred7_InternalApplicationLang()) ) {
                    alt5=2;
                }
                else if ( (synpred8_InternalApplicationLang()) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 11:
            case 41:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:923:1: ( ruleStringValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:923:1: ( ruleStringValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:924:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives1909);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:929:6: ( ruleIntValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:929:6: ( ruleIntValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:930:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives1926);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:935:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:935:6: ( ruleFloatValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:936:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__Alternatives1943);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:941:6: ( ruleReferenceValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:941:6: ( ruleReferenceValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:942:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives1960);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:952:1: rule__Parameter__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:956:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:957:1: ( ruleRuntimeProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:957:1: ( ruleRuntimeProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:958:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives1992);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:963:6: ( ruleReflectionProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:963:6: ( ruleReflectionProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:964:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2009);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:974:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:978:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:979:1: ( ( 'name' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:979:1: ( ( 'name' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:980:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:981:1: ( 'name' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:981:3: 'name'
                    {
                    match(input,12,FOLLOW_12_in_rule__ReflectionFunction__Alternatives2042); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:986:6: ( ( 'signature' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:986:6: ( ( 'signature' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:987:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:988:1: ( 'signature' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:988:3: 'signature'
                    {
                    match(input,13,FOLLOW_13_in_rule__ReflectionFunction__Alternatives2063); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:993:6: ( ( 'class' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:993:6: ( ( 'class' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:994:1: ( 'class' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:995:1: ( 'class' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:995:3: 'class'
                    {
                    match(input,14,FOLLOW_14_in_rule__ReflectionFunction__Alternatives2084); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1000:6: ( ( 'return-type' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1000:6: ( ( 'return-type' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1001:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1002:1: ( 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1002:3: 'return-type'
                    {
                    match(input,15,FOLLOW_15_in_rule__ReflectionFunction__Alternatives2105); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1012:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1016:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 22:
                {
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1017:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1017:1: ( ( '=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1018:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1019:1: ( '=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1019:3: '='
                    {
                    match(input,16,FOLLOW_16_in_rule__Operator__Alternatives2141); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1024:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1024:6: ( ( '~' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1025:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1026:1: ( '~' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1026:3: '~'
                    {
                    match(input,17,FOLLOW_17_in_rule__Operator__Alternatives2162); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1031:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1031:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1032:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1033:1: ( '!=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1033:3: '!='
                    {
                    match(input,18,FOLLOW_18_in_rule__Operator__Alternatives2183); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1038:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1038:6: ( ( '>' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1039:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1040:1: ( '>' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1040:3: '>'
                    {
                    match(input,19,FOLLOW_19_in_rule__Operator__Alternatives2204); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1045:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1045:6: ( ( '<' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1046:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1047:1: ( '<' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1047:3: '<'
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives2225); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1052:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1052:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1053:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1054:1: ( '>=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1054:3: '>='
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives2246); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1059:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1059:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1060:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1061:1: ( '<=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1061:3: '<='
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives2267); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1071:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1075:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1076:1: ( ( 'before' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1076:1: ( ( 'before' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1077:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1078:1: ( 'before' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1078:3: 'before'
                    {
                    match(input,23,FOLLOW_23_in_rule__InsertionPoint__Alternatives2303); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1083:6: ( ( 'after' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1083:6: ( ( 'after' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1084:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1085:1: ( 'after' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1085:3: 'after'
                    {
                    match(input,24,FOLLOW_24_in_rule__InsertionPoint__Alternatives2324); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1097:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1101:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1102:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02357);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02360);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1109:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1113:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1114:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1114:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1115:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Model__Group__0__Impl2388); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1128:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1132:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1133:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12419);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12422);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1140:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1144:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1145:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1145:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1146:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1147:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1147:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2449);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1157:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1161:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1162:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22479);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22482);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1169:1: rule__Model__Group__2__Impl : ( ( rule__Model__MetamodelsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1173:1: ( ( ( rule__Model__MetamodelsAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1174:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1174:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1175:1: ( rule__Model__MetamodelsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1176:1: ( rule__Model__MetamodelsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1176:2: rule__Model__MetamodelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl2509);
            	    rule__Model__MetamodelsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1186:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1190:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1191:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32540);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32543);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1198:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1202:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1203:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1203:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1204:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1205:1: ( rule__Model__ImportsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1205:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2570);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1215:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1219:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1220:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42601);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42604);
            rule__Model__Group__5();

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1227:1: rule__Model__Group__4__Impl : ( ( rule__Model__SourcesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1231:1: ( ( ( rule__Model__SourcesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1232:1: ( ( rule__Model__SourcesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1232:1: ( ( rule__Model__SourcesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1233:1: ( rule__Model__SourcesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1234:1: ( rule__Model__SourcesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1234:2: rule__Model__SourcesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__SourcesAssignment_4_in_rule__Model__Group__4__Impl2631);
            	    rule__Model__SourcesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSourcesAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1244:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1248:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1249:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52662);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1255:1: rule__Model__Group__5__Impl : ( ( rule__Model__AspectsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1259:1: ( ( ( rule__Model__AspectsAssignment_5 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1260:1: ( ( rule__Model__AspectsAssignment_5 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1260:1: ( ( rule__Model__AspectsAssignment_5 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1261:1: ( rule__Model__AspectsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1262:1: ( rule__Model__AspectsAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1262:2: rule__Model__AspectsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__AspectsAssignment_5_in_rule__Model__Group__5__Impl2689);
            	    rule__Model__AspectsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAspectsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1284:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1288:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1289:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02732);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02735);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1296:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1300:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1301:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1301:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1302:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Import__Group__0__Impl2763); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1315:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1320:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12794);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1326:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1330:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1331:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1331:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1332:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1333:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1333:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2821);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1347:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1351:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1352:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__02855);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__02858);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1359:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1363:1: ( ( 'register' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1364:1: ( 'register' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1364:1: ( 'register' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1365:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__RegisteredPackage__Group__0__Impl2886); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1378:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1382:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1383:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__12917);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__12920);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1390:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1394:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1395:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1395:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1396:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1397:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1397:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl2947);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1407:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1411:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1412:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__22977);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1418:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1422:1: ( ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1423:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1423:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1424:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1425:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1425:2: rule__RegisteredPackage__EPackageAssignment_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl3004);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1441:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1445:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1446:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__03040);
            rule__ApplicationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__03043);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1453:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1457:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1458:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1458:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1459:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__ApplicationModel__Group__0__Impl3071); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1472:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1476:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1477:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__13102);
            rule__ApplicationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__13105);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1484:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1488:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1489:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1489:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1490:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1491:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1491:2: rule__ApplicationModel__UsePackagesAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl3132);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1501:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1506:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__23162);
            rule__ApplicationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__23165);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1513:1: rule__ApplicationModel__Group__2__Impl : ( ( rule__ApplicationModel__Group_2__0 )* ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1517:1: ( ( ( rule__ApplicationModel__Group_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1518:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1518:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1519:1: ( rule__ApplicationModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1520:1: ( rule__ApplicationModel__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1520:2: rule__ApplicationModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl3192);
            	    rule__ApplicationModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1530:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1534:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1535:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__33223);
            rule__ApplicationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__33226);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1542:1: rule__ApplicationModel__Group__3__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1546:1: ( ( 'on' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1547:1: ( 'on' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1547:1: ( 'on' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1548:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__ApplicationModel__Group__3__Impl3254); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1561:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1565:1: ( rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1566:2: rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__43285);
            rule__ApplicationModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__43288);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1573:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__NameAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1577:1: ( ( ( rule__ApplicationModel__NameAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1578:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1578:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1579:1: ( rule__ApplicationModel__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1580:1: ( rule__ApplicationModel__NameAssignment_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1580:2: rule__ApplicationModel__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl3315);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1590:1: rule__ApplicationModel__Group__5 : rule__ApplicationModel__Group__5__Impl ;
    public final void rule__ApplicationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1594:1: ( rule__ApplicationModel__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1595:2: rule__ApplicationModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__53345);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1601:1: rule__ApplicationModel__Group__5__Impl : ( ( rule__ApplicationModel__ModelAssignment_5 ) ) ;
    public final void rule__ApplicationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1605:1: ( ( ( rule__ApplicationModel__ModelAssignment_5 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1606:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1606:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1607:1: ( rule__ApplicationModel__ModelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1608:1: ( rule__ApplicationModel__ModelAssignment_5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1608:2: rule__ApplicationModel__ModelAssignment_5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl3372);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1630:1: rule__ApplicationModel__Group_2__0 : rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 ;
    public final void rule__ApplicationModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1634:1: ( rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1635:2: rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__03414);
            rule__ApplicationModel__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__03417);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1642:1: rule__ApplicationModel__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1646:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1647:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1647:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1648:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ApplicationModel__Group_2__0__Impl3445); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1661:1: rule__ApplicationModel__Group_2__1 : rule__ApplicationModel__Group_2__1__Impl ;
    public final void rule__ApplicationModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1665:1: ( rule__ApplicationModel__Group_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1666:2: rule__ApplicationModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__13476);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1672:1: rule__ApplicationModel__Group_2__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) ;
    public final void rule__ApplicationModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1676:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1677:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1677:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1678:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1679:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1679:2: rule__ApplicationModel__UsePackagesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl3503);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1693:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1697:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1698:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03537);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03540);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1705:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1709:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1710:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1710:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1711:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3567); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1722:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1726:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1727:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13596);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1733:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1737:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1738:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1738:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1739:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1740:1: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1740:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3623);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1754:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1758:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1759:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03658);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03661);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1766:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1770:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1771:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1771:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1772:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1773:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1774:2: '.'
            {
            match(input,31,FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl3690); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1785:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1789:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1790:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13722);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1796:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1800:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1801:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1801:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1802:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3749); if (state.failed) return ;
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


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1817:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1821:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1822:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03782);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03785);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1829:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1833:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1834:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1834:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1835:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3812);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1846:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1850:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1851:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13841);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1857:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1861:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1862:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1862:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1863:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1864:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1864:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3868);
                    rule__QualifiedNameWithWildcard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1878:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1882:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1883:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03903);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03906);
            rule__QualifiedNameWithWildcard__Group_1__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1890:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1894:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1895:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1895:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1896:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl3934); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1909:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1913:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1914:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__13965);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1920:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1924:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1925:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1925:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1926:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl3993); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__Aspect__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1943:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1947:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1948:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__04028);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__04031);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1955:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1959:1: ( ( 'aspect' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1960:1: ( 'aspect' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1960:1: ( 'aspect' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1961:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Aspect__Group__0__Impl4059); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1974:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1978:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1979:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__14090);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__14093);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1986:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__QueryAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1990:1: ( ( ( rule__Aspect__QueryAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1991:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1991:1: ( ( rule__Aspect__QueryAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1992:1: ( rule__Aspect__QueryAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1993:1: ( rule__Aspect__QueryAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1993:2: rule__Aspect__QueryAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl4120);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2003:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2007:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2008:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__24150);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__24153);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2015:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2019:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2020:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2020:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2021:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,33,FOLLOW_33_in_rule__Aspect__Group__2__Impl4181); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2034:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2038:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2039:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__34212);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__34215);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2046:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__CollectorsAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2050:1: ( ( ( rule__Aspect__CollectorsAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2051:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2051:1: ( ( rule__Aspect__CollectorsAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2052:1: ( rule__Aspect__CollectorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2053:1: ( rule__Aspect__CollectorsAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2053:2: rule__Aspect__CollectorsAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl4242);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2063:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2067:1: ( rule__Aspect__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2068:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__44272);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2074:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2078:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2079:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2079:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2080:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,34,FOLLOW_34_in_rule__Aspect__Group__4__Impl4300); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2103:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2107:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2108:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04341);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04344);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2115:1: rule__Query__Group__0__Impl : ( ( rule__Query__LocationAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2119:1: ( ( ( rule__Query__LocationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2120:1: ( ( rule__Query__LocationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2120:1: ( ( rule__Query__LocationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2121:1: ( rule__Query__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2122:1: ( rule__Query__LocationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2122:2: rule__Query__LocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl4371);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2132:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2136:1: ( rule__Query__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2137:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14401);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2143:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2147:1: ( ( ( rule__Query__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2148:1: ( ( rule__Query__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2148:1: ( ( rule__Query__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2149:1: ( rule__Query__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2150:1: ( rule__Query__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2150:2: rule__Query__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl4428);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2164:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2168:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2169:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__04463);
            rule__Query__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__04466);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2176:1: rule__Query__Group_1__0__Impl : ( ( rule__Query__Alternatives_1_0 ) ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2180:1: ( ( ( rule__Query__Alternatives_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2181:1: ( ( rule__Query__Alternatives_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2181:1: ( ( rule__Query__Alternatives_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2182:1: ( rule__Query__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2183:1: ( rule__Query__Alternatives_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2183:2: rule__Query__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl4493);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2193:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl rule__Query__Group_1__2 ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2197:1: ( rule__Query__Group_1__1__Impl rule__Query__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2198:2: rule__Query__Group_1__1__Impl rule__Query__Group_1__2
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__14523);
            rule__Query__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__14526);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2205:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__Alternatives_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2209:1: ( ( ( rule__Query__Alternatives_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2210:1: ( ( rule__Query__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2210:1: ( ( rule__Query__Alternatives_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2211:1: ( rule__Query__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2212:1: ( rule__Query__Alternatives_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2212:2: rule__Query__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl4553);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2222:1: rule__Query__Group_1__2 : rule__Query__Group_1__2__Impl rule__Query__Group_1__3 ;
    public final void rule__Query__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2226:1: ( rule__Query__Group_1__2__Impl rule__Query__Group_1__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2227:2: rule__Query__Group_1__2__Impl rule__Query__Group_1__3
            {
            pushFollow(FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__24583);
            rule__Query__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__24586);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2234:1: rule__Query__Group_1__2__Impl : ( ( rule__Query__MethodAssignment_1_2 ) ) ;
    public final void rule__Query__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2238:1: ( ( ( rule__Query__MethodAssignment_1_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2239:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2239:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2240:1: ( rule__Query__MethodAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2241:1: ( rule__Query__MethodAssignment_1_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2241:2: rule__Query__MethodAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4613);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2251:1: rule__Query__Group_1__3 : rule__Query__Group_1__3__Impl rule__Query__Group_1__4 ;
    public final void rule__Query__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2255:1: ( rule__Query__Group_1__3__Impl rule__Query__Group_1__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2256:2: rule__Query__Group_1__3__Impl rule__Query__Group_1__4
            {
            pushFollow(FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34643);
            rule__Query__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34646);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2263:1: rule__Query__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Query__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2267:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2268:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2268:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2269:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Query__Group_1__3__Impl4674); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2282:1: rule__Query__Group_1__4 : rule__Query__Group_1__4__Impl rule__Query__Group_1__5 ;
    public final void rule__Query__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2286:1: ( rule__Query__Group_1__4__Impl rule__Query__Group_1__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2287:2: rule__Query__Group_1__4__Impl rule__Query__Group_1__5
            {
            pushFollow(FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44705);
            rule__Query__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44708);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2294:1: rule__Query__Group_1__4__Impl : ( ( rule__Query__ParameterAssignment_1_4 ) ) ;
    public final void rule__Query__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2298:1: ( ( ( rule__Query__ParameterAssignment_1_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2299:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2299:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2300:1: ( rule__Query__ParameterAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2301:1: ( rule__Query__ParameterAssignment_1_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2301:2: rule__Query__ParameterAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4735);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2311:1: rule__Query__Group_1__5 : rule__Query__Group_1__5__Impl rule__Query__Group_1__6 ;
    public final void rule__Query__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2315:1: ( rule__Query__Group_1__5__Impl rule__Query__Group_1__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2316:2: rule__Query__Group_1__5__Impl rule__Query__Group_1__6
            {
            pushFollow(FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54765);
            rule__Query__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54768);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2323:1: rule__Query__Group_1__5__Impl : ( ( rule__Query__Group_1_5__0 )* ) ;
    public final void rule__Query__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2327:1: ( ( ( rule__Query__Group_1_5__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2328:1: ( ( rule__Query__Group_1_5__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2328:1: ( ( rule__Query__Group_1_5__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2329:1: ( rule__Query__Group_1_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2330:1: ( rule__Query__Group_1_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2330:2: rule__Query__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4795);
            	    rule__Query__Group_1_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2340:1: rule__Query__Group_1__6 : rule__Query__Group_1__6__Impl ;
    public final void rule__Query__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2344:1: ( rule__Query__Group_1__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2345:2: rule__Query__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64826);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2351:1: rule__Query__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Query__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2355:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2356:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2356:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2357:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,36,FOLLOW_36_in_rule__Query__Group_1__6__Impl4854); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2384:1: rule__Query__Group_1_5__0 : rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 ;
    public final void rule__Query__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2388:1: ( rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2389:2: rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04899);
            rule__Query__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04902);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2396:1: rule__Query__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2400:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2401:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2401:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2402:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Query__Group_1_5__0__Impl4930); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2415:1: rule__Query__Group_1_5__1 : rule__Query__Group_1_5__1__Impl ;
    public final void rule__Query__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2419:1: ( rule__Query__Group_1_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2420:2: rule__Query__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14961);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2426:1: rule__Query__Group_1_5__1__Impl : ( ( rule__Query__ParameterAssignment_1_5_1 ) ) ;
    public final void rule__Query__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2430:1: ( ( ( rule__Query__ParameterAssignment_1_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2431:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2431:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2432:1: ( rule__Query__ParameterAssignment_1_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2433:1: ( rule__Query__ParameterAssignment_1_5_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2433:2: rule__Query__ParameterAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4988);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2447:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2451:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2452:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__05022);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__05025);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2459:1: rule__ParameterPattern__Group__0__Impl : ( ( rule__ParameterPattern__Alternatives_0 ) ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2463:1: ( ( ( rule__ParameterPattern__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2464:1: ( ( rule__ParameterPattern__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2464:1: ( ( rule__ParameterPattern__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2465:1: ( rule__ParameterPattern__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2466:1: ( rule__ParameterPattern__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2466:2: rule__ParameterPattern__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Alternatives_0_in_rule__ParameterPattern__Group__0__Impl5052);
            rule__ParameterPattern__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getAlternatives_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2476:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2480:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2481:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__15082);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__15085);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2488:1: rule__ParameterPattern__Group__1__Impl : ( ( rule__ParameterPattern__TypeAssignment_1 ) ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2492:1: ( ( ( rule__ParameterPattern__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2493:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2493:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2494:1: ( rule__ParameterPattern__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2495:1: ( rule__ParameterPattern__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2495:2: rule__ParameterPattern__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl5112);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2505:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2509:1: ( rule__ParameterPattern__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2510:2: rule__ParameterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__25142);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2516:1: rule__ParameterPattern__Group__2__Impl : ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2520:1: ( ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2521:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2521:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2522:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2523:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2523:2: rule__ParameterPattern__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl5169);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2539:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2543:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2544:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__05205);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__05208);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2551:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2555:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2556:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2556:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2557:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2558:1: ( rule__LocationQuery__NodeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2558:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl5235);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2568:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2572:1: ( rule__LocationQuery__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2573:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__15265);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2579:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Group_1__0 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2583:1: ( ( ( rule__LocationQuery__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2584:1: ( ( rule__LocationQuery__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2584:1: ( ( rule__LocationQuery__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2585:1: ( rule__LocationQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2586:1: ( rule__LocationQuery__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2586:2: rule__LocationQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl5292);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2600:1: rule__LocationQuery__Group_1__0 : rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 ;
    public final void rule__LocationQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2604:1: ( rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2605:2: rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__05327);
            rule__LocationQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__05330);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2612:1: rule__LocationQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2616:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2617:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2617:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2618:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__LocationQuery__Group_1__0__Impl5358); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2631:1: rule__LocationQuery__Group_1__1 : rule__LocationQuery__Group_1__1__Impl ;
    public final void rule__LocationQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2635:1: ( rule__LocationQuery__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2636:2: rule__LocationQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__15389);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2642:1: rule__LocationQuery__Group_1__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) ;
    public final void rule__LocationQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2646:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2647:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2647:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2648:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2649:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2649:2: rule__LocationQuery__SpecializationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl5416);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2663:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2667:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2668:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05450);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05453);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2675:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2679:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2680:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2680:1: ( ( rule__Node__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2681:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2682:1: ( rule__Node__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2682:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl5480);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2692:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2696:1: ( rule__Node__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2697:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15510);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2703:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2707:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2708:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2708:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2709:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2710:1: ( rule__Node__ParameterAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2710:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl5537);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2724:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2728:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2729:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__05572);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__05575);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2736:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2740:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2741:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2741:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2742:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParamQuery__Group__0__Impl5603); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2755:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2759:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2760:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15634);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15637);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2767:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2771:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2772:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2772:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2773:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2773:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2774:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2775:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2775:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5666);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2778:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2779:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2780:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==11||LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2780:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5678);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2791:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2795:1: ( rule__ParamQuery__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2796:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25711);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2802:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2806:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2807:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2807:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2808:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__ParamQuery__Group__2__Impl5739); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2827:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2831:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2832:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05776);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05779);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2839:1: rule__ParamCompare__Group__0__Impl : ( ( rule__ParamCompare__LeftAssignment_0 ) ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2843:1: ( ( ( rule__ParamCompare__LeftAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2844:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2844:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2845:1: ( rule__ParamCompare__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2846:1: ( rule__ParamCompare__LeftAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2846:2: rule__ParamCompare__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5806);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2856:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2860:1: ( rule__ParamCompare__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2861:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15836);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2867:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 ) ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2871:1: ( ( ( rule__ParamCompare__Group_1__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2872:1: ( ( rule__ParamCompare__Group_1__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2872:1: ( ( rule__ParamCompare__Group_1__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2873:1: ( rule__ParamCompare__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2874:1: ( rule__ParamCompare__Group_1__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2874:2: rule__ParamCompare__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5863);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2888:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2892:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2893:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05897);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05900);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2900:1: rule__ParamCompare__Group_1__0__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2904:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2905:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2905:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2906:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2907:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2907:2: rule__ParamCompare__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5927);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2917:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2921:1: ( rule__ParamCompare__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:2: rule__ParamCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15957);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2928:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__RightAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2932:1: ( ( ( rule__ParamCompare__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2933:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2933:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2934:1: ( rule__ParamCompare__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2935:1: ( rule__ParamCompare__RightAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2935:2: rule__ParamCompare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5984);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2949:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2953:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2954:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__06018);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__06021);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2961:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 ) ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2965:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2966:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2966:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2967:1: ( rule__ReferenceValue__QueryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2968:1: ( rule__ReferenceValue__QueryAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2968:2: rule__ReferenceValue__QueryAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl6048);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2978:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2982:1: ( rule__ReferenceValue__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2983:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__16078);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2989:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2993:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2994:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2994:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2995:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2996:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2996:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl6105);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3010:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3014:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3015:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__06139);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__06142);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3022:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3026:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3027:1: ( '#' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3027:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3028:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__RuntimeProperty__Group__0__Impl6170); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3041:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3045:1: ( rule__RuntimeProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3046:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__16201);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3052:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3056:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3057:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3057:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3058:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3059:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3059:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl6228);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3073:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3077:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3078:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__06262);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__06265);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3085:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3089:1: ( ( '$' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3090:1: ( '$' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3090:1: ( '$' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3091:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ReflectionProperty__Group__0__Impl6293); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3104:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3108:1: ( rule__ReflectionProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3109:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__16324);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3115:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3119:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3120:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3120:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3121:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3122:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3122:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl6351);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3136:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3140:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3141:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__06385);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__06388);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3148:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3152:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3153:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3153:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3154:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3155:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3157:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3167:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3171:1: ( rule__WildcardNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3172:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__16446);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3178:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3182:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3183:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3183:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3184:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,11,FOLLOW_11_in_rule__WildcardNode__Group__1__Impl6474); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3201:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3205:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3206:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__06509);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__06512);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3213:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3217:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3218:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3218:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3219:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3220:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3222:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3232:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3236:1: ( rule__SubPathNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3237:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__16570);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3243:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3247:1: ( ( '**' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3248:1: ( '**' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3248:1: ( '**' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3249:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__SubPathNode__Group__1__Impl6598); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3266:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3270:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3271:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06633);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06636);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3278:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3282:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3283:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3283:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3284:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3285:1: ( rule__Collector__InsertionPointAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3285:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6663);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3295:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl rule__Collector__Group__2 ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3299:1: ( rule__Collector__Group__1__Impl rule__Collector__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3300:2: rule__Collector__Group__1__Impl rule__Collector__Group__2
            {
            pushFollow(FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16693);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16696);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3307:1: rule__Collector__Group__1__Impl : ( ( rule__Collector__TypeAssignment_1 ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3311:1: ( ( ( rule__Collector__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3312:1: ( ( rule__Collector__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3312:1: ( ( rule__Collector__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3313:1: ( rule__Collector__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3314:1: ( rule__Collector__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3314:2: rule__Collector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6723);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3324:1: rule__Collector__Group__2 : rule__Collector__Group__2__Impl rule__Collector__Group__3 ;
    public final void rule__Collector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3328:1: ( rule__Collector__Group__2__Impl rule__Collector__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3329:2: rule__Collector__Group__2__Impl rule__Collector__Group__3
            {
            pushFollow(FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26753);
            rule__Collector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26756);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3336:1: rule__Collector__Group__2__Impl : ( '(' ) ;
    public final void rule__Collector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3340:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3341:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3341:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3342:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Collector__Group__2__Impl6784); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3355:1: rule__Collector__Group__3 : rule__Collector__Group__3__Impl rule__Collector__Group__4 ;
    public final void rule__Collector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3359:1: ( rule__Collector__Group__3__Impl rule__Collector__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3360:2: rule__Collector__Group__3__Impl rule__Collector__Group__4
            {
            pushFollow(FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36815);
            rule__Collector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36818);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3367:1: rule__Collector__Group__3__Impl : ( ( rule__Collector__Group_3__0 )? ) ;
    public final void rule__Collector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3371:1: ( ( ( rule__Collector__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3372:1: ( ( rule__Collector__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3372:1: ( ( rule__Collector__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3373:1: ( rule__Collector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3374:1: ( rule__Collector__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==11||LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3374:2: rule__Collector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6845);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3384:1: rule__Collector__Group__4 : rule__Collector__Group__4__Impl ;
    public final void rule__Collector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3388:1: ( rule__Collector__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3389:2: rule__Collector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46876);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3395:1: rule__Collector__Group__4__Impl : ( ')' ) ;
    public final void rule__Collector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3399:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3400:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3400:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3401:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__Collector__Group__4__Impl6904); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3424:1: rule__Collector__Group_3__0 : rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 ;
    public final void rule__Collector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3428:1: ( rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3429:2: rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06945);
            rule__Collector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06948);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3436:1: rule__Collector__Group_3__0__Impl : ( ( rule__Collector__InitializationsAssignment_3_0 ) ) ;
    public final void rule__Collector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3440:1: ( ( ( rule__Collector__InitializationsAssignment_3_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3441:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3441:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3442:1: ( rule__Collector__InitializationsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3443:1: ( rule__Collector__InitializationsAssignment_3_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3443:2: rule__Collector__InitializationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6975);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3453:1: rule__Collector__Group_3__1 : rule__Collector__Group_3__1__Impl ;
    public final void rule__Collector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3457:1: ( rule__Collector__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3458:2: rule__Collector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__17005);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3464:1: rule__Collector__Group_3__1__Impl : ( ( rule__Collector__Group_3_1__0 )* ) ;
    public final void rule__Collector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3468:1: ( ( ( rule__Collector__Group_3_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3469:1: ( ( rule__Collector__Group_3_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3469:1: ( ( rule__Collector__Group_3_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3470:1: ( rule__Collector__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3471:1: ( rule__Collector__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3471:2: rule__Collector__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl7032);
            	    rule__Collector__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3485:1: rule__Collector__Group_3_1__0 : rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 ;
    public final void rule__Collector__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3489:1: ( rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3490:2: rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__07067);
            rule__Collector__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__07070);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3497:1: rule__Collector__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Collector__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3501:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3502:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3502:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3503:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Collector__Group_3_1__0__Impl7098); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3516:1: rule__Collector__Group_3_1__1 : rule__Collector__Group_3_1__1__Impl ;
    public final void rule__Collector__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3520:1: ( rule__Collector__Group_3_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3521:2: rule__Collector__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__17129);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3527:1: rule__Collector__Group_3_1__1__Impl : ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) ;
    public final void rule__Collector__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3531:1: ( ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3532:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3532:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3533:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3534:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3534:2: rule__Collector__InitializationsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl7156);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3549:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3553:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3554:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3554:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3555:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_17195);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3564:1: rule__Model__MetamodelsAssignment_2 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3568:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3569:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3569:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3570:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsRegisteredPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_27226);
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


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3579:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3583:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3584:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3584:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3585:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37257);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__SourcesAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3594:1: rule__Model__SourcesAssignment_4 : ( ruleApplicationModel ) ;
    public final void rule__Model__SourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3598:1: ( ( ruleApplicationModel ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3599:1: ( ruleApplicationModel )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3599:1: ( ruleApplicationModel )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3600:1: ruleApplicationModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_47288);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SourcesAssignment_4"


    // $ANTLR start "rule__Model__AspectsAssignment_5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3609:1: rule__Model__AspectsAssignment_5 : ( ruleAspect ) ;
    public final void rule__Model__AspectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3613:1: ( ( ruleAspect ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3614:1: ( ruleAspect )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3614:1: ( ruleAspect )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3615:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_57319);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AspectsAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3624:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3628:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3629:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3629:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3630:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_17350);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__RegisteredPackage__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3639:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3643:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3644:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3644:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3645:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_17381); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3654:1: rule__RegisteredPackage__EPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__RegisteredPackage__EPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3658:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3659:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3659:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3660:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3661:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3662:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_27416); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3673:1: rule__ApplicationModel__UsePackagesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3677:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3678:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3678:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3679:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3680:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3681:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_17455); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3692:1: rule__ApplicationModel__UsePackagesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3696:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3697:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3697:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3698:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3699:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_17494); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3711:1: rule__ApplicationModel__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3715:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3716:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3716:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3717:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_47529); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3726:1: rule__ApplicationModel__ModelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3730:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3731:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3731:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3732:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_57560); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3741:1: rule__Aspect__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Aspect__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3745:1: ( ( ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3746:1: ( ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3746:1: ( ruleQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3747:1: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_17591);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3756:1: rule__Aspect__CollectorsAssignment_3 : ( ruleCollector ) ;
    public final void rule__Aspect__CollectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3760:1: ( ( ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3761:1: ( ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3761:1: ( ruleCollector )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3762:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_37622);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3771:1: rule__Query__LocationAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__Query__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3775:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3776:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3776:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3777:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_07653);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3786:1: rule__Query__ModifierAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ModifierAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3790:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3791:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3791:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3792:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3793:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3794:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_07688); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3805:1: rule__Query__ReturnTypeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ReturnTypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3809:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3810:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3810:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3811:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3812:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3813:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_07727); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3824:1: rule__Query__MethodAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Query__MethodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3828:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3829:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3829:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3830:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3831:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3832:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_27766); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3843:1: rule__Query__ParameterAssignment_1_4 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3847:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3848:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3848:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3849:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_47801);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3858:1: rule__Query__ParameterAssignment_1_5_1 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3862:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3863:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3863:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3864:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_17832);
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


    // $ANTLR start "rule__ParameterPattern__ModifierAssignment_0_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3873:1: rule__ParameterPattern__ModifierAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ModifierAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3877:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3878:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3878:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3879:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3880:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3881:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_0_07867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__ModifierAssignment_0_0"


    // $ANTLR start "rule__ParameterPattern__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3892:1: rule__ParameterPattern__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3896:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3897:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3897:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3898:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3899:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3900:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17906); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3911:1: rule__ParameterPattern__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3915:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3916:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3916:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3917:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3918:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3919:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27945); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3930:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3934:1: ( ( ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3935:1: ( ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3935:1: ( ruleNode )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3936:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07980);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3945:1: rule__LocationQuery__SpecializationAssignment_1_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3949:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3950:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3950:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3951:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_18011);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3960:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3964:1: ( ( ruleParamQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3965:1: ( ruleParamQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3965:1: ( ruleParamQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3966:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_18042);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3975:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamCompare ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3979:1: ( ( ruleParamCompare ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3980:1: ( ruleParamCompare )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3980:1: ( ruleParamCompare )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3981:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_18073);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3990:1: rule__ParamCompare__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__ParamCompare__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3994:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3995:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3995:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3996:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_08104);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4005:1: rule__ParamCompare__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4009:1: ( ( ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4010:1: ( ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4010:1: ( ruleOperator )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4011:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_08135);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4020:1: rule__ParamCompare__RightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4024:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4025:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4025:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4026:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_18166);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4035:1: rule__FloatValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4039:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4040:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4040:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4041:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment8197); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4050:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4054:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4055:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4055:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4056:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment8228); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4065:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4069:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4070:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4070:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4071:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8259); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4080:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4084:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4085:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4085:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4086:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_08290);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4095:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4099:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4100:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4100:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4101:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_18321);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4110:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4114:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4115:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4115:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4116:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_18352); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4125:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4129:1: ( ( ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4130:1: ( ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4130:1: ( ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4131:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_18383);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4140:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4144:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4145:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4145:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4146:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4147:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4148:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment8418); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4159:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4163:1: ( ( ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4164:1: ( ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4164:1: ( ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4165:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_08453);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4174:1: rule__Collector__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Collector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4178:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4179:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4179:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4180:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4181:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4182:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_18488);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4193:1: rule__Collector__InitializationsAssignment_3_0 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4197:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4198:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4198:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4199:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_08523);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4208:1: rule__Collector__InitializationsAssignment_3_1_1 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4212:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4213:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4213:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4214:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_18554);
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

    // $ANTLR start synpred7_InternalApplicationLang
    public final void synpred7_InternalApplicationLang_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:929:6: ( ( ruleIntValue ) )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:929:6: ( ruleIntValue )
        {
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:929:6: ( ruleIntValue )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:930:1: ruleIntValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleIntValue_in_synpred7_InternalApplicationLang1926);
        ruleIntValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalApplicationLang

    // $ANTLR start synpred8_InternalApplicationLang
    public final void synpred8_InternalApplicationLang_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:935:6: ( ( ruleFloatValue ) )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:935:6: ( ruleFloatValue )
        {
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:935:6: ( ruleFloatValue )
        // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:936:1: ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleFloatValue_in_synpred8_InternalApplicationLang1943);
        ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalApplicationLang

    // Delegated rules

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
    public final boolean synpred8_InternalApplicationLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalApplicationLang_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0_in_ruleApplicationModel280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0_in_ruleAspect460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterPattern554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0_in_ruleCollector1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_01684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Query__Alternatives_1_01703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Query__Alternatives_1_11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ModifierAssignment_0_0_in_rule__ParameterPattern__Alternatives_01790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ParameterPattern__Alternatives_01809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ReflectionFunction__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ReflectionFunction__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReflectionFunction__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ReflectionFunction__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Operator__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Operator__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Operator__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Operator__Alternatives2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__InsertionPoint__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__InsertionPoint__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__0__Impl2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12419 = new BitSet(new long[]{0x000000011C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22479 = new BitSet(new long[]{0x000000011C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl2509 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32540 = new BitSet(new long[]{0x000000011C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2570 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42601 = new BitSet(new long[]{0x000000011C000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SourcesAssignment_4_in_rule__Model__Group__4__Impl2631 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectsAssignment_5_in_rule__Model__Group__5__Impl2689 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Import__Group__0__Impl2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__02855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__02858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RegisteredPackage__Group__0__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__12917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__22977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__03040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__03043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ApplicationModel__Group__0__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__13102 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__23162 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__23165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl3192 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__33223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__33226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ApplicationModel__Group__3__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__43285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__43288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__53345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__03414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__03417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ApplicationModel__Group_2__0__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03537 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3623 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedName__Group_1__0__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03782 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__03903 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__03906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__04028 = new BitSet(new long[]{0x0000020000000810L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__04031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Aspect__Group__0__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__14090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__14093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__QueryAssignment_1_in_rule__Aspect__Group__1__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__24150 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__24153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Aspect__Group__2__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__34212 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__34215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__CollectorsAssignment_3_in_rule__Aspect__Group__3__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__44272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Aspect__Group__4__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04341 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__04463 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__14523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__24583 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__24586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34643 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Query__Group_1__3__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44705 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54765 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4795 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__64826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Query__Group_1__6__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__04899 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__04902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Query__Group_1_5__0__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__14961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__05022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__05025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Alternatives_0_in_rule__ParameterPattern__Group__0__Impl5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__15082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__15085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__25142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__05205 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__05208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__05327 = new BitSet(new long[]{0x0000020000000810L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__05330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LocationQuery__Group_1__0__Impl5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__15389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05450 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__05572 = new BitSet(new long[]{0x0000020000000870L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__05575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParamQuery__Group__0__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15634 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5666 = new BitSet(new long[]{0x0000020000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5678 = new BitSet(new long[]{0x0000020000000872L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParamQuery__Group__2__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05776 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__15836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__05897 = new BitSet(new long[]{0x0000020000000870L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__05900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__06018 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__06021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__16078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__06139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__06142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RuntimeProperty__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__06262 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__06265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ReflectionProperty__Group__0__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__16324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__06385 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__06388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__16446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__WildcardNode__Group__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__06509 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SubPathNode__Group__1__Impl6598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16693 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26753 = new BitSet(new long[]{0x0000021000000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Collector__Group__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36815 = new BitSet(new long[]{0x0000021000000870L});
    public static final BitSet FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__46876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Collector__Group__4__Impl6904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__06945 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__06948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__17005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl7032 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__07067 = new BitSet(new long[]{0x0000020000000870L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__07070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Collector__Group_3_1__0__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__17129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_17195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_27226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_47288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_57319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_17350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_17381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_27416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_17494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_47529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_57560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_17591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_37622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_07653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_07688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_07727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_27766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_47801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_17832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_0_07867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_17906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_27945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_07980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_18011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_18042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_08104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_08135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_18166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FloatValue__ValueAssignment8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment8259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_08290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_18321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_18352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_18383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_08453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_18488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_08523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_18554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_synpred7_InternalApplicationLang1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_synpred8_InternalApplicationLang1943 = new BitSet(new long[]{0x0000000000000002L});

}
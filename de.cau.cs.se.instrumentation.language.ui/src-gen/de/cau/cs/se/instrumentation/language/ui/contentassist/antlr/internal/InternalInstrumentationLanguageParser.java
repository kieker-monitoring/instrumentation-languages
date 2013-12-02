package de.cau.cs.se.instrumentation.language.ui.contentassist.antlr.internal; 

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
import de.cau.cs.se.instrumentation.language.services.InstrumentationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalInstrumentationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'pattern'", "'('", "')'", "','", "'record'", "'{'", "'}'", "'#'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalInstrumentationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInstrumentationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInstrumentationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g"; }


     
     	private InstrumentationLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(InstrumentationLanguageGrammarAccess grammarAccess) {
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:63:1: ruleModel EOF
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:77:2: rule__Model__Group__0
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:90:1: ( ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:91:1: ruleImport EOF
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:105:2: rule__Import__Group__0
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


    // $ANTLR start "entryRulePackage"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:117:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:118:1: ( rulePackage EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:119:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage187);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage194); if (state.failed) return ;

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:126:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:130:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:131:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:131:1: ( ( rule__Package__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:132:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:133:1: ( rule__Package__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:133:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage220);
            rule__Package__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:146:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:147:1: ruleQualifiedName EOF
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:161:2: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:173:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:174:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:175:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard307);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard314); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:182:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:186:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:188:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:189:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:189:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard340);
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


    // $ANTLR start "entryRulePattern"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:201:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:202:1: ( rulePattern EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:203:1: rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern367);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern374); if (state.failed) return ;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:210:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:214:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:215:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:215:1: ( ( rule__Pattern__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:216:1: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:217:1: ( rule__Pattern__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:217:2: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0_in_rulePattern400);
            rule__Pattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleParameter"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:229:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:230:1: ( ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:231:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter427);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter434); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:238:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:242:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:243:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:243:1: ( ( rule__Parameter__NameAssignment ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:244:1: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:245:1: ( rule__Parameter__NameAssignment )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:245:2: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter460);
            rule__Parameter__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleCodeElement"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:257:1: entryRuleCodeElement : ruleCodeElement EOF ;
    public final void entryRuleCodeElement() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:258:1: ( ruleCodeElement EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:259:1: ruleCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCodeElement_in_entryRuleCodeElement487);
            ruleCodeElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeElement494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCodeElement"


    // $ANTLR start "ruleCodeElement"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:266:1: ruleCodeElement : ( ( rule__CodeElement__Group__0 ) ) ;
    public final void ruleCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:270:2: ( ( ( rule__CodeElement__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:271:1: ( ( rule__CodeElement__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:271:1: ( ( rule__CodeElement__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:272:1: ( rule__CodeElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:273:1: ( rule__CodeElement__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:273:2: rule__CodeElement__Group__0
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__0_in_ruleCodeElement520);
            rule__CodeElement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeElement"


    // $ANTLR start "entryRuleSimpleCodeElement"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:285:1: entryRuleSimpleCodeElement : ruleSimpleCodeElement EOF ;
    public final void entryRuleSimpleCodeElement() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:286:1: ( ruleSimpleCodeElement EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:287:1: ruleSimpleCodeElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleCodeElementRule()); 
            }
            pushFollow(FOLLOW_ruleSimpleCodeElement_in_entryRuleSimpleCodeElement547);
            ruleSimpleCodeElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleCodeElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleCodeElement554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleCodeElement"


    // $ANTLR start "ruleSimpleCodeElement"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:294:1: ruleSimpleCodeElement : ( ( rule__SimpleCodeElement__Alternatives ) ) ;
    public final void ruleSimpleCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:298:2: ( ( ( rule__SimpleCodeElement__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:299:1: ( ( rule__SimpleCodeElement__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:299:1: ( ( rule__SimpleCodeElement__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:300:1: ( rule__SimpleCodeElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleCodeElementAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:301:1: ( rule__SimpleCodeElement__Alternatives )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:301:2: rule__SimpleCodeElement__Alternatives
            {
            pushFollow(FOLLOW_rule__SimpleCodeElement__Alternatives_in_ruleSimpleCodeElement580);
            rule__SimpleCodeElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleCodeElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleCodeElement"


    // $ANTLR start "entryRuleParameterRef"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:313:1: entryRuleParameterRef : ruleParameterRef EOF ;
    public final void entryRuleParameterRef() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:314:1: ( ruleParameterRef EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:315:1: ruleParameterRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefRule()); 
            }
            pushFollow(FOLLOW_ruleParameterRef_in_entryRuleParameterRef607);
            ruleParameterRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterRef614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameterRef"


    // $ANTLR start "ruleParameterRef"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:322:1: ruleParameterRef : ( ( rule__ParameterRef__RefAssignment ) ) ;
    public final void ruleParameterRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:326:2: ( ( ( rule__ParameterRef__RefAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:327:1: ( ( rule__ParameterRef__RefAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:327:1: ( ( rule__ParameterRef__RefAssignment ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:328:1: ( rule__ParameterRef__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:329:1: ( rule__ParameterRef__RefAssignment )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:329:2: rule__ParameterRef__RefAssignment
            {
            pushFollow(FOLLOW_rule__ParameterRef__RefAssignment_in_ruleParameterRef640);
            rule__ParameterRef__RefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRef"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:341:1: entryRuleXStringLiteral : ruleXStringLiteral EOF ;
    public final void entryRuleXStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:342:1: ( ruleXStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:343:1: ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral667);
            ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:350:1: ruleXStringLiteral : ( ( rule__XStringLiteral__ValueAssignment ) ) ;
    public final void ruleXStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:354:2: ( ( ( rule__XStringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:355:1: ( ( rule__XStringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:355:1: ( ( rule__XStringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:356:1: ( rule__XStringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:357:1: ( rule__XStringLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:357:2: rule__XStringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__XStringLiteral__ValueAssignment_in_ruleXStringLiteral700);
            rule__XStringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXStringLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleRecord"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:369:1: entryRuleRecord : ruleRecord EOF ;
    public final void entryRuleRecord() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:370:1: ( ruleRecord EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:371:1: ruleRecord EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordRule()); 
            }
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord727);
            ruleRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:378:1: ruleRecord : ( ( rule__Record__Group__0 ) ) ;
    public final void ruleRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:382:2: ( ( ( rule__Record__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:383:1: ( ( rule__Record__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:383:1: ( ( rule__Record__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:384:1: ( rule__Record__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:385:1: ( rule__Record__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:385:2: rule__Record__Group__0
            {
            pushFollow(FOLLOW_rule__Record__Group__0_in_ruleRecord760);
            rule__Record__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:397:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:398:1: ( ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:399:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier787);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:406:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:410:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:411:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:411:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:412:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:413:1: ( rule__Classifier__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:413:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0_in_ruleClassifier820);
            rule__Classifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleProperty"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:425:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:426:1: ( ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:427:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty847);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:434:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:438:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:439:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:439:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:440:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:441:1: ( rule__Property__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:441:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty880);
            rule__Property__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleReferenceProperty"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:453:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:454:1: ( ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:455:1: ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty907);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReferenceProperty"


    // $ANTLR start "ruleReferenceProperty"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:462:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:466:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:468:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:469:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:469:2: rule__ReferenceProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty940);
            rule__ReferenceProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReferenceProperty"


    // $ANTLR start "rule__SimpleCodeElement__Alternatives"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:481:1: rule__SimpleCodeElement__Alternatives : ( ( ruleXStringLiteral ) | ( ruleParameterRef ) );
    public final void rule__SimpleCodeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:485:1: ( ( ruleXStringLiteral ) | ( ruleParameterRef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
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
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:486:1: ( ruleXStringLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:486:1: ( ruleXStringLiteral )
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:487:1: ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleCodeElementAccess().getXStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_rule__SimpleCodeElement__Alternatives976);
                    ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleCodeElementAccess().getXStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:492:6: ( ruleParameterRef )
                    {
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:492:6: ( ruleParameterRef )
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:493:1: ruleParameterRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSimpleCodeElementAccess().getParameterRefParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParameterRef_in_rule__SimpleCodeElement__Alternatives993);
                    ruleParameterRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSimpleCodeElementAccess().getParameterRefParserRuleCall_1()); 
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
    // $ANTLR end "rule__SimpleCodeElement__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:505:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:509:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:510:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01023);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01026);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:517:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:521:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:522:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:522:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:523:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Model__Group__0__Impl1054); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:536:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:540:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:541:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11085);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11088);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:548:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:552:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:553:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:553:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:554:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:555:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:555:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1115);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:565:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:569:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:570:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21145);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21148);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:577:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:581:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:582:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:582:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:583:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:584:1: ( rule__Model__PackagesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:584:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1175);
            	    rule__Model__PackagesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:594:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:598:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:599:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31206);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31209);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:606:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:610:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:611:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:611:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:612:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:613:1: ( rule__Model__ImportsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:613:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1236);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:623:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:627:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:628:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41267);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41270);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:635:1: rule__Model__Group__4__Impl : ( ( rule__Model__PatternsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:639:1: ( ( ( rule__Model__PatternsAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:640:1: ( ( rule__Model__PatternsAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:640:1: ( ( rule__Model__PatternsAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:641:1: ( rule__Model__PatternsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPatternsAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:642:1: ( rule__Model__PatternsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:642:2: rule__Model__PatternsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__PatternsAssignment_4_in_rule__Model__Group__4__Impl1297);
            	    rule__Model__PatternsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPatternsAssignment_4()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:652:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:656:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:657:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51328);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:663:1: rule__Model__Group__5__Impl : ( ( rule__Model__RecordsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:667:1: ( ( ( rule__Model__RecordsAssignment_5 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:668:1: ( ( rule__Model__RecordsAssignment_5 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:668:1: ( ( rule__Model__RecordsAssignment_5 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:669:1: ( rule__Model__RecordsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRecordsAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:670:1: ( rule__Model__RecordsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:670:2: rule__Model__RecordsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__RecordsAssignment_5_in_rule__Model__Group__5__Impl1355);
            	    rule__Model__RecordsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRecordsAssignment_5()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:692:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:696:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:697:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01398);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01401);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:704:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:708:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:709:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:709:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:710:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl1429); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:723:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:727:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:728:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11460);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:734:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:738:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:740:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:741:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:741:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1487);
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


    // $ANTLR start "rule__Package__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:755:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:759:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:760:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01521);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01524);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:767:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:771:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:772:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:772:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:773:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__Package__Group__0__Impl1552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:786:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:790:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:791:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11583);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11586);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:798:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:802:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:803:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:803:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:804:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:805:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:805:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1613);
            rule__Package__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:815:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:819:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:820:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21643);
            rule__Package__Group__2__Impl();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:826:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:830:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:831:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:831:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:832:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:833:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:833:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl1670);
            rule__Package__PackageAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:849:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:853:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:854:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01706);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01709);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:861:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:865:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:866:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:866:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:867:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1736); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:878:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:882:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:883:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11765);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:889:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:893:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:894:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:894:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:895:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:896:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==RULE_ID) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:896:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1792);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:910:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:914:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:915:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01827);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01830);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:922:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:926:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:927:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:927:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:928:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:929:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:930:2: '.'
            {
            match(input,14,FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1859); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:941:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:945:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:946:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11891);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:952:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:956:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:957:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:957:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1918); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:973:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:977:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:978:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01951);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01954);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:985:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:989:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:990:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:990:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:991:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1981);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1002:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1006:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1007:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12010);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1013:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1017:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1018:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1018:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1019:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1020:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1020:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2037);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1034:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1038:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1039:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02072);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02075);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1046:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1050:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1051:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1051:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1052:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2103); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1065:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1069:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1070:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12134);
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
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1076:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1080:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1081:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1081:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1082:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2162); if (state.failed) return ;
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


    // $ANTLR start "rule__Pattern__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1099:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1103:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1104:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02197);
            rule__Pattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02200);
            rule__Pattern__Group__1();

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
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1111:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1115:1: ( ( 'pattern' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1116:1: ( 'pattern' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1116:1: ( 'pattern' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1117:1: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Pattern__Group__0__Impl2228); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPatternKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1130:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1134:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1135:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12259);
            rule__Pattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12262);
            rule__Pattern__Group__2();

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
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1142:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1146:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1147:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1147:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1148:1: ( rule__Pattern__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1149:1: ( rule__Pattern__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1149:2: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Pattern__NameAssignment_1_in_rule__Pattern__Group__1__Impl2289);
            rule__Pattern__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1159:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1163:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1164:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22319);
            rule__Pattern__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__22322);
            rule__Pattern__Group__3();

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
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1171:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1175:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1176:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1176:1: ( ( rule__Pattern__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1177:1: ( rule__Pattern__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1178:1: ( rule__Pattern__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1178:2: rule__Pattern__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Pattern__Group_2__0_in_rule__Pattern__Group__2__Impl2349);
                    rule__Pattern__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1188:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1192:1: ( rule__Pattern__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1193:2: rule__Pattern__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__32380);
            rule__Pattern__Group__3__Impl();

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
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1199:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__CodeSequceneAssignment_3 )* ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1203:1: ( ( ( rule__Pattern__CodeSequceneAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1204:1: ( ( rule__Pattern__CodeSequceneAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1204:1: ( ( rule__Pattern__CodeSequceneAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1205:1: ( rule__Pattern__CodeSequceneAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCodeSequceneAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1206:1: ( rule__Pattern__CodeSequceneAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1206:2: rule__Pattern__CodeSequceneAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Pattern__CodeSequceneAssignment_3_in_rule__Pattern__Group__3__Impl2407);
            	    rule__Pattern__CodeSequceneAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getCodeSequceneAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1224:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1228:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1229:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2__0__Impl_in_rule__Pattern__Group_2__02446);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group_2__1_in_rule__Pattern__Group_2__02449);
            rule__Pattern__Group_2__1();

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
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1236:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1240:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1241:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1241:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1242:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Pattern__Group_2__0__Impl2477); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1255:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1259:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1260:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2__1__Impl_in_rule__Pattern__Group_2__12508);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group_2__2_in_rule__Pattern__Group_2__12511);
            rule__Pattern__Group_2__2();

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
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1267:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1 ) ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1271:1: ( ( ( rule__Pattern__ParametersAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1272:1: ( ( rule__Pattern__ParametersAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1272:1: ( ( rule__Pattern__ParametersAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1273:1: ( rule__Pattern__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1274:1: ( rule__Pattern__ParametersAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1274:2: rule__Pattern__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Pattern__ParametersAssignment_2_1_in_rule__Pattern__Group_2__1__Impl2538);
            rule__Pattern__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1284:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3 ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1288:1: ( rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1289:2: rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2__2__Impl_in_rule__Pattern__Group_2__22568);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group_2__3_in_rule__Pattern__Group_2__22571);
            rule__Pattern__Group_2__3();

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
    // $ANTLR end "rule__Pattern__Group_2__2"


    // $ANTLR start "rule__Pattern__Group_2__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1296:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__Group_2_2__0 )* ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1300:1: ( ( ( rule__Pattern__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1301:1: ( ( rule__Pattern__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1301:1: ( ( rule__Pattern__Group_2_2__0 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1302:1: ( rule__Pattern__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1303:1: ( rule__Pattern__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1303:2: rule__Pattern__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Pattern__Group_2_2__0_in_rule__Pattern__Group_2__2__Impl2598);
            	    rule__Pattern__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2__Impl"


    // $ANTLR start "rule__Pattern__Group_2__3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1313:1: rule__Pattern__Group_2__3 : rule__Pattern__Group_2__3__Impl ;
    public final void rule__Pattern__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1317:1: ( rule__Pattern__Group_2__3__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1318:2: rule__Pattern__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2__3__Impl_in_rule__Pattern__Group_2__32629);
            rule__Pattern__Group_2__3__Impl();

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
    // $ANTLR end "rule__Pattern__Group_2__3"


    // $ANTLR start "rule__Pattern__Group_2__3__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1324:1: rule__Pattern__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1328:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1329:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1329:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1330:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Pattern__Group_2__3__Impl2657); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__3__Impl"


    // $ANTLR start "rule__Pattern__Group_2_2__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1351:1: rule__Pattern__Group_2_2__0 : rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1 ;
    public final void rule__Pattern__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1355:1: ( rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1356:2: rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2_2__0__Impl_in_rule__Pattern__Group_2_2__02696);
            rule__Pattern__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pattern__Group_2_2__1_in_rule__Pattern__Group_2_2__02699);
            rule__Pattern__Group_2_2__1();

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
    // $ANTLR end "rule__Pattern__Group_2_2__0"


    // $ANTLR start "rule__Pattern__Group_2_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1363:1: rule__Pattern__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1367:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1368:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1368:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1369:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Pattern__Group_2_2__0__Impl2727); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2_2__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1382:1: rule__Pattern__Group_2_2__1 : rule__Pattern__Group_2_2__1__Impl ;
    public final void rule__Pattern__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1386:1: ( rule__Pattern__Group_2_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1387:2: rule__Pattern__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group_2_2__1__Impl_in_rule__Pattern__Group_2_2__12758);
            rule__Pattern__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_2_2__1"


    // $ANTLR start "rule__Pattern__Group_2_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1393:1: rule__Pattern__Group_2_2__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Pattern__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1397:1: ( ( ( rule__Pattern__ParametersAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1398:1: ( ( rule__Pattern__ParametersAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1398:1: ( ( rule__Pattern__ParametersAssignment_2_2_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1399:1: ( rule__Pattern__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1400:1: ( rule__Pattern__ParametersAssignment_2_2_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1400:2: rule__Pattern__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Pattern__ParametersAssignment_2_2_1_in_rule__Pattern__Group_2_2__1__Impl2785);
            rule__Pattern__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2_2__1__Impl"


    // $ANTLR start "rule__CodeElement__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1414:1: rule__CodeElement__Group__0 : rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 ;
    public final void rule__CodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1418:1: ( rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1419:2: rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__0__Impl_in_rule__CodeElement__Group__02819);
            rule__CodeElement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CodeElement__Group__1_in_rule__CodeElement__Group__02822);
            rule__CodeElement__Group__1();

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
    // $ANTLR end "rule__CodeElement__Group__0"


    // $ANTLR start "rule__CodeElement__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1426:1: rule__CodeElement__Group__0__Impl : ( ( rule__CodeElement__ToUpperAssignment_0 )? ) ;
    public final void rule__CodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1430:1: ( ( ( rule__CodeElement__ToUpperAssignment_0 )? ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1431:1: ( ( rule__CodeElement__ToUpperAssignment_0 )? )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1431:1: ( ( rule__CodeElement__ToUpperAssignment_0 )? )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1432:1: ( rule__CodeElement__ToUpperAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1433:1: ( rule__CodeElement__ToUpperAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1433:2: rule__CodeElement__ToUpperAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CodeElement__ToUpperAssignment_0_in_rule__CodeElement__Group__0__Impl2849);
                    rule__CodeElement__ToUpperAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getToUpperAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__0__Impl"


    // $ANTLR start "rule__CodeElement__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1443:1: rule__CodeElement__Group__1 : rule__CodeElement__Group__1__Impl ;
    public final void rule__CodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1447:1: ( rule__CodeElement__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1448:2: rule__CodeElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__1__Impl_in_rule__CodeElement__Group__12880);
            rule__CodeElement__Group__1__Impl();

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
    // $ANTLR end "rule__CodeElement__Group__1"


    // $ANTLR start "rule__CodeElement__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1454:1: rule__CodeElement__Group__1__Impl : ( ( rule__CodeElement__ValueAssignment_1 ) ) ;
    public final void rule__CodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1458:1: ( ( ( rule__CodeElement__ValueAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1459:1: ( ( rule__CodeElement__ValueAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1459:1: ( ( rule__CodeElement__ValueAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1460:1: ( rule__CodeElement__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getValueAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1461:1: ( rule__CodeElement__ValueAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1461:2: rule__CodeElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeElement__ValueAssignment_1_in_rule__CodeElement__Group__1__Impl2907);
            rule__CodeElement__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__1__Impl"


    // $ANTLR start "rule__Record__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1475:1: rule__Record__Group__0 : rule__Record__Group__0__Impl rule__Record__Group__1 ;
    public final void rule__Record__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1479:1: ( rule__Record__Group__0__Impl rule__Record__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1480:2: rule__Record__Group__0__Impl rule__Record__Group__1
            {
            pushFollow(FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__02941);
            rule__Record__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Record__Group__1_in_rule__Record__Group__02944);
            rule__Record__Group__1();

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
    // $ANTLR end "rule__Record__Group__0"


    // $ANTLR start "rule__Record__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1487:1: rule__Record__Group__0__Impl : ( 'record' ) ;
    public final void rule__Record__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1491:1: ( ( 'record' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1492:1: ( 'record' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1492:1: ( 'record' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1493:1: 'record'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getRecordKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Record__Group__0__Impl2972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getRecordKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__0__Impl"


    // $ANTLR start "rule__Record__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1506:1: rule__Record__Group__1 : rule__Record__Group__1__Impl rule__Record__Group__2 ;
    public final void rule__Record__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1510:1: ( rule__Record__Group__1__Impl rule__Record__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1511:2: rule__Record__Group__1__Impl rule__Record__Group__2
            {
            pushFollow(FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__13003);
            rule__Record__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Record__Group__2_in_rule__Record__Group__13006);
            rule__Record__Group__2();

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
    // $ANTLR end "rule__Record__Group__1"


    // $ANTLR start "rule__Record__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1518:1: rule__Record__Group__1__Impl : ( ( rule__Record__NameAssignment_1 ) ) ;
    public final void rule__Record__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1522:1: ( ( ( rule__Record__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1523:1: ( ( rule__Record__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1523:1: ( ( rule__Record__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1524:1: ( rule__Record__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1525:1: ( rule__Record__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1525:2: rule__Record__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Record__NameAssignment_1_in_rule__Record__Group__1__Impl3033);
            rule__Record__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__1__Impl"


    // $ANTLR start "rule__Record__Group__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1535:1: rule__Record__Group__2 : rule__Record__Group__2__Impl rule__Record__Group__3 ;
    public final void rule__Record__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1539:1: ( rule__Record__Group__2__Impl rule__Record__Group__3 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1540:2: rule__Record__Group__2__Impl rule__Record__Group__3
            {
            pushFollow(FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__23063);
            rule__Record__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Record__Group__3_in_rule__Record__Group__23066);
            rule__Record__Group__3();

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
    // $ANTLR end "rule__Record__Group__2"


    // $ANTLR start "rule__Record__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1547:1: rule__Record__Group__2__Impl : ( '{' ) ;
    public final void rule__Record__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1551:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1552:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1552:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1553:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Record__Group__2__Impl3094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__2__Impl"


    // $ANTLR start "rule__Record__Group__3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1566:1: rule__Record__Group__3 : rule__Record__Group__3__Impl rule__Record__Group__4 ;
    public final void rule__Record__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1570:1: ( rule__Record__Group__3__Impl rule__Record__Group__4 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1571:2: rule__Record__Group__3__Impl rule__Record__Group__4
            {
            pushFollow(FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__33125);
            rule__Record__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Record__Group__4_in_rule__Record__Group__33128);
            rule__Record__Group__4();

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
    // $ANTLR end "rule__Record__Group__3"


    // $ANTLR start "rule__Record__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1578:1: rule__Record__Group__3__Impl : ( ( rule__Record__PropertiesAssignment_3 )* ) ;
    public final void rule__Record__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1582:1: ( ( ( rule__Record__PropertiesAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1583:1: ( ( rule__Record__PropertiesAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1583:1: ( ( rule__Record__PropertiesAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1584:1: ( rule__Record__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getPropertiesAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1585:1: ( rule__Record__PropertiesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1585:2: rule__Record__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Record__PropertiesAssignment_3_in_rule__Record__Group__3__Impl3155);
            	    rule__Record__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getPropertiesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__3__Impl"


    // $ANTLR start "rule__Record__Group__4"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1595:1: rule__Record__Group__4 : rule__Record__Group__4__Impl ;
    public final void rule__Record__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1599:1: ( rule__Record__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1600:2: rule__Record__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__43186);
            rule__Record__Group__4__Impl();

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
    // $ANTLR end "rule__Record__Group__4"


    // $ANTLR start "rule__Record__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1606:1: rule__Record__Group__4__Impl : ( '}' ) ;
    public final void rule__Record__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1610:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1611:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1611:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1612:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Record__Group__4__Impl3214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__Group__4__Impl"


    // $ANTLR start "rule__Classifier__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1635:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1639:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1640:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03255);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03258);
            rule__Classifier__Group__1();

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
    // $ANTLR end "rule__Classifier__Group__0"


    // $ANTLR start "rule__Classifier__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1647:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__PackageAssignment_0 ) ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1651:1: ( ( ( rule__Classifier__PackageAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1652:1: ( ( rule__Classifier__PackageAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1652:1: ( ( rule__Classifier__PackageAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1653:1: ( rule__Classifier__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1654:1: ( rule__Classifier__PackageAssignment_0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1654:2: rule__Classifier__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_in_rule__Classifier__Group__0__Impl3285);
            rule__Classifier__PackageAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackageAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__0__Impl"


    // $ANTLR start "rule__Classifier__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1664:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1668:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1669:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13315);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13318);
            rule__Classifier__Group__2();

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
    // $ANTLR end "rule__Classifier__Group__1"


    // $ANTLR start "rule__Classifier__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1676:1: rule__Classifier__Group__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1680:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1681:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1681:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1682:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__Classifier__Group__1__Impl3346); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__1__Impl"


    // $ANTLR start "rule__Classifier__Group__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1695:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1699:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1700:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23377);
            rule__Classifier__Group__2__Impl();

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
    // $ANTLR end "rule__Classifier__Group__2"


    // $ANTLR start "rule__Classifier__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1706:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__ClassAssignment_2 ) ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1710:1: ( ( ( rule__Classifier__ClassAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1711:1: ( ( rule__Classifier__ClassAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1711:1: ( ( rule__Classifier__ClassAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1712:1: ( rule__Classifier__ClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1713:1: ( rule__Classifier__ClassAssignment_2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1713:2: rule__Classifier__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_2_in_rule__Classifier__Group__2__Impl3404);
            rule__Classifier__ClassAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1729:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1733:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1734:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03440);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03443);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1741:1: rule__Property__Group__0__Impl : ( ( rule__Property__TypeAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1745:1: ( ( ( rule__Property__TypeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1746:1: ( ( rule__Property__TypeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1746:1: ( ( rule__Property__TypeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1747:1: ( rule__Property__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1748:1: ( rule__Property__TypeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1748:2: rule__Property__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl3470);
            rule__Property__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1758:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1762:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1763:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13500);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13503);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1770:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1774:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1775:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1775:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1776:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1777:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1777:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3530);
            rule__Property__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1787:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1791:1: ( rule__Property__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1792:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23560);
            rule__Property__Group__2__Impl();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1798:1: rule__Property__Group__2__Impl : ( ( rule__Property__Group_2__0 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1802:1: ( ( ( rule__Property__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1803:1: ( ( rule__Property__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1803:1: ( ( rule__Property__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1804:1: ( rule__Property__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1805:1: ( rule__Property__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1805:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl3587);
                    rule__Property__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group_2__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1821:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1825:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1826:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__03624);
            rule__Property__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03627);
            rule__Property__Group_2__1();

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
    // $ANTLR end "rule__Property__Group_2__0"


    // $ANTLR start "rule__Property__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1833:1: rule__Property__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1837:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1838:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1838:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1839:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Property__Group_2__0__Impl3655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__0__Impl"


    // $ANTLR start "rule__Property__Group_2__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1852:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl rule__Property__Group_2__2 ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1856:1: ( rule__Property__Group_2__1__Impl rule__Property__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1857:2: rule__Property__Group_2__1__Impl rule__Property__Group_2__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__13686);
            rule__Property__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2__2_in_rule__Property__Group_2__13689);
            rule__Property__Group_2__2();

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
    // $ANTLR end "rule__Property__Group_2__1"


    // $ANTLR start "rule__Property__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1864:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__PropertiesAssignment_2_1 )* ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1868:1: ( ( ( rule__Property__PropertiesAssignment_2_1 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1869:1: ( ( rule__Property__PropertiesAssignment_2_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1869:1: ( ( rule__Property__PropertiesAssignment_2_1 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1870:1: ( rule__Property__PropertiesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1871:1: ( rule__Property__PropertiesAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1871:2: rule__Property__PropertiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_2_1_in_rule__Property__Group_2__1__Impl3716);
            	    rule__Property__PropertiesAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__1__Impl"


    // $ANTLR start "rule__Property__Group_2__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1881:1: rule__Property__Group_2__2 : rule__Property__Group_2__2__Impl ;
    public final void rule__Property__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1885:1: ( rule__Property__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1886:2: rule__Property__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2__2__Impl_in_rule__Property__Group_2__23747);
            rule__Property__Group_2__2__Impl();

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
    // $ANTLR end "rule__Property__Group_2__2"


    // $ANTLR start "rule__Property__Group_2__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1892:1: rule__Property__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1896:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1897:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1897:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1898:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Property__Group_2__2__Impl3775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2__2__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1917:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1921:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1922:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__03812);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__03815);
            rule__ReferenceProperty__Group__1();

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
    // $ANTLR end "rule__ReferenceProperty__Group__0"


    // $ANTLR start "rule__ReferenceProperty__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1929:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1933:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1934:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1934:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1935:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1936:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1936:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl3842);
            rule__ReferenceProperty__RefAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__0__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1946:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1950:1: ( rule__ReferenceProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1951:2: rule__ReferenceProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__13872);
            rule__ReferenceProperty__Group__1__Impl();

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
    // $ANTLR end "rule__ReferenceProperty__Group__1"


    // $ANTLR start "rule__ReferenceProperty__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1957:1: rule__ReferenceProperty__Group__1__Impl : ( ( rule__ReferenceProperty__Group_1__0 )? ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1961:1: ( ( ( rule__ReferenceProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1962:1: ( ( rule__ReferenceProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1962:1: ( ( rule__ReferenceProperty__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1963:1: ( rule__ReferenceProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1964:1: ( rule__ReferenceProperty__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1964:2: rule__ReferenceProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__0_in_rule__ReferenceProperty__Group__1__Impl3899);
                    rule__ReferenceProperty__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__1__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group_1__0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1978:1: rule__ReferenceProperty__Group_1__0 : rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1 ;
    public final void rule__ReferenceProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1982:1: ( rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1983:2: rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__0__Impl_in_rule__ReferenceProperty__Group_1__03934);
            rule__ReferenceProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__1_in_rule__ReferenceProperty__Group_1__03937);
            rule__ReferenceProperty__Group_1__1();

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
    // $ANTLR end "rule__ReferenceProperty__Group_1__0"


    // $ANTLR start "rule__ReferenceProperty__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1990:1: rule__ReferenceProperty__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1994:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1995:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1995:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:1996:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__ReferenceProperty__Group_1__0__Impl3965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group_1__0__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group_1__1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2009:1: rule__ReferenceProperty__Group_1__1 : rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2 ;
    public final void rule__ReferenceProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2013:1: ( rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2014:2: rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__1__Impl_in_rule__ReferenceProperty__Group_1__13996);
            rule__ReferenceProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__2_in_rule__ReferenceProperty__Group_1__13999);
            rule__ReferenceProperty__Group_1__2();

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
    // $ANTLR end "rule__ReferenceProperty__Group_1__1"


    // $ANTLR start "rule__ReferenceProperty__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2021:1: rule__ReferenceProperty__Group_1__1__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* ) ;
    public final void rule__ReferenceProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2025:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2026:1: ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2026:1: ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2027:1: ( rule__ReferenceProperty__PropertiesAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2028:1: ( rule__ReferenceProperty__PropertiesAssignment_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2028:2: rule__ReferenceProperty__PropertiesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_1_1_in_rule__ReferenceProperty__Group_1__1__Impl4026);
            	    rule__ReferenceProperty__PropertiesAssignment_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group_1__1__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group_1__2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2038:1: rule__ReferenceProperty__Group_1__2 : rule__ReferenceProperty__Group_1__2__Impl ;
    public final void rule__ReferenceProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2042:1: ( rule__ReferenceProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2043:2: rule__ReferenceProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__2__Impl_in_rule__ReferenceProperty__Group_1__24057);
            rule__ReferenceProperty__Group_1__2__Impl();

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
    // $ANTLR end "rule__ReferenceProperty__Group_1__2"


    // $ANTLR start "rule__ReferenceProperty__Group_1__2__Impl"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2049:1: rule__ReferenceProperty__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2053:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2054:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2054:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2055:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__ReferenceProperty__Group_1__2__Impl4085); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group_1__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2075:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2079:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2080:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2080:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2081:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14127);
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


    // $ANTLR start "rule__Model__PackagesAssignment_2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2090:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2094:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2095:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2095:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2096:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_24158);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagesAssignment_2"


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2105:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2109:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2110:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2110:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2111:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_34189);
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


    // $ANTLR start "rule__Model__PatternsAssignment_4"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2120:1: rule__Model__PatternsAssignment_4 : ( rulePattern ) ;
    public final void rule__Model__PatternsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2124:1: ( ( rulePattern ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2125:1: ( rulePattern )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2125:1: ( rulePattern )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2126:1: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_rulePattern_in_rule__Model__PatternsAssignment_44220);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PatternsAssignment_4"


    // $ANTLR start "rule__Model__RecordsAssignment_5"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2135:1: rule__Model__RecordsAssignment_5 : ( ruleRecord ) ;
    public final void rule__Model__RecordsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2139:1: ( ( ruleRecord ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2140:1: ( ruleRecord )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2140:1: ( ruleRecord )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2141:1: ruleRecord
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRecordsRecordParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleRecord_in_rule__Model__RecordsAssignment_54251);
            ruleRecord();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRecordsRecordParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RecordsAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2150:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2154:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2155:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2155:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2156:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14282);
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


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2165:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2169:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2170:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2170:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2171:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__PackageAssignment_2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2180:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2184:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2185:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2185:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2186:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2187:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2188:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_24348); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackageAssignment_2"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2199:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2203:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2204:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2204:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2205:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pattern__NameAssignment_14383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2214:1: rule__Pattern__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2218:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2219:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2219:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2220:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_14414);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_1"


    // $ANTLR start "rule__Pattern__ParametersAssignment_2_2_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2229:1: rule__Pattern__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2233:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2234:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2234:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2235:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_2_14445);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Pattern__CodeSequceneAssignment_3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2244:1: rule__Pattern__CodeSequceneAssignment_3 : ( ruleCodeElement ) ;
    public final void rule__Pattern__CodeSequceneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2248:1: ( ( ruleCodeElement ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2249:1: ( ruleCodeElement )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2249:1: ( ruleCodeElement )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2250:1: ruleCodeElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCodeSequceneCodeElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCodeElement_in_rule__Pattern__CodeSequceneAssignment_34476);
            ruleCodeElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getCodeSequceneCodeElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__CodeSequceneAssignment_3"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2259:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2263:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2264:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2264:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2265:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4507); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__CodeElement__ToUpperAssignment_0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2274:1: rule__CodeElement__ToUpperAssignment_0 : ( ( '#' ) ) ;
    public final void rule__CodeElement__ToUpperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2278:1: ( ( ( '#' ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2279:1: ( ( '#' ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2279:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2280:1: ( '#' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2281:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2282:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__CodeElement__ToUpperAssignment_04543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__ToUpperAssignment_0"


    // $ANTLR start "rule__CodeElement__ValueAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2297:1: rule__CodeElement__ValueAssignment_1 : ( ruleSimpleCodeElement ) ;
    public final void rule__CodeElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2301:1: ( ( ruleSimpleCodeElement ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2302:1: ( ruleSimpleCodeElement )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2302:1: ( ruleSimpleCodeElement )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2303:1: ruleSimpleCodeElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getValueSimpleCodeElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleCodeElement_in_rule__CodeElement__ValueAssignment_14582);
            ruleSimpleCodeElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCodeElementAccess().getValueSimpleCodeElementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__ValueAssignment_1"


    // $ANTLR start "rule__ParameterRef__RefAssignment"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2312:1: rule__ParameterRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2316:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2317:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2317:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2318:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2319:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2320:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterRef__RefAssignment4617); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRef__RefAssignment"


    // $ANTLR start "rule__XStringLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2331:1: rule__XStringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__XStringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2335:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2336:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2336:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2337:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XStringLiteral__ValueAssignment4652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XStringLiteral__ValueAssignment"


    // $ANTLR start "rule__Record__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2346:1: rule__Record__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Record__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2350:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2351:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2351:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2352:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Record__NameAssignment_14683); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__NameAssignment_1"


    // $ANTLR start "rule__Record__PropertiesAssignment_3"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2361:1: rule__Record__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Record__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2365:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2366:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2366:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2367:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Record__PropertiesAssignment_34714);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Record__PropertiesAssignment_3"


    // $ANTLR start "rule__Classifier__PackageAssignment_0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2376:1: rule__Classifier__PackageAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2380:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2381:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2381:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2382:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2383:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2384:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_04749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__PackageAssignment_0"


    // $ANTLR start "rule__Classifier__ClassAssignment_2"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2395:1: rule__Classifier__ClassAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2399:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2400:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2400:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2401:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2402:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2403:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_24788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__ClassAssignment_2"


    // $ANTLR start "rule__Property__TypeAssignment_0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2414:1: rule__Property__TypeAssignment_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2418:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2419:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2419:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2420:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_04823);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_0"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2429:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2433:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2434:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2434:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2435:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_14854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__PropertiesAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2444:1: rule__Property__PropertiesAssignment_2_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2448:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2449:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2449:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2450:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_14885);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertiesAssignment_2_1"


    // $ANTLR start "rule__ReferenceProperty__RefAssignment_0"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2459:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2463:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2464:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2464:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2465:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2466:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2467:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_04920); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__RefAssignment_0"


    // $ANTLR start "rule__ReferenceProperty__PropertiesAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2478:1: rule__ReferenceProperty__PropertiesAssignment_1_1 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2482:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2483:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2483:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.language.ui/src-gen/de/cau/cs/se/instrumentation/language/ui/contentassist/antlr/internal/InternalInstrumentationLanguage.g:2484:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_1_14955);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__PropertiesAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0_in_rulePattern400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_entryRuleCodeElement487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeElement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__0_in_ruleCodeElement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleCodeElement_in_entryRuleSimpleCodeElement547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleCodeElement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleCodeElement__Alternatives_in_ruleSimpleCodeElement580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_entryRuleParameterRef607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterRef614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterRef__RefAssignment_in_ruleParameterRef640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XStringLiteral__ValueAssignment_in_ruleXStringLiteral700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0_in_ruleRecord760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_rule__SimpleCodeElement__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterRef_in_rule__SimpleCodeElement__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group__0__Impl1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11085 = new BitSet(new long[]{0x0000000000113000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21145 = new BitSet(new long[]{0x0000000000113000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1175 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31206 = new BitSet(new long[]{0x0000000000113000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1236 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41267 = new BitSet(new long[]{0x0000000000113000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PatternsAssignment_4_in_rule__Model__Group__4__Impl1297 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RecordsAssignment_5_in_rule__Model__Group__5__Impl1355 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__0__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11583 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1792 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedName__Group_1__0__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__01951 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__01954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02072 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__02197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Pattern__Group__0__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12259 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__NameAssignment_1_in_rule__Pattern__Group__1__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22319 = new BitSet(new long[]{0x0000000000820030L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__22322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__0_in_rule__Pattern__Group__2__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__32380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__CodeSequceneAssignment_3_in_rule__Pattern__Group__3__Impl2407 = new BitSet(new long[]{0x0000000000800032L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__0__Impl_in_rule__Pattern__Group_2__02446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__1_in_rule__Pattern__Group_2__02449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Pattern__Group_2__0__Impl2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__1__Impl_in_rule__Pattern__Group_2__12508 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__2_in_rule__Pattern__Group_2__12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__ParametersAssignment_2_1_in_rule__Pattern__Group_2__1__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__2__Impl_in_rule__Pattern__Group_2__22568 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__3_in_rule__Pattern__Group_2__22571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2_2__0_in_rule__Pattern__Group_2__2__Impl2598 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__3__Impl_in_rule__Pattern__Group_2__32629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Pattern__Group_2__3__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2_2__0__Impl_in_rule__Pattern__Group_2_2__02696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2_2__1_in_rule__Pattern__Group_2_2__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Pattern__Group_2_2__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2_2__1__Impl_in_rule__Pattern__Group_2_2__12758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__ParametersAssignment_2_2_1_in_rule__Pattern__Group_2_2__1__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__0__Impl_in_rule__CodeElement__Group__02819 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1_in_rule__CodeElement__Group__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__ToUpperAssignment_0_in_rule__CodeElement__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1__Impl_in_rule__CodeElement__Group__12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__ValueAssignment_1_in_rule__CodeElement__Group__1__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__0__Impl_in_rule__Record__Group__02941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Record__Group__1_in_rule__Record__Group__02944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Record__Group__0__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__1__Impl_in_rule__Record__Group__13003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Record__Group__2_in_rule__Record__Group__13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__NameAssignment_1_in_rule__Record__Group__1__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__2__Impl_in_rule__Record__Group__23063 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Record__Group__3_in_rule__Record__Group__23066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Record__Group__2__Impl3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__Group__3__Impl_in_rule__Record__Group__33125 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Record__Group__4_in_rule__Record__Group__33128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Record__PropertiesAssignment_3_in_rule__Record__Group__3__Impl3155 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Record__Group__4__Impl_in_rule__Record__Group__43186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Record__Group__4__Impl3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03255 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_in_rule__Classifier__Group__0__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Classifier__Group__1__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_2_in_rule__Classifier__Group__2__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13500 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__03624 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__Group_2__0__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__13686 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Property__Group_2__2_in_rule__Property__Group_2__13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_2_1_in_rule__Property__Group_2__1__Impl3716 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_2__2__Impl_in_rule__Property__Group_2__23747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Property__Group_2__2__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__03812 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__13872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__0_in_rule__ReferenceProperty__Group__1__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__0__Impl_in_rule__ReferenceProperty__Group_1__03934 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__1_in_rule__ReferenceProperty__Group_1__03937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReferenceProperty__Group_1__0__Impl3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__1__Impl_in_rule__ReferenceProperty__Group_1__13996 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__2_in_rule__ReferenceProperty__Group_1__13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_1_1_in_rule__ReferenceProperty__Group_1__1__Impl4026 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__2__Impl_in_rule__ReferenceProperty__Group_1__24057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReferenceProperty__Group_1__2__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_24158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_34189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_rule__Model__PatternsAssignment_44220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_rule__Model__RecordsAssignment_54251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_24348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pattern__NameAssignment_14383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_2_14445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_rule__Pattern__CodeSequceneAssignment_34476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CodeElement__ToUpperAssignment_04543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleCodeElement_in_rule__CodeElement__ValueAssignment_14582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterRef__RefAssignment4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XStringLiteral__ValueAssignment4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Record__NameAssignment_14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Record__PropertiesAssignment_34714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_04749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_24788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_04823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_14854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_14885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_04920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_1_14955 = new BitSet(new long[]{0x0000000000000002L});

}
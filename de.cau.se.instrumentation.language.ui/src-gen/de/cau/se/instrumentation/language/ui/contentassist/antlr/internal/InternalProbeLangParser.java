package de.cau.se.instrumentation.language.ui.contentassist.antlr.internal; 

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
import de.cau.se.instrumentation.language.services.ProbeLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalProbeLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'pattern'", "'('", "')'", "','", "'probe'", "':'", "'{'", "'}'", "'#'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
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


        public InternalProbeLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProbeLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProbeLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g"; }


     
     	private ProbeLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProbeLangGrammarAccess grammarAccess) {
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:62:1: ( ruleModel EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:63:1: ruleModel EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:77:2: rule__Model__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:90:1: ( ruleImport EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:91:1: ruleImport EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:105:2: rule__Import__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:117:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:118:1: ( rulePackage EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:119:1: rulePackage EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:126:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:130:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:131:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:131:1: ( ( rule__Package__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:132:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:133:1: ( rule__Package__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:133:2: rule__Package__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:146:1: ( ruleQualifiedName EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:147:1: ruleQualifiedName EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:161:2: rule__QualifiedName__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:173:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:174:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:175:1: ruleQualifiedNameWithWildcard EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:182:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:186:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:188:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:189:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:189:2: rule__QualifiedNameWithWildcard__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:201:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:202:1: ( rulePattern EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:203:1: rulePattern EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:210:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:214:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:215:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:215:1: ( ( rule__Pattern__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:216:1: ( rule__Pattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:217:1: ( rule__Pattern__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:217:2: rule__Pattern__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:229:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:230:1: ( ruleParameter EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:231:1: ruleParameter EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:238:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:242:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:243:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:243:1: ( ( rule__Parameter__NameAssignment ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:244:1: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:245:1: ( rule__Parameter__NameAssignment )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:245:2: rule__Parameter__NameAssignment
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:257:1: entryRuleCodeElement : ruleCodeElement EOF ;
    public final void entryRuleCodeElement() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:258:1: ( ruleCodeElement EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:259:1: ruleCodeElement EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:266:1: ruleCodeElement : ( ( rule__CodeElement__Group__0 ) ) ;
    public final void ruleCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:270:2: ( ( ( rule__CodeElement__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:271:1: ( ( rule__CodeElement__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:271:1: ( ( rule__CodeElement__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:272:1: ( rule__CodeElement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:273:1: ( rule__CodeElement__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:273:2: rule__CodeElement__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:285:1: entryRuleSimpleCodeElement : ruleSimpleCodeElement EOF ;
    public final void entryRuleSimpleCodeElement() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:286:1: ( ruleSimpleCodeElement EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:287:1: ruleSimpleCodeElement EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:294:1: ruleSimpleCodeElement : ( ( rule__SimpleCodeElement__Alternatives ) ) ;
    public final void ruleSimpleCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:298:2: ( ( ( rule__SimpleCodeElement__Alternatives ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:299:1: ( ( rule__SimpleCodeElement__Alternatives ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:299:1: ( ( rule__SimpleCodeElement__Alternatives ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:300:1: ( rule__SimpleCodeElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleCodeElementAccess().getAlternatives()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:301:1: ( rule__SimpleCodeElement__Alternatives )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:301:2: rule__SimpleCodeElement__Alternatives
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:313:1: entryRuleParameterRef : ruleParameterRef EOF ;
    public final void entryRuleParameterRef() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:314:1: ( ruleParameterRef EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:315:1: ruleParameterRef EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:322:1: ruleParameterRef : ( ( rule__ParameterRef__RefAssignment ) ) ;
    public final void ruleParameterRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:326:2: ( ( ( rule__ParameterRef__RefAssignment ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:327:1: ( ( rule__ParameterRef__RefAssignment ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:327:1: ( ( rule__ParameterRef__RefAssignment ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:328:1: ( rule__ParameterRef__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefAssignment()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:329:1: ( rule__ParameterRef__RefAssignment )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:329:2: rule__ParameterRef__RefAssignment
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:341:1: entryRuleXStringLiteral : ruleXStringLiteral EOF ;
    public final void entryRuleXStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:342:1: ( ruleXStringLiteral EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:343:1: ruleXStringLiteral EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:350:1: ruleXStringLiteral : ( ( rule__XStringLiteral__ValueAssignment ) ) ;
    public final void ruleXStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:354:2: ( ( ( rule__XStringLiteral__ValueAssignment ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:355:1: ( ( rule__XStringLiteral__ValueAssignment ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:355:1: ( ( rule__XStringLiteral__ValueAssignment ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:356:1: ( rule__XStringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:357:1: ( rule__XStringLiteral__ValueAssignment )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:357:2: rule__XStringLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleProbe"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:369:1: entryRuleProbe : ruleProbe EOF ;
    public final void entryRuleProbe() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:370:1: ( ruleProbe EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:371:1: ruleProbe EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeRule()); 
            }
            pushFollow(FOLLOW_ruleProbe_in_entryRuleProbe727);
            ruleProbe();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbe734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProbe"


    // $ANTLR start "ruleProbe"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:378:1: ruleProbe : ( ( rule__Probe__Group__0 ) ) ;
    public final void ruleProbe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:382:2: ( ( ( rule__Probe__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:383:1: ( ( rule__Probe__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:383:1: ( ( rule__Probe__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:384:1: ( rule__Probe__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:385:1: ( rule__Probe__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:385:2: rule__Probe__Group__0
            {
            pushFollow(FOLLOW_rule__Probe__Group__0_in_ruleProbe760);
            rule__Probe__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbe"


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:397:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:398:1: ( ruleClassifier EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:399:1: ruleClassifier EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:406:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:410:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:411:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:411:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:412:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:413:1: ( rule__Classifier__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:413:2: rule__Classifier__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:425:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:426:1: ( ruleProperty EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:427:1: ruleProperty EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:434:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:438:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:439:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:439:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:440:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:441:1: ( rule__Property__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:441:2: rule__Property__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:453:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:454:1: ( ruleReferenceProperty EOF )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:455:1: ruleReferenceProperty EOF
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:462:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:466:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:468:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:469:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:469:2: rule__ReferenceProperty__Group__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:481:1: rule__SimpleCodeElement__Alternatives : ( ( ruleXStringLiteral ) | ( ruleParameterRef ) );
    public final void rule__SimpleCodeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:485:1: ( ( ruleXStringLiteral ) | ( ruleParameterRef ) )
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
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:486:1: ( ruleXStringLiteral )
                    {
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:486:1: ( ruleXStringLiteral )
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:487:1: ruleXStringLiteral
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
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:492:6: ( ruleParameterRef )
                    {
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:492:6: ( ruleParameterRef )
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:493:1: ruleParameterRef
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:505:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:509:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:510:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:517:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:521:1: ( ( 'package' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:522:1: ( 'package' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:522:1: ( 'package' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:523:1: 'package'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:536:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:540:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:541:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:548:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:552:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:553:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:553:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:554:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:555:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:555:2: rule__Model__NameAssignment_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:565:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:569:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:570:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:577:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:581:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:582:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:582:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:583:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:584:1: ( rule__Model__PackagesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:584:2: rule__Model__PackagesAssignment_2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:594:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:598:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:599:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:606:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:610:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:611:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:611:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:612:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:613:1: ( rule__Model__ImportsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:613:2: rule__Model__ImportsAssignment_3
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:623:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:627:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:628:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:635:1: rule__Model__Group__4__Impl : ( ( rule__Model__PatternsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:639:1: ( ( ( rule__Model__PatternsAssignment_4 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:640:1: ( ( rule__Model__PatternsAssignment_4 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:640:1: ( ( rule__Model__PatternsAssignment_4 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:641:1: ( rule__Model__PatternsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPatternsAssignment_4()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:642:1: ( rule__Model__PatternsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:642:2: rule__Model__PatternsAssignment_4
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:652:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:656:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:657:2: rule__Model__Group__5__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:663:1: rule__Model__Group__5__Impl : ( ( rule__Model__ProbesAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:667:1: ( ( ( rule__Model__ProbesAssignment_5 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:668:1: ( ( rule__Model__ProbesAssignment_5 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:668:1: ( ( rule__Model__ProbesAssignment_5 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:669:1: ( rule__Model__ProbesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProbesAssignment_5()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:670:1: ( rule__Model__ProbesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:670:2: rule__Model__ProbesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProbesAssignment_5_in_rule__Model__Group__5__Impl1355);
            	    rule__Model__ProbesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProbesAssignment_5()); 
            }

            }


            }

        }
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:692:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:696:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:697:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:704:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:708:1: ( ( 'import' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:709:1: ( 'import' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:709:1: ( 'import' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:710:1: 'import'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:723:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:727:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:728:2: rule__Import__Group__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:734:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:738:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:739:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:740:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:741:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:741:2: rule__Import__ImportedNamespaceAssignment_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:755:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:759:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:760:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:767:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:771:1: ( ( 'use' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:772:1: ( 'use' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:772:1: ( 'use' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:773:1: 'use'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:786:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:790:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:791:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:798:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:802:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:803:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:803:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:804:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:805:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:805:2: rule__Package__NameAssignment_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:815:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:819:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:820:2: rule__Package__Group__2__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:826:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:830:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:831:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:831:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:832:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:833:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:833:2: rule__Package__PackageAssignment_2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:849:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:853:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:854:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:861:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:865:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:866:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:866:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:867:1: RULE_ID
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:878:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:882:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:883:2: rule__QualifiedName__Group__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:889:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:893:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:894:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:894:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:895:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:896:1: ( rule__QualifiedName__Group_1__0 )*
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
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:896:2: rule__QualifiedName__Group_1__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:910:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:914:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:915:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:922:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:926:1: ( ( ( '.' ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:927:1: ( ( '.' ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:927:1: ( ( '.' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:928:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:929:1: ( '.' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:930:2: '.'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:941:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:945:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:946:2: rule__QualifiedName__Group_1__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:952:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:956:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:957:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:957:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:958:1: RULE_ID
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:973:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:977:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:978:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:985:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:989:1: ( ( ruleQualifiedName ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:990:1: ( ruleQualifiedName )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:990:1: ( ruleQualifiedName )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:991:1: ruleQualifiedName
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1002:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1006:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1007:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1013:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1017:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1018:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1018:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1019:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1020:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1020:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1034:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1038:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1039:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1046:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1050:1: ( ( '.' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1051:1: ( '.' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1051:1: ( '.' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1052:1: '.'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1065:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1069:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1070:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1076:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1080:1: ( ( '*' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1081:1: ( '*' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1081:1: ( '*' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1082:1: '*'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1099:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1103:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1104:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1111:1: rule__Pattern__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1115:1: ( ( 'pattern' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1116:1: ( 'pattern' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1116:1: ( 'pattern' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1117:1: 'pattern'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1130:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1134:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1135:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1142:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1146:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1147:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1147:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1148:1: ( rule__Pattern__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1149:1: ( rule__Pattern__NameAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1149:2: rule__Pattern__NameAssignment_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1159:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1163:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1164:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1171:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__Group_2__0 )? ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1175:1: ( ( ( rule__Pattern__Group_2__0 )? ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1176:1: ( ( rule__Pattern__Group_2__0 )? )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1176:1: ( ( rule__Pattern__Group_2__0 )? )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1177:1: ( rule__Pattern__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1178:1: ( rule__Pattern__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1178:2: rule__Pattern__Group_2__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1188:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1192:1: ( rule__Pattern__Group__3__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1193:2: rule__Pattern__Group__3__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1199:1: rule__Pattern__Group__3__Impl : ( ( rule__Pattern__CodeSequceneAssignment_3 )* ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1203:1: ( ( ( rule__Pattern__CodeSequceneAssignment_3 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1204:1: ( ( rule__Pattern__CodeSequceneAssignment_3 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1204:1: ( ( rule__Pattern__CodeSequceneAssignment_3 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1205:1: ( rule__Pattern__CodeSequceneAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCodeSequceneAssignment_3()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1206:1: ( rule__Pattern__CodeSequceneAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1206:2: rule__Pattern__CodeSequceneAssignment_3
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1224:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1228:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1229:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1236:1: rule__Pattern__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1240:1: ( ( '(' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1241:1: ( '(' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1241:1: ( '(' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1242:1: '('
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1255:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1259:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1260:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1267:1: rule__Pattern__Group_2__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_1 ) ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1271:1: ( ( ( rule__Pattern__ParametersAssignment_2_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1272:1: ( ( rule__Pattern__ParametersAssignment_2_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1272:1: ( ( rule__Pattern__ParametersAssignment_2_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1273:1: ( rule__Pattern__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1274:1: ( rule__Pattern__ParametersAssignment_2_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1274:2: rule__Pattern__ParametersAssignment_2_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1284:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3 ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1288:1: ( rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1289:2: rule__Pattern__Group_2__2__Impl rule__Pattern__Group_2__3
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1296:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__Group_2_2__0 )* ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1300:1: ( ( ( rule__Pattern__Group_2_2__0 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1301:1: ( ( rule__Pattern__Group_2_2__0 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1301:1: ( ( rule__Pattern__Group_2_2__0 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1302:1: ( rule__Pattern__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getGroup_2_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1303:1: ( rule__Pattern__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1303:2: rule__Pattern__Group_2_2__0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1313:1: rule__Pattern__Group_2__3 : rule__Pattern__Group_2__3__Impl ;
    public final void rule__Pattern__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1317:1: ( rule__Pattern__Group_2__3__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1318:2: rule__Pattern__Group_2__3__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1324:1: rule__Pattern__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Pattern__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1328:1: ( ( ')' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1329:1: ( ')' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1329:1: ( ')' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1330:1: ')'
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1351:1: rule__Pattern__Group_2_2__0 : rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1 ;
    public final void rule__Pattern__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1355:1: ( rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1356:2: rule__Pattern__Group_2_2__0__Impl rule__Pattern__Group_2_2__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1363:1: rule__Pattern__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Pattern__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1367:1: ( ( ',' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1368:1: ( ',' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1368:1: ( ',' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1369:1: ','
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1382:1: rule__Pattern__Group_2_2__1 : rule__Pattern__Group_2_2__1__Impl ;
    public final void rule__Pattern__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1386:1: ( rule__Pattern__Group_2_2__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1387:2: rule__Pattern__Group_2_2__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1393:1: rule__Pattern__Group_2_2__1__Impl : ( ( rule__Pattern__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Pattern__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1397:1: ( ( ( rule__Pattern__ParametersAssignment_2_2_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1398:1: ( ( rule__Pattern__ParametersAssignment_2_2_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1398:1: ( ( rule__Pattern__ParametersAssignment_2_2_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1399:1: ( rule__Pattern__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersAssignment_2_2_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1400:1: ( rule__Pattern__ParametersAssignment_2_2_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1400:2: rule__Pattern__ParametersAssignment_2_2_1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1414:1: rule__CodeElement__Group__0 : rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 ;
    public final void rule__CodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1418:1: ( rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1419:2: rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1426:1: rule__CodeElement__Group__0__Impl : ( ( rule__CodeElement__ToUpperAssignment_0 )? ) ;
    public final void rule__CodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1430:1: ( ( ( rule__CodeElement__ToUpperAssignment_0 )? ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1431:1: ( ( rule__CodeElement__ToUpperAssignment_0 )? )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1431:1: ( ( rule__CodeElement__ToUpperAssignment_0 )? )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1432:1: ( rule__CodeElement__ToUpperAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperAssignment_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1433:1: ( rule__CodeElement__ToUpperAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1433:2: rule__CodeElement__ToUpperAssignment_0
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1443:1: rule__CodeElement__Group__1 : rule__CodeElement__Group__1__Impl ;
    public final void rule__CodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1447:1: ( rule__CodeElement__Group__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1448:2: rule__CodeElement__Group__1__Impl
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1454:1: rule__CodeElement__Group__1__Impl : ( ( rule__CodeElement__ValueAssignment_1 ) ) ;
    public final void rule__CodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1458:1: ( ( ( rule__CodeElement__ValueAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1459:1: ( ( rule__CodeElement__ValueAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1459:1: ( ( rule__CodeElement__ValueAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1460:1: ( rule__CodeElement__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getValueAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1461:1: ( rule__CodeElement__ValueAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1461:2: rule__CodeElement__ValueAssignment_1
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


    // $ANTLR start "rule__Probe__Group__0"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1475:1: rule__Probe__Group__0 : rule__Probe__Group__0__Impl rule__Probe__Group__1 ;
    public final void rule__Probe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1479:1: ( rule__Probe__Group__0__Impl rule__Probe__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1480:2: rule__Probe__Group__0__Impl rule__Probe__Group__1
            {
            pushFollow(FOLLOW_rule__Probe__Group__0__Impl_in_rule__Probe__Group__02941);
            rule__Probe__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__1_in_rule__Probe__Group__02944);
            rule__Probe__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__0"


    // $ANTLR start "rule__Probe__Group__0__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1487:1: rule__Probe__Group__0__Impl : ( 'probe' ) ;
    public final void rule__Probe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1491:1: ( ( 'probe' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1492:1: ( 'probe' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1492:1: ( 'probe' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1493:1: 'probe'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getProbeKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Probe__Group__0__Impl2972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getProbeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__0__Impl"


    // $ANTLR start "rule__Probe__Group__1"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1506:1: rule__Probe__Group__1 : rule__Probe__Group__1__Impl rule__Probe__Group__2 ;
    public final void rule__Probe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1510:1: ( rule__Probe__Group__1__Impl rule__Probe__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1511:2: rule__Probe__Group__1__Impl rule__Probe__Group__2
            {
            pushFollow(FOLLOW_rule__Probe__Group__1__Impl_in_rule__Probe__Group__13003);
            rule__Probe__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__2_in_rule__Probe__Group__13006);
            rule__Probe__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__1"


    // $ANTLR start "rule__Probe__Group__1__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1518:1: rule__Probe__Group__1__Impl : ( ( rule__Probe__NameAssignment_1 ) ) ;
    public final void rule__Probe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1522:1: ( ( ( rule__Probe__NameAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1523:1: ( ( rule__Probe__NameAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1523:1: ( ( rule__Probe__NameAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1524:1: ( rule__Probe__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getNameAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1525:1: ( rule__Probe__NameAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1525:2: rule__Probe__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Probe__NameAssignment_1_in_rule__Probe__Group__1__Impl3033);
            rule__Probe__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__1__Impl"


    // $ANTLR start "rule__Probe__Group__2"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1535:1: rule__Probe__Group__2 : rule__Probe__Group__2__Impl rule__Probe__Group__3 ;
    public final void rule__Probe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1539:1: ( rule__Probe__Group__2__Impl rule__Probe__Group__3 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1540:2: rule__Probe__Group__2__Impl rule__Probe__Group__3
            {
            pushFollow(FOLLOW_rule__Probe__Group__2__Impl_in_rule__Probe__Group__23063);
            rule__Probe__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__3_in_rule__Probe__Group__23066);
            rule__Probe__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__2"


    // $ANTLR start "rule__Probe__Group__2__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1547:1: rule__Probe__Group__2__Impl : ( ':' ) ;
    public final void rule__Probe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1551:1: ( ( ':' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1552:1: ( ':' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1552:1: ( ':' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1553:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getColonKeyword_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Probe__Group__2__Impl3094); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__2__Impl"


    // $ANTLR start "rule__Probe__Group__3"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1566:1: rule__Probe__Group__3 : rule__Probe__Group__3__Impl rule__Probe__Group__4 ;
    public final void rule__Probe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1570:1: ( rule__Probe__Group__3__Impl rule__Probe__Group__4 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1571:2: rule__Probe__Group__3__Impl rule__Probe__Group__4
            {
            pushFollow(FOLLOW_rule__Probe__Group__3__Impl_in_rule__Probe__Group__33125);
            rule__Probe__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__4_in_rule__Probe__Group__33128);
            rule__Probe__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__3"


    // $ANTLR start "rule__Probe__Group__3__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1578:1: rule__Probe__Group__3__Impl : ( ( rule__Probe__TypeAssignment_3 ) ) ;
    public final void rule__Probe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1582:1: ( ( ( rule__Probe__TypeAssignment_3 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1583:1: ( ( rule__Probe__TypeAssignment_3 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1583:1: ( ( rule__Probe__TypeAssignment_3 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1584:1: ( rule__Probe__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1585:1: ( rule__Probe__TypeAssignment_3 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1585:2: rule__Probe__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Probe__TypeAssignment_3_in_rule__Probe__Group__3__Impl3155);
            rule__Probe__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__3__Impl"


    // $ANTLR start "rule__Probe__Group__4"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1595:1: rule__Probe__Group__4 : rule__Probe__Group__4__Impl rule__Probe__Group__5 ;
    public final void rule__Probe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1599:1: ( rule__Probe__Group__4__Impl rule__Probe__Group__5 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1600:2: rule__Probe__Group__4__Impl rule__Probe__Group__5
            {
            pushFollow(FOLLOW_rule__Probe__Group__4__Impl_in_rule__Probe__Group__43185);
            rule__Probe__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__5_in_rule__Probe__Group__43188);
            rule__Probe__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__4"


    // $ANTLR start "rule__Probe__Group__4__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1607:1: rule__Probe__Group__4__Impl : ( '{' ) ;
    public final void rule__Probe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1611:1: ( ( '{' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1612:1: ( '{' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1612:1: ( '{' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1613:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Probe__Group__4__Impl3216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__4__Impl"


    // $ANTLR start "rule__Probe__Group__5"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1626:1: rule__Probe__Group__5 : rule__Probe__Group__5__Impl rule__Probe__Group__6 ;
    public final void rule__Probe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1630:1: ( rule__Probe__Group__5__Impl rule__Probe__Group__6 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1631:2: rule__Probe__Group__5__Impl rule__Probe__Group__6
            {
            pushFollow(FOLLOW_rule__Probe__Group__5__Impl_in_rule__Probe__Group__53247);
            rule__Probe__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Probe__Group__6_in_rule__Probe__Group__53250);
            rule__Probe__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__5"


    // $ANTLR start "rule__Probe__Group__5__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1638:1: rule__Probe__Group__5__Impl : ( ( rule__Probe__PropertiesAssignment_5 )* ) ;
    public final void rule__Probe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1642:1: ( ( ( rule__Probe__PropertiesAssignment_5 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1643:1: ( ( rule__Probe__PropertiesAssignment_5 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1643:1: ( ( rule__Probe__PropertiesAssignment_5 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1644:1: ( rule__Probe__PropertiesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getPropertiesAssignment_5()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1645:1: ( rule__Probe__PropertiesAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1645:2: rule__Probe__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Probe__PropertiesAssignment_5_in_rule__Probe__Group__5__Impl3277);
            	    rule__Probe__PropertiesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getPropertiesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__5__Impl"


    // $ANTLR start "rule__Probe__Group__6"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1655:1: rule__Probe__Group__6 : rule__Probe__Group__6__Impl ;
    public final void rule__Probe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1659:1: ( rule__Probe__Group__6__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1660:2: rule__Probe__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Probe__Group__6__Impl_in_rule__Probe__Group__63308);
            rule__Probe__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__6"


    // $ANTLR start "rule__Probe__Group__6__Impl"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1666:1: rule__Probe__Group__6__Impl : ( '}' ) ;
    public final void rule__Probe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1670:1: ( ( '}' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1671:1: ( '}' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1671:1: ( '}' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1672:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,23,FOLLOW_23_in_rule__Probe__Group__6__Impl3336); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__Group__6__Impl"


    // $ANTLR start "rule__Classifier__Group__0"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1699:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1703:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1704:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03381);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03384);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1711:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__PackageAssignment_0 ) ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1715:1: ( ( ( rule__Classifier__PackageAssignment_0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1716:1: ( ( rule__Classifier__PackageAssignment_0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1716:1: ( ( rule__Classifier__PackageAssignment_0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1717:1: ( rule__Classifier__PackageAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1718:1: ( rule__Classifier__PackageAssignment_0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1718:2: rule__Classifier__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_in_rule__Classifier__Group__0__Impl3411);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1728:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1732:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1733:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13441);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13444);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1740:1: rule__Classifier__Group__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1744:1: ( ( '.' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1745:1: ( '.' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1745:1: ( '.' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1746:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__Classifier__Group__1__Impl3472); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1759:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1763:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1764:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23503);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1770:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__ClassAssignment_2 ) ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1774:1: ( ( ( rule__Classifier__ClassAssignment_2 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1775:1: ( ( rule__Classifier__ClassAssignment_2 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1775:1: ( ( rule__Classifier__ClassAssignment_2 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1776:1: ( rule__Classifier__ClassAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1777:1: ( rule__Classifier__ClassAssignment_2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1777:2: rule__Classifier__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_2_in_rule__Classifier__Group__2__Impl3530);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1793:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1797:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1798:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03566);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03569);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1805:1: rule__Property__Group__0__Impl : ( ( rule__Property__TypeAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1809:1: ( ( ( rule__Property__TypeAssignment_0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1810:1: ( ( rule__Property__TypeAssignment_0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1810:1: ( ( rule__Property__TypeAssignment_0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1811:1: ( rule__Property__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1812:1: ( rule__Property__TypeAssignment_0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1812:2: rule__Property__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl3596);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1822:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1826:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1827:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13626);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13629);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1834:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1838:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1839:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1839:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1840:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1841:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1841:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3656);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1851:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1855:1: ( rule__Property__Group__2__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1856:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23686);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1862:1: rule__Property__Group__2__Impl : ( ( rule__Property__Group_2__0 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1866:1: ( ( ( rule__Property__Group_2__0 )? ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1867:1: ( ( rule__Property__Group_2__0 )? )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1867:1: ( ( rule__Property__Group_2__0 )? )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1868:1: ( rule__Property__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_2()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1869:1: ( rule__Property__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1869:2: rule__Property__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl3713);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1885:1: rule__Property__Group_2__0 : rule__Property__Group_2__0__Impl rule__Property__Group_2__1 ;
    public final void rule__Property__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1889:1: ( rule__Property__Group_2__0__Impl rule__Property__Group_2__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1890:2: rule__Property__Group_2__0__Impl rule__Property__Group_2__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__03750);
            rule__Property__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03753);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1897:1: rule__Property__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1901:1: ( ( '{' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1902:1: ( '{' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1902:1: ( '{' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1903:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Property__Group_2__0__Impl3781); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1916:1: rule__Property__Group_2__1 : rule__Property__Group_2__1__Impl rule__Property__Group_2__2 ;
    public final void rule__Property__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1920:1: ( rule__Property__Group_2__1__Impl rule__Property__Group_2__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1921:2: rule__Property__Group_2__1__Impl rule__Property__Group_2__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__13812);
            rule__Property__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2__2_in_rule__Property__Group_2__13815);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1928:1: rule__Property__Group_2__1__Impl : ( ( rule__Property__PropertiesAssignment_2_1 )* ) ;
    public final void rule__Property__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1932:1: ( ( ( rule__Property__PropertiesAssignment_2_1 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1933:1: ( ( rule__Property__PropertiesAssignment_2_1 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1933:1: ( ( rule__Property__PropertiesAssignment_2_1 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1934:1: ( rule__Property__PropertiesAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1935:1: ( rule__Property__PropertiesAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1935:2: rule__Property__PropertiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_2_1_in_rule__Property__Group_2__1__Impl3842);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1945:1: rule__Property__Group_2__2 : rule__Property__Group_2__2__Impl ;
    public final void rule__Property__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1949:1: ( rule__Property__Group_2__2__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1950:2: rule__Property__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2__2__Impl_in_rule__Property__Group_2__23873);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1956:1: rule__Property__Group_2__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1960:1: ( ( '}' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1961:1: ( '}' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1961:1: ( '}' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1962:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Property__Group_2__2__Impl3901); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1981:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1985:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1986:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__03938);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__03941);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1993:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1997:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1998:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1998:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:1999:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2000:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2000:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl3968);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2010:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2014:1: ( rule__ReferenceProperty__Group__1__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2015:2: rule__ReferenceProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__13998);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2021:1: rule__ReferenceProperty__Group__1__Impl : ( ( rule__ReferenceProperty__Group_1__0 )? ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2025:1: ( ( ( rule__ReferenceProperty__Group_1__0 )? ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2026:1: ( ( rule__ReferenceProperty__Group_1__0 )? )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2026:1: ( ( rule__ReferenceProperty__Group_1__0 )? )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2027:1: ( rule__ReferenceProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2028:1: ( rule__ReferenceProperty__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2028:2: rule__ReferenceProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__0_in_rule__ReferenceProperty__Group__1__Impl4025);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2042:1: rule__ReferenceProperty__Group_1__0 : rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1 ;
    public final void rule__ReferenceProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2046:1: ( rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2047:2: rule__ReferenceProperty__Group_1__0__Impl rule__ReferenceProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__0__Impl_in_rule__ReferenceProperty__Group_1__04060);
            rule__ReferenceProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__1_in_rule__ReferenceProperty__Group_1__04063);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2054:1: rule__ReferenceProperty__Group_1__0__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2058:1: ( ( '{' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2059:1: ( '{' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2059:1: ( '{' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2060:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__ReferenceProperty__Group_1__0__Impl4091); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2073:1: rule__ReferenceProperty__Group_1__1 : rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2 ;
    public final void rule__ReferenceProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2077:1: ( rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2 )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2078:2: rule__ReferenceProperty__Group_1__1__Impl rule__ReferenceProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__1__Impl_in_rule__ReferenceProperty__Group_1__14122);
            rule__ReferenceProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__2_in_rule__ReferenceProperty__Group_1__14125);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2085:1: rule__ReferenceProperty__Group_1__1__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* ) ;
    public final void rule__ReferenceProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2089:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2090:1: ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2090:1: ( ( rule__ReferenceProperty__PropertiesAssignment_1_1 )* )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2091:1: ( rule__ReferenceProperty__PropertiesAssignment_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_1_1()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2092:1: ( rule__ReferenceProperty__PropertiesAssignment_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2092:2: rule__ReferenceProperty__PropertiesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_1_1_in_rule__ReferenceProperty__Group_1__1__Impl4152);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2102:1: rule__ReferenceProperty__Group_1__2 : rule__ReferenceProperty__Group_1__2__Impl ;
    public final void rule__ReferenceProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2106:1: ( rule__ReferenceProperty__Group_1__2__Impl )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2107:2: rule__ReferenceProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group_1__2__Impl_in_rule__ReferenceProperty__Group_1__24183);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2113:1: rule__ReferenceProperty__Group_1__2__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2117:1: ( ( '}' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2118:1: ( '}' )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2118:1: ( '}' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2119:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_1_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__ReferenceProperty__Group_1__2__Impl4211); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2139:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2143:1: ( ( ruleQualifiedName ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2144:1: ( ruleQualifiedName )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2144:1: ( ruleQualifiedName )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2145:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14253);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2154:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2158:1: ( ( rulePackage ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2159:1: ( rulePackage )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2159:1: ( rulePackage )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2160:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_24284);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2169:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2173:1: ( ( ruleImport ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2174:1: ( ruleImport )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2174:1: ( ruleImport )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2175:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_34315);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2184:1: rule__Model__PatternsAssignment_4 : ( rulePattern ) ;
    public final void rule__Model__PatternsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2188:1: ( ( rulePattern ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2189:1: ( rulePattern )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2189:1: ( rulePattern )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2190:1: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_rulePattern_in_rule__Model__PatternsAssignment_44346);
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


    // $ANTLR start "rule__Model__ProbesAssignment_5"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2199:1: rule__Model__ProbesAssignment_5 : ( ruleProbe ) ;
    public final void rule__Model__ProbesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2203:1: ( ( ruleProbe ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2204:1: ( ruleProbe )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2204:1: ( ruleProbe )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2205:1: ruleProbe
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProbesProbeParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProbe_in_rule__Model__ProbesAssignment_54377);
            ruleProbe();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProbesProbeParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProbesAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2214:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2218:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2219:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2219:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2220:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14408);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2229:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2233:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2234:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2234:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2235:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14439); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2244:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2248:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2249:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2249:1: ( ( RULE_STRING ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2250:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2251:1: ( RULE_STRING )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2252:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_24474); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2263:1: rule__Pattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2267:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2268:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2268:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2269:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Pattern__NameAssignment_14509); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2278:1: rule__Pattern__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2282:1: ( ( ruleParameter ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2283:1: ( ruleParameter )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2283:1: ( ruleParameter )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2284:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_14540);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2293:1: rule__Pattern__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Pattern__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2297:1: ( ( ruleParameter ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2298:1: ( ruleParameter )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2298:1: ( ruleParameter )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2299:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_2_14571);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2308:1: rule__Pattern__CodeSequceneAssignment_3 : ( ruleCodeElement ) ;
    public final void rule__Pattern__CodeSequceneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2312:1: ( ( ruleCodeElement ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2313:1: ( ruleCodeElement )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2313:1: ( ruleCodeElement )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2314:1: ruleCodeElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getCodeSequceneCodeElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCodeElement_in_rule__Pattern__CodeSequceneAssignment_34602);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2323:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2327:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2328:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2328:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2329:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4633); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2338:1: rule__CodeElement__ToUpperAssignment_0 : ( ( '#' ) ) ;
    public final void rule__CodeElement__ToUpperAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2342:1: ( ( ( '#' ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2343:1: ( ( '#' ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2343:1: ( ( '#' ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2344:1: ( '#' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2345:1: ( '#' )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2346:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getToUpperNumberSignKeyword_0_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__CodeElement__ToUpperAssignment_04669); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2361:1: rule__CodeElement__ValueAssignment_1 : ( ruleSimpleCodeElement ) ;
    public final void rule__CodeElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2365:1: ( ( ruleSimpleCodeElement ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2366:1: ( ruleSimpleCodeElement )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2366:1: ( ruleSimpleCodeElement )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2367:1: ruleSimpleCodeElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCodeElementAccess().getValueSimpleCodeElementParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSimpleCodeElement_in_rule__CodeElement__ValueAssignment_14708);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2376:1: rule__ParameterRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2380:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2381:1: ( ( RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2381:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2382:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterCrossReference_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2383:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2384:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRefAccess().getRefParameterIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterRef__RefAssignment4743); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2395:1: rule__XStringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__XStringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2399:1: ( ( RULE_STRING ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2400:1: ( RULE_STRING )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2400:1: ( RULE_STRING )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2401:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__XStringLiteral__ValueAssignment4778); if (state.failed) return ;
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


    // $ANTLR start "rule__Probe__NameAssignment_1"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2410:1: rule__Probe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Probe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2414:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2415:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2415:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2416:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Probe__NameAssignment_14809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__NameAssignment_1"


    // $ANTLR start "rule__Probe__TypeAssignment_3"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2425:1: rule__Probe__TypeAssignment_3 : ( ruleClassifier ) ;
    public final void rule__Probe__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2429:1: ( ( ruleClassifier ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2430:1: ( ruleClassifier )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2430:1: ( ruleClassifier )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2431:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getTypeClassifierParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Probe__TypeAssignment_34840);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getTypeClassifierParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__TypeAssignment_3"


    // $ANTLR start "rule__Probe__PropertiesAssignment_5"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2440:1: rule__Probe__PropertiesAssignment_5 : ( ruleProperty ) ;
    public final void rule__Probe__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2444:1: ( ( ruleProperty ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2445:1: ( ruleProperty )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2445:1: ( ruleProperty )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2446:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProbeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Probe__PropertiesAssignment_54871);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProbeAccess().getPropertiesPropertyParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probe__PropertiesAssignment_5"


    // $ANTLR start "rule__Classifier__PackageAssignment_0"
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2455:1: rule__Classifier__PackageAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2459:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2460:1: ( ( RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2460:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2461:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2462:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2463:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_04906); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2474:1: rule__Classifier__ClassAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2478:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2479:1: ( ( RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2479:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2480:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_2_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2481:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2482:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_24945); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2493:1: rule__Property__TypeAssignment_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2497:1: ( ( ruleClassifier ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2498:1: ( ruleClassifier )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2498:1: ( ruleClassifier )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2499:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_04980);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2508:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2512:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2513:1: ( RULE_ID )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2513:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2514:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_15011); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2523:1: rule__Property__PropertiesAssignment_2_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2527:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2528:1: ( ruleReferenceProperty )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2528:1: ( ruleReferenceProperty )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2529:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_15042);
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2538:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2542:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2543:1: ( ( RULE_ID ) )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2543:1: ( ( RULE_ID ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2544:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2545:1: ( RULE_ID )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2546:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_05077); if (state.failed) return ;
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
    // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2557:1: rule__ReferenceProperty__PropertiesAssignment_1_1 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2561:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2562:1: ( ruleReferenceProperty )
            {
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2562:1: ( ruleReferenceProperty )
            // ../de.cau.se.instrumentation.language.ui/src-gen/de/cau/se/instrumentation/language/ui/contentassist/antlr/internal/InternalProbeLang.g:2563:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_1_15112);
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
    public static final BitSet FOLLOW_ruleProbe_in_entryRuleProbe727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbe734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__0_in_ruleProbe760 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Model__ProbesAssignment_5_in_rule__Model__Group__5__Impl1355 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__12259 = new BitSet(new long[]{0x0000000001020030L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2_in_rule__Pattern__Group__12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__NameAssignment_1_in_rule__Pattern__Group__1__Impl2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__2__Impl_in_rule__Pattern__Group__22319 = new BitSet(new long[]{0x0000000001020030L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3_in_rule__Pattern__Group__22322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group_2__0_in_rule__Pattern__Group__2__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__3__Impl_in_rule__Pattern__Group__32380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__CodeSequceneAssignment_3_in_rule__Pattern__Group__3__Impl2407 = new BitSet(new long[]{0x0000000001000032L});
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
    public static final BitSet FOLLOW_rule__CodeElement__Group__0__Impl_in_rule__CodeElement__Group__02819 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1_in_rule__CodeElement__Group__02822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__ToUpperAssignment_0_in_rule__CodeElement__Group__0__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1__Impl_in_rule__CodeElement__Group__12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__ValueAssignment_1_in_rule__CodeElement__Group__1__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__0__Impl_in_rule__Probe__Group__02941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Probe__Group__1_in_rule__Probe__Group__02944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Probe__Group__0__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__1__Impl_in_rule__Probe__Group__13003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Probe__Group__2_in_rule__Probe__Group__13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__NameAssignment_1_in_rule__Probe__Group__1__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__2__Impl_in_rule__Probe__Group__23063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Probe__Group__3_in_rule__Probe__Group__23066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Probe__Group__2__Impl3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__3__Impl_in_rule__Probe__Group__33125 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Probe__Group__4_in_rule__Probe__Group__33128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__TypeAssignment_3_in_rule__Probe__Group__3__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__4__Impl_in_rule__Probe__Group__43185 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Probe__Group__5_in_rule__Probe__Group__43188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Probe__Group__4__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__Group__5__Impl_in_rule__Probe__Group__53247 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Probe__Group__6_in_rule__Probe__Group__53250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probe__PropertiesAssignment_5_in_rule__Probe__Group__5__Impl3277 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Probe__Group__6__Impl_in_rule__Probe__Group__63308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Probe__Group__6__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__03381 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_in_rule__Classifier__Group__0__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__13441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__13444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Classifier__Group__1__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__23503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_2_in_rule__Classifier__Group__2__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__03566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__13626 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__23686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0_in_rule__Property__Group__2__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__0__Impl_in_rule__Property__Group_2__03750 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1_in_rule__Property__Group_2__03753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Property__Group_2__0__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2__1__Impl_in_rule__Property__Group_2__13812 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2__2_in_rule__Property__Group_2__13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_2_1_in_rule__Property__Group_2__1__Impl3842 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_2__2__Impl_in_rule__Property__Group_2__23873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group_2__2__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__03938 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__03941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__0_in_rule__ReferenceProperty__Group__1__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__0__Impl_in_rule__ReferenceProperty__Group_1__04060 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__1_in_rule__ReferenceProperty__Group_1__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReferenceProperty__Group_1__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__1__Impl_in_rule__ReferenceProperty__Group_1__14122 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__2_in_rule__ReferenceProperty__Group_1__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_1_1_in_rule__ReferenceProperty__Group_1__1__Impl4152 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group_1__2__Impl_in_rule__ReferenceProperty__Group_1__24183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReferenceProperty__Group_1__2__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_24284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_34315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_rule__Model__PatternsAssignment_44346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbe_in_rule__Model__ProbesAssignment_54377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_14408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_14439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_24474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Pattern__NameAssignment_14509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Pattern__ParametersAssignment_2_2_14571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_rule__Pattern__CodeSequceneAssignment_34602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CodeElement__ToUpperAssignment_04669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleCodeElement_in_rule__CodeElement__ValueAssignment_14708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterRef__RefAssignment4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__XStringLiteral__ValueAssignment4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Probe__NameAssignment_14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Probe__TypeAssignment_34840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Probe__PropertiesAssignment_54871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_04906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_24945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_04980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_15011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_1_15112 = new BitSet(new long[]{0x0000000000000002L});

}
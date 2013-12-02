package de.cau.cs.se.instrumentation.rl.ui.contentassist.antlr.internal; 

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
import de.cau.cs.se.instrumentation.rl.services.RecordLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRecordLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'pattern'", "'{'", "'}'", "':'", "','", "'tag'", "'struct'", "'extends'", "'const'", "'='", "'['", "']'", "'abstract'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=9;
    public static final int T__14=14;
    public static final int RULE_INT=6;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalRecordLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecordLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecordLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g"; }


     
     	private RecordLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RecordLangGrammarAccess grammarAccess) {
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:63:1: ruleModel EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:77:2: rule__Model__Group__0
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:90:1: ( ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:91:1: ruleImport EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:105:2: rule__Import__Group__0
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:117:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:118:1: ( rulePackage EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:119:1: rulePackage EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:126:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:130:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:131:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:131:1: ( ( rule__Package__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:132:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:133:1: ( rule__Package__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:133:2: rule__Package__Group__0
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:146:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:147:1: ruleQualifiedName EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:161:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:161:2: rule__QualifiedName__Group__0
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:173:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:174:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:175:1: ruleQualifiedNameWithWildcard EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:182:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:186:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:188:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:2: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:201:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:202:1: ( ruleType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:203:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType367);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:210:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:214:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:215:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:215:1: ( ( rule__Type__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:216:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:217:1: ( rule__Type__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:217:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType400);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRulePartialType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:229:1: entryRulePartialType : rulePartialType EOF ;
    public final void entryRulePartialType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:230:1: ( rulePartialType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:231:1: rulePartialType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialType_in_entryRulePartialType427);
            rulePartialType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialType434); if (state.failed) return ;

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
    // $ANTLR end "entryRulePartialType"


    // $ANTLR start "rulePartialType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:238:1: rulePartialType : ( ( rule__PartialType__Alternatives ) ) ;
    public final void rulePartialType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:242:2: ( ( ( rule__PartialType__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__PartialType__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__PartialType__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:244:1: ( rule__PartialType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:1: ( rule__PartialType__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:2: rule__PartialType__Alternatives
            {
            pushFollow(FOLLOW_rule__PartialType__Alternatives_in_rulePartialType460);
            rule__PartialType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartialType"


    // $ANTLR start "entryRulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:257:1: entryRulePartialRecordType : rulePartialRecordType EOF ;
    public final void entryRulePartialRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:258:1: ( rulePartialRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:259:1: rulePartialRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType487);
            rulePartialRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialRecordType494); if (state.failed) return ;

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
    // $ANTLR end "entryRulePartialRecordType"


    // $ANTLR start "rulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:266:1: rulePartialRecordType : ( ( rule__PartialRecordType__Group__0 ) ) ;
    public final void rulePartialRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:270:2: ( ( ( rule__PartialRecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__PartialRecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__PartialRecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:272:1: ( rule__PartialRecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:1: ( rule__PartialRecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:2: rule__PartialRecordType__Group__0
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType520);
            rule__PartialRecordType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePartialRecordType"


    // $ANTLR start "entryRuleTagType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:285:1: entryRuleTagType : ruleTagType EOF ;
    public final void entryRuleTagType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:286:1: ( ruleTagType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:287:1: ruleTagType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTagType_in_entryRuleTagType547);
            ruleTagType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagType554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTagType"


    // $ANTLR start "ruleTagType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:294:1: ruleTagType : ( ( rule__TagType__Group__0 ) ) ;
    public final void ruleTagType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:298:2: ( ( ( rule__TagType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__TagType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__TagType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:300:1: ( rule__TagType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:1: ( rule__TagType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:2: rule__TagType__Group__0
            {
            pushFollow(FOLLOW_rule__TagType__Group__0_in_ruleTagType580);
            rule__TagType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagType"


    // $ANTLR start "entryRuleRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:313:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:314:1: ( ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:315:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType607);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:322:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:326:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__RecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:328:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:1: ( rule__RecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType640);
            rule__RecordType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleConstant"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:341:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:342:1: ( ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:343:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant667);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:350:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:354:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__Constant__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:356:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:1: ( rule__Constant__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant700);
            rule__Constant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleProperty"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:369:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:370:1: ( ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:371:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty727);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:378:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:382:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:384:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:1: ( rule__Property__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty760);
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


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:397:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:398:1: ( ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:399:1: ruleClassifier EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:406:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:410:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:412:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:1: ( rule__Classifier__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:2: rule__Classifier__Group__0
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


    // $ANTLR start "entryRuleArraySize"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:425:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:426:1: ( ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:427:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize847);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:434:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:438:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__ArraySize__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:440:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:1: ( rule__ArraySize__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:2: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize880);
            rule__ArraySize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "entryRuleReferenceProperty"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:453:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:454:1: ( ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:455:1: ruleReferenceProperty EOF
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:462:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:466:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:468:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:2: rule__ReferenceProperty__Group__0
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


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:481:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:482:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:483:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral967);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:490:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:494:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:496:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1000);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:509:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:510:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:511:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1027);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:518:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:522:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:524:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1060);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:537:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:538:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:539:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1087);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:546:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:550:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:552:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1120);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:565:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:566:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:567:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1147);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1154); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:574:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:578:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:580:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1180);
            rule__FloatLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:593:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:594:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:595:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1207);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:602:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:606:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:608:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1240);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:621:1: entryRuleConstantLiteral : ruleConstantLiteral EOF ;
    public final void entryRuleConstantLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:622:1: ( ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:623:1: ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1267);
            ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstantLiteral"


    // $ANTLR start "ruleConstantLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:630:1: ruleConstantLiteral : ( ( rule__ConstantLiteral__ValueAssignment ) ) ;
    public final void ruleConstantLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:634:2: ( ( ( rule__ConstantLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:635:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:635:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:636:1: ( rule__ConstantLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:637:1: ( rule__ConstantLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:637:2: rule__ConstantLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1300);
            rule__ConstantLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantLiteral"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:649:1: rule__Type__Alternatives : ( ( ruleRecordType ) | ( rulePartialType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:653:1: ( ( ruleRecordType ) | ( rulePartialType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25||LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==19||LA1_0==24) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:654:1: ( ruleRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:654:1: ( ruleRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:655:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives1336);
                    ruleRecordType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:660:6: ( rulePartialType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:660:6: ( rulePartialType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:661:1: rulePartialType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPartialTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePartialType_in_rule__Type__Alternatives1353);
                    rulePartialType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getPartialTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PartialType__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:671:1: rule__PartialType__Alternatives : ( ( rulePartialRecordType ) | ( ruleTagType ) );
    public final void rule__PartialType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:675:1: ( ( rulePartialRecordType ) | ( ruleTagType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:676:1: ( rulePartialRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:676:1: ( rulePartialRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:677:1: rulePartialRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialTypeAccess().getPartialRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePartialRecordType_in_rule__PartialType__Alternatives1385);
                    rulePartialRecordType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialTypeAccess().getPartialRecordTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:682:6: ( ruleTagType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:682:6: ( ruleTagType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:683:1: ruleTagType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialTypeAccess().getTagTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTagType_in_rule__PartialType__Alternatives1402);
                    ruleTagType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialTypeAccess().getTagTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__PartialType__Alternatives"


    // $ANTLR start "rule__PartialRecordType__Alternatives_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:693:1: rule__PartialRecordType__Alternatives_4 : ( ( ( rule__PartialRecordType__PropertiesAssignment_4_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_4_1 ) ) );
    public final void rule__PartialRecordType__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:697:1: ( ( ( rule__PartialRecordType__PropertiesAssignment_4_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_4_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:698:1: ( ( rule__PartialRecordType__PropertiesAssignment_4_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:698:1: ( ( rule__PartialRecordType__PropertiesAssignment_4_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:699:1: ( rule__PartialRecordType__PropertiesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_4_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:700:1: ( rule__PartialRecordType__PropertiesAssignment_4_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:700:2: rule__PartialRecordType__PropertiesAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__PropertiesAssignment_4_0_in_rule__PartialRecordType__Alternatives_41434);
                    rule__PartialRecordType__PropertiesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:704:6: ( ( rule__PartialRecordType__ConstantsAssignment_4_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:704:6: ( ( rule__PartialRecordType__ConstantsAssignment_4_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:705:1: ( rule__PartialRecordType__ConstantsAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_4_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:706:1: ( rule__PartialRecordType__ConstantsAssignment_4_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:706:2: rule__PartialRecordType__ConstantsAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__ConstantsAssignment_4_1_in_rule__PartialRecordType__Alternatives_41452);
                    rule__PartialRecordType__ConstantsAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_4_1()); 
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
    // $ANTLR end "rule__PartialRecordType__Alternatives_4"


    // $ANTLR start "rule__RecordType__Alternatives_6"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:715:1: rule__RecordType__Alternatives_6 : ( ( ( rule__RecordType__PropertiesAssignment_6_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_6_1 ) ) );
    public final void rule__RecordType__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:719:1: ( ( ( rule__RecordType__PropertiesAssignment_6_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_6_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:1: ( ( rule__RecordType__PropertiesAssignment_6_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:1: ( ( rule__RecordType__PropertiesAssignment_6_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:721:1: ( rule__RecordType__PropertiesAssignment_6_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_6_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:722:1: ( rule__RecordType__PropertiesAssignment_6_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:722:2: rule__RecordType__PropertiesAssignment_6_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__PropertiesAssignment_6_0_in_rule__RecordType__Alternatives_61485);
                    rule__RecordType__PropertiesAssignment_6_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:726:6: ( ( rule__RecordType__ConstantsAssignment_6_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:726:6: ( ( rule__RecordType__ConstantsAssignment_6_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:727:1: ( rule__RecordType__ConstantsAssignment_6_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_6_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:728:1: ( rule__RecordType__ConstantsAssignment_6_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:728:2: rule__RecordType__ConstantsAssignment_6_1
                    {
                    pushFollow(FOLLOW_rule__RecordType__ConstantsAssignment_6_1_in_rule__RecordType__Alternatives_61503);
                    rule__RecordType__ConstantsAssignment_6_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getConstantsAssignment_6_1()); 
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
    // $ANTLR end "rule__RecordType__Alternatives_6"


    // $ANTLR start "rule__Property__Alternatives_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:737:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:741:1: ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:742:1: ( ( rule__Property__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:742:1: ( ( rule__Property__Group_2_0__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:743:1: ( rule__Property__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:744:1: ( rule__Property__Group_2_0__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:744:2: rule__Property__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21536);
                    rule__Property__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:748:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:748:6: ( ( rule__Property__Group_2_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:749:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:750:1: ( rule__Property__Group_2_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:750:2: rule__Property__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21554);
                    rule__Property__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__Property__Alternatives_2"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:759:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:763:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt6=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:764:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:764:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:765:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1587);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:770:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:770:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:771:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1604);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:776:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:776:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:777:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1621);
                    ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:782:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:782:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:783:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1638);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:788:6: ( ruleConstantLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:788:6: ( ruleConstantLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:789:1: ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1655);
                    ruleConstantLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:801:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:805:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:806:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01685);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01688);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:813:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:817:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:818:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:818:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:819:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl1716); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:832:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:836:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:837:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11747);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11750);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:844:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:848:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:849:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:849:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:850:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:851:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:851:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1777);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:861:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:865:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:866:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21807);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21810);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:873:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:877:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:878:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:878:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:879:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:880:1: ( rule__Model__PackagesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:880:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1837);
            	    rule__Model__PackagesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:890:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:894:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:895:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31868);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31871);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:902:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:906:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:907:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:907:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:908:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:909:1: ( rule__Model__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:909:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1898);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:919:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:923:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:924:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41929);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:930:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:934:1: ( ( ( rule__Model__TypesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:935:1: ( ( rule__Model__TypesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:935:1: ( ( rule__Model__TypesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:936:1: ( rule__Model__TypesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:937:1: ( rule__Model__TypesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||(LA9_0>=24 && LA9_0<=25)||LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:937:2: rule__Model__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1956);
            	    rule__Model__TypesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Import__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:957:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:961:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:962:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01997);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02000);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:969:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:973:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:974:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:974:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:975:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl2028); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:988:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:992:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:993:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12059);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:999:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1003:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1004:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1004:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1005:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1006:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1006:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2086);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1020:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1024:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1025:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02120);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02123);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1032:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1036:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1037:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1037:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1038:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Package__Group__0__Impl2151); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1051:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1055:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1056:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12182);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12185);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1063:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1067:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1068:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1068:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1069:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1070:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1070:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2212);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1080:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1084:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1085:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22242);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1091:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1095:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1096:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1096:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1097:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1098:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1098:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2269);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1114:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1118:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1119:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02305);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02308);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1126:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1130:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1131:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1131:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1132:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2335); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1143:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1147:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1148:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12364);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1154:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1158:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1159:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1159:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1160:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1161:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1161:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2391);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1175:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1179:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1180:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02426);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02429);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1187:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1191:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1192:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1192:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1193:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1194:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1195:2: '.'
            {
            match(input,17,FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl2458); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1206:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1210:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1211:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12490);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1217:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1221:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1222:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1222:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1223:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2517); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1238:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1242:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1243:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02550);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02553);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1250:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1254:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1256:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2580);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1267:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1271:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1272:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12609);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1278:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1282:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1283:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1283:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1284:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1285:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1285:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2636);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1299:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1303:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1304:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02671);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02674);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1311:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1315:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1316:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1316:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1317:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2702); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1330:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1334:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1335:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12733);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1341:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1345:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1346:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1346:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1347:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2761); if (state.failed) return ;
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


    // $ANTLR start "rule__PartialRecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1364:1: rule__PartialRecordType__Group__0 : rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 ;
    public final void rule__PartialRecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1368:1: ( rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1369:2: rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02796);
            rule__PartialRecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02799);
            rule__PartialRecordType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__0"


    // $ANTLR start "rule__PartialRecordType__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1376:1: rule__PartialRecordType__Group__0__Impl : ( 'pattern' ) ;
    public final void rule__PartialRecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1380:1: ( ( 'pattern' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1381:1: ( 'pattern' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1381:1: ( 'pattern' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1382:1: 'pattern'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getPatternKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__PartialRecordType__Group__0__Impl2827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getPatternKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1395:1: rule__PartialRecordType__Group__1 : rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 ;
    public final void rule__PartialRecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1399:1: ( rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1400:2: rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12858);
            rule__PartialRecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12861);
            rule__PartialRecordType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__1"


    // $ANTLR start "rule__PartialRecordType__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1407:1: rule__PartialRecordType__Group__1__Impl : ( ( rule__PartialRecordType__NameAssignment_1 ) ) ;
    public final void rule__PartialRecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1411:1: ( ( ( rule__PartialRecordType__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1412:1: ( ( rule__PartialRecordType__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1412:1: ( ( rule__PartialRecordType__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1413:1: ( rule__PartialRecordType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1414:1: ( rule__PartialRecordType__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1414:2: rule__PartialRecordType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__NameAssignment_1_in_rule__PartialRecordType__Group__1__Impl2888);
            rule__PartialRecordType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1424:1: rule__PartialRecordType__Group__2 : rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 ;
    public final void rule__PartialRecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1428:1: ( rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1429:2: rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22918);
            rule__PartialRecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22921);
            rule__PartialRecordType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__2"


    // $ANTLR start "rule__PartialRecordType__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1436:1: rule__PartialRecordType__Group__2__Impl : ( ( rule__PartialRecordType__Group_2__0 )? ) ;
    public final void rule__PartialRecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1440:1: ( ( ( rule__PartialRecordType__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1441:1: ( ( rule__PartialRecordType__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1441:1: ( ( rule__PartialRecordType__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1442:1: ( rule__PartialRecordType__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1443:1: ( rule__PartialRecordType__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1443:2: rule__PartialRecordType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_2__0_in_rule__PartialRecordType__Group__2__Impl2948);
                    rule__PartialRecordType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__2__Impl"


    // $ANTLR start "rule__PartialRecordType__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1453:1: rule__PartialRecordType__Group__3 : rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4 ;
    public final void rule__PartialRecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1457:1: ( rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1458:2: rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32979);
            rule__PartialRecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__4_in_rule__PartialRecordType__Group__32982);
            rule__PartialRecordType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__3"


    // $ANTLR start "rule__PartialRecordType__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1465:1: rule__PartialRecordType__Group__3__Impl : ( '{' ) ;
    public final void rule__PartialRecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1469:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1470:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1470:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1471:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__PartialRecordType__Group__3__Impl3010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__3__Impl"


    // $ANTLR start "rule__PartialRecordType__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1484:1: rule__PartialRecordType__Group__4 : rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5 ;
    public final void rule__PartialRecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1488:1: ( rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1489:2: rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__4__Impl_in_rule__PartialRecordType__Group__43041);
            rule__PartialRecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__5_in_rule__PartialRecordType__Group__43044);
            rule__PartialRecordType__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__4"


    // $ANTLR start "rule__PartialRecordType__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1496:1: rule__PartialRecordType__Group__4__Impl : ( ( rule__PartialRecordType__Alternatives_4 )* ) ;
    public final void rule__PartialRecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1500:1: ( ( ( rule__PartialRecordType__Alternatives_4 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1501:1: ( ( rule__PartialRecordType__Alternatives_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1501:1: ( ( rule__PartialRecordType__Alternatives_4 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1502:1: ( rule__PartialRecordType__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAlternatives_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1503:1: ( rule__PartialRecordType__Alternatives_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1503:2: rule__PartialRecordType__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Alternatives_4_in_rule__PartialRecordType__Group__4__Impl3071);
            	    rule__PartialRecordType__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__4__Impl"


    // $ANTLR start "rule__PartialRecordType__Group__5"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1513:1: rule__PartialRecordType__Group__5 : rule__PartialRecordType__Group__5__Impl ;
    public final void rule__PartialRecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1517:1: ( rule__PartialRecordType__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1518:2: rule__PartialRecordType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__5__Impl_in_rule__PartialRecordType__Group__53102);
            rule__PartialRecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__5"


    // $ANTLR start "rule__PartialRecordType__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1524:1: rule__PartialRecordType__Group__5__Impl : ( '}' ) ;
    public final void rule__PartialRecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1528:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1529:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1529:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1530:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FOLLOW_21_in_rule__PartialRecordType__Group__5__Impl3130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group__5__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1555:1: rule__PartialRecordType__Group_2__0 : rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1 ;
    public final void rule__PartialRecordType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1559:1: ( rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1560:2: rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__0__Impl_in_rule__PartialRecordType__Group_2__03173);
            rule__PartialRecordType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__1_in_rule__PartialRecordType__Group_2__03176);
            rule__PartialRecordType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__0"


    // $ANTLR start "rule__PartialRecordType__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1567:1: rule__PartialRecordType__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PartialRecordType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1571:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1572:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1572:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1573:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getColonKeyword_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PartialRecordType__Group_2__0__Impl3204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1586:1: rule__PartialRecordType__Group_2__1 : rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2 ;
    public final void rule__PartialRecordType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1590:1: ( rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1591:2: rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__1__Impl_in_rule__PartialRecordType__Group_2__13235);
            rule__PartialRecordType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__2_in_rule__PartialRecordType__Group_2__13238);
            rule__PartialRecordType__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__1"


    // $ANTLR start "rule__PartialRecordType__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1598:1: rule__PartialRecordType__Group_2__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) ) ;
    public final void rule__PartialRecordType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1602:1: ( ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1603:1: ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1603:1: ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1604:1: ( rule__PartialRecordType__ParentsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1605:1: ( rule__PartialRecordType__ParentsAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1605:2: rule__PartialRecordType__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_2_1_in_rule__PartialRecordType__Group_2__1__Impl3265);
            rule__PartialRecordType__ParentsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_2__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1615:1: rule__PartialRecordType__Group_2__2 : rule__PartialRecordType__Group_2__2__Impl ;
    public final void rule__PartialRecordType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1619:1: ( rule__PartialRecordType__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1620:2: rule__PartialRecordType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__2__Impl_in_rule__PartialRecordType__Group_2__23295);
            rule__PartialRecordType__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__2"


    // $ANTLR start "rule__PartialRecordType__Group_2__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1626:1: rule__PartialRecordType__Group_2__2__Impl : ( ( rule__PartialRecordType__Group_2_2__0 )* ) ;
    public final void rule__PartialRecordType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1630:1: ( ( ( rule__PartialRecordType__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1631:1: ( ( rule__PartialRecordType__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1631:1: ( ( rule__PartialRecordType__Group_2_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1632:1: ( rule__PartialRecordType__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1633:1: ( rule__PartialRecordType__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1633:2: rule__PartialRecordType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__0_in_rule__PartialRecordType__Group_2__2__Impl3322);
            	    rule__PartialRecordType__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2__2__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_2_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1649:1: rule__PartialRecordType__Group_2_2__0 : rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1 ;
    public final void rule__PartialRecordType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1653:1: ( rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1654:2: rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__0__Impl_in_rule__PartialRecordType__Group_2_2__03359);
            rule__PartialRecordType__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__1_in_rule__PartialRecordType__Group_2_2__03362);
            rule__PartialRecordType__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2_2__0"


    // $ANTLR start "rule__PartialRecordType__Group_2_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1661:1: rule__PartialRecordType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PartialRecordType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1665:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1666:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1666:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1667:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__PartialRecordType__Group_2_2__0__Impl3390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2_2__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_2_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1680:1: rule__PartialRecordType__Group_2_2__1 : rule__PartialRecordType__Group_2_2__1__Impl ;
    public final void rule__PartialRecordType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1684:1: ( rule__PartialRecordType__Group_2_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1685:2: rule__PartialRecordType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__1__Impl_in_rule__PartialRecordType__Group_2_2__13421);
            rule__PartialRecordType__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2_2__1"


    // $ANTLR start "rule__PartialRecordType__Group_2_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1691:1: rule__PartialRecordType__Group_2_2__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) ) ;
    public final void rule__PartialRecordType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1695:1: ( ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1696:1: ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1696:1: ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1697:1: ( rule__PartialRecordType__ParentsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1698:1: ( rule__PartialRecordType__ParentsAssignment_2_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1698:2: rule__PartialRecordType__ParentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_2_2_1_in_rule__PartialRecordType__Group_2_2__1__Impl3448);
            rule__PartialRecordType__ParentsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_2_2__1__Impl"


    // $ANTLR start "rule__TagType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1712:1: rule__TagType__Group__0 : rule__TagType__Group__0__Impl rule__TagType__Group__1 ;
    public final void rule__TagType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1716:1: ( rule__TagType__Group__0__Impl rule__TagType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1717:2: rule__TagType__Group__0__Impl rule__TagType__Group__1
            {
            pushFollow(FOLLOW_rule__TagType__Group__0__Impl_in_rule__TagType__Group__03482);
            rule__TagType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagType__Group__1_in_rule__TagType__Group__03485);
            rule__TagType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__0"


    // $ANTLR start "rule__TagType__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1724:1: rule__TagType__Group__0__Impl : ( 'tag' ) ;
    public final void rule__TagType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1728:1: ( ( 'tag' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1729:1: ( 'tag' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1729:1: ( 'tag' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1730:1: 'tag'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getTagKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__TagType__Group__0__Impl3513); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getTagKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__0__Impl"


    // $ANTLR start "rule__TagType__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1743:1: rule__TagType__Group__1 : rule__TagType__Group__1__Impl rule__TagType__Group__2 ;
    public final void rule__TagType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1747:1: ( rule__TagType__Group__1__Impl rule__TagType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1748:2: rule__TagType__Group__1__Impl rule__TagType__Group__2
            {
            pushFollow(FOLLOW_rule__TagType__Group__1__Impl_in_rule__TagType__Group__13544);
            rule__TagType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagType__Group__2_in_rule__TagType__Group__13547);
            rule__TagType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__1"


    // $ANTLR start "rule__TagType__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1755:1: rule__TagType__Group__1__Impl : ( ( rule__TagType__NameAssignment_1 ) ) ;
    public final void rule__TagType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1759:1: ( ( ( rule__TagType__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1760:1: ( ( rule__TagType__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1760:1: ( ( rule__TagType__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1761:1: ( rule__TagType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1762:1: ( rule__TagType__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1762:2: rule__TagType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TagType__NameAssignment_1_in_rule__TagType__Group__1__Impl3574);
            rule__TagType__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__1__Impl"


    // $ANTLR start "rule__TagType__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1772:1: rule__TagType__Group__2 : rule__TagType__Group__2__Impl ;
    public final void rule__TagType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1776:1: ( rule__TagType__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1777:2: rule__TagType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TagType__Group__2__Impl_in_rule__TagType__Group__23604);
            rule__TagType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__2"


    // $ANTLR start "rule__TagType__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1783:1: rule__TagType__Group__2__Impl : ( ( rule__TagType__Group_2__0 )? ) ;
    public final void rule__TagType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1787:1: ( ( ( rule__TagType__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1788:1: ( ( rule__TagType__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1788:1: ( ( rule__TagType__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1789:1: ( rule__TagType__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1790:1: ( rule__TagType__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1790:2: rule__TagType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TagType__Group_2__0_in_rule__TagType__Group__2__Impl3631);
                    rule__TagType__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group__2__Impl"


    // $ANTLR start "rule__TagType__Group_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1806:1: rule__TagType__Group_2__0 : rule__TagType__Group_2__0__Impl rule__TagType__Group_2__1 ;
    public final void rule__TagType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1810:1: ( rule__TagType__Group_2__0__Impl rule__TagType__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1811:2: rule__TagType__Group_2__0__Impl rule__TagType__Group_2__1
            {
            pushFollow(FOLLOW_rule__TagType__Group_2__0__Impl_in_rule__TagType__Group_2__03668);
            rule__TagType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagType__Group_2__1_in_rule__TagType__Group_2__03671);
            rule__TagType__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__0"


    // $ANTLR start "rule__TagType__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1818:1: rule__TagType__Group_2__0__Impl : ( ':' ) ;
    public final void rule__TagType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1822:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1823:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1823:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1824:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getColonKeyword_2_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__TagType__Group_2__0__Impl3699); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__0__Impl"


    // $ANTLR start "rule__TagType__Group_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1837:1: rule__TagType__Group_2__1 : rule__TagType__Group_2__1__Impl rule__TagType__Group_2__2 ;
    public final void rule__TagType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1841:1: ( rule__TagType__Group_2__1__Impl rule__TagType__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1842:2: rule__TagType__Group_2__1__Impl rule__TagType__Group_2__2
            {
            pushFollow(FOLLOW_rule__TagType__Group_2__1__Impl_in_rule__TagType__Group_2__13730);
            rule__TagType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagType__Group_2__2_in_rule__TagType__Group_2__13733);
            rule__TagType__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__1"


    // $ANTLR start "rule__TagType__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1849:1: rule__TagType__Group_2__1__Impl : ( ( rule__TagType__ParentsAssignment_2_1 ) ) ;
    public final void rule__TagType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1853:1: ( ( ( rule__TagType__ParentsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1854:1: ( ( rule__TagType__ParentsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1854:1: ( ( rule__TagType__ParentsAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1855:1: ( rule__TagType__ParentsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1856:1: ( rule__TagType__ParentsAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1856:2: rule__TagType__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TagType__ParentsAssignment_2_1_in_rule__TagType__Group_2__1__Impl3760);
            rule__TagType__ParentsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__1__Impl"


    // $ANTLR start "rule__TagType__Group_2__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1866:1: rule__TagType__Group_2__2 : rule__TagType__Group_2__2__Impl ;
    public final void rule__TagType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1870:1: ( rule__TagType__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1871:2: rule__TagType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TagType__Group_2__2__Impl_in_rule__TagType__Group_2__23790);
            rule__TagType__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__2"


    // $ANTLR start "rule__TagType__Group_2__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1877:1: rule__TagType__Group_2__2__Impl : ( ( rule__TagType__Group_2_2__0 )* ) ;
    public final void rule__TagType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1881:1: ( ( ( rule__TagType__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1882:1: ( ( rule__TagType__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1882:1: ( ( rule__TagType__Group_2_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1883:1: ( rule__TagType__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1884:1: ( rule__TagType__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1884:2: rule__TagType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TagType__Group_2_2__0_in_rule__TagType__Group_2__2__Impl3817);
            	    rule__TagType__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2__2__Impl"


    // $ANTLR start "rule__TagType__Group_2_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1900:1: rule__TagType__Group_2_2__0 : rule__TagType__Group_2_2__0__Impl rule__TagType__Group_2_2__1 ;
    public final void rule__TagType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1904:1: ( rule__TagType__Group_2_2__0__Impl rule__TagType__Group_2_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1905:2: rule__TagType__Group_2_2__0__Impl rule__TagType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__TagType__Group_2_2__0__Impl_in_rule__TagType__Group_2_2__03854);
            rule__TagType__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagType__Group_2_2__1_in_rule__TagType__Group_2_2__03857);
            rule__TagType__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2_2__0"


    // $ANTLR start "rule__TagType__Group_2_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1912:1: rule__TagType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__TagType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1916:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1917:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1917:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1918:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__TagType__Group_2_2__0__Impl3885); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2_2__0__Impl"


    // $ANTLR start "rule__TagType__Group_2_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1931:1: rule__TagType__Group_2_2__1 : rule__TagType__Group_2_2__1__Impl ;
    public final void rule__TagType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1935:1: ( rule__TagType__Group_2_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1936:2: rule__TagType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TagType__Group_2_2__1__Impl_in_rule__TagType__Group_2_2__13916);
            rule__TagType__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2_2__1"


    // $ANTLR start "rule__TagType__Group_2_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1942:1: rule__TagType__Group_2_2__1__Impl : ( ( rule__TagType__ParentsAssignment_2_2_1 ) ) ;
    public final void rule__TagType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1946:1: ( ( ( rule__TagType__ParentsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1947:1: ( ( rule__TagType__ParentsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1947:1: ( ( rule__TagType__ParentsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1948:1: ( rule__TagType__ParentsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1949:1: ( rule__TagType__ParentsAssignment_2_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1949:2: rule__TagType__ParentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__TagType__ParentsAssignment_2_2_1_in_rule__TagType__Group_2_2__1__Impl3943);
            rule__TagType__ParentsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__Group_2_2__1__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1963:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1967:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1968:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03977);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03980);
            rule__RecordType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1975:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__AbstractAssignment_0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1979:1: ( ( ( rule__RecordType__AbstractAssignment_0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1980:1: ( ( rule__RecordType__AbstractAssignment_0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1980:1: ( ( rule__RecordType__AbstractAssignment_0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1981:1: ( rule__RecordType__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1982:1: ( rule__RecordType__AbstractAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1982:2: rule__RecordType__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__AbstractAssignment_0_in_rule__RecordType__Group__0__Impl4007);
                    rule__RecordType__AbstractAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1992:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1996:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1997:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__14038);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__14041);
            rule__RecordType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2004:1: rule__RecordType__Group__1__Impl : ( 'struct' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2008:1: ( ( 'struct' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2009:1: ( 'struct' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2009:1: ( 'struct' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2010:1: 'struct'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getStructKeyword_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__RecordType__Group__1__Impl4069); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getStructKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2023:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2027:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2028:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__24100);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__24103);
            rule__RecordType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2035:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__NameAssignment_2 ) ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2039:1: ( ( ( rule__RecordType__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2040:1: ( ( rule__RecordType__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2040:1: ( ( rule__RecordType__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2041:1: ( rule__RecordType__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2042:1: ( rule__RecordType__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2042:2: rule__RecordType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_2_in_rule__RecordType__Group__2__Impl4130);
            rule__RecordType__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2052:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2056:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2057:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__34160);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__34163);
            rule__RecordType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2064:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )? ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2068:1: ( ( ( rule__RecordType__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2069:1: ( ( rule__RecordType__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2069:1: ( ( rule__RecordType__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2070:1: ( rule__RecordType__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2071:1: ( rule__RecordType__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2071:2: rule__RecordType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_3__0_in_rule__RecordType__Group__3__Impl4190);
                    rule__RecordType__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2081:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2085:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2086:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__44221);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__44224);
            rule__RecordType__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2093:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__Group_4__0 )? ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2097:1: ( ( ( rule__RecordType__Group_4__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2098:1: ( ( rule__RecordType__Group_4__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2098:1: ( ( rule__RecordType__Group_4__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2099:1: ( rule__RecordType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2100:1: ( rule__RecordType__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2100:2: rule__RecordType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_4__0_in_rule__RecordType__Group__4__Impl4251);
                    rule__RecordType__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group__5"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2110:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2114:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2115:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__54282);
            rule__RecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__54285);
            rule__RecordType__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5"


    // $ANTLR start "rule__RecordType__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2122:1: rule__RecordType__Group__5__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2126:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2127:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2127:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2128:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_20_in_rule__RecordType__Group__5__Impl4313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__5__Impl"


    // $ANTLR start "rule__RecordType__Group__6"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2141:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2145:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2146:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__64344);
            rule__RecordType__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__64347);
            rule__RecordType__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6"


    // $ANTLR start "rule__RecordType__Group__6__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2153:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__Alternatives_6 )* ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2157:1: ( ( ( rule__RecordType__Alternatives_6 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2158:1: ( ( rule__RecordType__Alternatives_6 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2158:1: ( ( rule__RecordType__Alternatives_6 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2159:1: ( rule__RecordType__Alternatives_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_6()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2160:1: ( rule__RecordType__Alternatives_6 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2160:2: rule__RecordType__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Alternatives_6_in_rule__RecordType__Group__6__Impl4374);
            	    rule__RecordType__Alternatives_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__6__Impl"


    // $ANTLR start "rule__RecordType__Group__7"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2170:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2174:1: ( rule__RecordType__Group__7__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2175:2: rule__RecordType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__74405);
            rule__RecordType__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7"


    // $ANTLR start "rule__RecordType__Group__7__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2181:1: rule__RecordType__Group__7__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2185:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2186:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2186:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2187:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FOLLOW_21_in_rule__RecordType__Group__7__Impl4433); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__7__Impl"


    // $ANTLR start "rule__RecordType__Group_3__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2216:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2220:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2221:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_3__0__Impl_in_rule__RecordType__Group_3__04480);
            rule__RecordType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_3__1_in_rule__RecordType__Group_3__04483);
            rule__RecordType__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0"


    // $ANTLR start "rule__RecordType__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2228:1: rule__RecordType__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2232:1: ( ( 'extends' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2233:1: ( 'extends' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2233:1: ( 'extends' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2234:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__RecordType__Group_3__0__Impl4511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getExtendsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0__Impl"


    // $ANTLR start "rule__RecordType__Group_3__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2247:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2251:1: ( rule__RecordType__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2252:2: rule__RecordType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_3__1__Impl_in_rule__RecordType__Group_3__14542);
            rule__RecordType__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1"


    // $ANTLR start "rule__RecordType__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2258:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__ParentAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2262:1: ( ( ( rule__RecordType__ParentAssignment_3_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2263:1: ( ( rule__RecordType__ParentAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2263:1: ( ( rule__RecordType__ParentAssignment_3_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2264:1: ( rule__RecordType__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2265:1: ( rule__RecordType__ParentAssignment_3_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2265:2: rule__RecordType__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentAssignment_3_1_in_rule__RecordType__Group_3__1__Impl4569);
            rule__RecordType__ParentAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1__Impl"


    // $ANTLR start "rule__RecordType__Group_4__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2279:1: rule__RecordType__Group_4__0 : rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1 ;
    public final void rule__RecordType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2283:1: ( rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2284:2: rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__0__Impl_in_rule__RecordType__Group_4__04603);
            rule__RecordType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4__1_in_rule__RecordType__Group_4__04606);
            rule__RecordType__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__0"


    // $ANTLR start "rule__RecordType__Group_4__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2291:1: rule__RecordType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2295:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2296:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2296:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2297:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_4__0__Impl4634); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__0__Impl"


    // $ANTLR start "rule__RecordType__Group_4__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2310:1: rule__RecordType__Group_4__1 : rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2 ;
    public final void rule__RecordType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2314:1: ( rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2315:2: rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__1__Impl_in_rule__RecordType__Group_4__14665);
            rule__RecordType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4__2_in_rule__RecordType__Group_4__14668);
            rule__RecordType__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__1"


    // $ANTLR start "rule__RecordType__Group_4__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2322:1: rule__RecordType__Group_4__1__Impl : ( ( rule__RecordType__ParentsAssignment_4_1 ) ) ;
    public final void rule__RecordType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2326:1: ( ( ( rule__RecordType__ParentsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2327:1: ( ( rule__RecordType__ParentsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2327:1: ( ( rule__RecordType__ParentsAssignment_4_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2328:1: ( rule__RecordType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2329:1: ( rule__RecordType__ParentsAssignment_4_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2329:2: rule__RecordType__ParentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_4_1_in_rule__RecordType__Group_4__1__Impl4695);
            rule__RecordType__ParentsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__1__Impl"


    // $ANTLR start "rule__RecordType__Group_4__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2339:1: rule__RecordType__Group_4__2 : rule__RecordType__Group_4__2__Impl ;
    public final void rule__RecordType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2343:1: ( rule__RecordType__Group_4__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2344:2: rule__RecordType__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__2__Impl_in_rule__RecordType__Group_4__24725);
            rule__RecordType__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__2"


    // $ANTLR start "rule__RecordType__Group_4__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2350:1: rule__RecordType__Group_4__2__Impl : ( ( rule__RecordType__Group_4_2__0 )* ) ;
    public final void rule__RecordType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2354:1: ( ( ( rule__RecordType__Group_4_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2355:1: ( ( rule__RecordType__Group_4_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2355:1: ( ( rule__RecordType__Group_4_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2356:1: ( rule__RecordType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2357:1: ( rule__RecordType__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2357:2: rule__RecordType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_4_2__0_in_rule__RecordType__Group_4__2__Impl4752);
            	    rule__RecordType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4__2__Impl"


    // $ANTLR start "rule__RecordType__Group_4_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2373:1: rule__RecordType__Group_4_2__0 : rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1 ;
    public final void rule__RecordType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2377:1: ( rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2378:2: rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__0__Impl_in_rule__RecordType__Group_4_2__04789);
            rule__RecordType__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__1_in_rule__RecordType__Group_4_2__04792);
            rule__RecordType__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4_2__0"


    // $ANTLR start "rule__RecordType__Group_4_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2385:1: rule__RecordType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2389:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2390:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2390:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2391:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_4_2__0__Impl4820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4_2__0__Impl"


    // $ANTLR start "rule__RecordType__Group_4_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2404:1: rule__RecordType__Group_4_2__1 : rule__RecordType__Group_4_2__1__Impl ;
    public final void rule__RecordType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2408:1: ( rule__RecordType__Group_4_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2409:2: rule__RecordType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__1__Impl_in_rule__RecordType__Group_4_2__14851);
            rule__RecordType__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4_2__1"


    // $ANTLR start "rule__RecordType__Group_4_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2415:1: rule__RecordType__Group_4_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__RecordType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2419:1: ( ( ( rule__RecordType__ParentsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2420:1: ( ( rule__RecordType__ParentsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2420:1: ( ( rule__RecordType__ParentsAssignment_4_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2421:1: ( rule__RecordType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2422:1: ( rule__RecordType__ParentsAssignment_4_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2422:2: rule__RecordType__ParentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_4_2_1_in_rule__RecordType__Group_4_2__1__Impl4878);
            rule__RecordType__ParentsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_4_2__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2436:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2440:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2441:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04912);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04915);
            rule__Constant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2448:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2452:1: ( ( 'const' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2453:1: ( 'const' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2453:1: ( 'const' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2454:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constant__Group__0__Impl4943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2467:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2471:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2472:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14974);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14977);
            rule__Constant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2479:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2483:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2484:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2484:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2485:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2486:1: ( rule__Constant__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2486:2: rule__Constant__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl5004);
            rule__Constant__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2496:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2500:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2501:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__25034);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__25037);
            rule__Constant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2508:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2512:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2513:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2513:1: ( ( rule__Constant__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2514:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2515:1: ( rule__Constant__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2515:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl5064);
            rule__Constant__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2525:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2529:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2530:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__35094);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__35097);
            rule__Constant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2537:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2541:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2542:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2542:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2543:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constant__Group__3__Impl5125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__Constant__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2556:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2560:1: ( rule__Constant__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2561:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45156);
            rule__Constant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4"


    // $ANTLR start "rule__Constant__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2567:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2571:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2572:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2572:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2573:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2574:1: ( rule__Constant__ValueAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2574:2: rule__Constant__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5183);
            rule__Constant__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2594:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2598:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2599:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05223);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05226);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2606:1: rule__Property__Group__0__Impl : ( ( rule__Property__TypeAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2610:1: ( ( ( rule__Property__TypeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2611:1: ( ( rule__Property__TypeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2611:1: ( ( rule__Property__TypeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2612:1: ( rule__Property__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2613:1: ( rule__Property__TypeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2613:2: rule__Property__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl5253);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2623:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2627:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2628:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15283);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15286);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2635:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2639:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2640:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2640:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2641:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2642:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2642:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5313);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2652:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2656:1: ( rule__Property__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2657:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25343);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2663:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2667:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2668:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2668:1: ( ( rule__Property__Alternatives_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2669:1: ( rule__Property__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2670:1: ( rule__Property__Alternatives_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2670:2: rule__Property__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5370);
            rule__Property__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Property__Group_2_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2686:1: rule__Property__Group_2_0__0 : rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 ;
    public final void rule__Property__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2690:1: ( rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2691:2: rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05406);
            rule__Property__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05409);
            rule__Property__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__0"


    // $ANTLR start "rule__Property__Group_2_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2698:1: rule__Property__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2702:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2703:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2703:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2704:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Property__Group_2_0__0__Impl5437); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__0__Impl"


    // $ANTLR start "rule__Property__Group_2_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2717:1: rule__Property__Group_2_0__1 : rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 ;
    public final void rule__Property__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2721:1: ( rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2722:2: rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15468);
            rule__Property__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15471);
            rule__Property__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__1"


    // $ANTLR start "rule__Property__Group_2_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2729:1: rule__Property__Group_2_0__1__Impl : ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) ;
    public final void rule__Property__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2733:1: ( ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2734:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2734:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2735:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2736:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2736:2: rule__Property__PropertiesAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5498);
            	    rule__Property__PropertiesAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__1__Impl"


    // $ANTLR start "rule__Property__Group_2_0__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2746:1: rule__Property__Group_2_0__2 : rule__Property__Group_2_0__2__Impl ;
    public final void rule__Property__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2750:1: ( rule__Property__Group_2_0__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2751:2: rule__Property__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25529);
            rule__Property__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__2"


    // $ANTLR start "rule__Property__Group_2_0__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2757:1: rule__Property__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2761:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2762:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2762:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2763:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Property__Group_2_0__2__Impl5557); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_0__2__Impl"


    // $ANTLR start "rule__Property__Group_2_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2782:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2786:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2787:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05594);
            rule__Property__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05597);
            rule__Property__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__0"


    // $ANTLR start "rule__Property__Group_2_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2794:1: rule__Property__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2798:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2799:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2799:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2800:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group_2_1__0__Impl5625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__0__Impl"


    // $ANTLR start "rule__Property__Group_2_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2813:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2817:1: ( rule__Property__Group_2_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2818:2: rule__Property__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15656);
            rule__Property__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__1"


    // $ANTLR start "rule__Property__Group_2_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2824:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ValueAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2828:1: ( ( ( rule__Property__ValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2829:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2829:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2830:1: ( rule__Property__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2831:1: ( rule__Property__ValueAssignment_2_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2831:2: rule__Property__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5683);
            rule__Property__ValueAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__1__Impl"


    // $ANTLR start "rule__Classifier__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2845:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2849:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2850:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05717);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05720);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2857:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__Group_0__0 )? ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2861:1: ( ( ( rule__Classifier__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2862:1: ( ( rule__Classifier__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2862:1: ( ( rule__Classifier__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2863:1: ( rule__Classifier__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2864:1: ( rule__Classifier__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==17) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2864:2: rule__Classifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5747);
                    rule__Classifier__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getGroup_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2874:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2878:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2879:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15778);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15781);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2886:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__ClassAssignment_1 ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2890:1: ( ( ( rule__Classifier__ClassAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2891:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2891:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2892:1: ( rule__Classifier__ClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2893:1: ( rule__Classifier__ClassAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2893:2: rule__Classifier__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5808);
            rule__Classifier__ClassAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassAssignment_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2903:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2907:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2908:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25838);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2914:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__SizesAssignment_2 )* ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2918:1: ( ( ( rule__Classifier__SizesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2919:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2919:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2920:1: ( rule__Classifier__SizesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2921:1: ( rule__Classifier__SizesAssignment_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2921:2: rule__Classifier__SizesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5865);
            	    rule__Classifier__SizesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getSizesAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Classifier__Group_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2937:1: rule__Classifier__Group_0__0 : rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 ;
    public final void rule__Classifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2941:1: ( rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2942:2: rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05902);
            rule__Classifier__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05905);
            rule__Classifier__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group_0__0"


    // $ANTLR start "rule__Classifier__Group_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2949:1: rule__Classifier__Group_0__0__Impl : ( ( rule__Classifier__PackageAssignment_0_0 ) ) ;
    public final void rule__Classifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2953:1: ( ( ( rule__Classifier__PackageAssignment_0_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2954:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2954:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2955:1: ( rule__Classifier__PackageAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2956:1: ( rule__Classifier__PackageAssignment_0_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2956:2: rule__Classifier__PackageAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5932);
            rule__Classifier__PackageAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackageAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group_0__0__Impl"


    // $ANTLR start "rule__Classifier__Group_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2966:1: rule__Classifier__Group_0__1 : rule__Classifier__Group_0__1__Impl ;
    public final void rule__Classifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2970:1: ( rule__Classifier__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2971:2: rule__Classifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15962);
            rule__Classifier__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group_0__1"


    // $ANTLR start "rule__Classifier__Group_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2977:1: rule__Classifier__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2981:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2982:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2982:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2983:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_0_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__Classifier__Group_0__1__Impl5990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getFullStopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__Group_0__1__Impl"


    // $ANTLR start "rule__ArraySize__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3000:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3004:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3005:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06025);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06028);
            rule__ArraySize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0"


    // $ANTLR start "rule__ArraySize__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3012:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3016:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3017:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3017:1: ( () )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3018:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3019:1: ()
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3021:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0__Impl"


    // $ANTLR start "rule__ArraySize__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3031:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3035:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3036:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16086);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16089);
            rule__ArraySize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1"


    // $ANTLR start "rule__ArraySize__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3043:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3047:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3048:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3048:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3049:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__ArraySize__Group__1__Impl6117); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1__Impl"


    // $ANTLR start "rule__ArraySize__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3062:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3066:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3067:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26148);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26151);
            rule__ArraySize__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2"


    // $ANTLR start "rule__ArraySize__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3074:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3078:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3079:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3079:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3080:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3081:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3081:2: rule__ArraySize__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6178);
                    rule__ArraySize__SizeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2__Impl"


    // $ANTLR start "rule__ArraySize__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3091:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3095:1: ( rule__ArraySize__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3096:2: rule__ArraySize__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36209);
            rule__ArraySize__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__3"


    // $ANTLR start "rule__ArraySize__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3102:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3106:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3107:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3107:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3108:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArraySize__Group__3__Impl6237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__3__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3129:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3133:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3134:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06276);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06279);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3141:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3145:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3146:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3146:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3147:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3148:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3148:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6306);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3158:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3162:1: ( rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3163:2: rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16336);
            rule__ReferenceProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16339);
            rule__ReferenceProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3170:1: rule__ReferenceProperty__Group__1__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3174:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3175:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3175:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3176:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__ReferenceProperty__Group__1__Impl6367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ReferenceProperty__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3189:1: rule__ReferenceProperty__Group__2 : rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 ;
    public final void rule__ReferenceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3193:1: ( rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3194:2: rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26398);
            rule__ReferenceProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26401);
            rule__ReferenceProperty__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__2"


    // $ANTLR start "rule__ReferenceProperty__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3201:1: rule__ReferenceProperty__Group__2__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) ;
    public final void rule__ReferenceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3205:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3206:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3206:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3207:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3208:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3208:2: rule__ReferenceProperty__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6428);
            	    rule__ReferenceProperty__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__2__Impl"


    // $ANTLR start "rule__ReferenceProperty__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3218:1: rule__ReferenceProperty__Group__3 : rule__ReferenceProperty__Group__3__Impl ;
    public final void rule__ReferenceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3222:1: ( rule__ReferenceProperty__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3223:2: rule__ReferenceProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36459);
            rule__ReferenceProperty__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__3"


    // $ANTLR start "rule__ReferenceProperty__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3229:1: rule__ReferenceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3233:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3234:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3234:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3235:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__ReferenceProperty__Group__3__Impl6487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__Group__3__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3257:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3261:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3262:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3262:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3263:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16531);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3272:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3276:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3277:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3277:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3278:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_26562);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3287:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3291:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3292:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3292:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3293:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_36593);
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


    // $ANTLR start "rule__Model__TypesAssignment_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3302:1: rule__Model__TypesAssignment_4 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3306:1: ( ( ruleType ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3307:1: ( ruleType )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3307:1: ( ruleType )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3308:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_46624);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3317:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3321:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3322:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3322:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3323:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16655);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3332:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3336:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3337:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3337:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3338:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_16686); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3347:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3351:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3352:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3352:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3353:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3354:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3355:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_26721); if (state.failed) return ;
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


    // $ANTLR start "rule__PartialRecordType__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3366:1: rule__PartialRecordType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartialRecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3370:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3371:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3371:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3372:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_16756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__NameAssignment_1"


    // $ANTLR start "rule__PartialRecordType__ParentsAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3381:1: rule__PartialRecordType__ParentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3385:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3386:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3386:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3387:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3388:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3389:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_16791);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ParentsAssignment_2_1"


    // $ANTLR start "rule__PartialRecordType__ParentsAssignment_2_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3400:1: rule__PartialRecordType__ParentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3404:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3405:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3405:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3406:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3407:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3408:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_2_16830);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialTypeCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ParentsAssignment_2_2_1"


    // $ANTLR start "rule__PartialRecordType__PropertiesAssignment_4_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3419:1: rule__PartialRecordType__PropertiesAssignment_4_0 : ( ruleProperty ) ;
    public final void rule__PartialRecordType__PropertiesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3423:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3424:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3424:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3425:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_4_06865);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__PropertiesAssignment_4_0"


    // $ANTLR start "rule__PartialRecordType__ConstantsAssignment_4_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3434:1: rule__PartialRecordType__ConstantsAssignment_4_1 : ( ruleConstant ) ;
    public final void rule__PartialRecordType__ConstantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3438:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3439:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3439:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3440:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_4_16896);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ConstantsAssignment_4_1"


    // $ANTLR start "rule__TagType__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3449:1: rule__TagType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TagType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3453:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3454:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3454:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3455:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagType__NameAssignment_16927); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__NameAssignment_1"


    // $ANTLR start "rule__TagType__ParentsAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3464:1: rule__TagType__ParentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TagType__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3468:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3469:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3469:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3470:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3471:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3472:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsTagTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TagType__ParentsAssignment_2_16962);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsTagTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__ParentsAssignment_2_1"


    // $ANTLR start "rule__TagType__ParentsAssignment_2_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3483:1: rule__TagType__ParentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TagType__ParentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3487:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3488:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3488:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3489:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3490:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3491:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagTypeAccess().getParentsTagTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TagType__ParentsAssignment_2_2_17001);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsTagTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagTypeAccess().getParentsTagTypeCrossReference_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagType__ParentsAssignment_2_2_1"


    // $ANTLR start "rule__RecordType__AbstractAssignment_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3502:1: rule__RecordType__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3506:1: ( ( ( 'abstract' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3507:1: ( ( 'abstract' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3507:1: ( ( 'abstract' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3508:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3509:1: ( 'abstract' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3510:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__RecordType__AbstractAssignment_07041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__AbstractAssignment_0"


    // $ANTLR start "rule__RecordType__NameAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3525:1: rule__RecordType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3529:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3530:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3530:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3531:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_27080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_2"


    // $ANTLR start "rule__RecordType__ParentAssignment_3_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3540:1: rule__RecordType__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3544:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3545:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3545:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3546:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_3_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3547:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3548:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_3_17115);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentAssignment_3_1"


    // $ANTLR start "rule__RecordType__ParentsAssignment_4_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3559:1: rule__RecordType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3563:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3564:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3564:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3565:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3566:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3567:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_17154);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentsAssignment_4_1"


    // $ANTLR start "rule__RecordType__ParentsAssignment_4_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3578:1: rule__RecordType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3582:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3583:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3583:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3584:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3585:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3586:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_2_17193);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialTypeCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentsAssignment_4_2_1"


    // $ANTLR start "rule__RecordType__PropertiesAssignment_6_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3597:1: rule__RecordType__PropertiesAssignment_6_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3601:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3602:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3602:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3603:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_6_07228);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__PropertiesAssignment_6_0"


    // $ANTLR start "rule__RecordType__ConstantsAssignment_6_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3612:1: rule__RecordType__ConstantsAssignment_6_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3616:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3617:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3617:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3618:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_6_17259);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ConstantsAssignment_6_1"


    // $ANTLR start "rule__Constant__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3627:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3631:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3632:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3632:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3633:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_17290);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__TypeAssignment_1"


    // $ANTLR start "rule__Constant__NameAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3642:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3646:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3647:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3647:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3648:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_27321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_2"


    // $ANTLR start "rule__Constant__ValueAssignment_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3657:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3661:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3662:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3662:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3663:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_47352);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_4"


    // $ANTLR start "rule__Property__TypeAssignment_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3672:1: rule__Property__TypeAssignment_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3676:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3677:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3677:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3678:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_07383);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3687:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3691:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3692:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3692:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3693:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_17414); if (state.failed) return ;
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


    // $ANTLR start "rule__Property__PropertiesAssignment_2_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3702:1: rule__Property__PropertiesAssignment_2_0_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3706:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3707:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3707:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3708:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_17445);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertiesAssignment_2_0_1"


    // $ANTLR start "rule__Property__ValueAssignment_2_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3717:1: rule__Property__ValueAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3721:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3722:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3722:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3723:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_17476);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_2_1_1"


    // $ANTLR start "rule__Classifier__PackageAssignment_0_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3732:1: rule__Classifier__PackageAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3736:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3737:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3737:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3738:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3739:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3740:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_07511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__PackageAssignment_0_0"


    // $ANTLR start "rule__Classifier__ClassAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3751:1: rule__Classifier__ClassAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3755:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3756:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3756:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3757:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3758:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3759:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_17550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__ClassAssignment_1"


    // $ANTLR start "rule__Classifier__SizesAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3770:1: rule__Classifier__SizesAssignment_2 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3774:1: ( ( ruleArraySize ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3775:1: ( ruleArraySize )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3775:1: ( ruleArraySize )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3776:1: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_27585);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__SizesAssignment_2"


    // $ANTLR start "rule__ArraySize__SizeAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3785:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3789:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3790:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3790:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3791:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_27616); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__SizeAssignment_2"


    // $ANTLR start "rule__ReferenceProperty__RefAssignment_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3800:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3804:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3805:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3805:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3806:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3807:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3808:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_07651); if (state.failed) return ;
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


    // $ANTLR start "rule__ReferenceProperty__PropertiesAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3819:1: rule__ReferenceProperty__PropertiesAssignment_2 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3823:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3824:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3824:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3825:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_27686);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceProperty__PropertiesAssignment_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3834:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3838:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3839:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3839:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3840:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3849:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3853:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3854:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3854:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3855:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment7748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3864:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3868:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3869:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3869:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3870:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment7779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3879:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3883:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3884:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3884:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3885:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment7810); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__ConstantLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3894:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3898:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3899:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3899:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3900:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3901:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3902:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment7845); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantLiteral__ValueAssignment"

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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialType_in_entryRulePartialType427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialType434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialType__Alternatives_in_rulePartialType460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialRecordType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagType_in_entryRuleTagType547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagType554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group__0_in_ruleTagType580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialType_in_rule__Type__Alternatives1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_rule__PartialType__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagType_in_rule__PartialType__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__PropertiesAssignment_4_0_in_rule__PartialRecordType__Alternatives_41434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ConstantsAssignment_4_1_in_rule__PartialRecordType__Alternatives_41452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__PropertiesAssignment_6_0_in_rule__RecordType__Alternatives_61485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ConstantsAssignment_6_1_in_rule__RecordType__Alternatives_61503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11747 = new BitSet(new long[]{0x0000000083098000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21807 = new BitSet(new long[]{0x0000000083098000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1837 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31868 = new BitSet(new long[]{0x0000000083098000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1898 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1956 = new BitSet(new long[]{0x0000000083080002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01997 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Package__Group__0__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12182 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02305 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2391 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02550 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02671 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PartialRecordType__Group__0__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12858 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__NameAssignment_1_in_rule__PartialRecordType__Group__1__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22918 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__0_in_rule__PartialRecordType__Group__2__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32979 = new BitSet(new long[]{0x0000000008200010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__4_in_rule__PartialRecordType__Group__32982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PartialRecordType__Group__3__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__4__Impl_in_rule__PartialRecordType__Group__43041 = new BitSet(new long[]{0x0000000008200010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__5_in_rule__PartialRecordType__Group__43044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Alternatives_4_in_rule__PartialRecordType__Group__4__Impl3071 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__5__Impl_in_rule__PartialRecordType__Group__53102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PartialRecordType__Group__5__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__0__Impl_in_rule__PartialRecordType__Group_2__03173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__1_in_rule__PartialRecordType__Group_2__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PartialRecordType__Group_2__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__1__Impl_in_rule__PartialRecordType__Group_2__13235 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__2_in_rule__PartialRecordType__Group_2__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_2_1_in_rule__PartialRecordType__Group_2__1__Impl3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__2__Impl_in_rule__PartialRecordType__Group_2__23295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__0_in_rule__PartialRecordType__Group_2__2__Impl3322 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__0__Impl_in_rule__PartialRecordType__Group_2_2__03359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__1_in_rule__PartialRecordType__Group_2_2__03362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PartialRecordType__Group_2_2__0__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__1__Impl_in_rule__PartialRecordType__Group_2_2__13421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_2_2_1_in_rule__PartialRecordType__Group_2_2__1__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group__0__Impl_in_rule__TagType__Group__03482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagType__Group__1_in_rule__TagType__Group__03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TagType__Group__0__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group__1__Impl_in_rule__TagType__Group__13544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TagType__Group__2_in_rule__TagType__Group__13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__NameAssignment_1_in_rule__TagType__Group__1__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group__2__Impl_in_rule__TagType__Group__23604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__0_in_rule__TagType__Group__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__0__Impl_in_rule__TagType__Group_2__03668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__1_in_rule__TagType__Group_2__03671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TagType__Group_2__0__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__1__Impl_in_rule__TagType__Group_2__13730 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__2_in_rule__TagType__Group_2__13733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__ParentsAssignment_2_1_in_rule__TagType__Group_2__1__Impl3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2__2__Impl_in_rule__TagType__Group_2__23790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2_2__0_in_rule__TagType__Group_2__2__Impl3817 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2_2__0__Impl_in_rule__TagType__Group_2_2__03854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagType__Group_2_2__1_in_rule__TagType__Group_2_2__03857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TagType__Group_2_2__0__Impl3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__Group_2_2__1__Impl_in_rule__TagType__Group_2_2__13916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagType__ParentsAssignment_2_2_1_in_rule__TagType__Group_2_2__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03977 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AbstractAssignment_0_in_rule__RecordType__Group__0__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__14038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__14041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group__1__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__24100 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__24103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_2_in_rule__RecordType__Group__2__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__34160 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__34163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__0_in_rule__RecordType__Group__3__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__44221 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__44224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__0_in_rule__RecordType__Group__4__Impl4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__54282 = new BitSet(new long[]{0x0000000008200010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__54285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group__5__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__64344 = new BitSet(new long[]{0x0000000008200010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__64347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Alternatives_6_in_rule__RecordType__Group__6__Impl4374 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__74405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group__7__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__0__Impl_in_rule__RecordType__Group_3__04480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__1_in_rule__RecordType__Group_3__04483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group_3__0__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__1__Impl_in_rule__RecordType__Group_3__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentAssignment_3_1_in_rule__RecordType__Group_3__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__0__Impl_in_rule__RecordType__Group_4__04603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__1_in_rule__RecordType__Group_4__04606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_4__0__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__1__Impl_in_rule__RecordType__Group_4__14665 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__2_in_rule__RecordType__Group_4__14668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_4_1_in_rule__RecordType__Group_4__1__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__2__Impl_in_rule__RecordType__Group_4__24725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__0_in_rule__RecordType__Group_4__2__Impl4752 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__0__Impl_in_rule__RecordType__Group_4_2__04789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__1_in_rule__RecordType__Group_4_2__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_4_2__0__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__1__Impl_in_rule__RecordType__Group_4_2__14851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_4_2_1_in_rule__RecordType__Group_4_2__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constant__Group__0__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__25034 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__25037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__35094 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__35097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constant__Group__3__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_in_rule__Property__Group__0__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15283 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05406 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Property__Group_2_0__0__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15468 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5498 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__Group_2_0__2__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05594 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group_2_1__0__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05717 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5865 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05902 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Classifier__Group_0__1__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06025 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16086 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ArraySize__Group__1__Impl6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26148 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArraySize__Group__3__Impl6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06276 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16336 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ReferenceProperty__Group__1__Impl6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26398 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6428 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReferenceProperty__Group__3__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_26562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_36593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_46624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_16686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_26721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_16756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_16791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_2_16830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_4_06865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_4_16896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagType__NameAssignment_16927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TagType__ParentsAssignment_2_16962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TagType__ParentsAssignment_2_2_17001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RecordType__AbstractAssignment_07041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_27080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_3_17115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_17154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_2_17193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_6_07228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_6_17259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_17290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_27321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_47352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_17414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_17476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_07511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_17550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_27585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_27616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_07651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_27686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment7845 = new BitSet(new long[]{0x0000000000000002L});

}
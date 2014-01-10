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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'.'", "'*'", "'template'", "':'", "','", "'{'", "'}'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'['", "']'", "'abstract'"
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
    public static final int T__32=32;
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


    // $ANTLR start "entryRulePartialRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:229:1: entryRulePartialRecordType : rulePartialRecordType EOF ;
    public final void entryRulePartialRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:230:1: ( rulePartialRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:231:1: rulePartialRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType427);
            rulePartialRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialRecordType434); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:238:1: rulePartialRecordType : ( ( rule__PartialRecordType__Group__0 ) ) ;
    public final void rulePartialRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:242:2: ( ( ( rule__PartialRecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__PartialRecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__PartialRecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:244:1: ( rule__PartialRecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:1: ( rule__PartialRecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:2: rule__PartialRecordType__Group__0
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType460);
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


    // $ANTLR start "entryRuleRecordType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:257:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:258:1: ( ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:259:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType487);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType494); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:266:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:270:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__RecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:272:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:1: ( rule__RecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType520);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:285:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:286:1: ( ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:287:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant547);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant554); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:294:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:298:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__Constant__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:300:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:1: ( rule__Constant__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant580);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:313:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:314:1: ( ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:315:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty607);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty614); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:322:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:326:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:328:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:1: ( rule__Property__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty640);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:341:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:342:1: ( ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:343:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier667);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier674); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:350:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:354:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:356:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:1: ( rule__Classifier__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0_in_ruleClassifier700);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:369:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:370:1: ( ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:371:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize727);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:378:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:382:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__ArraySize__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:384:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:1: ( rule__ArraySize__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:2: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize760);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:397:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:398:1: ( ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:399:1: ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty787);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty794); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:406:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:410:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:412:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:2: rule__ReferenceProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty820);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:425:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:426:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:427:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral847);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral854); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:434:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:438:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:440:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral880);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:454:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:455:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral907);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral914); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:462:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:466:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:468:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral940);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:481:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:482:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:483:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral967);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral974); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:490:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:494:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:496:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1000);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:509:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:510:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:511:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1027);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1034); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:518:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:522:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:524:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1060);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:537:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:538:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:539:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1087);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:546:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:550:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:552:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1120);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:565:1: entryRuleConstantLiteral : ruleConstantLiteral EOF ;
    public final void entryRuleConstantLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:566:1: ( ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:567:1: ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1147);
            ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:574:1: ruleConstantLiteral : ( ( rule__ConstantLiteral__ValueAssignment ) ) ;
    public final void ruleConstantLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:578:2: ( ( ( rule__ConstantLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:580:1: ( rule__ConstantLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:1: ( rule__ConstantLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:2: rule__ConstantLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1180);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:593:1: rule__Type__Alternatives : ( ( ruleRecordType ) | ( rulePartialRecordType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:597:1: ( ( ruleRecordType ) | ( rulePartialRecordType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24||LA1_0==32) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:598:1: ( ruleRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:598:1: ( ruleRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:599:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives1216);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:604:6: ( rulePartialRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:604:6: ( rulePartialRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:605:1: rulePartialRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPartialRecordTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePartialRecordType_in_rule__Type__Alternatives1233);
                    rulePartialRecordType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getPartialRecordTypeParserRuleCall_1()); 
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


    // $ANTLR start "rule__PartialRecordType__Alternatives_3_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:615:1: rule__PartialRecordType__Alternatives_3_1 : ( ( ( rule__PartialRecordType__PropertiesAssignment_3_1_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_3_1_1 ) ) );
    public final void rule__PartialRecordType__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:619:1: ( ( ( rule__PartialRecordType__PropertiesAssignment_3_1_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_3_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:620:1: ( ( rule__PartialRecordType__PropertiesAssignment_3_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:620:1: ( ( rule__PartialRecordType__PropertiesAssignment_3_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:621:1: ( rule__PartialRecordType__PropertiesAssignment_3_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_3_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:622:1: ( rule__PartialRecordType__PropertiesAssignment_3_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:622:2: rule__PartialRecordType__PropertiesAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__PropertiesAssignment_3_1_0_in_rule__PartialRecordType__Alternatives_3_11265);
                    rule__PartialRecordType__PropertiesAssignment_3_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_3_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:626:6: ( ( rule__PartialRecordType__ConstantsAssignment_3_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:626:6: ( ( rule__PartialRecordType__ConstantsAssignment_3_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:627:1: ( rule__PartialRecordType__ConstantsAssignment_3_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_3_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:628:1: ( rule__PartialRecordType__ConstantsAssignment_3_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:628:2: rule__PartialRecordType__ConstantsAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__ConstantsAssignment_3_1_1_in_rule__PartialRecordType__Alternatives_3_11283);
                    rule__PartialRecordType__ConstantsAssignment_3_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_3_1_1()); 
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
    // $ANTLR end "rule__PartialRecordType__Alternatives_3_1"


    // $ANTLR start "rule__RecordType__Alternatives_5_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:637:1: rule__RecordType__Alternatives_5_1 : ( ( ( rule__RecordType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_5_1_1 ) ) );
    public final void rule__RecordType__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:641:1: ( ( ( rule__RecordType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_5_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==28) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:642:1: ( ( rule__RecordType__PropertiesAssignment_5_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:642:1: ( ( rule__RecordType__PropertiesAssignment_5_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:643:1: ( rule__RecordType__PropertiesAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:644:1: ( rule__RecordType__PropertiesAssignment_5_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:644:2: rule__RecordType__PropertiesAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__PropertiesAssignment_5_1_0_in_rule__RecordType__Alternatives_5_11316);
                    rule__RecordType__PropertiesAssignment_5_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:648:6: ( ( rule__RecordType__ConstantsAssignment_5_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:648:6: ( ( rule__RecordType__ConstantsAssignment_5_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:649:1: ( rule__RecordType__ConstantsAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_5_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:650:1: ( rule__RecordType__ConstantsAssignment_5_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:650:2: rule__RecordType__ConstantsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_rule__RecordType__ConstantsAssignment_5_1_1_in_rule__RecordType__Alternatives_5_11334);
                    rule__RecordType__ConstantsAssignment_5_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getConstantsAssignment_5_1_1()); 
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
    // $ANTLR end "rule__RecordType__Alternatives_5_1"


    // $ANTLR start "rule__Property__Alternatives_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:659:1: rule__Property__Alternatives_0 : ( ( ( rule__Property__TypeAssignment_0_0 ) ) | ( ( rule__Property__Group_0_1__0 ) ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:663:1: ( ( ( rule__Property__TypeAssignment_0_0 ) ) | ( ( rule__Property__Group_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:664:1: ( ( rule__Property__TypeAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:664:1: ( ( rule__Property__TypeAssignment_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:665:1: ( rule__Property__TypeAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getTypeAssignment_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:666:1: ( rule__Property__TypeAssignment_0_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:666:2: rule__Property__TypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Property__TypeAssignment_0_0_in_rule__Property__Alternatives_01367);
                    rule__Property__TypeAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getTypeAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:670:6: ( ( rule__Property__Group_0_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:670:6: ( ( rule__Property__Group_0_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:671:1: ( rule__Property__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_0_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:672:1: ( rule__Property__Group_0_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:672:2: rule__Property__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_0_1__0_in_rule__Property__Alternatives_01385);
                    rule__Property__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_0_1()); 
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
    // $ANTLR end "rule__Property__Alternatives_0"


    // $ANTLR start "rule__Property__Alternatives_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:681:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:685:1: ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:686:1: ( ( rule__Property__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:686:1: ( ( rule__Property__Group_2_0__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:687:1: ( rule__Property__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:688:1: ( rule__Property__Group_2_0__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:688:2: rule__Property__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21418);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:692:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:692:6: ( ( rule__Property__Group_2_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:693:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:694:1: ( rule__Property__Group_2_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:694:2: rule__Property__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21436);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:703:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:707:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) )
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:708:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:708:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:709:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1469);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:714:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:714:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:715:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1486);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:721:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1503);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:726:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:726:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:727:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1520);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:732:6: ( ruleConstantLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:732:6: ( ruleConstantLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:733:1: ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1537);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:745:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:749:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:750:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01567);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01570);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:757:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:761:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:762:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:762:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:763:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl1598); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:776:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:780:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:781:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11629);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11632);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:788:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:792:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:793:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:793:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:794:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:795:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:795:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1659);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:805:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:809:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:810:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21689);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21692);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:817:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:821:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:822:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:822:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:823:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:824:1: ( rule__Model__PackagesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:824:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1719);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:834:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:838:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:839:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31750);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31753);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:846:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:850:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:851:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:851:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:852:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:853:1: ( rule__Model__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:853:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1780);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:863:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:867:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:868:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41811);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:874:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:878:1: ( ( ( rule__Model__TypesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:879:1: ( ( rule__Model__TypesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:879:1: ( ( rule__Model__TypesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:880:1: ( rule__Model__TypesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:881:1: ( rule__Model__TypesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19||LA9_0==24||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:881:2: rule__Model__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1838);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:901:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:905:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:906:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01879);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01882);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:913:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:917:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:918:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:918:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:919:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1910); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:932:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:936:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:937:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11941);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:943:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:947:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:948:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:948:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:949:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:950:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:950:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1968);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:964:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:968:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:969:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02002);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02005);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:976:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:980:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:981:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:981:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:982:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Package__Group__0__Impl2033); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:995:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:999:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1000:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12064);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12067);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1007:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1011:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1012:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1012:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1013:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1014:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1014:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2094);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1024:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1028:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1029:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22124);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1035:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1039:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1040:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1040:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1041:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1042:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1042:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2151);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1058:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1062:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1063:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02187);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02190);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1070:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1074:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1075:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1075:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1076:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2217); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1087:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1091:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1092:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12246);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1098:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1102:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1103:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1103:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1104:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1105:1: ( rule__QualifiedName__Group_1__0 )*
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
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1105:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2273);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1119:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1123:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1124:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02308);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02311);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1131:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1135:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1136:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1136:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1137:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1138:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1139:2: '.'
            {
            match(input,17,FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl2340); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1150:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1154:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1155:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12372);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1161:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1165:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1166:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1166:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1167:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2399); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1182:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1186:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1187:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02432);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02435);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1194:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1198:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1199:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1199:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1200:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2462);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1211:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1215:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1216:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12491);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1222:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1226:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1227:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1227:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1228:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1229:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1229:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2518);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1243:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1247:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1248:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02553);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02556);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1259:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1260:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1260:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1261:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2584); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1274:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1278:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1279:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12615);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1285:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1289:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1290:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1290:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1291:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2643); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1308:1: rule__PartialRecordType__Group__0 : rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 ;
    public final void rule__PartialRecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1312:1: ( rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1313:2: rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02678);
            rule__PartialRecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02681);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1320:1: rule__PartialRecordType__Group__0__Impl : ( 'template' ) ;
    public final void rule__PartialRecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1324:1: ( ( 'template' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1325:1: ( 'template' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1325:1: ( 'template' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1326:1: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getTemplateKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__PartialRecordType__Group__0__Impl2709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getTemplateKeyword_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1339:1: rule__PartialRecordType__Group__1 : rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 ;
    public final void rule__PartialRecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1343:1: ( rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1344:2: rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12740);
            rule__PartialRecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12743);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1351:1: rule__PartialRecordType__Group__1__Impl : ( ( rule__PartialRecordType__NameAssignment_1 ) ) ;
    public final void rule__PartialRecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1355:1: ( ( ( rule__PartialRecordType__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1356:1: ( ( rule__PartialRecordType__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1356:1: ( ( rule__PartialRecordType__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1357:1: ( rule__PartialRecordType__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1358:1: ( rule__PartialRecordType__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1358:2: rule__PartialRecordType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__NameAssignment_1_in_rule__PartialRecordType__Group__1__Impl2770);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1368:1: rule__PartialRecordType__Group__2 : rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 ;
    public final void rule__PartialRecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1372:1: ( rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1373:2: rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22800);
            rule__PartialRecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22803);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1380:1: rule__PartialRecordType__Group__2__Impl : ( ( rule__PartialRecordType__Group_2__0 )? ) ;
    public final void rule__PartialRecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1384:1: ( ( ( rule__PartialRecordType__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1385:1: ( ( rule__PartialRecordType__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1385:1: ( ( rule__PartialRecordType__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1386:1: ( rule__PartialRecordType__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1387:1: ( rule__PartialRecordType__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1387:2: rule__PartialRecordType__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_2__0_in_rule__PartialRecordType__Group__2__Impl2830);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1397:1: rule__PartialRecordType__Group__3 : rule__PartialRecordType__Group__3__Impl ;
    public final void rule__PartialRecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1401:1: ( rule__PartialRecordType__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1402:2: rule__PartialRecordType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32861);
            rule__PartialRecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1408:1: rule__PartialRecordType__Group__3__Impl : ( ( rule__PartialRecordType__Group_3__0 )? ) ;
    public final void rule__PartialRecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1412:1: ( ( ( rule__PartialRecordType__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1413:1: ( ( rule__PartialRecordType__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1413:1: ( ( rule__PartialRecordType__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1414:1: ( rule__PartialRecordType__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1415:1: ( rule__PartialRecordType__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1415:2: rule__PartialRecordType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_3__0_in_rule__PartialRecordType__Group__3__Impl2888);
                    rule__PartialRecordType__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PartialRecordType__Group_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1433:1: rule__PartialRecordType__Group_2__0 : rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1 ;
    public final void rule__PartialRecordType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1437:1: ( rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1438:2: rule__PartialRecordType__Group_2__0__Impl rule__PartialRecordType__Group_2__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__0__Impl_in_rule__PartialRecordType__Group_2__02927);
            rule__PartialRecordType__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__1_in_rule__PartialRecordType__Group_2__02930);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1445:1: rule__PartialRecordType__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PartialRecordType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1449:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1450:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1450:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1451:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getColonKeyword_2_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PartialRecordType__Group_2__0__Impl2958); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1464:1: rule__PartialRecordType__Group_2__1 : rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2 ;
    public final void rule__PartialRecordType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1468:1: ( rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1469:2: rule__PartialRecordType__Group_2__1__Impl rule__PartialRecordType__Group_2__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__1__Impl_in_rule__PartialRecordType__Group_2__12989);
            rule__PartialRecordType__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__2_in_rule__PartialRecordType__Group_2__12992);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1476:1: rule__PartialRecordType__Group_2__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) ) ;
    public final void rule__PartialRecordType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1480:1: ( ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1481:1: ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1481:1: ( ( rule__PartialRecordType__ParentsAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1482:1: ( rule__PartialRecordType__ParentsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1483:1: ( rule__PartialRecordType__ParentsAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1483:2: rule__PartialRecordType__ParentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_2_1_in_rule__PartialRecordType__Group_2__1__Impl3019);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1493:1: rule__PartialRecordType__Group_2__2 : rule__PartialRecordType__Group_2__2__Impl ;
    public final void rule__PartialRecordType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1497:1: ( rule__PartialRecordType__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1498:2: rule__PartialRecordType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2__2__Impl_in_rule__PartialRecordType__Group_2__23049);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1504:1: rule__PartialRecordType__Group_2__2__Impl : ( ( rule__PartialRecordType__Group_2_2__0 )* ) ;
    public final void rule__PartialRecordType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1508:1: ( ( ( rule__PartialRecordType__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1509:1: ( ( rule__PartialRecordType__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1509:1: ( ( rule__PartialRecordType__Group_2_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1510:1: ( rule__PartialRecordType__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1511:1: ( rule__PartialRecordType__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1511:2: rule__PartialRecordType__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__0_in_rule__PartialRecordType__Group_2__2__Impl3076);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1527:1: rule__PartialRecordType__Group_2_2__0 : rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1 ;
    public final void rule__PartialRecordType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1531:1: ( rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1532:2: rule__PartialRecordType__Group_2_2__0__Impl rule__PartialRecordType__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__0__Impl_in_rule__PartialRecordType__Group_2_2__03113);
            rule__PartialRecordType__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__1_in_rule__PartialRecordType__Group_2_2__03116);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1539:1: rule__PartialRecordType__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__PartialRecordType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1543:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1544:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1544:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1545:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PartialRecordType__Group_2_2__0__Impl3144); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1558:1: rule__PartialRecordType__Group_2_2__1 : rule__PartialRecordType__Group_2_2__1__Impl ;
    public final void rule__PartialRecordType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1562:1: ( rule__PartialRecordType__Group_2_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1563:2: rule__PartialRecordType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_2_2__1__Impl_in_rule__PartialRecordType__Group_2_2__13175);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1569:1: rule__PartialRecordType__Group_2_2__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) ) ;
    public final void rule__PartialRecordType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1573:1: ( ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1574:1: ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1574:1: ( ( rule__PartialRecordType__ParentsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1575:1: ( rule__PartialRecordType__ParentsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1576:1: ( rule__PartialRecordType__ParentsAssignment_2_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1576:2: rule__PartialRecordType__ParentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_2_2_1_in_rule__PartialRecordType__Group_2_2__1__Impl3202);
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


    // $ANTLR start "rule__PartialRecordType__Group_3__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1590:1: rule__PartialRecordType__Group_3__0 : rule__PartialRecordType__Group_3__0__Impl rule__PartialRecordType__Group_3__1 ;
    public final void rule__PartialRecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1594:1: ( rule__PartialRecordType__Group_3__0__Impl rule__PartialRecordType__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1595:2: rule__PartialRecordType__Group_3__0__Impl rule__PartialRecordType__Group_3__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_3__0__Impl_in_rule__PartialRecordType__Group_3__03236);
            rule__PartialRecordType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_3__1_in_rule__PartialRecordType__Group_3__03239);
            rule__PartialRecordType__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__0"


    // $ANTLR start "rule__PartialRecordType__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1602:1: rule__PartialRecordType__Group_3__0__Impl : ( '{' ) ;
    public final void rule__PartialRecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1606:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1607:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1607:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1608:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PartialRecordType__Group_3__0__Impl3267); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_3__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1621:1: rule__PartialRecordType__Group_3__1 : rule__PartialRecordType__Group_3__1__Impl rule__PartialRecordType__Group_3__2 ;
    public final void rule__PartialRecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1625:1: ( rule__PartialRecordType__Group_3__1__Impl rule__PartialRecordType__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1626:2: rule__PartialRecordType__Group_3__1__Impl rule__PartialRecordType__Group_3__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_3__1__Impl_in_rule__PartialRecordType__Group_3__13298);
            rule__PartialRecordType__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_3__2_in_rule__PartialRecordType__Group_3__13301);
            rule__PartialRecordType__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__1"


    // $ANTLR start "rule__PartialRecordType__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1633:1: rule__PartialRecordType__Group_3__1__Impl : ( ( rule__PartialRecordType__Alternatives_3_1 )* ) ;
    public final void rule__PartialRecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1637:1: ( ( ( rule__PartialRecordType__Alternatives_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1638:1: ( ( rule__PartialRecordType__Alternatives_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1638:1: ( ( rule__PartialRecordType__Alternatives_3_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1639:1: ( rule__PartialRecordType__Alternatives_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAlternatives_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1640:1: ( rule__PartialRecordType__Alternatives_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==26||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1640:2: rule__PartialRecordType__Alternatives_3_1
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Alternatives_3_1_in_rule__PartialRecordType__Group_3__1__Impl3328);
            	    rule__PartialRecordType__Alternatives_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAlternatives_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_3__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1650:1: rule__PartialRecordType__Group_3__2 : rule__PartialRecordType__Group_3__2__Impl ;
    public final void rule__PartialRecordType__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1654:1: ( rule__PartialRecordType__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1655:2: rule__PartialRecordType__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_3__2__Impl_in_rule__PartialRecordType__Group_3__23359);
            rule__PartialRecordType__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__2"


    // $ANTLR start "rule__PartialRecordType__Group_3__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1661:1: rule__PartialRecordType__Group_3__2__Impl : ( '}' ) ;
    public final void rule__PartialRecordType__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1665:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1666:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1666:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1667:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__PartialRecordType__Group_3__2__Impl3387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_3__2__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1686:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1690:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1691:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03424);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03427);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1698:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__AbstractAssignment_0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1702:1: ( ( ( rule__RecordType__AbstractAssignment_0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1703:1: ( ( rule__RecordType__AbstractAssignment_0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1703:1: ( ( rule__RecordType__AbstractAssignment_0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1704:1: ( rule__RecordType__AbstractAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1705:1: ( rule__RecordType__AbstractAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1705:2: rule__RecordType__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__AbstractAssignment_0_in_rule__RecordType__Group__0__Impl3454);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1715:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1719:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1720:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13485);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13488);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1727:1: rule__RecordType__Group__1__Impl : ( 'entity' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1731:1: ( ( 'entity' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1732:1: ( 'entity' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1732:1: ( 'entity' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1733:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getEntityKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__1__Impl3516); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getEntityKeyword_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1746:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1750:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1751:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23547);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23550);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1758:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__NameAssignment_2 ) ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1762:1: ( ( ( rule__RecordType__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1763:1: ( ( rule__RecordType__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1763:1: ( ( rule__RecordType__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1764:1: ( rule__RecordType__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1765:1: ( rule__RecordType__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1765:2: rule__RecordType__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_2_in_rule__RecordType__Group__2__Impl3577);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1775:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1779:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1780:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33607);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33610);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1787:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )? ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1791:1: ( ( ( rule__RecordType__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1792:1: ( ( rule__RecordType__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1792:1: ( ( rule__RecordType__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1793:1: ( rule__RecordType__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1794:1: ( rule__RecordType__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1794:2: rule__RecordType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_3__0_in_rule__RecordType__Group__3__Impl3637);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1804:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1808:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1809:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43668);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43671);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1816:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__Group_4__0 )? ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1820:1: ( ( ( rule__RecordType__Group_4__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1821:1: ( ( rule__RecordType__Group_4__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1821:1: ( ( rule__RecordType__Group_4__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1822:1: ( rule__RecordType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1823:1: ( rule__RecordType__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1823:2: rule__RecordType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_4__0_in_rule__RecordType__Group__4__Impl3698);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1833:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1837:1: ( rule__RecordType__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1838:2: rule__RecordType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53729);
            rule__RecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1844:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )? ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1848:1: ( ( ( rule__RecordType__Group_5__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1849:1: ( ( rule__RecordType__Group_5__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1849:1: ( ( rule__RecordType__Group_5__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1850:1: ( rule__RecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1851:1: ( rule__RecordType__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1851:2: rule__RecordType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3756);
                    rule__RecordType__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RecordType__Group_3__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1873:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1877:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1878:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_3__0__Impl_in_rule__RecordType__Group_3__03799);
            rule__RecordType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_3__1_in_rule__RecordType__Group_3__03802);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1885:1: rule__RecordType__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1889:1: ( ( 'extends' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1890:1: ( 'extends' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1890:1: ( 'extends' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1891:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_3_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_3__0__Impl3830); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1904:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1908:1: ( rule__RecordType__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1909:2: rule__RecordType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_3__1__Impl_in_rule__RecordType__Group_3__13861);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1915:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__ParentAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1919:1: ( ( ( rule__RecordType__ParentAssignment_3_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1920:1: ( ( rule__RecordType__ParentAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1920:1: ( ( rule__RecordType__ParentAssignment_3_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1921:1: ( rule__RecordType__ParentAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1922:1: ( rule__RecordType__ParentAssignment_3_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1922:2: rule__RecordType__ParentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentAssignment_3_1_in_rule__RecordType__Group_3__1__Impl3888);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1936:1: rule__RecordType__Group_4__0 : rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1 ;
    public final void rule__RecordType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1940:1: ( rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1941:2: rule__RecordType__Group_4__0__Impl rule__RecordType__Group_4__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__0__Impl_in_rule__RecordType__Group_4__03922);
            rule__RecordType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4__1_in_rule__RecordType__Group_4__03925);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1948:1: rule__RecordType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1952:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1953:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1953:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1954:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__RecordType__Group_4__0__Impl3953); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1967:1: rule__RecordType__Group_4__1 : rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2 ;
    public final void rule__RecordType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1971:1: ( rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1972:2: rule__RecordType__Group_4__1__Impl rule__RecordType__Group_4__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__1__Impl_in_rule__RecordType__Group_4__13984);
            rule__RecordType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4__2_in_rule__RecordType__Group_4__13987);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1979:1: rule__RecordType__Group_4__1__Impl : ( ( rule__RecordType__ParentsAssignment_4_1 ) ) ;
    public final void rule__RecordType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1983:1: ( ( ( rule__RecordType__ParentsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1984:1: ( ( rule__RecordType__ParentsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1984:1: ( ( rule__RecordType__ParentsAssignment_4_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1985:1: ( rule__RecordType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1986:1: ( rule__RecordType__ParentsAssignment_4_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1986:2: rule__RecordType__ParentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_4_1_in_rule__RecordType__Group_4__1__Impl4014);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1996:1: rule__RecordType__Group_4__2 : rule__RecordType__Group_4__2__Impl ;
    public final void rule__RecordType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2000:1: ( rule__RecordType__Group_4__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2001:2: rule__RecordType__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4__2__Impl_in_rule__RecordType__Group_4__24044);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2007:1: rule__RecordType__Group_4__2__Impl : ( ( rule__RecordType__Group_4_2__0 )* ) ;
    public final void rule__RecordType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2011:1: ( ( ( rule__RecordType__Group_4_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2012:1: ( ( rule__RecordType__Group_4_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2012:1: ( ( rule__RecordType__Group_4_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2013:1: ( rule__RecordType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2014:1: ( rule__RecordType__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2014:2: rule__RecordType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_4_2__0_in_rule__RecordType__Group_4__2__Impl4071);
            	    rule__RecordType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2030:1: rule__RecordType__Group_4_2__0 : rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1 ;
    public final void rule__RecordType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2034:1: ( rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2035:2: rule__RecordType__Group_4_2__0__Impl rule__RecordType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__0__Impl_in_rule__RecordType__Group_4_2__04108);
            rule__RecordType__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__1_in_rule__RecordType__Group_4_2__04111);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2042:1: rule__RecordType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2046:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2047:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2047:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2048:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_4_2__0__Impl4139); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2061:1: rule__RecordType__Group_4_2__1 : rule__RecordType__Group_4_2__1__Impl ;
    public final void rule__RecordType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2065:1: ( rule__RecordType__Group_4_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2066:2: rule__RecordType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_4_2__1__Impl_in_rule__RecordType__Group_4_2__14170);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2072:1: rule__RecordType__Group_4_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__RecordType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2076:1: ( ( ( rule__RecordType__ParentsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2077:1: ( ( rule__RecordType__ParentsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2077:1: ( ( rule__RecordType__ParentsAssignment_4_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2078:1: ( rule__RecordType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2079:1: ( rule__RecordType__ParentsAssignment_4_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2079:2: rule__RecordType__ParentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_4_2_1_in_rule__RecordType__Group_4_2__1__Impl4197);
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


    // $ANTLR start "rule__RecordType__Group_5__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2093:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2097:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2098:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04231);
            rule__RecordType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04234);
            rule__RecordType__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__0"


    // $ANTLR start "rule__RecordType__Group_5__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2105:1: rule__RecordType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2109:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2110:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2110:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2111:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_5__0__Impl4262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__0__Impl"


    // $ANTLR start "rule__RecordType__Group_5__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2124:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl rule__RecordType__Group_5__2 ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2128:1: ( rule__RecordType__Group_5__1__Impl rule__RecordType__Group_5__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2129:2: rule__RecordType__Group_5__1__Impl rule__RecordType__Group_5__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14293);
            rule__RecordType__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_5__2_in_rule__RecordType__Group_5__14296);
            rule__RecordType__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__1"


    // $ANTLR start "rule__RecordType__Group_5__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2136:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__Alternatives_5_1 )* ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2140:1: ( ( ( rule__RecordType__Alternatives_5_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2141:1: ( ( rule__RecordType__Alternatives_5_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2141:1: ( ( rule__RecordType__Alternatives_5_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2142:1: ( rule__RecordType__Alternatives_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2143:1: ( rule__RecordType__Alternatives_5_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==26||LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2143:2: rule__RecordType__Alternatives_5_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Alternatives_5_1_in_rule__RecordType__Group_5__1__Impl4323);
            	    rule__RecordType__Alternatives_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAlternatives_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__1__Impl"


    // $ANTLR start "rule__RecordType__Group_5__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2153:1: rule__RecordType__Group_5__2 : rule__RecordType__Group_5__2__Impl ;
    public final void rule__RecordType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2157:1: ( rule__RecordType__Group_5__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2158:2: rule__RecordType__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__2__Impl_in_rule__RecordType__Group_5__24354);
            rule__RecordType__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__2"


    // $ANTLR start "rule__RecordType__Group_5__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2164:1: rule__RecordType__Group_5__2__Impl : ( '}' ) ;
    public final void rule__RecordType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2168:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2169:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2169:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2170:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_5__2__Impl4382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_5__2__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2189:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2193:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2194:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04419);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04422);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2201:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2205:1: ( ( 'const' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2206:1: ( 'const' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2206:1: ( 'const' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2207:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Constant__Group__0__Impl4450); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2220:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2224:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2225:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14481);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14484);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2232:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2236:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2237:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2237:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2238:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2239:1: ( rule__Constant__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2239:2: rule__Constant__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl4511);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2249:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2253:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2254:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24541);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24544);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2261:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2265:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2266:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2266:1: ( ( rule__Constant__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2267:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2268:1: ( rule__Constant__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2268:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl4571);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2278:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2282:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2283:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34601);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34604);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2290:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2294:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2295:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2295:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2296:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constant__Group__3__Impl4632); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2309:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2313:1: ( rule__Constant__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2314:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44663);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2320:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2324:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2325:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2325:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2326:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2327:1: ( rule__Constant__ValueAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2327:2: rule__Constant__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl4690);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2347:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2351:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2352:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04730);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04733);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2359:1: rule__Property__Group__0__Impl : ( ( rule__Property__Alternatives_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2363:1: ( ( ( rule__Property__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2364:1: ( ( rule__Property__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2364:1: ( ( rule__Property__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2365:1: ( rule__Property__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2366:1: ( rule__Property__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2366:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__0__Impl4760);
            rule__Property__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2376:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2380:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2381:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14790);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14793);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2388:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2392:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2393:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2393:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2394:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2395:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2395:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl4820);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2405:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2409:1: ( rule__Property__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2410:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24850);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2416:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2420:1: ( ( ( rule__Property__Alternatives_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2421:1: ( ( rule__Property__Alternatives_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2421:1: ( ( rule__Property__Alternatives_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2422:1: ( rule__Property__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2423:1: ( rule__Property__Alternatives_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22||LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2423:2: rule__Property__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl4877);
                    rule__Property__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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


    // $ANTLR start "rule__Property__Group_0_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2439:1: rule__Property__Group_0_1__0 : rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1 ;
    public final void rule__Property__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2443:1: ( rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2444:2: rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__0__Impl_in_rule__Property__Group_0_1__04914);
            rule__Property__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0_1__1_in_rule__Property__Group_0_1__04917);
            rule__Property__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__0"


    // $ANTLR start "rule__Property__Group_0_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2451:1: rule__Property__Group_0_1__0__Impl : ( 'alias' ) ;
    public final void rule__Property__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2455:1: ( ( 'alias' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2456:1: ( 'alias' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2456:1: ( 'alias' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2457:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAliasKeyword_0_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group_0_1__0__Impl4945); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAliasKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__0__Impl"


    // $ANTLR start "rule__Property__Group_0_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2470:1: rule__Property__Group_0_1__1 : rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2 ;
    public final void rule__Property__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2474:1: ( rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2475:2: rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__1__Impl_in_rule__Property__Group_0_1__14976);
            rule__Property__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0_1__2_in_rule__Property__Group_0_1__14979);
            rule__Property__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__1"


    // $ANTLR start "rule__Property__Group_0_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2482:1: rule__Property__Group_0_1__1__Impl : ( ( rule__Property__ReferToAssignment_0_1_1 ) ) ;
    public final void rule__Property__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2486:1: ( ( ( rule__Property__ReferToAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2487:1: ( ( rule__Property__ReferToAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2487:1: ( ( rule__Property__ReferToAssignment_0_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2488:1: ( rule__Property__ReferToAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2489:1: ( rule__Property__ReferToAssignment_0_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2489:2: rule__Property__ReferToAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Property__ReferToAssignment_0_1_1_in_rule__Property__Group_0_1__1__Impl5006);
            rule__Property__ReferToAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__1__Impl"


    // $ANTLR start "rule__Property__Group_0_1__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2499:1: rule__Property__Group_0_1__2 : rule__Property__Group_0_1__2__Impl ;
    public final void rule__Property__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2503:1: ( rule__Property__Group_0_1__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2504:2: rule__Property__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__2__Impl_in_rule__Property__Group_0_1__25036);
            rule__Property__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__2"


    // $ANTLR start "rule__Property__Group_0_1__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2510:1: rule__Property__Group_0_1__2__Impl : ( 'as' ) ;
    public final void rule__Property__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2514:1: ( ( 'as' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2515:1: ( 'as' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2515:1: ( 'as' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2516:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAsKeyword_0_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Property__Group_0_1__2__Impl5064); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAsKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_0_1__2__Impl"


    // $ANTLR start "rule__Property__Group_2_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2535:1: rule__Property__Group_2_0__0 : rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 ;
    public final void rule__Property__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2539:1: ( rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2540:2: rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05101);
            rule__Property__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05104);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2547:1: rule__Property__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2551:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2552:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2552:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2553:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Property__Group_2_0__0__Impl5132); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2566:1: rule__Property__Group_2_0__1 : rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 ;
    public final void rule__Property__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2570:1: ( rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2571:2: rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15163);
            rule__Property__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15166);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2578:1: rule__Property__Group_2_0__1__Impl : ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) ;
    public final void rule__Property__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2582:1: ( ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2583:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2583:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2584:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2585:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2585:2: rule__Property__PropertiesAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5193);
            	    rule__Property__PropertiesAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2595:1: rule__Property__Group_2_0__2 : rule__Property__Group_2_0__2__Impl ;
    public final void rule__Property__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2599:1: ( rule__Property__Group_2_0__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2600:2: rule__Property__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25224);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2606:1: rule__Property__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2610:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2611:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2611:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2612:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Property__Group_2_0__2__Impl5252); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2631:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2635:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2636:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05289);
            rule__Property__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05292);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2643:1: rule__Property__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2647:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2648:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2648:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2649:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Property__Group_2_1__0__Impl5320); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2662:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2666:1: ( rule__Property__Group_2_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2667:2: rule__Property__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15351);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2673:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ValueAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2677:1: ( ( ( rule__Property__ValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2678:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2678:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2679:1: ( rule__Property__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2680:1: ( rule__Property__ValueAssignment_2_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2680:2: rule__Property__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5378);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2694:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2698:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2699:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05412);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05415);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2706:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__Group_0__0 )? ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2710:1: ( ( ( rule__Classifier__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2711:1: ( ( rule__Classifier__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2711:1: ( ( rule__Classifier__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2712:1: ( rule__Classifier__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2713:1: ( rule__Classifier__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==17) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2713:2: rule__Classifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5442);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2723:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2727:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2728:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15473);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15476);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2735:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__ClassAssignment_1 ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2739:1: ( ( ( rule__Classifier__ClassAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2740:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2740:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2741:1: ( rule__Classifier__ClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2742:1: ( rule__Classifier__ClassAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2742:2: rule__Classifier__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5503);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2752:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2756:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2757:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25533);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2763:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__SizesAssignment_2 )* ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2767:1: ( ( ( rule__Classifier__SizesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2768:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2768:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2769:1: ( rule__Classifier__SizesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2770:1: ( rule__Classifier__SizesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2770:2: rule__Classifier__SizesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5560);
            	    rule__Classifier__SizesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2786:1: rule__Classifier__Group_0__0 : rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 ;
    public final void rule__Classifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2790:1: ( rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2791:2: rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05597);
            rule__Classifier__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05600);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2798:1: rule__Classifier__Group_0__0__Impl : ( ( rule__Classifier__PackageAssignment_0_0 ) ) ;
    public final void rule__Classifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2802:1: ( ( ( rule__Classifier__PackageAssignment_0_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2803:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2803:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2804:1: ( rule__Classifier__PackageAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2805:1: ( rule__Classifier__PackageAssignment_0_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2805:2: rule__Classifier__PackageAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5627);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2815:1: rule__Classifier__Group_0__1 : rule__Classifier__Group_0__1__Impl ;
    public final void rule__Classifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2819:1: ( rule__Classifier__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2820:2: rule__Classifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15657);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2826:1: rule__Classifier__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2830:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2831:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2831:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2832:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_0_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__Classifier__Group_0__1__Impl5685); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2849:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2853:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2854:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__05720);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__05723);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2861:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2865:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2866:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2866:1: ( () )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2867:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2868:1: ()
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2870:1: 
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2880:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2884:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2885:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__15781);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__15784);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2892:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2896:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2897:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2897:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2898:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArraySize__Group__1__Impl5812); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2911:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2915:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2916:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__25843);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__25846);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2923:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2927:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2928:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2928:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2929:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2930:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2930:2: rule__ArraySize__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl5873);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2940:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2944:1: ( rule__ArraySize__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2945:2: rule__ArraySize__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__35904);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2951:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2955:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2956:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2956:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2957:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__ArraySize__Group__3__Impl5932); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2978:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2982:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2983:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__05971);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__05974);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2990:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2994:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2995:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2995:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2996:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2997:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2997:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6001);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3007:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3011:1: ( rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3012:2: rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16031);
            rule__ReferenceProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16034);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3019:1: rule__ReferenceProperty__Group__1__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3023:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3024:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3024:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3025:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__ReferenceProperty__Group__1__Impl6062); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3038:1: rule__ReferenceProperty__Group__2 : rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 ;
    public final void rule__ReferenceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3042:1: ( rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3043:2: rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26093);
            rule__ReferenceProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26096);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3050:1: rule__ReferenceProperty__Group__2__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) ;
    public final void rule__ReferenceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3054:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3055:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3055:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3056:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3057:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3057:2: rule__ReferenceProperty__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6123);
            	    rule__ReferenceProperty__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3067:1: rule__ReferenceProperty__Group__3 : rule__ReferenceProperty__Group__3__Impl ;
    public final void rule__ReferenceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3071:1: ( rule__ReferenceProperty__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3072:2: rule__ReferenceProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36154);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3078:1: rule__ReferenceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3082:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3083:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3083:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3084:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__ReferenceProperty__Group__3__Impl6182); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3106:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3110:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3111:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3111:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3112:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16226);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3121:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3125:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3126:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3126:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3127:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_26257);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3136:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3140:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3141:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3141:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3142:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_36288);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3151:1: rule__Model__TypesAssignment_4 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3155:1: ( ( ruleType ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3156:1: ( ruleType )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3156:1: ( ruleType )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3157:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_46319);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3166:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3170:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3171:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3171:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3172:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16350);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3181:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3185:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3186:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3186:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3187:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_16381); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3196:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3200:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3201:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3201:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3202:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3203:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3204:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_26416); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3215:1: rule__PartialRecordType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PartialRecordType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3219:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3220:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3220:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3221:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_16451); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3230:1: rule__PartialRecordType__ParentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3234:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3235:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3235:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3236:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3237:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3238:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_16486);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3249:1: rule__PartialRecordType__ParentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3253:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3254:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3254:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3255:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3256:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3257:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_2_16525);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_2_2_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PartialRecordType__PropertiesAssignment_3_1_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3268:1: rule__PartialRecordType__PropertiesAssignment_3_1_0 : ( ruleProperty ) ;
    public final void rule__PartialRecordType__PropertiesAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3272:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3273:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3273:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3274:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_3_1_06560);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__PropertiesAssignment_3_1_0"


    // $ANTLR start "rule__PartialRecordType__ConstantsAssignment_3_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3283:1: rule__PartialRecordType__ConstantsAssignment_3_1_1 : ( ruleConstant ) ;
    public final void rule__PartialRecordType__ConstantsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3287:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3288:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3288:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3289:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_3_1_16591);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ConstantsAssignment_3_1_1"


    // $ANTLR start "rule__RecordType__AbstractAssignment_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3298:1: rule__RecordType__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3302:1: ( ( ( 'abstract' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3303:1: ( ( 'abstract' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3303:1: ( ( 'abstract' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3304:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3305:1: ( 'abstract' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3306:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_0_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__RecordType__AbstractAssignment_06627); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3321:1: rule__RecordType__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3325:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3326:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3326:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3327:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_26666); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3336:1: rule__RecordType__ParentAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3340:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3341:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3341:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3342:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_3_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3343:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3344:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_3_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_3_16701);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3355:1: rule__RecordType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3359:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3360:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3360:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3361:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3362:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3363:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_16740);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3374:1: rule__RecordType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3378:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3379:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3379:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3380:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3381:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3382:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_2_16779);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_2_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RecordType__PropertiesAssignment_5_1_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3393:1: rule__RecordType__PropertiesAssignment_5_1_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3397:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3398:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3398:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3399:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_5_1_06814);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__PropertiesAssignment_5_1_0"


    // $ANTLR start "rule__RecordType__ConstantsAssignment_5_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3408:1: rule__RecordType__ConstantsAssignment_5_1_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3412:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3413:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3413:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3414:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_5_1_16845);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ConstantsAssignment_5_1_1"


    // $ANTLR start "rule__Constant__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3423:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3427:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3428:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3428:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3429:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_16876);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3438:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3442:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3443:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3443:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3444:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_26907); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3453:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3457:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3458:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3458:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3459:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_46938);
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


    // $ANTLR start "rule__Property__TypeAssignment_0_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3468:1: rule__Property__TypeAssignment_0_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3472:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3473:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3473:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3474:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_0_06969);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_0_0"


    // $ANTLR start "rule__Property__ReferToAssignment_0_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3483:1: rule__Property__ReferToAssignment_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReferToAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3487:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3488:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3488:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3489:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_0_1_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3490:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3491:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_0_1_17004); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_0_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ReferToAssignment_0_1_1"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3502:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3506:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3507:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3507:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3508:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_17039); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3517:1: rule__Property__PropertiesAssignment_2_0_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3521:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3522:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3522:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3523:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_17070);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3532:1: rule__Property__ValueAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3536:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3537:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3537:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3538:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_17101);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3547:1: rule__Classifier__PackageAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3551:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3552:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3552:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3553:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3554:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3555:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_07136); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3566:1: rule__Classifier__ClassAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3570:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3571:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3571:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3572:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3573:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3574:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_17175); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3585:1: rule__Classifier__SizesAssignment_2 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3589:1: ( ( ruleArraySize ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3590:1: ( ruleArraySize )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3590:1: ( ruleArraySize )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3591:1: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_27210);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3600:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3604:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3605:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3605:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3606:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_27241); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3615:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3619:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3620:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3620:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3621:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3622:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3623:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_07276); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3634:1: rule__ReferenceProperty__PropertiesAssignment_2 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3638:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3639:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3639:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3640:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_27311);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3649:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3653:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3654:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3654:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3655:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7342); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3664:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3668:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3669:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3669:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3670:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment7373); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3679:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3683:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3684:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3684:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3685:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment7404); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3694:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3698:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3699:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3699:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3700:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment7435); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3709:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3713:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3714:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3714:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3715:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3716:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3717:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment7470); if (state.failed) return ;
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
    public static final BitSet FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialRecordType434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_rule__Type__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__PropertiesAssignment_3_1_0_in_rule__PartialRecordType__Alternatives_3_11265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ConstantsAssignment_3_1_1_in_rule__PartialRecordType__Alternatives_3_11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__PropertiesAssignment_5_1_0_in_rule__RecordType__Alternatives_5_11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ConstantsAssignment_5_1_1_in_rule__RecordType__Alternatives_5_11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_0_in_rule__Property__Alternatives_01367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__0_in_rule__Property__Alternatives_01385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11629 = new BitSet(new long[]{0x0000000101098000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21689 = new BitSet(new long[]{0x0000000101098000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1719 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31750 = new BitSet(new long[]{0x0000000101098000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1780 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1838 = new BitSet(new long[]{0x0000000101080002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Package__Group__0__Impl2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2273 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedName__Group_1__0__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__02432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__02435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__02553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PartialRecordType__Group__0__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12740 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__NameAssignment_1_in_rule__PartialRecordType__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22800 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__0_in_rule__PartialRecordType__Group__2__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__0_in_rule__PartialRecordType__Group__3__Impl2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__0__Impl_in_rule__PartialRecordType__Group_2__02927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__1_in_rule__PartialRecordType__Group_2__02930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PartialRecordType__Group_2__0__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__1__Impl_in_rule__PartialRecordType__Group_2__12989 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__2_in_rule__PartialRecordType__Group_2__12992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_2_1_in_rule__PartialRecordType__Group_2__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2__2__Impl_in_rule__PartialRecordType__Group_2__23049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__0_in_rule__PartialRecordType__Group_2__2__Impl3076 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__0__Impl_in_rule__PartialRecordType__Group_2_2__03113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__1_in_rule__PartialRecordType__Group_2_2__03116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PartialRecordType__Group_2_2__0__Impl3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_2_2__1__Impl_in_rule__PartialRecordType__Group_2_2__13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_2_2_1_in_rule__PartialRecordType__Group_2_2__1__Impl3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__0__Impl_in_rule__PartialRecordType__Group_3__03236 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__1_in_rule__PartialRecordType__Group_3__03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PartialRecordType__Group_3__0__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__1__Impl_in_rule__PartialRecordType__Group_3__13298 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__2_in_rule__PartialRecordType__Group_3__13301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Alternatives_3_1_in_rule__PartialRecordType__Group_3__1__Impl3328 = new BitSet(new long[]{0x0000000014000012L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_3__2__Impl_in_rule__PartialRecordType__Group_3__23359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PartialRecordType__Group_3__2__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03424 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AbstractAssignment_0_in_rule__RecordType__Group__0__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__1__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23547 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_2_in_rule__RecordType__Group__2__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33607 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__0_in_rule__RecordType__Group__3__Impl3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43668 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__0_in_rule__RecordType__Group__4__Impl3698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__0__Impl_in_rule__RecordType__Group_3__03799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__1_in_rule__RecordType__Group_3__03802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_3__0__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_3__1__Impl_in_rule__RecordType__Group_3__13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentAssignment_3_1_in_rule__RecordType__Group_3__1__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__0__Impl_in_rule__RecordType__Group_4__03922 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__1_in_rule__RecordType__Group_4__03925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group_4__0__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__1__Impl_in_rule__RecordType__Group_4__13984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__2_in_rule__RecordType__Group_4__13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_4_1_in_rule__RecordType__Group_4__1__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4__2__Impl_in_rule__RecordType__Group_4__24044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__0_in_rule__RecordType__Group_4__2__Impl4071 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__0__Impl_in_rule__RecordType__Group_4_2__04108 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__1_in_rule__RecordType__Group_4_2__04111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_4_2__0__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_4_2__1__Impl_in_rule__RecordType__Group_4_2__14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_4_2_1_in_rule__RecordType__Group_4_2__1__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04231 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_5__0__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14293 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__2_in_rule__RecordType__Group_5__14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Alternatives_5_1_in_rule__RecordType__Group_5__1__Impl4323 = new BitSet(new long[]{0x0000000014000012L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__2__Impl_in_rule__RecordType__Group_5__24354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_5__2__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constant__Group__0__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24541 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34601 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constant__Group__3__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__04730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__0__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__14790 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__14793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__24850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__0__Impl_in_rule__Property__Group_0_1__04914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__1_in_rule__Property__Group_0_1__04917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group_0_1__0__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__1__Impl_in_rule__Property__Group_0_1__14976 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__2_in_rule__Property__Group_0_1__14979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ReferToAssignment_0_1_1_in_rule__Property__Group_0_1__1__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__2__Impl_in_rule__Property__Group_0_1__25036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Property__Group_0_1__2__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05101 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Property__Group_2_0__0__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15163 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5193 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group_2_0__2__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05289 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Property__Group_2_1__0__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15473 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5560 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05597 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Classifier__Group_0__1__Impl5685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__05720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__05723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__15781 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__15784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArraySize__Group__1__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__25843 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__25846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__35904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ArraySize__Group__3__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__05971 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__05974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16031 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReferenceProperty__Group__1__Impl6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26093 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6123 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReferenceProperty__Group__3__Impl6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_16226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_26257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_36288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_46319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_16350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_16381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_26416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_16451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_16486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_2_2_16525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_3_1_06560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_3_1_16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RecordType__AbstractAssignment_06627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_26666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_3_16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_16740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_4_2_16779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_5_1_06814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_5_1_16845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_16876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_26907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_46938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_0_06969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_0_1_17004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_17039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_17070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_17101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_07136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_27210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_27241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_07276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_27311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment7435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment7470 = new BitSet(new long[]{0x0000000000000002L});

}
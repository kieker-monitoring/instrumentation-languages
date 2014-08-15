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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'use'", "'template'", "'@author'", "'@since'", "':'", "','", "'{'", "'}'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'.'", "'['", "']'", "'*'", "'abstract'"
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
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=9;
    public static final int T__14=14;
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:145:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:146:1: ( ruleType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:147:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType247);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType254); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:154:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:158:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:159:1: ( ( rule__Type__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:159:1: ( ( rule__Type__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:160:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:161:1: ( rule__Type__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:161:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType280);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:173:1: entryRulePartialRecordType : rulePartialRecordType EOF ;
    public final void entryRulePartialRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:174:1: ( rulePartialRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:175:1: rulePartialRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeRule()); 
            }
            pushFollow(FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType307);
            rulePartialRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartialRecordType314); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:182:1: rulePartialRecordType : ( ( rule__PartialRecordType__Group__0 ) ) ;
    public final void rulePartialRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:186:2: ( ( ( rule__PartialRecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__PartialRecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__PartialRecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:188:1: ( rule__PartialRecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:1: ( rule__PartialRecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:2: rule__PartialRecordType__Group__0
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType340);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:201:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:202:1: ( ruleRecordType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:203:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType367);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType374); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:210:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:214:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:215:1: ( ( rule__RecordType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:215:1: ( ( rule__RecordType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:216:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:217:1: ( rule__RecordType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:217:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0_in_ruleRecordType400);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:229:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:230:1: ( ruleConstant EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:231:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant427);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant434); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:238:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:242:2: ( ( ( rule__Constant__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__Constant__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:243:1: ( ( rule__Constant__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:244:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:1: ( rule__Constant__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:245:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_rule__Constant__Group__0_in_ruleConstant460);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:257:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:258:1: ( ruleProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:259:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty487);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty494); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:266:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:270:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__Property__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:271:1: ( ( rule__Property__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:272:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:1: ( rule__Property__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:273:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty520);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:285:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:286:1: ( ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:287:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier547);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier554); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:294:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:298:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:300:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:1: ( rule__Classifier__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0_in_ruleClassifier580);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:313:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:314:1: ( ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:315:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize607);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize614); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:322:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:326:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__ArraySize__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:328:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:1: ( rule__ArraySize__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:2: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize640);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:341:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:342:1: ( ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:343:1: ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty667);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty674); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:350:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:354:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:356:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:2: rule__ReferenceProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty700);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:369:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:370:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:371:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral727);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:378:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:382:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:384:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral760);
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


    // $ANTLR start "entryRuleArrayLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:397:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:398:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:399:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral787);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:406:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:410:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:412:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral820);
            rule__ArrayLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:425:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:426:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:427:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral847);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral854); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:434:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:438:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:440:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral880);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:453:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:454:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:455:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral907);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral914); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:462:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:466:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:467:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:468:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:469:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral940);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:481:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:482:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:483:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral967);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral974); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:490:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:494:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:495:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:496:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:497:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1000);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:509:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:510:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:511:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1027);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1034); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:518:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:522:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:523:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:524:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:525:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1060);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:537:1: entryRuleConstantLiteral : ruleConstantLiteral EOF ;
    public final void entryRuleConstantLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:538:1: ( ruleConstantLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:539:1: ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1087);
            ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantLiteral1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:546:1: ruleConstantLiteral : ( ( rule__ConstantLiteral__ValueAssignment ) ) ;
    public final void ruleConstantLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:550:2: ( ( ( rule__ConstantLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:551:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:552:1: ( rule__ConstantLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:1: ( rule__ConstantLiteral__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:553:2: rule__ConstantLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1120);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:565:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:566:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:567:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1147);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:574:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:578:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:579:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:580:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:581:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1180);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:593:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:594:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:595:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1207);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:602:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:606:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:608:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1240);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:621:1: rule__Type__Alternatives : ( ( ruleRecordType ) | ( rulePartialRecordType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:625:1: ( ( ruleRecordType ) | ( rulePartialRecordType ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 19:
                        {
                        int LA1_2 = input.LA(4);

                        if ( (LA1_2==RULE_FLOAT) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==17) ) {
                                alt1=2;
                            }
                            else if ( (LA1_6==24||LA1_6==34) ) {
                                alt1=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 17:
                        {
                        alt1=2;
                        }
                        break;
                    case 24:
                    case 34:
                        {
                        alt1=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_FLOAT) ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6==17) ) {
                        alt1=2;
                    }
                    else if ( (LA1_6==24||LA1_6==34) ) {
                        alt1=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 34:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:626:1: ( ruleRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:626:1: ( ruleRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:627:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives1276);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:632:6: ( rulePartialRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:632:6: ( rulePartialRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:633:1: rulePartialRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getPartialRecordTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePartialRecordType_in_rule__Type__Alternatives1293);
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


    // $ANTLR start "rule__PartialRecordType__Alternatives_5_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:643:1: rule__PartialRecordType__Alternatives_5_1 : ( ( ( rule__PartialRecordType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_5_1_1 ) ) );
    public final void rule__PartialRecordType__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:647:1: ( ( ( rule__PartialRecordType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__PartialRecordType__ConstantsAssignment_5_1_1 ) ) )
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:648:1: ( ( rule__PartialRecordType__PropertiesAssignment_5_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:648:1: ( ( rule__PartialRecordType__PropertiesAssignment_5_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:649:1: ( rule__PartialRecordType__PropertiesAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:650:1: ( rule__PartialRecordType__PropertiesAssignment_5_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:650:2: rule__PartialRecordType__PropertiesAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__PropertiesAssignment_5_1_0_in_rule__PartialRecordType__Alternatives_5_11325);
                    rule__PartialRecordType__PropertiesAssignment_5_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:654:6: ( ( rule__PartialRecordType__ConstantsAssignment_5_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:654:6: ( ( rule__PartialRecordType__ConstantsAssignment_5_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:655:1: ( rule__PartialRecordType__ConstantsAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_5_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:656:1: ( rule__PartialRecordType__ConstantsAssignment_5_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:656:2: rule__PartialRecordType__ConstantsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__ConstantsAssignment_5_1_1_in_rule__PartialRecordType__Alternatives_5_11343);
                    rule__PartialRecordType__ConstantsAssignment_5_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPartialRecordTypeAccess().getConstantsAssignment_5_1_1()); 
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
    // $ANTLR end "rule__PartialRecordType__Alternatives_5_1"


    // $ANTLR start "rule__RecordType__Alternatives_7_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:665:1: rule__RecordType__Alternatives_7_1 : ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) );
    public final void rule__RecordType__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:669:1: ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) )
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:670:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:670:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:671:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_7_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:672:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:672:2: rule__RecordType__PropertiesAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__PropertiesAssignment_7_1_0_in_rule__RecordType__Alternatives_7_11376);
                    rule__RecordType__PropertiesAssignment_7_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_7_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:676:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:676:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:677:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_7_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:678:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:678:2: rule__RecordType__ConstantsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_rule__RecordType__ConstantsAssignment_7_1_1_in_rule__RecordType__Alternatives_7_11394);
                    rule__RecordType__ConstantsAssignment_7_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRecordTypeAccess().getConstantsAssignment_7_1_1()); 
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
    // $ANTLR end "rule__RecordType__Alternatives_7_1"


    // $ANTLR start "rule__Property__Alternatives_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:687:1: rule__Property__Alternatives_0 : ( ( ( rule__Property__TypeAssignment_0_0 ) ) | ( ( rule__Property__Group_0_1__0 ) ) );
    public final void rule__Property__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:691:1: ( ( ( rule__Property__TypeAssignment_0_0 ) ) | ( ( rule__Property__Group_0_1__0 ) ) )
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:692:1: ( ( rule__Property__TypeAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:692:1: ( ( rule__Property__TypeAssignment_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:693:1: ( rule__Property__TypeAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getTypeAssignment_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:694:1: ( rule__Property__TypeAssignment_0_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:694:2: rule__Property__TypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Property__TypeAssignment_0_0_in_rule__Property__Alternatives_01427);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:698:6: ( ( rule__Property__Group_0_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:698:6: ( ( rule__Property__Group_0_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:699:1: ( rule__Property__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_0_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:700:1: ( rule__Property__Group_0_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:700:2: rule__Property__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_0_1__0_in_rule__Property__Alternatives_01445);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:709:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:713:1: ( ( ( rule__Property__Group_2_0__0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:714:1: ( ( rule__Property__Group_2_0__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:714:1: ( ( rule__Property__Group_2_0__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:715:1: ( rule__Property__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:716:1: ( rule__Property__Group_2_0__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:716:2: rule__Property__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21478);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:720:6: ( ( rule__Property__Group_2_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:721:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:722:1: ( rule__Property__Group_2_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:722:2: rule__Property__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21496);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:731:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:735:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) )
            int alt6=6;
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
            case 22:
                {
                alt6=6;
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:736:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:736:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:737:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1529);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:742:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:742:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:743:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1546);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:748:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:748:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:749:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1563);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:754:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:754:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:755:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1580);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:760:6: ( ruleConstantLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:760:6: ( ruleConstantLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:761:1: ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1597);
                    ruleConstantLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:766:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:766:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:767:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives1614);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:779:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:783:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:784:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01644);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01647);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:791:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:795:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:796:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:796:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:797:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl1675); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:810:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:814:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:815:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11706);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11709);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:822:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:826:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:827:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:827:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:828:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:829:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:829:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1736);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:839:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:843:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:844:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21766);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21769);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:851:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:855:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:856:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:856:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:857:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:858:1: ( rule__Model__PackagesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:858:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1796);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:868:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:872:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:873:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31827);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31830);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:880:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:884:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:885:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:885:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:886:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:887:1: ( rule__Model__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:887:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1857);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:897:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:901:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:902:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41888);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:908:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:912:1: ( ( ( rule__Model__TypesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:913:1: ( ( rule__Model__TypesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:913:1: ( ( rule__Model__TypesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:914:1: ( rule__Model__TypesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:915:1: ( rule__Model__TypesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=17 && LA9_0<=19)||LA9_0==24||LA9_0==34) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:915:2: rule__Model__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1915);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:935:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:939:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:940:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01956);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01959);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:947:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:951:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:952:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:952:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:953:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Import__Group__0__Impl1987); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:966:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:970:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:971:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12018);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:977:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:981:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:982:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:982:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:983:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:984:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:984:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2045);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:998:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1002:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1003:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02079);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02082);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1010:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1014:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1015:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1015:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1016:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Package__Group__0__Impl2110); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1029:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1033:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1034:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12141);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12144);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1041:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1045:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1046:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1046:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1047:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1048:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1048:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2171);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1058:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1062:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1063:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22201);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1069:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1073:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1074:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1074:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1075:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1076:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1076:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2228);
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


    // $ANTLR start "rule__PartialRecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1092:1: rule__PartialRecordType__Group__0 : rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 ;
    public final void rule__PartialRecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1096:1: ( rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1097:2: rule__PartialRecordType__Group__0__Impl rule__PartialRecordType__Group__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02264);
            rule__PartialRecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02267);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1104:1: rule__PartialRecordType__Group__0__Impl : ( ( rule__PartialRecordType__Group_0__0 )? ) ;
    public final void rule__PartialRecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1108:1: ( ( ( rule__PartialRecordType__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1109:1: ( ( rule__PartialRecordType__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1109:1: ( ( rule__PartialRecordType__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1110:1: ( rule__PartialRecordType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1111:1: ( rule__PartialRecordType__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1111:2: rule__PartialRecordType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_0__0_in_rule__PartialRecordType__Group__0__Impl2294);
                    rule__PartialRecordType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1121:1: rule__PartialRecordType__Group__1 : rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 ;
    public final void rule__PartialRecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1125:1: ( rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1126:2: rule__PartialRecordType__Group__1__Impl rule__PartialRecordType__Group__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12325);
            rule__PartialRecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12328);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1133:1: rule__PartialRecordType__Group__1__Impl : ( ( rule__PartialRecordType__Group_1__0 )? ) ;
    public final void rule__PartialRecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1137:1: ( ( ( rule__PartialRecordType__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1138:1: ( ( rule__PartialRecordType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1138:1: ( ( rule__PartialRecordType__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1139:1: ( rule__PartialRecordType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1140:1: ( rule__PartialRecordType__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1140:2: rule__PartialRecordType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_1__0_in_rule__PartialRecordType__Group__1__Impl2355);
                    rule__PartialRecordType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1150:1: rule__PartialRecordType__Group__2 : rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 ;
    public final void rule__PartialRecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1154:1: ( rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1155:2: rule__PartialRecordType__Group__2__Impl rule__PartialRecordType__Group__3
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22386);
            rule__PartialRecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22389);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1162:1: rule__PartialRecordType__Group__2__Impl : ( 'template' ) ;
    public final void rule__PartialRecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1166:1: ( ( 'template' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1167:1: ( 'template' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1167:1: ( 'template' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1168:1: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getTemplateKeyword_2()); 
            }
            match(input,17,FOLLOW_17_in_rule__PartialRecordType__Group__2__Impl2417); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getTemplateKeyword_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1181:1: rule__PartialRecordType__Group__3 : rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4 ;
    public final void rule__PartialRecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1185:1: ( rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1186:2: rule__PartialRecordType__Group__3__Impl rule__PartialRecordType__Group__4
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32448);
            rule__PartialRecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__4_in_rule__PartialRecordType__Group__32451);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1193:1: rule__PartialRecordType__Group__3__Impl : ( ( rule__PartialRecordType__NameAssignment_3 ) ) ;
    public final void rule__PartialRecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1197:1: ( ( ( rule__PartialRecordType__NameAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1198:1: ( ( rule__PartialRecordType__NameAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1198:1: ( ( rule__PartialRecordType__NameAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1199:1: ( rule__PartialRecordType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1200:1: ( rule__PartialRecordType__NameAssignment_3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1200:2: rule__PartialRecordType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__PartialRecordType__NameAssignment_3_in_rule__PartialRecordType__Group__3__Impl2478);
            rule__PartialRecordType__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getNameAssignment_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1210:1: rule__PartialRecordType__Group__4 : rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5 ;
    public final void rule__PartialRecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1214:1: ( rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1215:2: rule__PartialRecordType__Group__4__Impl rule__PartialRecordType__Group__5
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__4__Impl_in_rule__PartialRecordType__Group__42508);
            rule__PartialRecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group__5_in_rule__PartialRecordType__Group__42511);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1222:1: rule__PartialRecordType__Group__4__Impl : ( ( rule__PartialRecordType__Group_4__0 )? ) ;
    public final void rule__PartialRecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1226:1: ( ( ( rule__PartialRecordType__Group_4__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1227:1: ( ( rule__PartialRecordType__Group_4__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1227:1: ( ( rule__PartialRecordType__Group_4__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1228:1: ( rule__PartialRecordType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1229:1: ( rule__PartialRecordType__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1229:2: rule__PartialRecordType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_4__0_in_rule__PartialRecordType__Group__4__Impl2538);
                    rule__PartialRecordType__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1239:1: rule__PartialRecordType__Group__5 : rule__PartialRecordType__Group__5__Impl ;
    public final void rule__PartialRecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1243:1: ( rule__PartialRecordType__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1244:2: rule__PartialRecordType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group__5__Impl_in_rule__PartialRecordType__Group__52569);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1250:1: rule__PartialRecordType__Group__5__Impl : ( ( rule__PartialRecordType__Group_5__0 )? ) ;
    public final void rule__PartialRecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1254:1: ( ( ( rule__PartialRecordType__Group_5__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: ( ( rule__PartialRecordType__Group_5__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: ( ( rule__PartialRecordType__Group_5__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1256:1: ( rule__PartialRecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1257:1: ( rule__PartialRecordType__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1257:2: rule__PartialRecordType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__PartialRecordType__Group_5__0_in_rule__PartialRecordType__Group__5__Impl2596);
                    rule__PartialRecordType__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PartialRecordType__Group_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1279:1: rule__PartialRecordType__Group_0__0 : rule__PartialRecordType__Group_0__0__Impl rule__PartialRecordType__Group_0__1 ;
    public final void rule__PartialRecordType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1283:1: ( rule__PartialRecordType__Group_0__0__Impl rule__PartialRecordType__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1284:2: rule__PartialRecordType__Group_0__0__Impl rule__PartialRecordType__Group_0__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_0__0__Impl_in_rule__PartialRecordType__Group_0__02639);
            rule__PartialRecordType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_0__1_in_rule__PartialRecordType__Group_0__02642);
            rule__PartialRecordType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_0__0"


    // $ANTLR start "rule__PartialRecordType__Group_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1291:1: rule__PartialRecordType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__PartialRecordType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1295:1: ( ( '@author' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1296:1: ( '@author' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1296:1: ( '@author' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1297:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__PartialRecordType__Group_0__0__Impl2670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAuthorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_0__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1310:1: rule__PartialRecordType__Group_0__1 : rule__PartialRecordType__Group_0__1__Impl ;
    public final void rule__PartialRecordType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1314:1: ( rule__PartialRecordType__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1315:2: rule__PartialRecordType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_0__1__Impl_in_rule__PartialRecordType__Group_0__12701);
            rule__PartialRecordType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_0__1"


    // $ANTLR start "rule__PartialRecordType__Group_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1321:1: rule__PartialRecordType__Group_0__1__Impl : ( ( rule__PartialRecordType__AuthorAssignment_0_1 ) ) ;
    public final void rule__PartialRecordType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1325:1: ( ( ( rule__PartialRecordType__AuthorAssignment_0_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1326:1: ( ( rule__PartialRecordType__AuthorAssignment_0_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1326:1: ( ( rule__PartialRecordType__AuthorAssignment_0_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1327:1: ( rule__PartialRecordType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAuthorAssignment_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1328:1: ( rule__PartialRecordType__AuthorAssignment_0_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1328:2: rule__PartialRecordType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__AuthorAssignment_0_1_in_rule__PartialRecordType__Group_0__1__Impl2728);
            rule__PartialRecordType__AuthorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAuthorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_0__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1342:1: rule__PartialRecordType__Group_1__0 : rule__PartialRecordType__Group_1__0__Impl rule__PartialRecordType__Group_1__1 ;
    public final void rule__PartialRecordType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1346:1: ( rule__PartialRecordType__Group_1__0__Impl rule__PartialRecordType__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1347:2: rule__PartialRecordType__Group_1__0__Impl rule__PartialRecordType__Group_1__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_1__0__Impl_in_rule__PartialRecordType__Group_1__02762);
            rule__PartialRecordType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_1__1_in_rule__PartialRecordType__Group_1__02765);
            rule__PartialRecordType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_1__0"


    // $ANTLR start "rule__PartialRecordType__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1354:1: rule__PartialRecordType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__PartialRecordType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1358:1: ( ( '@since' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1359:1: ( '@since' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1359:1: ( '@since' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1360:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__PartialRecordType__Group_1__0__Impl2793); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getSinceKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_1__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1373:1: rule__PartialRecordType__Group_1__1 : rule__PartialRecordType__Group_1__1__Impl ;
    public final void rule__PartialRecordType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1377:1: ( rule__PartialRecordType__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1378:2: rule__PartialRecordType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_1__1__Impl_in_rule__PartialRecordType__Group_1__12824);
            rule__PartialRecordType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_1__1"


    // $ANTLR start "rule__PartialRecordType__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1384:1: rule__PartialRecordType__Group_1__1__Impl : ( ( rule__PartialRecordType__SinceAssignment_1_1 ) ) ;
    public final void rule__PartialRecordType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1388:1: ( ( ( rule__PartialRecordType__SinceAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1389:1: ( ( rule__PartialRecordType__SinceAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1389:1: ( ( rule__PartialRecordType__SinceAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1390:1: ( rule__PartialRecordType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getSinceAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1391:1: ( rule__PartialRecordType__SinceAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1391:2: rule__PartialRecordType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__SinceAssignment_1_1_in_rule__PartialRecordType__Group_1__1__Impl2851);
            rule__PartialRecordType__SinceAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getSinceAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_1__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_4__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1405:1: rule__PartialRecordType__Group_4__0 : rule__PartialRecordType__Group_4__0__Impl rule__PartialRecordType__Group_4__1 ;
    public final void rule__PartialRecordType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1409:1: ( rule__PartialRecordType__Group_4__0__Impl rule__PartialRecordType__Group_4__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1410:2: rule__PartialRecordType__Group_4__0__Impl rule__PartialRecordType__Group_4__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4__0__Impl_in_rule__PartialRecordType__Group_4__02885);
            rule__PartialRecordType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4__1_in_rule__PartialRecordType__Group_4__02888);
            rule__PartialRecordType__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__0"


    // $ANTLR start "rule__PartialRecordType__Group_4__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1417:1: rule__PartialRecordType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__PartialRecordType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1421:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1422:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1422:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1423:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PartialRecordType__Group_4__0__Impl2916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_4__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1436:1: rule__PartialRecordType__Group_4__1 : rule__PartialRecordType__Group_4__1__Impl rule__PartialRecordType__Group_4__2 ;
    public final void rule__PartialRecordType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1440:1: ( rule__PartialRecordType__Group_4__1__Impl rule__PartialRecordType__Group_4__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1441:2: rule__PartialRecordType__Group_4__1__Impl rule__PartialRecordType__Group_4__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4__1__Impl_in_rule__PartialRecordType__Group_4__12947);
            rule__PartialRecordType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4__2_in_rule__PartialRecordType__Group_4__12950);
            rule__PartialRecordType__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__1"


    // $ANTLR start "rule__PartialRecordType__Group_4__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1448:1: rule__PartialRecordType__Group_4__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_4_1 ) ) ;
    public final void rule__PartialRecordType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1452:1: ( ( ( rule__PartialRecordType__ParentsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1453:1: ( ( rule__PartialRecordType__ParentsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1453:1: ( ( rule__PartialRecordType__ParentsAssignment_4_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1454:1: ( rule__PartialRecordType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1455:1: ( rule__PartialRecordType__ParentsAssignment_4_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1455:2: rule__PartialRecordType__ParentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_4_1_in_rule__PartialRecordType__Group_4__1__Impl2977);
            rule__PartialRecordType__ParentsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_4__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1465:1: rule__PartialRecordType__Group_4__2 : rule__PartialRecordType__Group_4__2__Impl ;
    public final void rule__PartialRecordType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1469:1: ( rule__PartialRecordType__Group_4__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1470:2: rule__PartialRecordType__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4__2__Impl_in_rule__PartialRecordType__Group_4__23007);
            rule__PartialRecordType__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__2"


    // $ANTLR start "rule__PartialRecordType__Group_4__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1476:1: rule__PartialRecordType__Group_4__2__Impl : ( ( rule__PartialRecordType__Group_4_2__0 )* ) ;
    public final void rule__PartialRecordType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1480:1: ( ( ( rule__PartialRecordType__Group_4_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1481:1: ( ( rule__PartialRecordType__Group_4_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1481:1: ( ( rule__PartialRecordType__Group_4_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1482:1: ( rule__PartialRecordType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1483:1: ( rule__PartialRecordType__Group_4_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1483:2: rule__PartialRecordType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Group_4_2__0_in_rule__PartialRecordType__Group_4__2__Impl3034);
            	    rule__PartialRecordType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4__2__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_4_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1499:1: rule__PartialRecordType__Group_4_2__0 : rule__PartialRecordType__Group_4_2__0__Impl rule__PartialRecordType__Group_4_2__1 ;
    public final void rule__PartialRecordType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1503:1: ( rule__PartialRecordType__Group_4_2__0__Impl rule__PartialRecordType__Group_4_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1504:2: rule__PartialRecordType__Group_4_2__0__Impl rule__PartialRecordType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4_2__0__Impl_in_rule__PartialRecordType__Group_4_2__03071);
            rule__PartialRecordType__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4_2__1_in_rule__PartialRecordType__Group_4_2__03074);
            rule__PartialRecordType__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4_2__0"


    // $ANTLR start "rule__PartialRecordType__Group_4_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1511:1: rule__PartialRecordType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__PartialRecordType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1515:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1516:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1516:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1517:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__PartialRecordType__Group_4_2__0__Impl3102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4_2__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_4_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1530:1: rule__PartialRecordType__Group_4_2__1 : rule__PartialRecordType__Group_4_2__1__Impl ;
    public final void rule__PartialRecordType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1534:1: ( rule__PartialRecordType__Group_4_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1535:2: rule__PartialRecordType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_4_2__1__Impl_in_rule__PartialRecordType__Group_4_2__13133);
            rule__PartialRecordType__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4_2__1"


    // $ANTLR start "rule__PartialRecordType__Group_4_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1541:1: rule__PartialRecordType__Group_4_2__1__Impl : ( ( rule__PartialRecordType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__PartialRecordType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1545:1: ( ( ( rule__PartialRecordType__ParentsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1546:1: ( ( rule__PartialRecordType__ParentsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1546:1: ( ( rule__PartialRecordType__ParentsAssignment_4_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1547:1: ( rule__PartialRecordType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1548:1: ( rule__PartialRecordType__ParentsAssignment_4_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1548:2: rule__PartialRecordType__ParentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__ParentsAssignment_4_2_1_in_rule__PartialRecordType__Group_4_2__1__Impl3160);
            rule__PartialRecordType__ParentsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_4_2__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_5__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1562:1: rule__PartialRecordType__Group_5__0 : rule__PartialRecordType__Group_5__0__Impl rule__PartialRecordType__Group_5__1 ;
    public final void rule__PartialRecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1566:1: ( rule__PartialRecordType__Group_5__0__Impl rule__PartialRecordType__Group_5__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1567:2: rule__PartialRecordType__Group_5__0__Impl rule__PartialRecordType__Group_5__1
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_5__0__Impl_in_rule__PartialRecordType__Group_5__03194);
            rule__PartialRecordType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_5__1_in_rule__PartialRecordType__Group_5__03197);
            rule__PartialRecordType__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__0"


    // $ANTLR start "rule__PartialRecordType__Group_5__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1574:1: rule__PartialRecordType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__PartialRecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1578:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1579:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1579:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1580:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__PartialRecordType__Group_5__0__Impl3225); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__0__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_5__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1593:1: rule__PartialRecordType__Group_5__1 : rule__PartialRecordType__Group_5__1__Impl rule__PartialRecordType__Group_5__2 ;
    public final void rule__PartialRecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1597:1: ( rule__PartialRecordType__Group_5__1__Impl rule__PartialRecordType__Group_5__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1598:2: rule__PartialRecordType__Group_5__1__Impl rule__PartialRecordType__Group_5__2
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_5__1__Impl_in_rule__PartialRecordType__Group_5__13256);
            rule__PartialRecordType__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PartialRecordType__Group_5__2_in_rule__PartialRecordType__Group_5__13259);
            rule__PartialRecordType__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__1"


    // $ANTLR start "rule__PartialRecordType__Group_5__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1605:1: rule__PartialRecordType__Group_5__1__Impl : ( ( rule__PartialRecordType__Alternatives_5_1 )* ) ;
    public final void rule__PartialRecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1609:1: ( ( ( rule__PartialRecordType__Alternatives_5_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1610:1: ( ( rule__PartialRecordType__Alternatives_5_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1610:1: ( ( rule__PartialRecordType__Alternatives_5_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1611:1: ( rule__PartialRecordType__Alternatives_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAlternatives_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1612:1: ( rule__PartialRecordType__Alternatives_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==26||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1612:2: rule__PartialRecordType__Alternatives_5_1
            	    {
            	    pushFollow(FOLLOW_rule__PartialRecordType__Alternatives_5_1_in_rule__PartialRecordType__Group_5__1__Impl3286);
            	    rule__PartialRecordType__Alternatives_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAlternatives_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__1__Impl"


    // $ANTLR start "rule__PartialRecordType__Group_5__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1622:1: rule__PartialRecordType__Group_5__2 : rule__PartialRecordType__Group_5__2__Impl ;
    public final void rule__PartialRecordType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1626:1: ( rule__PartialRecordType__Group_5__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1627:2: rule__PartialRecordType__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__PartialRecordType__Group_5__2__Impl_in_rule__PartialRecordType__Group_5__23317);
            rule__PartialRecordType__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__2"


    // $ANTLR start "rule__PartialRecordType__Group_5__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1633:1: rule__PartialRecordType__Group_5__2__Impl : ( '}' ) ;
    public final void rule__PartialRecordType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1637:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1638:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1638:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1639:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__PartialRecordType__Group_5__2__Impl3345); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__Group_5__2__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1658:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1662:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1663:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03382);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03385);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1670:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__Group_0__0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1674:1: ( ( ( rule__RecordType__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1675:1: ( ( rule__RecordType__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1675:1: ( ( rule__RecordType__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1676:1: ( rule__RecordType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1677:1: ( rule__RecordType__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1677:2: rule__RecordType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_0__0_in_rule__RecordType__Group__0__Impl3412);
                    rule__RecordType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1687:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1691:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1692:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13443);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13446);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1699:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__Group_1__0 )? ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1703:1: ( ( ( rule__RecordType__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1704:1: ( ( rule__RecordType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1704:1: ( ( rule__RecordType__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1705:1: ( rule__RecordType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1706:1: ( rule__RecordType__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1706:2: rule__RecordType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_1__0_in_rule__RecordType__Group__1__Impl3473);
                    rule__RecordType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1716:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1720:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1721:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23504);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23507);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1728:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__AbstractAssignment_2 )? ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1732:1: ( ( ( rule__RecordType__AbstractAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1733:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1733:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1734:1: ( rule__RecordType__AbstractAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1735:1: ( rule__RecordType__AbstractAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1735:2: rule__RecordType__AbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RecordType__AbstractAssignment_2_in_rule__RecordType__Group__2__Impl3534);
                    rule__RecordType__AbstractAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1745:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1749:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1750:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33565);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33568);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1757:1: rule__RecordType__Group__3__Impl : ( 'entity' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1761:1: ( ( 'entity' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1762:1: ( 'entity' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1762:1: ( 'entity' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1763:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getEntityKeyword_3()); 
            }
            match(input,24,FOLLOW_24_in_rule__RecordType__Group__3__Impl3596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getEntityKeyword_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1776:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1780:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1781:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43627);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43630);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1788:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__NameAssignment_4 ) ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1792:1: ( ( ( rule__RecordType__NameAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1793:1: ( ( rule__RecordType__NameAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1793:1: ( ( rule__RecordType__NameAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1794:1: ( rule__RecordType__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1795:1: ( rule__RecordType__NameAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1795:2: rule__RecordType__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_4_in_rule__RecordType__Group__4__Impl3657);
            rule__RecordType__NameAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameAssignment_4()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1805:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1809:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1810:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53687);
            rule__RecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53690);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1817:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )? ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1821:1: ( ( ( rule__RecordType__Group_5__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1822:1: ( ( rule__RecordType__Group_5__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1822:1: ( ( rule__RecordType__Group_5__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1823:1: ( rule__RecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1824:1: ( rule__RecordType__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1824:2: rule__RecordType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3717);
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


    // $ANTLR start "rule__RecordType__Group__6"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1834:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1838:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1839:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63748);
            rule__RecordType__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63751);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1846:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__Group_6__0 )? ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1850:1: ( ( ( rule__RecordType__Group_6__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1851:1: ( ( rule__RecordType__Group_6__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1851:1: ( ( rule__RecordType__Group_6__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1852:1: ( rule__RecordType__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1853:1: ( rule__RecordType__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1853:2: rule__RecordType__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_6__0_in_rule__RecordType__Group__6__Impl3778);
                    rule__RecordType__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_6()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1863:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1867:1: ( rule__RecordType__Group__7__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1868:2: rule__RecordType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73809);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1874:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )? ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1878:1: ( ( ( rule__RecordType__Group_7__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1879:1: ( ( rule__RecordType__Group_7__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1879:1: ( ( rule__RecordType__Group_7__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1880:1: ( rule__RecordType__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1881:1: ( rule__RecordType__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1881:2: rule__RecordType__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_7__0_in_rule__RecordType__Group__7__Impl3836);
                    rule__RecordType__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RecordType__Group_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1907:1: rule__RecordType__Group_0__0 : rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 ;
    public final void rule__RecordType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1911:1: ( rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1912:2: rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_0__0__Impl_in_rule__RecordType__Group_0__03883);
            rule__RecordType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_0__1_in_rule__RecordType__Group_0__03886);
            rule__RecordType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_0__0"


    // $ANTLR start "rule__RecordType__Group_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1919:1: rule__RecordType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__RecordType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1923:1: ( ( '@author' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1924:1: ( '@author' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1924:1: ( '@author' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1925:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__RecordType__Group_0__0__Impl3914); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_0__0__Impl"


    // $ANTLR start "rule__RecordType__Group_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1938:1: rule__RecordType__Group_0__1 : rule__RecordType__Group_0__1__Impl ;
    public final void rule__RecordType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1942:1: ( rule__RecordType__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1943:2: rule__RecordType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_0__1__Impl_in_rule__RecordType__Group_0__13945);
            rule__RecordType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_0__1"


    // $ANTLR start "rule__RecordType__Group_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1949:1: rule__RecordType__Group_0__1__Impl : ( ( rule__RecordType__AuthorAssignment_0_1 ) ) ;
    public final void rule__RecordType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1953:1: ( ( ( rule__RecordType__AuthorAssignment_0_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1954:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1954:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1955:1: ( rule__RecordType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorAssignment_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1956:1: ( rule__RecordType__AuthorAssignment_0_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1956:2: rule__RecordType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RecordType__AuthorAssignment_0_1_in_rule__RecordType__Group_0__1__Impl3972);
            rule__RecordType__AuthorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAuthorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_0__1__Impl"


    // $ANTLR start "rule__RecordType__Group_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1970:1: rule__RecordType__Group_1__0 : rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 ;
    public final void rule__RecordType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1974:1: ( rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1975:2: rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_1__0__Impl_in_rule__RecordType__Group_1__04006);
            rule__RecordType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_1__1_in_rule__RecordType__Group_1__04009);
            rule__RecordType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_1__0"


    // $ANTLR start "rule__RecordType__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1982:1: rule__RecordType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__RecordType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1986:1: ( ( '@since' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1987:1: ( '@since' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1987:1: ( '@since' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1988:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RecordType__Group_1__0__Impl4037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_1__0__Impl"


    // $ANTLR start "rule__RecordType__Group_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2001:1: rule__RecordType__Group_1__1 : rule__RecordType__Group_1__1__Impl ;
    public final void rule__RecordType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2005:1: ( rule__RecordType__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2006:2: rule__RecordType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_1__1__Impl_in_rule__RecordType__Group_1__14068);
            rule__RecordType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_1__1"


    // $ANTLR start "rule__RecordType__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2012:1: rule__RecordType__Group_1__1__Impl : ( ( rule__RecordType__SinceAssignment_1_1 ) ) ;
    public final void rule__RecordType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2016:1: ( ( ( rule__RecordType__SinceAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2017:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2017:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2018:1: ( rule__RecordType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2019:1: ( rule__RecordType__SinceAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2019:2: rule__RecordType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordType__SinceAssignment_1_1_in_rule__RecordType__Group_1__1__Impl4095);
            rule__RecordType__SinceAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getSinceAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_1__1__Impl"


    // $ANTLR start "rule__RecordType__Group_5__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2033:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2037:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2038:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04129);
            rule__RecordType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04132);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2045:1: rule__RecordType__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2049:1: ( ( 'extends' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2050:1: ( 'extends' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2050:1: ( 'extends' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2051:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_5__0__Impl4160); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2064:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2068:1: ( rule__RecordType__Group_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2069:2: rule__RecordType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14191);
            rule__RecordType__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2075:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__ParentAssignment_5_1 ) ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2079:1: ( ( ( rule__RecordType__ParentAssignment_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2080:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2080:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2081:1: ( rule__RecordType__ParentAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2082:1: ( rule__RecordType__ParentAssignment_5_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2082:2: rule__RecordType__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentAssignment_5_1_in_rule__RecordType__Group_5__1__Impl4218);
            rule__RecordType__ParentAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentAssignment_5_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__RecordType__Group_6__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2096:1: rule__RecordType__Group_6__0 : rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 ;
    public final void rule__RecordType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2100:1: ( rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2101:2: rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__0__Impl_in_rule__RecordType__Group_6__04252);
            rule__RecordType__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6__1_in_rule__RecordType__Group_6__04255);
            rule__RecordType__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__0"


    // $ANTLR start "rule__RecordType__Group_6__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2108:1: rule__RecordType__Group_6__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2112:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2113:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2113:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2114:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_6_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__RecordType__Group_6__0__Impl4283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getColonKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__0__Impl"


    // $ANTLR start "rule__RecordType__Group_6__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2127:1: rule__RecordType__Group_6__1 : rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 ;
    public final void rule__RecordType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2131:1: ( rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2132:2: rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__1__Impl_in_rule__RecordType__Group_6__14314);
            rule__RecordType__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6__2_in_rule__RecordType__Group_6__14317);
            rule__RecordType__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__1"


    // $ANTLR start "rule__RecordType__Group_6__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2139:1: rule__RecordType__Group_6__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_1 ) ) ;
    public final void rule__RecordType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2143:1: ( ( ( rule__RecordType__ParentsAssignment_6_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2144:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2144:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2145:1: ( rule__RecordType__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2146:1: ( rule__RecordType__ParentsAssignment_6_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2146:2: rule__RecordType__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_6_1_in_rule__RecordType__Group_6__1__Impl4344);
            rule__RecordType__ParentsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__1__Impl"


    // $ANTLR start "rule__RecordType__Group_6__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2156:1: rule__RecordType__Group_6__2 : rule__RecordType__Group_6__2__Impl ;
    public final void rule__RecordType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2160:1: ( rule__RecordType__Group_6__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2161:2: rule__RecordType__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__2__Impl_in_rule__RecordType__Group_6__24374);
            rule__RecordType__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__2"


    // $ANTLR start "rule__RecordType__Group_6__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2167:1: rule__RecordType__Group_6__2__Impl : ( ( rule__RecordType__Group_6_2__0 )* ) ;
    public final void rule__RecordType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2171:1: ( ( ( rule__RecordType__Group_6_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2172:1: ( ( rule__RecordType__Group_6_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2172:1: ( ( rule__RecordType__Group_6_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2173:1: ( rule__RecordType__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2174:1: ( rule__RecordType__Group_6_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2174:2: rule__RecordType__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_6_2__0_in_rule__RecordType__Group_6__2__Impl4401);
            	    rule__RecordType__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getGroup_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6__2__Impl"


    // $ANTLR start "rule__RecordType__Group_6_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2190:1: rule__RecordType__Group_6_2__0 : rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 ;
    public final void rule__RecordType__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2194:1: ( rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2195:2: rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__0__Impl_in_rule__RecordType__Group_6_2__04438);
            rule__RecordType__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__1_in_rule__RecordType__Group_6_2__04441);
            rule__RecordType__Group_6_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6_2__0"


    // $ANTLR start "rule__RecordType__Group_6_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2202:1: rule__RecordType__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2206:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2207:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2207:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2208:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_6_2__0__Impl4469); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6_2__0__Impl"


    // $ANTLR start "rule__RecordType__Group_6_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2221:1: rule__RecordType__Group_6_2__1 : rule__RecordType__Group_6_2__1__Impl ;
    public final void rule__RecordType__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2225:1: ( rule__RecordType__Group_6_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2226:2: rule__RecordType__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__1__Impl_in_rule__RecordType__Group_6_2__14500);
            rule__RecordType__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6_2__1"


    // $ANTLR start "rule__RecordType__Group_6_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2232:1: rule__RecordType__Group_6_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__RecordType__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2236:1: ( ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2237:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2237:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2238:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2239:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2239:2: rule__RecordType__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_6_2_1_in_rule__RecordType__Group_6_2__1__Impl4527);
            rule__RecordType__ParentsAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_6_2__1__Impl"


    // $ANTLR start "rule__RecordType__Group_7__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2253:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2257:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2258:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__0__Impl_in_rule__RecordType__Group_7__04561);
            rule__RecordType__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_7__1_in_rule__RecordType__Group_7__04564);
            rule__RecordType__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__0"


    // $ANTLR start "rule__RecordType__Group_7__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2265:1: rule__RecordType__Group_7__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2269:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2270:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2270:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2271:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_7__0__Impl4592); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__0__Impl"


    // $ANTLR start "rule__RecordType__Group_7__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2284:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2288:1: ( rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2289:2: rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__1__Impl_in_rule__RecordType__Group_7__14623);
            rule__RecordType__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_7__2_in_rule__RecordType__Group_7__14626);
            rule__RecordType__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__1"


    // $ANTLR start "rule__RecordType__Group_7__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2296:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__Alternatives_7_1 )* ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2300:1: ( ( ( rule__RecordType__Alternatives_7_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2301:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2301:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2302:1: ( rule__RecordType__Alternatives_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_7_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2303:1: ( rule__RecordType__Alternatives_7_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==26||LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2303:2: rule__RecordType__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Alternatives_7_1_in_rule__RecordType__Group_7__1__Impl4653);
            	    rule__RecordType__Alternatives_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAlternatives_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__1__Impl"


    // $ANTLR start "rule__RecordType__Group_7__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2313:1: rule__RecordType__Group_7__2 : rule__RecordType__Group_7__2__Impl ;
    public final void rule__RecordType__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2317:1: ( rule__RecordType__Group_7__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2318:2: rule__RecordType__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__2__Impl_in_rule__RecordType__Group_7__24684);
            rule__RecordType__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__2"


    // $ANTLR start "rule__RecordType__Group_7__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2324:1: rule__RecordType__Group_7__2__Impl : ( '}' ) ;
    public final void rule__RecordType__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2328:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2329:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2329:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2330:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_7__2__Impl4712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_7__2__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2349:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2353:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2354:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04749);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04752);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2361:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2365:1: ( ( 'const' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2366:1: ( 'const' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2366:1: ( 'const' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2367:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Constant__Group__0__Impl4780); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2380:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2384:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2385:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14811);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14814);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2392:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2396:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2397:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2397:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2398:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2399:1: ( rule__Constant__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2399:2: rule__Constant__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl4841);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2409:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2413:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2414:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24871);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24874);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2421:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2425:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2426:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2426:1: ( ( rule__Constant__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2427:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2428:1: ( rule__Constant__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2428:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl4901);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2438:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2442:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2443:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34931);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34934);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2450:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2454:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2455:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2455:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2456:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,27,FOLLOW_27_in_rule__Constant__Group__3__Impl4962); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2469:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2473:1: ( rule__Constant__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2474:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44993);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2480:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2484:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2485:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2485:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2486:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2487:1: ( rule__Constant__ValueAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2487:2: rule__Constant__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5020);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2507:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2511:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2512:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05060);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05063);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2519:1: rule__Property__Group__0__Impl : ( ( rule__Property__Alternatives_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2523:1: ( ( ( rule__Property__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2524:1: ( ( rule__Property__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2524:1: ( ( rule__Property__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2525:1: ( rule__Property__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2526:1: ( rule__Property__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2526:2: rule__Property__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__0__Impl5090);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2536:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2540:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2541:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15120);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15123);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2548:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2552:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2553:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2553:1: ( ( rule__Property__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2554:1: ( rule__Property__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2555:1: ( rule__Property__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2555:2: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5150);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2565:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2569:1: ( rule__Property__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2570:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25180);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2576:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 )? ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2580:1: ( ( ( rule__Property__Alternatives_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2581:1: ( ( rule__Property__Alternatives_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2581:1: ( ( rule__Property__Alternatives_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2582:1: ( rule__Property__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2583:1: ( rule__Property__Alternatives_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22||LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2583:2: rule__Property__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5207);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2599:1: rule__Property__Group_0_1__0 : rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1 ;
    public final void rule__Property__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2603:1: ( rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2604:2: rule__Property__Group_0_1__0__Impl rule__Property__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__0__Impl_in_rule__Property__Group_0_1__05244);
            rule__Property__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0_1__1_in_rule__Property__Group_0_1__05247);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2611:1: rule__Property__Group_0_1__0__Impl : ( 'alias' ) ;
    public final void rule__Property__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2615:1: ( ( 'alias' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2616:1: ( 'alias' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2616:1: ( 'alias' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2617:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAliasKeyword_0_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Property__Group_0_1__0__Impl5275); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2630:1: rule__Property__Group_0_1__1 : rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2 ;
    public final void rule__Property__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2634:1: ( rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2635:2: rule__Property__Group_0_1__1__Impl rule__Property__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__1__Impl_in_rule__Property__Group_0_1__15306);
            rule__Property__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0_1__2_in_rule__Property__Group_0_1__15309);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2642:1: rule__Property__Group_0_1__1__Impl : ( ( rule__Property__ReferToAssignment_0_1_1 ) ) ;
    public final void rule__Property__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2646:1: ( ( ( rule__Property__ReferToAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2647:1: ( ( rule__Property__ReferToAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2647:1: ( ( rule__Property__ReferToAssignment_0_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2648:1: ( rule__Property__ReferToAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2649:1: ( rule__Property__ReferToAssignment_0_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2649:2: rule__Property__ReferToAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__Property__ReferToAssignment_0_1_1_in_rule__Property__Group_0_1__1__Impl5336);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2659:1: rule__Property__Group_0_1__2 : rule__Property__Group_0_1__2__Impl ;
    public final void rule__Property__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2663:1: ( rule__Property__Group_0_1__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2664:2: rule__Property__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_0_1__2__Impl_in_rule__Property__Group_0_1__25366);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2670:1: rule__Property__Group_0_1__2__Impl : ( 'as' ) ;
    public final void rule__Property__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2674:1: ( ( 'as' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2675:1: ( 'as' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2675:1: ( 'as' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2676:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAsKeyword_0_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Property__Group_0_1__2__Impl5394); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2695:1: rule__Property__Group_2_0__0 : rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 ;
    public final void rule__Property__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2699:1: ( rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2700:2: rule__Property__Group_2_0__0__Impl rule__Property__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05431);
            rule__Property__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05434);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2707:1: rule__Property__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2711:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2712:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2712:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2713:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Property__Group_2_0__0__Impl5462); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2726:1: rule__Property__Group_2_0__1 : rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 ;
    public final void rule__Property__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2730:1: ( rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2731:2: rule__Property__Group_2_0__1__Impl rule__Property__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15493);
            rule__Property__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15496);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2738:1: rule__Property__Group_2_0__1__Impl : ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) ;
    public final void rule__Property__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2742:1: ( ( ( rule__Property__PropertiesAssignment_2_0_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2743:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2743:1: ( ( rule__Property__PropertiesAssignment_2_0_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2744:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_2_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2745:1: ( rule__Property__PropertiesAssignment_2_0_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2745:2: rule__Property__PropertiesAssignment_2_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5523);
            	    rule__Property__PropertiesAssignment_2_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2755:1: rule__Property__Group_2_0__2 : rule__Property__Group_2_0__2__Impl ;
    public final void rule__Property__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2759:1: ( rule__Property__Group_2_0__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2760:2: rule__Property__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25554);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2766:1: rule__Property__Group_2_0__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2770:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2771:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2771:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2772:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_2_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Property__Group_2_0__2__Impl5582); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2791:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2795:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2796:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05619);
            rule__Property__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05622);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2803:1: rule__Property__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2807:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2808:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2808:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2809:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Property__Group_2_1__0__Impl5650); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2822:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2826:1: ( rule__Property__Group_2_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2827:2: rule__Property__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15681);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2833:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ValueAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2837:1: ( ( ( rule__Property__ValueAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2838:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2838:1: ( ( rule__Property__ValueAssignment_2_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2839:1: ( rule__Property__ValueAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2840:1: ( rule__Property__ValueAssignment_2_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2840:2: rule__Property__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5708);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2854:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2858:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2859:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05742);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05745);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2866:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__Group_0__0 )? ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2870:1: ( ( ( rule__Classifier__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2871:1: ( ( rule__Classifier__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2871:1: ( ( rule__Classifier__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2872:1: ( rule__Classifier__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2873:1: ( rule__Classifier__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==30) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2873:2: rule__Classifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5772);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2883:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2887:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2888:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15803);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15806);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2895:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__ClassAssignment_1 ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2899:1: ( ( ( rule__Classifier__ClassAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2900:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2900:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2901:1: ( rule__Classifier__ClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2902:1: ( rule__Classifier__ClassAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2902:2: rule__Classifier__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5833);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2912:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2916:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2917:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25863);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2923:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__SizesAssignment_2 )* ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2927:1: ( ( ( rule__Classifier__SizesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2928:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2928:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2929:1: ( rule__Classifier__SizesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2930:1: ( rule__Classifier__SizesAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2930:2: rule__Classifier__SizesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5890);
            	    rule__Classifier__SizesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2946:1: rule__Classifier__Group_0__0 : rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 ;
    public final void rule__Classifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2950:1: ( rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2951:2: rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05927);
            rule__Classifier__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05930);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2958:1: rule__Classifier__Group_0__0__Impl : ( ( rule__Classifier__PackageAssignment_0_0 ) ) ;
    public final void rule__Classifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2962:1: ( ( ( rule__Classifier__PackageAssignment_0_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2963:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2963:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2964:1: ( rule__Classifier__PackageAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2965:1: ( rule__Classifier__PackageAssignment_0_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2965:2: rule__Classifier__PackageAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5957);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2975:1: rule__Classifier__Group_0__1 : rule__Classifier__Group_0__1__Impl ;
    public final void rule__Classifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2979:1: ( rule__Classifier__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2980:2: rule__Classifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15987);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2986:1: rule__Classifier__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2990:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2991:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2991:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2992:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_0_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Classifier__Group_0__1__Impl6015); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3009:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3013:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3014:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06050);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06053);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3021:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3025:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3026:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3026:1: ( () )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3027:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3028:1: ()
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3030:1: 
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3040:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3044:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3045:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16111);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16114);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3052:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3056:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3057:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3057:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3058:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__ArraySize__Group__1__Impl6142); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3071:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3075:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3076:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26173);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26176);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3083:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3087:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3088:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3088:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3089:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3090:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_INT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3090:2: rule__ArraySize__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6203);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3100:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3104:1: ( rule__ArraySize__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3105:2: rule__ArraySize__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36234);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3111:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3115:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3116:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3116:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3117:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ArraySize__Group__3__Impl6262); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3138:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3142:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3143:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06301);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06304);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3150:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3154:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3155:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3155:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3156:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3157:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3157:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6331);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3167:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3171:1: ( rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3172:2: rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16361);
            rule__ReferenceProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16364);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3179:1: rule__ReferenceProperty__Group__1__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3183:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3184:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3184:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3185:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__ReferenceProperty__Group__1__Impl6392); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3198:1: rule__ReferenceProperty__Group__2 : rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 ;
    public final void rule__ReferenceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3202:1: ( rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3203:2: rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26423);
            rule__ReferenceProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26426);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3210:1: rule__ReferenceProperty__Group__2__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) ;
    public final void rule__ReferenceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3214:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3215:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3215:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3216:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3217:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3217:2: rule__ReferenceProperty__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6453);
            	    rule__ReferenceProperty__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3227:1: rule__ReferenceProperty__Group__3 : rule__ReferenceProperty__Group__3__Impl ;
    public final void rule__ReferenceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3231:1: ( rule__ReferenceProperty__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3232:2: rule__ReferenceProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36484);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3238:1: rule__ReferenceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3242:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3243:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3243:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3244:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__ReferenceProperty__Group__3__Impl6512); if (state.failed) return ;
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


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3265:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3269:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3270:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__06551);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__06554);
            rule__ArrayLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0"


    // $ANTLR start "rule__ArrayLiteral__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3277:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3281:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3282:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3282:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3283:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__ArrayLiteral__Group__0__Impl6582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3296:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3300:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3301:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__16613);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__16616);
            rule__ArrayLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__1"


    // $ANTLR start "rule__ArrayLiteral__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3308:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3312:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3313:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3313:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3314:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3315:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3315:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl6643);
            rule__ArrayLiteral__LiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3325:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3329:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3330:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__26673);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__26676);
            rule__ArrayLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__2"


    // $ANTLR start "rule__ArrayLiteral__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3337:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3341:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3342:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3342:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3343:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3344:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3344:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl6703);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__2__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3354:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3358:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3359:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__36734);
            rule__ArrayLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__3"


    // $ANTLR start "rule__ArrayLiteral__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3365:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3369:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3370:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3370:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3371:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__ArrayLiteral__Group__3__Impl6762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__3__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3392:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3396:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3397:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__06801);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__06804);
            rule__ArrayLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__0"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3404:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3408:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3409:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3409:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3410:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__ArrayLiteral__Group_2__0__Impl6832); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3423:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3427:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3428:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__16863);
            rule__ArrayLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__1"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3434:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3438:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3439:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3439:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3440:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3441:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3441:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl6890);
            rule__ArrayLiteral__LiteralsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3455:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3459:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3460:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06924);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06927);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3467:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3471:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3472:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3472:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3473:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6954); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3484:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3488:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3489:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16983);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3495:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3499:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3500:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3500:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3501:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3502:1: ( rule__QualifiedName__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==30) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==RULE_ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3502:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7010);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3516:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3520:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3521:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07045);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07048);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3528:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3532:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3533:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3533:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3534:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3535:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3536:2: '.'
            {
            match(input,30,FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl7077); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3547:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3551:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3552:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17109);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3558:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3562:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3563:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3563:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3564:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7136); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3579:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3583:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3584:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07169);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07172);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3591:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3595:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3596:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3596:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3597:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7199);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3608:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3612:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3613:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17228);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3619:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3623:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3624:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3624:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3625:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3626:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3626:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl7255);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3640:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3644:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3645:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__07290);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__07293);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3652:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3656:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3657:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3657:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3658:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl7321); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3671:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3675:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3676:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__17352);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3682:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3686:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3687:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3687:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3688:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl7380); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3706:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3710:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3711:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3711:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3712:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_17420);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3721:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3725:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3726:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3726:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3727:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_27451);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3736:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3740:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3741:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3741:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3742:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37482);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3751:1: rule__Model__TypesAssignment_4 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3755:1: ( ( ruleType ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3756:1: ( ruleType )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3756:1: ( ruleType )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3757:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_47513);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3766:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3770:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3771:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3771:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3772:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_17544);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3781:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3785:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3786:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3786:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3787:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_17575); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3796:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3800:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3801:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3801:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3802:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3803:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3804:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_27610); if (state.failed) return ;
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


    // $ANTLR start "rule__PartialRecordType__AuthorAssignment_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3815:1: rule__PartialRecordType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__PartialRecordType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3819:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3820:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3820:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3821:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PartialRecordType__AuthorAssignment_0_17645); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__AuthorAssignment_0_1"


    // $ANTLR start "rule__PartialRecordType__SinceAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3830:1: rule__PartialRecordType__SinceAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__PartialRecordType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3834:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3835:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3835:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3836:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getSinceFLOATTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__PartialRecordType__SinceAssignment_1_17676); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getSinceFLOATTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__SinceAssignment_1_1"


    // $ANTLR start "rule__PartialRecordType__NameAssignment_3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3845:1: rule__PartialRecordType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__PartialRecordType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3849:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3850:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3850:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3851:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_37707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__NameAssignment_3"


    // $ANTLR start "rule__PartialRecordType__ParentsAssignment_4_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3860:1: rule__PartialRecordType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3864:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3865:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3865:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3866:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3867:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3868:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_4_17742);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ParentsAssignment_4_1"


    // $ANTLR start "rule__PartialRecordType__ParentsAssignment_4_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3879:1: rule__PartialRecordType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PartialRecordType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3883:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3884:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3884:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3885:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3886:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3887:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_4_2_17781);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getParentsPartialRecordTypeCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ParentsAssignment_4_2_1"


    // $ANTLR start "rule__PartialRecordType__PropertiesAssignment_5_1_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3898:1: rule__PartialRecordType__PropertiesAssignment_5_1_0 : ( ruleProperty ) ;
    public final void rule__PartialRecordType__PropertiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3902:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3903:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3903:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3904:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_5_1_07816);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__PropertiesAssignment_5_1_0"


    // $ANTLR start "rule__PartialRecordType__ConstantsAssignment_5_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3913:1: rule__PartialRecordType__ConstantsAssignment_5_1_1 : ( ruleConstant ) ;
    public final void rule__PartialRecordType__ConstantsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3917:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3918:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3918:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3919:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_5_1_17847);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPartialRecordTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PartialRecordType__ConstantsAssignment_5_1_1"


    // $ANTLR start "rule__RecordType__AuthorAssignment_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3928:1: rule__RecordType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3932:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3933:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3933:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3934:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RecordType__AuthorAssignment_0_17878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__AuthorAssignment_0_1"


    // $ANTLR start "rule__RecordType__SinceAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3943:1: rule__RecordType__SinceAssignment_1_1 : ( RULE_FLOAT ) ;
    public final void rule__RecordType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3947:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3948:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3948:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3949:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceFLOATTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__RecordType__SinceAssignment_1_17909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getSinceFLOATTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__SinceAssignment_1_1"


    // $ANTLR start "rule__RecordType__AbstractAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3958:1: rule__RecordType__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3962:1: ( ( ( 'abstract' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3963:1: ( ( 'abstract' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3963:1: ( ( 'abstract' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3964:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3965:1: ( 'abstract' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3966:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__RecordType__AbstractAssignment_27945); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__AbstractAssignment_2"


    // $ANTLR start "rule__RecordType__NameAssignment_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3981:1: rule__RecordType__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3985:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3986:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3986:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3987:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_47984); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_4"


    // $ANTLR start "rule__RecordType__ParentAssignment_5_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3996:1: rule__RecordType__ParentAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4000:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4001:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4001:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4002:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4003:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4004:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_5_18019);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentAssignment_5_1"


    // $ANTLR start "rule__RecordType__ParentsAssignment_6_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4015:1: rule__RecordType__ParentsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4019:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4020:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4020:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4021:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_6_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4022:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4023:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_18058);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentsAssignment_6_1"


    // $ANTLR start "rule__RecordType__ParentsAssignment_6_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4034:1: rule__RecordType__ParentsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4038:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4039:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4039:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4040:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_6_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4041:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4042:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_2_18097);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsPartialRecordTypeCrossReference_6_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ParentsAssignment_6_2_1"


    // $ANTLR start "rule__RecordType__PropertiesAssignment_7_1_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4053:1: rule__RecordType__PropertiesAssignment_7_1_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4057:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4058:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4058:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4059:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_7_1_08132);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__PropertiesAssignment_7_1_0"


    // $ANTLR start "rule__RecordType__ConstantsAssignment_7_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4068:1: rule__RecordType__ConstantsAssignment_7_1_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4072:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4073:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4073:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4074:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_7_1_18163);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__ConstantsAssignment_7_1_1"


    // $ANTLR start "rule__Constant__TypeAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4083:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4087:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4088:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4088:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4089:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_18194);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4098:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4102:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4103:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4103:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_28225); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4113:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4117:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4118:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4118:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4119:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_48256);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4128:1: rule__Property__TypeAssignment_0_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4132:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4133:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4133:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4134:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_0_08287);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4143:1: rule__Property__ReferToAssignment_0_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReferToAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4147:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4148:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4148:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4149:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_0_1_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4150:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4151:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_0_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_0_1_18322); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4162:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4166:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4167:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4167:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4168:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_18357); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4177:1: rule__Property__PropertiesAssignment_2_0_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4181:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4182:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4182:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4183:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_18388);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4192:1: rule__Property__ValueAssignment_2_1_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4196:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4197:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4197:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4198:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_18419);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4207:1: rule__Classifier__PackageAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4211:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4212:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4212:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4213:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4214:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4215:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_08454); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4226:1: rule__Classifier__ClassAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4230:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4231:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4231:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4232:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4233:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4234:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_18493); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4245:1: rule__Classifier__SizesAssignment_2 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4249:1: ( ( ruleArraySize ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4250:1: ( ruleArraySize )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4250:1: ( ruleArraySize )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4251:1: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_28528);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4260:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4264:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4265:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4265:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4266:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_28559); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4275:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4279:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4280:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4280:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4281:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4282:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4283:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_08594); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4294:1: rule__ReferenceProperty__PropertiesAssignment_2 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4298:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4299:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4299:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4300:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_28629);
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


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4309:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4313:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4314:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4314:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4315:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_18660);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_1"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4324:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4328:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4329:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4329:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4330:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_18691);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_2_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4339:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4343:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4344:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4344:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4345:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment8722); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4354:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4358:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4359:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4359:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4360:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment8753); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4369:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4373:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4374:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4374:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4375:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment8784); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4384:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4388:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4389:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4389:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4390:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment8815); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4399:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4403:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4404:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4404:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4405:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4406:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4407:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment8850); if (state.failed) return ;
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
    public static final BitSet FOLLOW_ruleType_in_entryRuleType247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_entryRulePartialRecordType307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartialRecordType314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0_in_rulePartialRecordType340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_entryRuleConstantLiteral1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantLiteral1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstantLiteral__ValueAssignment_in_ruleConstantLiteral1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartialRecordType_in_rule__Type__Alternatives1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__PropertiesAssignment_5_1_0_in_rule__PartialRecordType__Alternatives_5_11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ConstantsAssignment_5_1_1_in_rule__PartialRecordType__Alternatives_5_11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__PropertiesAssignment_7_1_0_in_rule__RecordType__Alternatives_7_11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ConstantsAssignment_7_1_1_in_rule__RecordType__Alternatives_7_11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_0_0_in_rule__Property__Alternatives_01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__0_in_rule__Property__Alternatives_01445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0_in_rule__Property__Alternatives_21478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11706 = new BitSet(new long[]{0x00000004010F8000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21766 = new BitSet(new long[]{0x00000004010F8000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl1796 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31827 = new BitSet(new long[]{0x00000004010F8000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl1857 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl1915 = new BitSet(new long[]{0x00000004010E0002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__0__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Package__Group__0__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12141 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__0__Impl_in_rule__PartialRecordType__Group__02264 = new BitSet(new long[]{0x00000004010E0000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1_in_rule__PartialRecordType__Group__02267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_0__0_in_rule__PartialRecordType__Group__0__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__1__Impl_in_rule__PartialRecordType__Group__12325 = new BitSet(new long[]{0x00000004010E0000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2_in_rule__PartialRecordType__Group__12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_1__0_in_rule__PartialRecordType__Group__1__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__2__Impl_in_rule__PartialRecordType__Group__22386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3_in_rule__PartialRecordType__Group__22389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PartialRecordType__Group__2__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__3__Impl_in_rule__PartialRecordType__Group__32448 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__4_in_rule__PartialRecordType__Group__32451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__NameAssignment_3_in_rule__PartialRecordType__Group__3__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__4__Impl_in_rule__PartialRecordType__Group__42508 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__5_in_rule__PartialRecordType__Group__42511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__0_in_rule__PartialRecordType__Group__4__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group__5__Impl_in_rule__PartialRecordType__Group__52569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__0_in_rule__PartialRecordType__Group__5__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_0__0__Impl_in_rule__PartialRecordType__Group_0__02639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_0__1_in_rule__PartialRecordType__Group_0__02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PartialRecordType__Group_0__0__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_0__1__Impl_in_rule__PartialRecordType__Group_0__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__AuthorAssignment_0_1_in_rule__PartialRecordType__Group_0__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_1__0__Impl_in_rule__PartialRecordType__Group_1__02762 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_1__1_in_rule__PartialRecordType__Group_1__02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PartialRecordType__Group_1__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_1__1__Impl_in_rule__PartialRecordType__Group_1__12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__SinceAssignment_1_1_in_rule__PartialRecordType__Group_1__1__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__0__Impl_in_rule__PartialRecordType__Group_4__02885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__1_in_rule__PartialRecordType__Group_4__02888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PartialRecordType__Group_4__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__1__Impl_in_rule__PartialRecordType__Group_4__12947 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__2_in_rule__PartialRecordType__Group_4__12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_4_1_in_rule__PartialRecordType__Group_4__1__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4__2__Impl_in_rule__PartialRecordType__Group_4__23007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4_2__0_in_rule__PartialRecordType__Group_4__2__Impl3034 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4_2__0__Impl_in_rule__PartialRecordType__Group_4_2__03071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4_2__1_in_rule__PartialRecordType__Group_4_2__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PartialRecordType__Group_4_2__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_4_2__1__Impl_in_rule__PartialRecordType__Group_4_2__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__ParentsAssignment_4_2_1_in_rule__PartialRecordType__Group_4_2__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__0__Impl_in_rule__PartialRecordType__Group_5__03194 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__1_in_rule__PartialRecordType__Group_5__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PartialRecordType__Group_5__0__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__1__Impl_in_rule__PartialRecordType__Group_5__13256 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__2_in_rule__PartialRecordType__Group_5__13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Alternatives_5_1_in_rule__PartialRecordType__Group_5__1__Impl3286 = new BitSet(new long[]{0x0000000014000012L});
    public static final BitSet FOLLOW_rule__PartialRecordType__Group_5__2__Impl_in_rule__PartialRecordType__Group_5__23317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PartialRecordType__Group_5__2__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03382 = new BitSet(new long[]{0x00000004010C0000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__0_in_rule__RecordType__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13443 = new BitSet(new long[]{0x00000004010C0000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__0_in_rule__RecordType__Group__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23504 = new BitSet(new long[]{0x00000004010C0000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AbstractAssignment_2_in_rule__RecordType__Group__2__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group__3__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43627 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_4_in_rule__RecordType__Group__4__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53687 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63748 = new BitSet(new long[]{0x0000000002500000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__0_in_rule__RecordType__Group__6__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__73809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__0_in_rule__RecordType__Group__7__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__0__Impl_in_rule__RecordType__Group_0__03883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__1_in_rule__RecordType__Group_0__03886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RecordType__Group_0__0__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__1__Impl_in_rule__RecordType__Group_0__13945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AuthorAssignment_0_1_in_rule__RecordType__Group_0__1__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__0__Impl_in_rule__RecordType__Group_1__04006 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__1_in_rule__RecordType__Group_1__04009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordType__Group_1__0__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__1__Impl_in_rule__RecordType__Group_1__14068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__SinceAssignment_1_1_in_rule__RecordType__Group_1__1__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_5__0__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentAssignment_5_1_in_rule__RecordType__Group_5__1__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__0__Impl_in_rule__RecordType__Group_6__04252 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__1_in_rule__RecordType__Group_6__04255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group_6__0__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__1__Impl_in_rule__RecordType__Group_6__14314 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__2_in_rule__RecordType__Group_6__14317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_6_1_in_rule__RecordType__Group_6__1__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__2__Impl_in_rule__RecordType__Group_6__24374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__0_in_rule__RecordType__Group_6__2__Impl4401 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__0__Impl_in_rule__RecordType__Group_6_2__04438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__1_in_rule__RecordType__Group_6_2__04441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_6_2__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__1__Impl_in_rule__RecordType__Group_6_2__14500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_6_2_1_in_rule__RecordType__Group_6_2__1__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__0__Impl_in_rule__RecordType__Group_7__04561 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__1_in_rule__RecordType__Group_7__04564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_7__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__1__Impl_in_rule__RecordType__Group_7__14623 = new BitSet(new long[]{0x0000000014800010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__2_in_rule__RecordType__Group_7__14626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Alternatives_7_1_in_rule__RecordType__Group_7__1__Impl4653 = new BitSet(new long[]{0x0000000014000012L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__2__Impl_in_rule__RecordType__Group_7__24684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_7__2__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Constant__Group__0__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__14811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__14814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__24871 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__24874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__34931 = new BitSet(new long[]{0x00000000004001F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__34934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Constant__Group__3__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__44993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_0_in_rule__Property__Group__0__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15120 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_1_in_rule__Property__Group__1__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__0__Impl_in_rule__Property__Group_0_1__05244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__1_in_rule__Property__Group_0_1__05247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Property__Group_0_1__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__1__Impl_in_rule__Property__Group_0_1__15306 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__2_in_rule__Property__Group_0_1__15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ReferToAssignment_0_1_1_in_rule__Property__Group_0_1__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_1__2__Impl_in_rule__Property__Group_0_1__25366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Property__Group_0_1__2__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__0__Impl_in_rule__Property__Group_2_0__05431 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1_in_rule__Property__Group_2_0__05434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Property__Group_2_0__0__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__1__Impl_in_rule__Property__Group_2_0__15493 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2_in_rule__Property__Group_2_0__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_2_0_1_in_rule__Property__Group_2_0__1__Impl5523 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_2_0__2__Impl_in_rule__Property__Group_2_0__25554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Property__Group_2_0__2__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05619 = new BitSet(new long[]{0x00000000004001F0L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Property__Group_2_1__0__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__05742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__05745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__15803 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__25863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl5890 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__05927 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__05930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__15987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Classifier__Group_0__1__Impl6015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06050 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16111 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ArraySize__Group__1__Impl6142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26173 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ArraySize__Group__3__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06301 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__16361 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__16364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReferenceProperty__Group__1__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__26423 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__26426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl6453 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__36484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReferenceProperty__Group__3__Impl6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__06551 = new BitSet(new long[]{0x00000000004001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__06554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ArrayLiteral__Group__0__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__16613 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__16616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__26673 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__26676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl6703 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__36734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayLiteral__Group__3__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__06801 = new BitSet(new long[]{0x00000000004001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__06804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ArrayLiteral__Group_2__0__Impl6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06924 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7010 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedName__Group_1__0__Impl7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07169 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__17228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl7255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__07290 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__07293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__17352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_17420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_27451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_37482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_47513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_17544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_17575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_27610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PartialRecordType__AuthorAssignment_0_17645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__PartialRecordType__SinceAssignment_1_17676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PartialRecordType__NameAssignment_37707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_4_17742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PartialRecordType__ParentsAssignment_4_2_17781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PartialRecordType__PropertiesAssignment_5_1_07816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__PartialRecordType__ConstantsAssignment_5_1_17847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RecordType__AuthorAssignment_0_17878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__RecordType__SinceAssignment_1_17909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RecordType__AbstractAssignment_27945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_47984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_5_18019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_18058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_2_18097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_7_1_08132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_7_1_18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_18194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_28225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_48256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_0_08287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_0_1_18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_18357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_2_0_18388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_2_1_18419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_08454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_18493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_28528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_28559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_08594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_28629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_18660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_18691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment8850 = new BitSet(new long[]{0x0000000000000002L});

}
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transient'", "'auto-increment'", "'package'", "'import'", "'use'", "'template'", "'@author'", "'@since'", "':'", "','", "'{'", "'}'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'grouped'", "'by'", "'.'", "'['", "']'", "'*'", "'abstract'", "'KIEKER_VERSION'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_FLOAT=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleTemplateType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:173:1: entryRuleTemplateType : ruleTemplateType EOF ;
    public final void entryRuleTemplateType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:174:1: ( ruleTemplateType EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:175:1: ruleTemplateType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateType_in_entryRuleTemplateType307);
            ruleTemplateType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateType314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTemplateType"


    // $ANTLR start "ruleTemplateType"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:182:1: ruleTemplateType : ( ( rule__TemplateType__Group__0 ) ) ;
    public final void ruleTemplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:186:2: ( ( ( rule__TemplateType__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__TemplateType__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:187:1: ( ( rule__TemplateType__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:188:1: ( rule__TemplateType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:1: ( rule__TemplateType__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:189:2: rule__TemplateType__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__0_in_ruleTemplateType340);
            rule__TemplateType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateType"


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


    // $ANTLR start "entryRuleForeignKey"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:285:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:286:1: ( ruleForeignKey EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:287:1: ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_ruleForeignKey_in_entryRuleForeignKey547);
            ruleForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeignKey554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:294:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:298:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__ForeignKey__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:299:1: ( ( rule__ForeignKey__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:300:1: ( rule__ForeignKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:1: ( rule__ForeignKey__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:301:2: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__0_in_ruleForeignKey580);
            rule__ForeignKey__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeignKey"


    // $ANTLR start "entryRuleClassifier"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:313:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:314:1: ( ruleClassifier EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:315:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier607);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier614); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:322:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:326:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__Classifier__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:327:1: ( ( rule__Classifier__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:328:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:1: ( rule__Classifier__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:329:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0_in_ruleClassifier640);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:341:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:342:1: ( ruleArraySize EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:343:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_entryRuleArraySize667);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySize674); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:350:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:354:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:355:1: ( ( rule__ArraySize__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:356:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:1: ( rule__ArraySize__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:357:2: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize700);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:369:1: entryRuleReferenceProperty : ruleReferenceProperty EOF ;
    public final void entryRuleReferenceProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:370:1: ( ruleReferenceProperty EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:371:1: ruleReferenceProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty727);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferencePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceProperty734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:378:1: ruleReferenceProperty : ( ( rule__ReferenceProperty__Group__0 ) ) ;
    public final void ruleReferenceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:382:2: ( ( ( rule__ReferenceProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__ReferenceProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:383:1: ( ( rule__ReferenceProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:384:1: ( rule__ReferenceProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:1: ( rule__ReferenceProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:385:2: rule__ReferenceProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty760);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:397:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:398:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:399:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral787);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral794); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:406:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:410:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:411:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:412:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:413:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral820);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:425:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:426:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:427:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral847);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral854); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:434:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:438:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:439:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:440:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:441:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral880);
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


    // $ANTLR start "entryRuleBuiltInValueLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:593:1: entryRuleBuiltInValueLiteral : ruleBuiltInValueLiteral EOF ;
    public final void entryRuleBuiltInValueLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:594:1: ( ruleBuiltInValueLiteral EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:595:1: ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1207);
            ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBuiltInValueLiteral"


    // $ANTLR start "ruleBuiltInValueLiteral"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:602:1: ruleBuiltInValueLiteral : ( ( rule__BuiltInValueLiteral__Group__0 ) ) ;
    public final void ruleBuiltInValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:606:2: ( ( ( rule__BuiltInValueLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:607:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:608:1: ( rule__BuiltInValueLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:1: ( rule__BuiltInValueLiteral__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:609:2: rule__BuiltInValueLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1240);
            rule__BuiltInValueLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltInValueLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:621:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:622:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:623:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1267);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:630:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:634:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:635:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:635:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:636:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:637:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:637:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1300);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:649:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:650:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:651:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1327);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1334); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:658:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:662:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:663:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:663:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:664:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:665:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:665:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1360);
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


    // $ANTLR start "rulePropertyModifier"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:678:1: rulePropertyModifier : ( ( rule__PropertyModifier__Alternatives ) ) ;
    public final void rulePropertyModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:682:1: ( ( ( rule__PropertyModifier__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:683:1: ( ( rule__PropertyModifier__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:683:1: ( ( rule__PropertyModifier__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:684:1: ( rule__PropertyModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyModifierAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:685:1: ( rule__PropertyModifier__Alternatives )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:685:2: rule__PropertyModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyModifier__Alternatives_in_rulePropertyModifier1397);
            rule__PropertyModifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyModifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyModifier"


    // $ANTLR start "rule__Type__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:696:1: rule__Type__Alternatives : ( ( ruleRecordType ) | ( ruleTemplateType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:700:1: ( ( ruleRecordType ) | ( ruleTemplateType ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 21:
                        {
                        int LA1_2 = input.LA(4);

                        if ( (LA1_2==RULE_STRING) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==26||LA1_6==38) ) {
                                alt1=1;
                            }
                            else if ( (LA1_6==19) ) {
                                alt1=2;
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
                    case 26:
                    case 38:
                        {
                        alt1=1;
                        }
                        break;
                    case 19:
                        {
                        alt1=2;
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
            case 21:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_STRING) ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6==26||LA1_6==38) ) {
                        alt1=1;
                    }
                    else if ( (LA1_6==19) ) {
                        alt1=2;
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
            case 26:
            case 38:
                {
                alt1=1;
                }
                break;
            case 19:
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:701:1: ( ruleRecordType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:701:1: ( ruleRecordType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:702:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rule__Type__Alternatives1432);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:707:6: ( ruleTemplateType )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:707:6: ( ruleTemplateType )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:708:1: ruleTemplateType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTemplateTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTemplateType_in_rule__Type__Alternatives1449);
                    ruleTemplateType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTemplateTypeParserRuleCall_1()); 
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


    // $ANTLR start "rule__TemplateType__Alternatives_5_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:718:1: rule__TemplateType__Alternatives_5_1 : ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) );
    public final void rule__TemplateType__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:722:1: ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=15)||LA2_0==30||LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:723:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:723:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:724:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:725:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:725:2: rule__TemplateType__PropertiesAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_rule__TemplateType__PropertiesAssignment_5_1_0_in_rule__TemplateType__Alternatives_5_11481);
                    rule__TemplateType__PropertiesAssignment_5_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemplateTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:729:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:729:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:730:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getConstantsAssignment_5_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:731:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:731:2: rule__TemplateType__ConstantsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_rule__TemplateType__ConstantsAssignment_5_1_1_in_rule__TemplateType__Alternatives_5_11499);
                    rule__TemplateType__ConstantsAssignment_5_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemplateTypeAccess().getConstantsAssignment_5_1_1()); 
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
    // $ANTLR end "rule__TemplateType__Alternatives_5_1"


    // $ANTLR start "rule__RecordType__Alternatives_7_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:740:1: rule__RecordType__Alternatives_7_1 : ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) );
    public final void rule__RecordType__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:744:1: ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=15)||LA3_0==30||LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:745:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:745:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:746:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_7_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:747:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:747:2: rule__RecordType__PropertiesAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_rule__RecordType__PropertiesAssignment_7_1_0_in_rule__RecordType__Alternatives_7_11532);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:751:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:751:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:752:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_7_1_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:753:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:753:2: rule__RecordType__ConstantsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_rule__RecordType__ConstantsAssignment_7_1_1_in_rule__RecordType__Alternatives_7_11550);
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


    // $ANTLR start "rule__Property__Alternatives_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:762:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:766:1: ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:767:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:767:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:768:1: ( rule__Property__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getTypeAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:769:1: ( rule__Property__TypeAssignment_2_0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:769:2: rule__Property__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Property__TypeAssignment_2_0_in_rule__Property__Alternatives_21583);
                    rule__Property__TypeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getTypeAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:773:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:773:6: ( ( rule__Property__Group_2_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:774:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:775:1: ( rule__Property__Group_2_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:775:2: rule__Property__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21601);
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


    // $ANTLR start "rule__Property__Alternatives_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:784:1: rule__Property__Alternatives_4 : ( ( ( rule__Property__Group_4_0__0 ) ) | ( ( rule__Property__Group_4_1__0 ) ) );
    public final void rule__Property__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:788:1: ( ( ( rule__Property__Group_4_0__0 ) ) | ( ( rule__Property__Group_4_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:789:1: ( ( rule__Property__Group_4_0__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:789:1: ( ( rule__Property__Group_4_0__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:790:1: ( rule__Property__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_4_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:791:1: ( rule__Property__Group_4_0__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:791:2: rule__Property__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4_0__0_in_rule__Property__Alternatives_41634);
                    rule__Property__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:795:6: ( ( rule__Property__Group_4_1__0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:795:6: ( ( rule__Property__Group_4_1__0 ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:796:1: ( rule__Property__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_4_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:797:1: ( rule__Property__Group_4_1__0 )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:797:2: rule__Property__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4_1__0_in_rule__Property__Alternatives_41652);
                    rule__Property__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__Property__Alternatives_4"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:806:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:810:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) )
            int alt6=7;
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
            case 24:
                {
                alt6=6;
                }
                break;
            case 39:
                {
                alt6=7;
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:811:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:811:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:812:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1685);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:817:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:817:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:818:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1702);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:823:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:823:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:824:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1719);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:829:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:829:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:830:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1736);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:835:6: ( ruleConstantLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:835:6: ( ruleConstantLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:836:1: ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1753);
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
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:841:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:841:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:842:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives1770);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:847:6: ( ruleBuiltInValueLiteral )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:847:6: ( ruleBuiltInValueLiteral )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:848:1: ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives1787);
                    ruleBuiltInValueLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_6()); 
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


    // $ANTLR start "rule__PropertyModifier__Alternatives"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:858:1: rule__PropertyModifier__Alternatives : ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) );
    public final void rule__PropertyModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:862:1: ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:863:1: ( ( 'transient' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:863:1: ( ( 'transient' ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:864:1: ( 'transient' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:865:1: ( 'transient' )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:865:3: 'transient'
                    {
                    match(input,14,FOLLOW_14_in_rule__PropertyModifier__Alternatives1820); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:870:6: ( ( 'auto-increment' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:870:6: ( ( 'auto-increment' ) )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:871:1: ( 'auto-increment' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:872:1: ( 'auto-increment' )
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:872:3: 'auto-increment'
                    {
                    match(input,15,FOLLOW_15_in_rule__PropertyModifier__Alternatives1841); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__PropertyModifier__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:884:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:888:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:889:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01874);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01877);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:896:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:900:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:901:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:901:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:902:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl1905); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:915:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:919:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:920:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11936);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11939);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:927:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:931:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:932:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:932:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:933:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:934:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:934:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1966);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:944:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:948:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:949:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21996);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21999);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:956:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:960:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:961:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:961:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:962:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:963:1: ( rule__Model__PackagesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:963:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl2026);
            	    rule__Model__PackagesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:973:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:977:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:978:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32057);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32060);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:985:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:989:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:990:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:990:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:991:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:992:1: ( rule__Model__ImportsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:992:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2087);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1002:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1006:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1007:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42118);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1013:1: rule__Model__Group__4__Impl : ( ( rule__Model__TypesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1017:1: ( ( ( rule__Model__TypesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1018:1: ( ( rule__Model__TypesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1018:1: ( ( rule__Model__TypesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1019:1: ( rule__Model__TypesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1020:1: ( rule__Model__TypesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=19 && LA10_0<=21)||LA10_0==26||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1020:2: rule__Model__TypesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl2145);
            	    rule__Model__TypesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1040:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1044:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1045:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02186);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02189);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1052:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1056:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1057:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1057:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1058:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl2217); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1071:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1075:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1076:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12248);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1082:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1086:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1087:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1087:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1088:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1089:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1089:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2275);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1103:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1107:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1108:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02309);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02312);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1115:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1119:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1120:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1120:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1121:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Package__Group__0__Impl2340); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1134:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1138:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1139:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12371);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12374);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1146:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1150:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1151:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1151:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1152:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1153:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1153:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2401);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1163:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1167:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1168:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22431);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1174:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1178:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1179:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1179:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1180:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1181:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1181:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2458);
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


    // $ANTLR start "rule__TemplateType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1197:1: rule__TemplateType__Group__0 : rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 ;
    public final void rule__TemplateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1201:1: ( rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1202:2: rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__0__Impl_in_rule__TemplateType__Group__02494);
            rule__TemplateType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group__1_in_rule__TemplateType__Group__02497);
            rule__TemplateType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__0"


    // $ANTLR start "rule__TemplateType__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1209:1: rule__TemplateType__Group__0__Impl : ( ( rule__TemplateType__Group_0__0 )? ) ;
    public final void rule__TemplateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1213:1: ( ( ( rule__TemplateType__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1214:1: ( ( rule__TemplateType__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1214:1: ( ( rule__TemplateType__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1215:1: ( rule__TemplateType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1216:1: ( rule__TemplateType__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1216:2: rule__TemplateType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TemplateType__Group_0__0_in_rule__TemplateType__Group__0__Impl2524);
                    rule__TemplateType__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__0__Impl"


    // $ANTLR start "rule__TemplateType__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1226:1: rule__TemplateType__Group__1 : rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 ;
    public final void rule__TemplateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1230:1: ( rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1231:2: rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__1__Impl_in_rule__TemplateType__Group__12555);
            rule__TemplateType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group__2_in_rule__TemplateType__Group__12558);
            rule__TemplateType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__1"


    // $ANTLR start "rule__TemplateType__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1238:1: rule__TemplateType__Group__1__Impl : ( ( rule__TemplateType__Group_1__0 )? ) ;
    public final void rule__TemplateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1242:1: ( ( ( rule__TemplateType__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1243:1: ( ( rule__TemplateType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1243:1: ( ( rule__TemplateType__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1244:1: ( rule__TemplateType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1245:1: ( rule__TemplateType__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1245:2: rule__TemplateType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TemplateType__Group_1__0_in_rule__TemplateType__Group__1__Impl2585);
                    rule__TemplateType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__1__Impl"


    // $ANTLR start "rule__TemplateType__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1255:1: rule__TemplateType__Group__2 : rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 ;
    public final void rule__TemplateType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1259:1: ( rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1260:2: rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__2__Impl_in_rule__TemplateType__Group__22616);
            rule__TemplateType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group__3_in_rule__TemplateType__Group__22619);
            rule__TemplateType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__2"


    // $ANTLR start "rule__TemplateType__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1267:1: rule__TemplateType__Group__2__Impl : ( 'template' ) ;
    public final void rule__TemplateType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1271:1: ( ( 'template' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1272:1: ( 'template' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1272:1: ( 'template' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1273:1: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__TemplateType__Group__2__Impl2647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__2__Impl"


    // $ANTLR start "rule__TemplateType__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1286:1: rule__TemplateType__Group__3 : rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 ;
    public final void rule__TemplateType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1290:1: ( rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1291:2: rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__3__Impl_in_rule__TemplateType__Group__32678);
            rule__TemplateType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group__4_in_rule__TemplateType__Group__32681);
            rule__TemplateType__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__3"


    // $ANTLR start "rule__TemplateType__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1298:1: rule__TemplateType__Group__3__Impl : ( ( rule__TemplateType__NameAssignment_3 ) ) ;
    public final void rule__TemplateType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1302:1: ( ( ( rule__TemplateType__NameAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1303:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1303:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1304:1: ( rule__TemplateType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getNameAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1305:1: ( rule__TemplateType__NameAssignment_3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1305:2: rule__TemplateType__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__TemplateType__NameAssignment_3_in_rule__TemplateType__Group__3__Impl2708);
            rule__TemplateType__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__3__Impl"


    // $ANTLR start "rule__TemplateType__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1315:1: rule__TemplateType__Group__4 : rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 ;
    public final void rule__TemplateType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1319:1: ( rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1320:2: rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__4__Impl_in_rule__TemplateType__Group__42738);
            rule__TemplateType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group__5_in_rule__TemplateType__Group__42741);
            rule__TemplateType__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__4"


    // $ANTLR start "rule__TemplateType__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1327:1: rule__TemplateType__Group__4__Impl : ( ( rule__TemplateType__Group_4__0 )? ) ;
    public final void rule__TemplateType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1331:1: ( ( ( rule__TemplateType__Group_4__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1332:1: ( ( rule__TemplateType__Group_4__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1332:1: ( ( rule__TemplateType__Group_4__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1333:1: ( rule__TemplateType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1334:1: ( rule__TemplateType__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1334:2: rule__TemplateType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TemplateType__Group_4__0_in_rule__TemplateType__Group__4__Impl2768);
                    rule__TemplateType__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__4__Impl"


    // $ANTLR start "rule__TemplateType__Group__5"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1344:1: rule__TemplateType__Group__5 : rule__TemplateType__Group__5__Impl ;
    public final void rule__TemplateType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1348:1: ( rule__TemplateType__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1349:2: rule__TemplateType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group__5__Impl_in_rule__TemplateType__Group__52799);
            rule__TemplateType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__5"


    // $ANTLR start "rule__TemplateType__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1355:1: rule__TemplateType__Group__5__Impl : ( ( rule__TemplateType__Group_5__0 )? ) ;
    public final void rule__TemplateType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1359:1: ( ( ( rule__TemplateType__Group_5__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1360:1: ( ( rule__TemplateType__Group_5__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1360:1: ( ( rule__TemplateType__Group_5__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1361:1: ( rule__TemplateType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1362:1: ( rule__TemplateType__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1362:2: rule__TemplateType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__TemplateType__Group_5__0_in_rule__TemplateType__Group__5__Impl2826);
                    rule__TemplateType__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group__5__Impl"


    // $ANTLR start "rule__TemplateType__Group_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1384:1: rule__TemplateType__Group_0__0 : rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 ;
    public final void rule__TemplateType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1388:1: ( rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1389:2: rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_0__0__Impl_in_rule__TemplateType__Group_0__02869);
            rule__TemplateType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_0__1_in_rule__TemplateType__Group_0__02872);
            rule__TemplateType__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_0__0"


    // $ANTLR start "rule__TemplateType__Group_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1396:1: rule__TemplateType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__TemplateType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1400:1: ( ( '@author' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1401:1: ( '@author' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1401:1: ( '@author' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1402:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__TemplateType__Group_0__0__Impl2900); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getAuthorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_0__0__Impl"


    // $ANTLR start "rule__TemplateType__Group_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1415:1: rule__TemplateType__Group_0__1 : rule__TemplateType__Group_0__1__Impl ;
    public final void rule__TemplateType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1419:1: ( rule__TemplateType__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1420:2: rule__TemplateType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_0__1__Impl_in_rule__TemplateType__Group_0__12931);
            rule__TemplateType__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_0__1"


    // $ANTLR start "rule__TemplateType__Group_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1426:1: rule__TemplateType__Group_0__1__Impl : ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) ;
    public final void rule__TemplateType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1430:1: ( ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1431:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1431:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1432:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorAssignment_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1433:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1433:2: rule__TemplateType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TemplateType__AuthorAssignment_0_1_in_rule__TemplateType__Group_0__1__Impl2958);
            rule__TemplateType__AuthorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getAuthorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_0__1__Impl"


    // $ANTLR start "rule__TemplateType__Group_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1447:1: rule__TemplateType__Group_1__0 : rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 ;
    public final void rule__TemplateType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1451:1: ( rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1452:2: rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_1__0__Impl_in_rule__TemplateType__Group_1__02992);
            rule__TemplateType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_1__1_in_rule__TemplateType__Group_1__02995);
            rule__TemplateType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_1__0"


    // $ANTLR start "rule__TemplateType__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1459:1: rule__TemplateType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__TemplateType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1463:1: ( ( '@since' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1464:1: ( '@since' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1464:1: ( '@since' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1465:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__TemplateType__Group_1__0__Impl3023); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getSinceKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_1__0__Impl"


    // $ANTLR start "rule__TemplateType__Group_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1478:1: rule__TemplateType__Group_1__1 : rule__TemplateType__Group_1__1__Impl ;
    public final void rule__TemplateType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1482:1: ( rule__TemplateType__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1483:2: rule__TemplateType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_1__1__Impl_in_rule__TemplateType__Group_1__13054);
            rule__TemplateType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_1__1"


    // $ANTLR start "rule__TemplateType__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1489:1: rule__TemplateType__Group_1__1__Impl : ( ( rule__TemplateType__SinceAssignment_1_1 ) ) ;
    public final void rule__TemplateType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1493:1: ( ( ( rule__TemplateType__SinceAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1494:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1494:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1495:1: ( rule__TemplateType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1496:1: ( rule__TemplateType__SinceAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1496:2: rule__TemplateType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TemplateType__SinceAssignment_1_1_in_rule__TemplateType__Group_1__1__Impl3081);
            rule__TemplateType__SinceAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getSinceAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_1__1__Impl"


    // $ANTLR start "rule__TemplateType__Group_4__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1510:1: rule__TemplateType__Group_4__0 : rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 ;
    public final void rule__TemplateType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1514:1: ( rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1515:2: rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_4__0__Impl_in_rule__TemplateType__Group_4__03115);
            rule__TemplateType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_4__1_in_rule__TemplateType__Group_4__03118);
            rule__TemplateType__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__0"


    // $ANTLR start "rule__TemplateType__Group_4__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1522:1: rule__TemplateType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__TemplateType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1526:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1527:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1527:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1528:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__TemplateType__Group_4__0__Impl3146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__0__Impl"


    // $ANTLR start "rule__TemplateType__Group_4__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1541:1: rule__TemplateType__Group_4__1 : rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 ;
    public final void rule__TemplateType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1545:1: ( rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1546:2: rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_4__1__Impl_in_rule__TemplateType__Group_4__13177);
            rule__TemplateType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_4__2_in_rule__TemplateType__Group_4__13180);
            rule__TemplateType__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__1"


    // $ANTLR start "rule__TemplateType__Group_4__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1553:1: rule__TemplateType__Group_4__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) ;
    public final void rule__TemplateType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1557:1: ( ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1558:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1558:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1559:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1560:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1560:2: rule__TemplateType__ParentsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TemplateType__ParentsAssignment_4_1_in_rule__TemplateType__Group_4__1__Impl3207);
            rule__TemplateType__ParentsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__1__Impl"


    // $ANTLR start "rule__TemplateType__Group_4__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1570:1: rule__TemplateType__Group_4__2 : rule__TemplateType__Group_4__2__Impl ;
    public final void rule__TemplateType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1574:1: ( rule__TemplateType__Group_4__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1575:2: rule__TemplateType__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_4__2__Impl_in_rule__TemplateType__Group_4__23237);
            rule__TemplateType__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__2"


    // $ANTLR start "rule__TemplateType__Group_4__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1581:1: rule__TemplateType__Group_4__2__Impl : ( ( rule__TemplateType__Group_4_2__0 )* ) ;
    public final void rule__TemplateType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1585:1: ( ( ( rule__TemplateType__Group_4_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1586:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1586:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1587:1: ( rule__TemplateType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1588:1: ( rule__TemplateType__Group_4_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1588:2: rule__TemplateType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateType__Group_4_2__0_in_rule__TemplateType__Group_4__2__Impl3264);
            	    rule__TemplateType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4__2__Impl"


    // $ANTLR start "rule__TemplateType__Group_4_2__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1604:1: rule__TemplateType__Group_4_2__0 : rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 ;
    public final void rule__TemplateType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1608:1: ( rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1609:2: rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_4_2__0__Impl_in_rule__TemplateType__Group_4_2__03301);
            rule__TemplateType__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_4_2__1_in_rule__TemplateType__Group_4_2__03304);
            rule__TemplateType__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4_2__0"


    // $ANTLR start "rule__TemplateType__Group_4_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1616:1: rule__TemplateType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1620:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1621:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1621:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1622:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__TemplateType__Group_4_2__0__Impl3332); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4_2__0__Impl"


    // $ANTLR start "rule__TemplateType__Group_4_2__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1635:1: rule__TemplateType__Group_4_2__1 : rule__TemplateType__Group_4_2__1__Impl ;
    public final void rule__TemplateType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1639:1: ( rule__TemplateType__Group_4_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1640:2: rule__TemplateType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_4_2__1__Impl_in_rule__TemplateType__Group_4_2__13363);
            rule__TemplateType__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4_2__1"


    // $ANTLR start "rule__TemplateType__Group_4_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1646:1: rule__TemplateType__Group_4_2__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__TemplateType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1650:1: ( ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1651:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1651:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1652:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1653:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1653:2: rule__TemplateType__ParentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__TemplateType__ParentsAssignment_4_2_1_in_rule__TemplateType__Group_4_2__1__Impl3390);
            rule__TemplateType__ParentsAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_4_2__1__Impl"


    // $ANTLR start "rule__TemplateType__Group_5__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1667:1: rule__TemplateType__Group_5__0 : rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 ;
    public final void rule__TemplateType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1671:1: ( rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1672:2: rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_5__0__Impl_in_rule__TemplateType__Group_5__03424);
            rule__TemplateType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_5__1_in_rule__TemplateType__Group_5__03427);
            rule__TemplateType__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__0"


    // $ANTLR start "rule__TemplateType__Group_5__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1679:1: rule__TemplateType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__TemplateType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1683:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1684:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1684:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1685:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__TemplateType__Group_5__0__Impl3455); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__0__Impl"


    // $ANTLR start "rule__TemplateType__Group_5__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1698:1: rule__TemplateType__Group_5__1 : rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 ;
    public final void rule__TemplateType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1702:1: ( rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1703:2: rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_5__1__Impl_in_rule__TemplateType__Group_5__13486);
            rule__TemplateType__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TemplateType__Group_5__2_in_rule__TemplateType__Group_5__13489);
            rule__TemplateType__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__1"


    // $ANTLR start "rule__TemplateType__Group_5__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1710:1: rule__TemplateType__Group_5__1__Impl : ( ( rule__TemplateType__Alternatives_5_1 )* ) ;
    public final void rule__TemplateType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1714:1: ( ( ( rule__TemplateType__Alternatives_5_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1715:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1715:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1716:1: ( rule__TemplateType__Alternatives_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAlternatives_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1717:1: ( rule__TemplateType__Alternatives_5_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=14 && LA16_0<=15)||LA16_0==28||LA16_0==30||LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1717:2: rule__TemplateType__Alternatives_5_1
            	    {
            	    pushFollow(FOLLOW_rule__TemplateType__Alternatives_5_1_in_rule__TemplateType__Group_5__1__Impl3516);
            	    rule__TemplateType__Alternatives_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getAlternatives_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__1__Impl"


    // $ANTLR start "rule__TemplateType__Group_5__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1727:1: rule__TemplateType__Group_5__2 : rule__TemplateType__Group_5__2__Impl ;
    public final void rule__TemplateType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1731:1: ( rule__TemplateType__Group_5__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1732:2: rule__TemplateType__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateType__Group_5__2__Impl_in_rule__TemplateType__Group_5__23547);
            rule__TemplateType__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__2"


    // $ANTLR start "rule__TemplateType__Group_5__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1738:1: rule__TemplateType__Group_5__2__Impl : ( '}' ) ;
    public final void rule__TemplateType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1742:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1743:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1743:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1744:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__TemplateType__Group_5__2__Impl3575); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__Group_5__2__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1763:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1767:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1768:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03612);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03615);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1775:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__Group_0__0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1779:1: ( ( ( rule__RecordType__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1780:1: ( ( rule__RecordType__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1780:1: ( ( rule__RecordType__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1781:1: ( rule__RecordType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1782:1: ( rule__RecordType__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1782:2: rule__RecordType__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_0__0_in_rule__RecordType__Group__0__Impl3642);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1792:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1796:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1797:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13673);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13676);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1804:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__Group_1__0 )? ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1808:1: ( ( ( rule__RecordType__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1809:1: ( ( rule__RecordType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1809:1: ( ( rule__RecordType__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1810:1: ( rule__RecordType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1811:1: ( rule__RecordType__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1811:2: rule__RecordType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_1__0_in_rule__RecordType__Group__1__Impl3703);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1821:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1825:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1826:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23734);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23737);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1833:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__AbstractAssignment_2 )? ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1837:1: ( ( ( rule__RecordType__AbstractAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1838:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1838:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1839:1: ( rule__RecordType__AbstractAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1840:1: ( rule__RecordType__AbstractAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1840:2: rule__RecordType__AbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RecordType__AbstractAssignment_2_in_rule__RecordType__Group__2__Impl3764);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1850:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1854:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1855:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33795);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33798);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1862:1: rule__RecordType__Group__3__Impl : ( 'entity' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1866:1: ( ( 'entity' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1867:1: ( 'entity' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1867:1: ( 'entity' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1868:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getEntityKeyword_3()); 
            }
            match(input,26,FOLLOW_26_in_rule__RecordType__Group__3__Impl3826); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1881:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1885:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1886:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43857);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43860);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1893:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__NameAssignment_4 ) ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1897:1: ( ( ( rule__RecordType__NameAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1898:1: ( ( rule__RecordType__NameAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1898:1: ( ( rule__RecordType__NameAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1899:1: ( rule__RecordType__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1900:1: ( rule__RecordType__NameAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1900:2: rule__RecordType__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__RecordType__NameAssignment_4_in_rule__RecordType__Group__4__Impl3887);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1910:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1914:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1915:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53917);
            rule__RecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53920);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1922:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )? ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1926:1: ( ( ( rule__RecordType__Group_5__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1927:1: ( ( rule__RecordType__Group_5__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1927:1: ( ( rule__RecordType__Group_5__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1928:1: ( rule__RecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1929:1: ( rule__RecordType__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1929:2: rule__RecordType__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3947);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1939:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1943:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1944:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63978);
            rule__RecordType__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63981);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1951:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__Group_6__0 )? ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1955:1: ( ( ( rule__RecordType__Group_6__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1956:1: ( ( rule__RecordType__Group_6__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1956:1: ( ( rule__RecordType__Group_6__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1957:1: ( rule__RecordType__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1958:1: ( rule__RecordType__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1958:2: rule__RecordType__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_6__0_in_rule__RecordType__Group__6__Impl4008);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1968:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1972:1: ( rule__RecordType__Group__7__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1973:2: rule__RecordType__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__74039);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1979:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )? ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1983:1: ( ( ( rule__RecordType__Group_7__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1984:1: ( ( rule__RecordType__Group_7__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1984:1: ( ( rule__RecordType__Group_7__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1985:1: ( rule__RecordType__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1986:1: ( rule__RecordType__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:1986:2: rule__RecordType__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__RecordType__Group_7__0_in_rule__RecordType__Group__7__Impl4066);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2012:1: rule__RecordType__Group_0__0 : rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 ;
    public final void rule__RecordType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2016:1: ( rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2017:2: rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_0__0__Impl_in_rule__RecordType__Group_0__04113);
            rule__RecordType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_0__1_in_rule__RecordType__Group_0__04116);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2024:1: rule__RecordType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__RecordType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2028:1: ( ( '@author' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2029:1: ( '@author' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2029:1: ( '@author' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2030:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__RecordType__Group_0__0__Impl4144); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2043:1: rule__RecordType__Group_0__1 : rule__RecordType__Group_0__1__Impl ;
    public final void rule__RecordType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2047:1: ( rule__RecordType__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2048:2: rule__RecordType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_0__1__Impl_in_rule__RecordType__Group_0__14175);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2054:1: rule__RecordType__Group_0__1__Impl : ( ( rule__RecordType__AuthorAssignment_0_1 ) ) ;
    public final void rule__RecordType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2058:1: ( ( ( rule__RecordType__AuthorAssignment_0_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2059:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2059:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2060:1: ( rule__RecordType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorAssignment_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2061:1: ( rule__RecordType__AuthorAssignment_0_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2061:2: rule__RecordType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RecordType__AuthorAssignment_0_1_in_rule__RecordType__Group_0__1__Impl4202);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2075:1: rule__RecordType__Group_1__0 : rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 ;
    public final void rule__RecordType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2079:1: ( rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2080:2: rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_1__0__Impl_in_rule__RecordType__Group_1__04236);
            rule__RecordType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_1__1_in_rule__RecordType__Group_1__04239);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2087:1: rule__RecordType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__RecordType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2091:1: ( ( '@since' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2092:1: ( '@since' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2092:1: ( '@since' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2093:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__RecordType__Group_1__0__Impl4267); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2106:1: rule__RecordType__Group_1__1 : rule__RecordType__Group_1__1__Impl ;
    public final void rule__RecordType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2110:1: ( rule__RecordType__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2111:2: rule__RecordType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_1__1__Impl_in_rule__RecordType__Group_1__14298);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2117:1: rule__RecordType__Group_1__1__Impl : ( ( rule__RecordType__SinceAssignment_1_1 ) ) ;
    public final void rule__RecordType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2121:1: ( ( ( rule__RecordType__SinceAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2122:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2122:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2123:1: ( rule__RecordType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2124:1: ( rule__RecordType__SinceAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2124:2: rule__RecordType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordType__SinceAssignment_1_1_in_rule__RecordType__Group_1__1__Impl4325);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2138:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2142:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2143:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04359);
            rule__RecordType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04362);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2150:1: rule__RecordType__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2154:1: ( ( 'extends' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2155:1: ( 'extends' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2155:1: ( 'extends' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2156:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__RecordType__Group_5__0__Impl4390); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2169:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2173:1: ( rule__RecordType__Group_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2174:2: rule__RecordType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14421);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2180:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__ParentAssignment_5_1 ) ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2184:1: ( ( ( rule__RecordType__ParentAssignment_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2185:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2185:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2186:1: ( rule__RecordType__ParentAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2187:1: ( rule__RecordType__ParentAssignment_5_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2187:2: rule__RecordType__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentAssignment_5_1_in_rule__RecordType__Group_5__1__Impl4448);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2201:1: rule__RecordType__Group_6__0 : rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 ;
    public final void rule__RecordType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2205:1: ( rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2206:2: rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__0__Impl_in_rule__RecordType__Group_6__04482);
            rule__RecordType__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6__1_in_rule__RecordType__Group_6__04485);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2213:1: rule__RecordType__Group_6__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2217:1: ( ( ':' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2218:1: ( ':' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2218:1: ( ':' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2219:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_6_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__RecordType__Group_6__0__Impl4513); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2232:1: rule__RecordType__Group_6__1 : rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 ;
    public final void rule__RecordType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2236:1: ( rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2237:2: rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__1__Impl_in_rule__RecordType__Group_6__14544);
            rule__RecordType__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6__2_in_rule__RecordType__Group_6__14547);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2244:1: rule__RecordType__Group_6__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_1 ) ) ;
    public final void rule__RecordType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2248:1: ( ( ( rule__RecordType__ParentsAssignment_6_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2249:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2249:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2250:1: ( rule__RecordType__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2251:1: ( rule__RecordType__ParentsAssignment_6_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2251:2: rule__RecordType__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_6_1_in_rule__RecordType__Group_6__1__Impl4574);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2261:1: rule__RecordType__Group_6__2 : rule__RecordType__Group_6__2__Impl ;
    public final void rule__RecordType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2265:1: ( rule__RecordType__Group_6__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2266:2: rule__RecordType__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6__2__Impl_in_rule__RecordType__Group_6__24604);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2272:1: rule__RecordType__Group_6__2__Impl : ( ( rule__RecordType__Group_6_2__0 )* ) ;
    public final void rule__RecordType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2276:1: ( ( ( rule__RecordType__Group_6_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2277:1: ( ( rule__RecordType__Group_6_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2277:1: ( ( rule__RecordType__Group_6_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2278:1: ( rule__RecordType__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2279:1: ( rule__RecordType__Group_6_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2279:2: rule__RecordType__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Group_6_2__0_in_rule__RecordType__Group_6__2__Impl4631);
            	    rule__RecordType__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2295:1: rule__RecordType__Group_6_2__0 : rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 ;
    public final void rule__RecordType__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2299:1: ( rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2300:2: rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__0__Impl_in_rule__RecordType__Group_6_2__04668);
            rule__RecordType__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__1_in_rule__RecordType__Group_6_2__04671);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2307:1: rule__RecordType__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2311:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2312:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2312:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2313:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__RecordType__Group_6_2__0__Impl4699); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2326:1: rule__RecordType__Group_6_2__1 : rule__RecordType__Group_6_2__1__Impl ;
    public final void rule__RecordType__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2330:1: ( rule__RecordType__Group_6_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2331:2: rule__RecordType__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_6_2__1__Impl_in_rule__RecordType__Group_6_2__14730);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2337:1: rule__RecordType__Group_6_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__RecordType__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2341:1: ( ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2342:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2342:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2343:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2344:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2344:2: rule__RecordType__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__RecordType__ParentsAssignment_6_2_1_in_rule__RecordType__Group_6_2__1__Impl4757);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2358:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2362:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2363:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__0__Impl_in_rule__RecordType__Group_7__04791);
            rule__RecordType__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_7__1_in_rule__RecordType__Group_7__04794);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2370:1: rule__RecordType__Group_7__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2374:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2375:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2375:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2376:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__RecordType__Group_7__0__Impl4822); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2389:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2393:1: ( rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2394:2: rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__1__Impl_in_rule__RecordType__Group_7__14853);
            rule__RecordType__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RecordType__Group_7__2_in_rule__RecordType__Group_7__14856);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2401:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__Alternatives_7_1 )* ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2405:1: ( ( ( rule__RecordType__Alternatives_7_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2406:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2406:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2407:1: ( rule__RecordType__Alternatives_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_7_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2408:1: ( rule__RecordType__Alternatives_7_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||(LA24_0>=14 && LA24_0<=15)||LA24_0==28||LA24_0==30||LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2408:2: rule__RecordType__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordType__Alternatives_7_1_in_rule__RecordType__Group_7__1__Impl4883);
            	    rule__RecordType__Alternatives_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2418:1: rule__RecordType__Group_7__2 : rule__RecordType__Group_7__2__Impl ;
    public final void rule__RecordType__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2422:1: ( rule__RecordType__Group_7__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2423:2: rule__RecordType__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordType__Group_7__2__Impl_in_rule__RecordType__Group_7__24914);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2429:1: rule__RecordType__Group_7__2__Impl : ( '}' ) ;
    public final void rule__RecordType__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2433:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2434:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2434:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2435:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__RecordType__Group_7__2__Impl4942); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2454:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2458:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2459:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04979);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04982);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2466:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2470:1: ( ( 'const' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2471:1: ( 'const' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2471:1: ( 'const' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2472:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Constant__Group__0__Impl5010); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2485:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2489:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2490:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__15041);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__15044);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2497:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2501:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2502:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2502:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2503:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2504:1: ( rule__Constant__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2504:2: rule__Constant__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl5071);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2514:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2518:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2519:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__25101);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__25104);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2526:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2530:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2531:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2531:1: ( ( rule__Constant__NameAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2532:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2533:1: ( rule__Constant__NameAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2533:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl5131);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2543:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2547:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2548:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__35161);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__35164);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2555:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2559:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2560:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2560:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2561:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__Constant__Group__3__Impl5192); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2574:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2578:1: ( rule__Constant__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2579:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45223);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2585:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2589:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2590:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2590:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2591:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2592:1: ( rule__Constant__ValueAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2592:2: rule__Constant__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5250);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2612:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2616:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2617:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05290);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05293);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2624:1: rule__Property__Group__0__Impl : ( ( rule__Property__ModifiersAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2628:1: ( ( ( rule__Property__ModifiersAssignment_0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2629:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2629:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2630:1: ( rule__Property__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2631:1: ( rule__Property__ModifiersAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2631:2: rule__Property__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Property__ModifiersAssignment_0_in_rule__Property__Group__0__Impl5320);
            	    rule__Property__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2641:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2645:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2646:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15351);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15354);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2653:1: rule__Property__Group__1__Impl : ( ( rule__Property__ForeignKeyAssignment_1 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2657:1: ( ( ( rule__Property__ForeignKeyAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2658:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2658:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2659:1: ( rule__Property__ForeignKeyAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getForeignKeyAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2660:1: ( rule__Property__ForeignKeyAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2660:2: rule__Property__ForeignKeyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Property__ForeignKeyAssignment_1_in_rule__Property__Group__1__Impl5381);
                    rule__Property__ForeignKeyAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getForeignKeyAssignment_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2670:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2674:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2675:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25412);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25415);
            rule__Property__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2682:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2686:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2687:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2687:1: ( ( rule__Property__Alternatives_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2688:1: ( rule__Property__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2689:1: ( rule__Property__Alternatives_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2689:2: rule__Property__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5442);
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


    // $ANTLR start "rule__Property__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2699:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2703:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2704:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35472);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__35475);
            rule__Property__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2711:1: rule__Property__Group__3__Impl : ( ( rule__Property__NameAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2715:1: ( ( ( rule__Property__NameAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2716:1: ( ( rule__Property__NameAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2716:1: ( ( rule__Property__NameAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2717:1: ( rule__Property__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2718:1: ( rule__Property__NameAssignment_3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2718:2: rule__Property__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_3_in_rule__Property__Group__3__Impl5502);
            rule__Property__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2728:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2732:1: ( rule__Property__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2733:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__45532);
            rule__Property__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2739:1: rule__Property__Group__4__Impl : ( ( rule__Property__Alternatives_4 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2743:1: ( ( ( rule__Property__Alternatives_4 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2744:1: ( ( rule__Property__Alternatives_4 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2744:1: ( ( rule__Property__Alternatives_4 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2745:1: ( rule__Property__Alternatives_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2746:1: ( rule__Property__Alternatives_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24||LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2746:2: rule__Property__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__Property__Alternatives_4_in_rule__Property__Group__4__Impl5559);
                    rule__Property__Alternatives_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group_2_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2766:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2770:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2771:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05600);
            rule__Property__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05603);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2778:1: rule__Property__Group_2_1__0__Impl : ( 'alias' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2782:1: ( ( 'alias' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2783:1: ( 'alias' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2783:1: ( 'alias' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2784:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Property__Group_2_1__0__Impl5631); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2797:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2801:1: ( rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2802:2: rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15662);
            rule__Property__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_2_1__2_in_rule__Property__Group_2_1__15665);
            rule__Property__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2809:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ReferToAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2813:1: ( ( ( rule__Property__ReferToAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2814:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2814:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2815:1: ( rule__Property__ReferToAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2816:1: ( rule__Property__ReferToAssignment_2_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2816:2: rule__Property__ReferToAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Property__ReferToAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5692);
            rule__Property__ReferToAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToAssignment_2_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Property__Group_2_1__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2826:1: rule__Property__Group_2_1__2 : rule__Property__Group_2_1__2__Impl ;
    public final void rule__Property__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2830:1: ( rule__Property__Group_2_1__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2831:2: rule__Property__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_2_1__2__Impl_in_rule__Property__Group_2_1__25722);
            rule__Property__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__2"


    // $ANTLR start "rule__Property__Group_2_1__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2837:1: rule__Property__Group_2_1__2__Impl : ( 'as' ) ;
    public final void rule__Property__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2841:1: ( ( 'as' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2842:1: ( 'as' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2842:1: ( 'as' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2843:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAsKeyword_2_1_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Property__Group_2_1__2__Impl5750); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAsKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_2_1__2__Impl"


    // $ANTLR start "rule__Property__Group_4_0__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2862:1: rule__Property__Group_4_0__0 : rule__Property__Group_4_0__0__Impl rule__Property__Group_4_0__1 ;
    public final void rule__Property__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2866:1: ( rule__Property__Group_4_0__0__Impl rule__Property__Group_4_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2867:2: rule__Property__Group_4_0__0__Impl rule__Property__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4_0__0__Impl_in_rule__Property__Group_4_0__05787);
            rule__Property__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_4_0__1_in_rule__Property__Group_4_0__05790);
            rule__Property__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__0"


    // $ANTLR start "rule__Property__Group_4_0__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2874:1: rule__Property__Group_4_0__0__Impl : ( '{' ) ;
    public final void rule__Property__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2878:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2879:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2879:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2880:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Property__Group_4_0__0__Impl5818); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__0__Impl"


    // $ANTLR start "rule__Property__Group_4_0__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2893:1: rule__Property__Group_4_0__1 : rule__Property__Group_4_0__1__Impl rule__Property__Group_4_0__2 ;
    public final void rule__Property__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2897:1: ( rule__Property__Group_4_0__1__Impl rule__Property__Group_4_0__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2898:2: rule__Property__Group_4_0__1__Impl rule__Property__Group_4_0__2
            {
            pushFollow(FOLLOW_rule__Property__Group_4_0__1__Impl_in_rule__Property__Group_4_0__15849);
            rule__Property__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_4_0__2_in_rule__Property__Group_4_0__15852);
            rule__Property__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__1"


    // $ANTLR start "rule__Property__Group_4_0__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2905:1: rule__Property__Group_4_0__1__Impl : ( ( rule__Property__PropertiesAssignment_4_0_1 )* ) ;
    public final void rule__Property__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2909:1: ( ( ( rule__Property__PropertiesAssignment_4_0_1 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2910:1: ( ( rule__Property__PropertiesAssignment_4_0_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2910:1: ( ( rule__Property__PropertiesAssignment_4_0_1 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2911:1: ( rule__Property__PropertiesAssignment_4_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesAssignment_4_0_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2912:1: ( rule__Property__PropertiesAssignment_4_0_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2912:2: rule__Property__PropertiesAssignment_4_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__PropertiesAssignment_4_0_1_in_rule__Property__Group_4_0__1__Impl5879);
            	    rule__Property__PropertiesAssignment_4_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__1__Impl"


    // $ANTLR start "rule__Property__Group_4_0__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2922:1: rule__Property__Group_4_0__2 : rule__Property__Group_4_0__2__Impl ;
    public final void rule__Property__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2926:1: ( rule__Property__Group_4_0__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2927:2: rule__Property__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4_0__2__Impl_in_rule__Property__Group_4_0__25910);
            rule__Property__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__2"


    // $ANTLR start "rule__Property__Group_4_0__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2933:1: rule__Property__Group_4_0__2__Impl : ( '}' ) ;
    public final void rule__Property__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2937:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2938:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2938:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2939:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_4_0_2()); 
            }
            match(input,25,FOLLOW_25_in_rule__Property__Group_4_0__2__Impl5938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_0__2__Impl"


    // $ANTLR start "rule__Property__Group_4_1__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2958:1: rule__Property__Group_4_1__0 : rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1 ;
    public final void rule__Property__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2962:1: ( rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2963:2: rule__Property__Group_4_1__0__Impl rule__Property__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_4_1__0__Impl_in_rule__Property__Group_4_1__05975);
            rule__Property__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_4_1__1_in_rule__Property__Group_4_1__05978);
            rule__Property__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__0"


    // $ANTLR start "rule__Property__Group_4_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2970:1: rule__Property__Group_4_1__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2974:1: ( ( '=' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2975:1: ( '=' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2975:1: ( '=' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2976:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Property__Group_4_1__0__Impl6006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__0__Impl"


    // $ANTLR start "rule__Property__Group_4_1__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2989:1: rule__Property__Group_4_1__1 : rule__Property__Group_4_1__1__Impl ;
    public final void rule__Property__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2993:1: ( rule__Property__Group_4_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:2994:2: rule__Property__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_4_1__1__Impl_in_rule__Property__Group_4_1__16037);
            rule__Property__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__1"


    // $ANTLR start "rule__Property__Group_4_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3000:1: rule__Property__Group_4_1__1__Impl : ( ( rule__Property__ValueAssignment_4_1_1 ) ) ;
    public final void rule__Property__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3004:1: ( ( ( rule__Property__ValueAssignment_4_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3005:1: ( ( rule__Property__ValueAssignment_4_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3005:1: ( ( rule__Property__ValueAssignment_4_1_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3006:1: ( rule__Property__ValueAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_4_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3007:1: ( rule__Property__ValueAssignment_4_1_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3007:2: rule__Property__ValueAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_4_1_1_in_rule__Property__Group_4_1__1__Impl6064);
            rule__Property__ValueAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4_1__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3021:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3025:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3026:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__0__Impl_in_rule__ForeignKey__Group__06098);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeignKey__Group__1_in_rule__ForeignKey__Group__06101);
            rule__ForeignKey__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0"


    // $ANTLR start "rule__ForeignKey__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3033:1: rule__ForeignKey__Group__0__Impl : ( 'grouped' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3037:1: ( ( 'grouped' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3038:1: ( 'grouped' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3038:1: ( 'grouped' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3039:1: 'grouped'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroupedKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__ForeignKey__Group__0__Impl6129); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getGroupedKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__0__Impl"


    // $ANTLR start "rule__ForeignKey__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3052:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3056:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3057:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__1__Impl_in_rule__ForeignKey__Group__16160);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeignKey__Group__2_in_rule__ForeignKey__Group__16163);
            rule__ForeignKey__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1"


    // $ANTLR start "rule__ForeignKey__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3064:1: rule__ForeignKey__Group__1__Impl : ( 'by' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3068:1: ( ( 'by' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3069:1: ( 'by' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3069:1: ( 'by' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3070:1: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getByKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ForeignKey__Group__1__Impl6191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getByKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3083:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3087:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3088:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__2__Impl_in_rule__ForeignKey__Group__26222);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeignKey__Group__3_in_rule__ForeignKey__Group__26225);
            rule__ForeignKey__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2"


    // $ANTLR start "rule__ForeignKey__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3095:1: rule__ForeignKey__Group__2__Impl : ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3099:1: ( ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3100:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3100:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3101:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3102:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3102:2: rule__ForeignKey__RecordTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ForeignKey__RecordTypeAssignment_2_in_rule__ForeignKey__Group__2__Impl6252);
            rule__ForeignKey__RecordTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getRecordTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__2__Impl"


    // $ANTLR start "rule__ForeignKey__Group__3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3112:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3116:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3117:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__3__Impl_in_rule__ForeignKey__Group__36282);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeignKey__Group__4_in_rule__ForeignKey__Group__36285);
            rule__ForeignKey__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3"


    // $ANTLR start "rule__ForeignKey__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3124:1: rule__ForeignKey__Group__3__Impl : ( '.' ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3128:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3129:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3129:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3130:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getFullStopKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__ForeignKey__Group__3__Impl6313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getFullStopKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__3__Impl"


    // $ANTLR start "rule__ForeignKey__Group__4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3143:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3147:1: ( rule__ForeignKey__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3148:2: rule__ForeignKey__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ForeignKey__Group__4__Impl_in_rule__ForeignKey__Group__46344);
            rule__ForeignKey__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4"


    // $ANTLR start "rule__ForeignKey__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3154:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3158:1: ( ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3159:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3159:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3160:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3161:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3161:2: rule__ForeignKey__PropertyRefAssignment_4
            {
            pushFollow(FOLLOW_rule__ForeignKey__PropertyRefAssignment_4_in_rule__ForeignKey__Group__4__Impl6371);
            rule__ForeignKey__PropertyRefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getPropertyRefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__Group__4__Impl"


    // $ANTLR start "rule__Classifier__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3181:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3185:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3186:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__06411);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__06414);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3193:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__Group_0__0 )? ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3197:1: ( ( ( rule__Classifier__Group_0__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3198:1: ( ( rule__Classifier__Group_0__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3198:1: ( ( rule__Classifier__Group_0__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3199:1: ( rule__Classifier__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3200:1: ( rule__Classifier__Group_0__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==34) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3200:2: rule__Classifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl6441);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3210:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl rule__Classifier__Group__2 ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3214:1: ( rule__Classifier__Group__1__Impl rule__Classifier__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3215:2: rule__Classifier__Group__1__Impl rule__Classifier__Group__2
            {
            pushFollow(FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__16472);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__16475);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3222:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__ClassAssignment_1 ) ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3226:1: ( ( ( rule__Classifier__ClassAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3227:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3227:1: ( ( rule__Classifier__ClassAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3228:1: ( rule__Classifier__ClassAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3229:1: ( rule__Classifier__ClassAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3229:2: rule__Classifier__ClassAssignment_1
            {
            pushFollow(FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl6502);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3239:1: rule__Classifier__Group__2 : rule__Classifier__Group__2__Impl ;
    public final void rule__Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3243:1: ( rule__Classifier__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3244:2: rule__Classifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__26532);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3250:1: rule__Classifier__Group__2__Impl : ( ( rule__Classifier__SizesAssignment_2 )* ) ;
    public final void rule__Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3254:1: ( ( ( rule__Classifier__SizesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3255:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3255:1: ( ( rule__Classifier__SizesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3256:1: ( rule__Classifier__SizesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3257:1: ( rule__Classifier__SizesAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==35) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3257:2: rule__Classifier__SizesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl6559);
            	    rule__Classifier__SizesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3273:1: rule__Classifier__Group_0__0 : rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 ;
    public final void rule__Classifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3277:1: ( rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3278:2: rule__Classifier__Group_0__0__Impl rule__Classifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__06596);
            rule__Classifier__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__06599);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3285:1: rule__Classifier__Group_0__0__Impl : ( ( rule__Classifier__PackageAssignment_0_0 ) ) ;
    public final void rule__Classifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3289:1: ( ( ( rule__Classifier__PackageAssignment_0_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3290:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3290:1: ( ( rule__Classifier__PackageAssignment_0_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3291:1: ( rule__Classifier__PackageAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackageAssignment_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3292:1: ( rule__Classifier__PackageAssignment_0_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3292:2: rule__Classifier__PackageAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl6626);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3302:1: rule__Classifier__Group_0__1 : rule__Classifier__Group_0__1__Impl ;
    public final void rule__Classifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3306:1: ( rule__Classifier__Group_0__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3307:2: rule__Classifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__16656);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3313:1: rule__Classifier__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Classifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3317:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3318:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3318:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3319:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getFullStopKeyword_0_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Classifier__Group_0__1__Impl6684); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3336:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3340:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3341:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06719);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06722);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3348:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3352:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3353:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3353:1: ( () )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3354:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3355:1: ()
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3357:1: 
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3367:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3371:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3372:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16780);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16783);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3379:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3383:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3384:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3384:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3385:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__ArraySize__Group__1__Impl6811); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3398:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3402:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3403:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26842);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26845);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3410:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3414:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3415:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3415:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3416:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3417:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3417:2: rule__ArraySize__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6872);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3427:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3431:1: ( rule__ArraySize__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3432:2: rule__ArraySize__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36903);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3438:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3442:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3443:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3443:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3444:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__ArraySize__Group__3__Impl6931); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3465:1: rule__ReferenceProperty__Group__0 : rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 ;
    public final void rule__ReferenceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3469:1: ( rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3470:2: rule__ReferenceProperty__Group__0__Impl rule__ReferenceProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06970);
            rule__ReferenceProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06973);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3477:1: rule__ReferenceProperty__Group__0__Impl : ( ( rule__ReferenceProperty__RefAssignment_0 ) ) ;
    public final void rule__ReferenceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3481:1: ( ( ( rule__ReferenceProperty__RefAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3482:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3482:1: ( ( rule__ReferenceProperty__RefAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3483:1: ( rule__ReferenceProperty__RefAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3484:1: ( rule__ReferenceProperty__RefAssignment_0 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3484:2: rule__ReferenceProperty__RefAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl7000);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3494:1: rule__ReferenceProperty__Group__1 : rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 ;
    public final void rule__ReferenceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3498:1: ( rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3499:2: rule__ReferenceProperty__Group__1__Impl rule__ReferenceProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__17030);
            rule__ReferenceProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__17033);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3506:1: rule__ReferenceProperty__Group__1__Impl : ( '{' ) ;
    public final void rule__ReferenceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3510:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3511:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3511:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3512:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__ReferenceProperty__Group__1__Impl7061); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3525:1: rule__ReferenceProperty__Group__2 : rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 ;
    public final void rule__ReferenceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3529:1: ( rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3530:2: rule__ReferenceProperty__Group__2__Impl rule__ReferenceProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__27092);
            rule__ReferenceProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__27095);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3537:1: rule__ReferenceProperty__Group__2__Impl : ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) ;
    public final void rule__ReferenceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3541:1: ( ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3542:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3542:1: ( ( rule__ReferenceProperty__PropertiesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3543:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3544:1: ( rule__ReferenceProperty__PropertiesAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3544:2: rule__ReferenceProperty__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl7122);
            	    rule__ReferenceProperty__PropertiesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3554:1: rule__ReferenceProperty__Group__3 : rule__ReferenceProperty__Group__3__Impl ;
    public final void rule__ReferenceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3558:1: ( rule__ReferenceProperty__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3559:2: rule__ReferenceProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__37153);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3565:1: rule__ReferenceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ReferenceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3569:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3570:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3570:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3571:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__ReferenceProperty__Group__3__Impl7181); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3592:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3596:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3597:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__07220);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__07223);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3604:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3608:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3609:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3609:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3610:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ArrayLiteral__Group__0__Impl7251); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3623:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3627:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3628:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__17282);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__17285);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3635:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3639:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3640:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3640:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3641:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3642:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3642:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl7312);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3652:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3656:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3657:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__27342);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__27345);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3664:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3668:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3669:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3669:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3670:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3671:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3671:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl7372);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3681:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3685:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3686:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__37403);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3692:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3696:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3697:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3697:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3698:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,25,FOLLOW_25_in_rule__ArrayLiteral__Group__3__Impl7431); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3719:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3723:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3724:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__07470);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__07473);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3731:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3735:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3736:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3736:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3737:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__ArrayLiteral__Group_2__0__Impl7501); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3750:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3754:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3755:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__17532);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3761:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3765:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3766:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3766:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3767:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3768:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3768:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl7559);
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


    // $ANTLR start "rule__BuiltInValueLiteral__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3782:1: rule__BuiltInValueLiteral__Group__0 : rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 ;
    public final void rule__BuiltInValueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3786:1: ( rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3787:2: rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__07593);
            rule__BuiltInValueLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__07596);
            rule__BuiltInValueLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__0"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3794:1: rule__BuiltInValueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BuiltInValueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3798:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3799:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3799:1: ( () )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3800:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3801:1: ()
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3803:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__0__Impl"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3813:1: rule__BuiltInValueLiteral__Group__1 : rule__BuiltInValueLiteral__Group__1__Impl ;
    public final void rule__BuiltInValueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3817:1: ( rule__BuiltInValueLiteral__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3818:2: rule__BuiltInValueLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__17654);
            rule__BuiltInValueLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__1"


    // $ANTLR start "rule__BuiltInValueLiteral__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3824:1: rule__BuiltInValueLiteral__Group__1__Impl : ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BuiltInValueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3828:1: ( ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3829:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3829:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3830:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3831:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3831:2: rule__BuiltInValueLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl7681);
            rule__BuiltInValueLiteral__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3845:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3849:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3850:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07715);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07718);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3857:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3861:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3862:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3862:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3863:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7745); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3874:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3878:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3879:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17774);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3885:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3889:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3890:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3890:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3891:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3892:1: ( rule__QualifiedName__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==RULE_ID) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3892:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7801);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3906:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3910:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3911:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07836);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07839);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3918:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3922:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3923:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3923:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3924:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3925:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3926:2: '.'
            {
            match(input,34,FOLLOW_34_in_rule__QualifiedName__Group_1__0__Impl7868); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3937:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3941:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3942:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17900);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3948:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3952:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3953:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3953:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3954:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7927); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3969:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3973:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3974:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07960);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07963);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3981:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3985:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3986:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3986:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3987:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7990);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:3998:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4002:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4003:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18019);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4009:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4013:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4014:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4014:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4015:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4016:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4016:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8046);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4030:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4034:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4035:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__08081);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__08084);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4042:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4046:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4047:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4047:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4048:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl8112); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4061:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4065:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4066:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__18143);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4072:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4076:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4077:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4077:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4078:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl8171); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4096:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4100:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4101:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4101:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4102:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_18211);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4111:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4115:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4116:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4116:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4117:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_28242);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4126:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4130:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4131:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4131:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4132:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_38273);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4141:1: rule__Model__TypesAssignment_4 : ( ruleType ) ;
    public final void rule__Model__TypesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4145:1: ( ( ruleType ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4146:1: ( ruleType )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4146:1: ( ruleType )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4147:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment_48304);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4156:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4160:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4161:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4161:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4162:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_18335);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4171:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4175:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4176:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4176:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4177:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_18366); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4186:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4190:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4191:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4191:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4192:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4193:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4194:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_28401); if (state.failed) return ;
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


    // $ANTLR start "rule__TemplateType__AuthorAssignment_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4205:1: rule__TemplateType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4209:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4210:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4210:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4211:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TemplateType__AuthorAssignment_0_18436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__AuthorAssignment_0_1"


    // $ANTLR start "rule__TemplateType__SinceAssignment_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4220:1: rule__TemplateType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4224:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4225:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4225:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4226:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TemplateType__SinceAssignment_1_18467); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__SinceAssignment_1_1"


    // $ANTLR start "rule__TemplateType__NameAssignment_3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4235:1: rule__TemplateType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TemplateType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4239:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4240:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4240:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4241:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemplateType__NameAssignment_38498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__NameAssignment_3"


    // $ANTLR start "rule__TemplateType__ParentsAssignment_4_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4250:1: rule__TemplateType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4254:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4255:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4255:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4256:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4257:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4258:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TemplateType__ParentsAssignment_4_18533);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__ParentsAssignment_4_1"


    // $ANTLR start "rule__TemplateType__ParentsAssignment_4_2_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4269:1: rule__TemplateType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4273:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4274:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4274:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4275:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4276:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4277:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TemplateType__ParentsAssignment_4_2_18572);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__ParentsAssignment_4_2_1"


    // $ANTLR start "rule__TemplateType__PropertiesAssignment_5_1_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4288:1: rule__TemplateType__PropertiesAssignment_5_1_0 : ( ruleProperty ) ;
    public final void rule__TemplateType__PropertiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4292:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4293:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4293:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4294:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__TemplateType__PropertiesAssignment_5_1_08607);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__PropertiesAssignment_5_1_0"


    // $ANTLR start "rule__TemplateType__ConstantsAssignment_5_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4303:1: rule__TemplateType__ConstantsAssignment_5_1_1 : ( ruleConstant ) ;
    public final void rule__TemplateType__ConstantsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4307:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4308:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4308:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4309:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__TemplateType__ConstantsAssignment_5_1_18638);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateType__ConstantsAssignment_5_1_1"


    // $ANTLR start "rule__RecordType__AuthorAssignment_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4318:1: rule__RecordType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4322:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4323:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4323:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4324:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RecordType__AuthorAssignment_0_18669); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4333:1: rule__RecordType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4337:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4338:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4338:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4339:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RecordType__SinceAssignment_1_18700); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4348:1: rule__RecordType__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4352:1: ( ( ( 'abstract' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4353:1: ( ( 'abstract' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4353:1: ( ( 'abstract' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4354:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4355:1: ( 'abstract' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4356:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RecordType__AbstractAssignment_28736); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4371:1: rule__RecordType__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4375:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4376:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4376:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4377:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_48775); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4386:1: rule__RecordType__ParentAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4390:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4391:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4391:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4392:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4393:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4394:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_5_18810);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4405:1: rule__RecordType__ParentsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4409:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4410:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4410:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4411:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4412:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4413:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_18849);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4424:1: rule__RecordType__ParentsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4428:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4429:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4429:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4430:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4431:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4432:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_2_18888);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4443:1: rule__RecordType__PropertiesAssignment_7_1_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4447:1: ( ( ruleProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4448:1: ( ruleProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4448:1: ( ruleProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4449:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_7_1_08923);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4458:1: rule__RecordType__ConstantsAssignment_7_1_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4462:1: ( ( ruleConstant ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4463:1: ( ruleConstant )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4463:1: ( ruleConstant )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4464:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_7_1_18954);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4473:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4477:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4478:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4478:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4479:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_18985);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4488:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4492:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4493:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4493:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4494:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_29016); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4503:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4507:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4508:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4508:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4509:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_49047);
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


    // $ANTLR start "rule__Property__ModifiersAssignment_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4518:1: rule__Property__ModifiersAssignment_0 : ( rulePropertyModifier ) ;
    public final void rule__Property__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4522:1: ( ( rulePropertyModifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4523:1: ( rulePropertyModifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4523:1: ( rulePropertyModifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4524:1: rulePropertyModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getModifiersPropertyModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulePropertyModifier_in_rule__Property__ModifiersAssignment_09078);
            rulePropertyModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getModifiersPropertyModifierEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ModifiersAssignment_0"


    // $ANTLR start "rule__Property__ForeignKeyAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4533:1: rule__Property__ForeignKeyAssignment_1 : ( ruleForeignKey ) ;
    public final void rule__Property__ForeignKeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4537:1: ( ( ruleForeignKey ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4538:1: ( ruleForeignKey )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4538:1: ( ruleForeignKey )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4539:1: ruleForeignKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getForeignKeyForeignKeyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleForeignKey_in_rule__Property__ForeignKeyAssignment_19109);
            ruleForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getForeignKeyForeignKeyParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ForeignKeyAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_2_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4548:1: rule__Property__TypeAssignment_2_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4552:1: ( ( ruleClassifier ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:1: ( ruleClassifier )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4553:1: ( ruleClassifier )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4554:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_2_09140);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_2_0"


    // $ANTLR start "rule__Property__ReferToAssignment_2_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4563:1: rule__Property__ReferToAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReferToAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4567:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4568:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4568:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4569:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4570:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4571:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_2_1_19175); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ReferToAssignment_2_1_1"


    // $ANTLR start "rule__Property__NameAssignment_3"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4582:1: rule__Property__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4586:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4587:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4587:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4588:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_39210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_3"


    // $ANTLR start "rule__Property__PropertiesAssignment_4_0_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4597:1: rule__Property__PropertiesAssignment_4_0_1 : ( ruleReferenceProperty ) ;
    public final void rule__Property__PropertiesAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4601:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4602:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4602:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4603:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_4_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_4_0_19241);
            ruleReferenceProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertiesReferencePropertyParserRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertiesAssignment_4_0_1"


    // $ANTLR start "rule__Property__ValueAssignment_4_1_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4612:1: rule__Property__ValueAssignment_4_1_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4616:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4617:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4617:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4618:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_4_1_19272);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_4_1_1"


    // $ANTLR start "rule__ForeignKey__RecordTypeAssignment_2"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4627:1: rule__ForeignKey__RecordTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RecordTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4631:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4632:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4632:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4633:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4634:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4635:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeignKey__RecordTypeAssignment_29307); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__RecordTypeAssignment_2"


    // $ANTLR start "rule__ForeignKey__PropertyRefAssignment_4"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4646:1: rule__ForeignKey__PropertyRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__PropertyRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4650:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4651:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4651:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4652:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyCrossReference_4_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4653:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4654:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeignKey__PropertyRefAssignment_49346); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeignKey__PropertyRefAssignment_4"


    // $ANTLR start "rule__Classifier__PackageAssignment_0_0"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4665:1: rule__Classifier__PackageAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__PackageAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4669:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4670:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4670:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4671:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4672:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4673:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getPackagePackageIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_09385); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4684:1: rule__Classifier__ClassAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__ClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4688:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4689:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4689:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4690:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4691:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4692:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getClassEClassifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_19424); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4703:1: rule__Classifier__SizesAssignment_2 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4707:1: ( ( ruleArraySize ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4708:1: ( ruleArraySize )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4708:1: ( ruleArraySize )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4709:1: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_29459);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4718:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4722:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4723:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4723:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4724:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_29490); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4733:1: rule__ReferenceProperty__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ReferenceProperty__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4737:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4738:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4738:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4739:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4740:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4741:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getRefEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_09525); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4752:1: rule__ReferenceProperty__PropertiesAssignment_2 : ( ruleReferenceProperty ) ;
    public final void rule__ReferenceProperty__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4756:1: ( ( ruleReferenceProperty ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4757:1: ( ruleReferenceProperty )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4757:1: ( ruleReferenceProperty )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4758:1: ruleReferenceProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferencePropertyAccess().getPropertiesReferencePropertyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_29560);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4767:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4771:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4772:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4772:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4773:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_19591);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4782:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4786:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4787:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4787:1: ( ruleLiteral )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4788:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_19622);
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4797:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4801:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4802:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4802:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4803:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment9653); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4812:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4816:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4817:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4817:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4818:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment9684); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4827:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4831:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4832:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4832:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4833:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment9715); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4842:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4846:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4847:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4847:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4848:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment9746); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4857:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4861:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4862:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4862:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4863:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4864:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4865:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment9781); if (state.failed) return ;
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


    // $ANTLR start "rule__BuiltInValueLiteral__ValueAssignment_1"
    // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4876:1: rule__BuiltInValueLiteral__ValueAssignment_1 : ( ( 'KIEKER_VERSION' ) ) ;
    public final void rule__BuiltInValueLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4880:1: ( ( ( 'KIEKER_VERSION' ) ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4881:1: ( ( 'KIEKER_VERSION' ) )
            {
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4881:1: ( ( 'KIEKER_VERSION' ) )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4882:1: ( 'KIEKER_VERSION' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4883:1: ( 'KIEKER_VERSION' )
            // ../de.cau.cs.se.instrumentation.rl.ui/src-gen/de/cau/cs/se/instrumentation/rl/ui/contentassist/antlr/internal/InternalRecordLang.g:4884:1: 'KIEKER_VERSION'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__BuiltInValueLiteral__ValueAssignment_19821); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltInValueLiteral__ValueAssignment_1"

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
    public static final BitSet FOLLOW_ruleTemplateType_in_entryRuleTemplateType307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateType314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__0_in_ruleTemplateType340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0_in_ruleRecordType400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0_in_ruleConstant460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_entryRuleForeignKey547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeignKey554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__0_in_ruleForeignKey580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0_in_ruleClassifier640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_entryRuleArraySize667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySize674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0_in_ruleArraySize700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_entryRuleReferenceProperty727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceProperty734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0_in_ruleReferenceProperty760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral880 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_entryRuleBuiltInValueLiteral1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltInValueLiteral1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0_in_ruleBuiltInValueLiteral1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyModifier__Alternatives_in_rulePropertyModifier1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_rule__Type__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateType_in_rule__Type__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__PropertiesAssignment_5_1_0_in_rule__TemplateType__Alternatives_5_11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__ConstantsAssignment_5_1_1_in_rule__TemplateType__Alternatives_5_11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__PropertiesAssignment_7_1_0_in_rule__RecordType__Alternatives_7_11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ConstantsAssignment_7_1_1_in_rule__RecordType__Alternatives_7_11550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_2_0_in_rule__Property__Alternatives_21583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0_in_rule__Property__Alternatives_21601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__0_in_rule__Property__Alternatives_41634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__0_in_rule__Property__Alternatives_41652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantLiteral_in_rule__Literal__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltInValueLiteral_in_rule__Literal__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PropertyModifier__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropertyModifier__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11936 = new BitSet(new long[]{0x00000040043E0000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21996 = new BitSet(new long[]{0x00000040043E0000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl2026 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32057 = new BitSet(new long[]{0x00000040043E0000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2087 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_4_in_rule__Model__Group__4__Impl2145 = new BitSet(new long[]{0x0000004004380002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__02309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__02312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Package__Group__0__Impl2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__12371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__12374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__22431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__0__Impl_in_rule__TemplateType__Group__02494 = new BitSet(new long[]{0x0000004004380000L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__1_in_rule__TemplateType__Group__02497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_0__0_in_rule__TemplateType__Group__0__Impl2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__1__Impl_in_rule__TemplateType__Group__12555 = new BitSet(new long[]{0x0000004004380000L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__2_in_rule__TemplateType__Group__12558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_1__0_in_rule__TemplateType__Group__1__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__2__Impl_in_rule__TemplateType__Group__22616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__3_in_rule__TemplateType__Group__22619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TemplateType__Group__2__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__3__Impl_in_rule__TemplateType__Group__32678 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__4_in_rule__TemplateType__Group__32681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__NameAssignment_3_in_rule__TemplateType__Group__3__Impl2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__4__Impl_in_rule__TemplateType__Group__42738 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__5_in_rule__TemplateType__Group__42741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__0_in_rule__TemplateType__Group__4__Impl2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group__5__Impl_in_rule__TemplateType__Group__52799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__0_in_rule__TemplateType__Group__5__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_0__0__Impl_in_rule__TemplateType__Group_0__02869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_0__1_in_rule__TemplateType__Group_0__02872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TemplateType__Group_0__0__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_0__1__Impl_in_rule__TemplateType__Group_0__12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__AuthorAssignment_0_1_in_rule__TemplateType__Group_0__1__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_1__0__Impl_in_rule__TemplateType__Group_1__02992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_1__1_in_rule__TemplateType__Group_1__02995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TemplateType__Group_1__0__Impl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_1__1__Impl_in_rule__TemplateType__Group_1__13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__SinceAssignment_1_1_in_rule__TemplateType__Group_1__1__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__0__Impl_in_rule__TemplateType__Group_4__03115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__1_in_rule__TemplateType__Group_4__03118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TemplateType__Group_4__0__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__1__Impl_in_rule__TemplateType__Group_4__13177 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__2_in_rule__TemplateType__Group_4__13180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__ParentsAssignment_4_1_in_rule__TemplateType__Group_4__1__Impl3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4__2__Impl_in_rule__TemplateType__Group_4__23237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4_2__0_in_rule__TemplateType__Group_4__2__Impl3264 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4_2__0__Impl_in_rule__TemplateType__Group_4_2__03301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4_2__1_in_rule__TemplateType__Group_4_2__03304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TemplateType__Group_4_2__0__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_4_2__1__Impl_in_rule__TemplateType__Group_4_2__13363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__ParentsAssignment_4_2_1_in_rule__TemplateType__Group_4_2__1__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__0__Impl_in_rule__TemplateType__Group_5__03424 = new BitSet(new long[]{0x000000015200C010L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__1_in_rule__TemplateType__Group_5__03427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TemplateType__Group_5__0__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__1__Impl_in_rule__TemplateType__Group_5__13486 = new BitSet(new long[]{0x000000015200C010L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__2_in_rule__TemplateType__Group_5__13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateType__Alternatives_5_1_in_rule__TemplateType__Group_5__1__Impl3516 = new BitSet(new long[]{0x000000015000C012L});
    public static final BitSet FOLLOW_rule__TemplateType__Group_5__2__Impl_in_rule__TemplateType__Group_5__23547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__TemplateType__Group_5__2__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__0__Impl_in_rule__RecordType__Group__03612 = new BitSet(new long[]{0x0000004004300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1_in_rule__RecordType__Group__03615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__0_in_rule__RecordType__Group__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__1__Impl_in_rule__RecordType__Group__13673 = new BitSet(new long[]{0x0000004004300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2_in_rule__RecordType__Group__13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__0_in_rule__RecordType__Group__1__Impl3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__2__Impl_in_rule__RecordType__Group__23734 = new BitSet(new long[]{0x0000004004300000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3_in_rule__RecordType__Group__23737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AbstractAssignment_2_in_rule__RecordType__Group__2__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__3__Impl_in_rule__RecordType__Group__33795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4_in_rule__RecordType__Group__33798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RecordType__Group__3__Impl3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__4__Impl_in_rule__RecordType__Group__43857 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5_in_rule__RecordType__Group__43860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__NameAssignment_4_in_rule__RecordType__Group__4__Impl3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__5__Impl_in_rule__RecordType__Group__53917 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6_in_rule__RecordType__Group__53920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0_in_rule__RecordType__Group__5__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__6__Impl_in_rule__RecordType__Group__63978 = new BitSet(new long[]{0x0000000009400000L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7_in_rule__RecordType__Group__63981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__0_in_rule__RecordType__Group__6__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group__7__Impl_in_rule__RecordType__Group__74039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__0_in_rule__RecordType__Group__7__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__0__Impl_in_rule__RecordType__Group_0__04113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__1_in_rule__RecordType__Group_0__04116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordType__Group_0__0__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_0__1__Impl_in_rule__RecordType__Group_0__14175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__AuthorAssignment_0_1_in_rule__RecordType__Group_0__1__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__0__Impl_in_rule__RecordType__Group_1__04236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__1_in_rule__RecordType__Group_1__04239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordType__Group_1__0__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_1__1__Impl_in_rule__RecordType__Group_1__14298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__SinceAssignment_1_1_in_rule__RecordType__Group_1__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__0__Impl_in_rule__RecordType__Group_5__04359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1_in_rule__RecordType__Group_5__04362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordType__Group_5__0__Impl4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_5__1__Impl_in_rule__RecordType__Group_5__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentAssignment_5_1_in_rule__RecordType__Group_5__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__0__Impl_in_rule__RecordType__Group_6__04482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__1_in_rule__RecordType__Group_6__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordType__Group_6__0__Impl4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__1__Impl_in_rule__RecordType__Group_6__14544 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__2_in_rule__RecordType__Group_6__14547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_6_1_in_rule__RecordType__Group_6__1__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6__2__Impl_in_rule__RecordType__Group_6__24604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__0_in_rule__RecordType__Group_6__2__Impl4631 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__0__Impl_in_rule__RecordType__Group_6_2__04668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__1_in_rule__RecordType__Group_6_2__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordType__Group_6_2__0__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_6_2__1__Impl_in_rule__RecordType__Group_6_2__14730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__ParentsAssignment_6_2_1_in_rule__RecordType__Group_6_2__1__Impl4757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__0__Impl_in_rule__RecordType__Group_7__04791 = new BitSet(new long[]{0x000000015200C010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__1_in_rule__RecordType__Group_7__04794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RecordType__Group_7__0__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__1__Impl_in_rule__RecordType__Group_7__14853 = new BitSet(new long[]{0x000000015200C010L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__2_in_rule__RecordType__Group_7__14856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordType__Alternatives_7_1_in_rule__RecordType__Group_7__1__Impl4883 = new BitSet(new long[]{0x000000015000C012L});
    public static final BitSet FOLLOW_rule__RecordType__Group_7__2__Impl_in_rule__RecordType__Group_7__24914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RecordType__Group_7__2__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__0__Impl_in_rule__Constant__Group__04979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__1_in_rule__Constant__Group__04982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Constant__Group__0__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__1__Impl_in_rule__Constant__Group__15041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constant__Group__2_in_rule__Constant__Group__15044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__TypeAssignment_1_in_rule__Constant__Group__1__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__2__Impl_in_rule__Constant__Group__25101 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Constant__Group__3_in_rule__Constant__Group__25104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NameAssignment_2_in_rule__Constant__Group__2__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__3__Impl_in_rule__Constant__Group__35161 = new BitSet(new long[]{0x00000080010001F0L});
    public static final BitSet FOLLOW_rule__Constant__Group__4_in_rule__Constant__Group__35164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Constant__Group__3__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group__4__Impl_in_rule__Constant__Group__45223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__ValueAssignment_4_in_rule__Constant__Group__4__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__05290 = new BitSet(new long[]{0x000000014000C010L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__05293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ModifiersAssignment_0_in_rule__Property__Group__0__Impl5320 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__15351 = new BitSet(new long[]{0x000000014000C010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__15354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ForeignKeyAssignment_1_in_rule__Property__Group__1__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__25412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__25415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__35472 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__35475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_3_in_rule__Property__Group__3__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__45532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_4_in_rule__Property__Group__4__Impl5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__0__Impl_in_rule__Property__Group_2_1__05600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1_in_rule__Property__Group_2_1__05603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Property__Group_2_1__0__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__1__Impl_in_rule__Property__Group_2_1__15662 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__2_in_rule__Property__Group_2_1__15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ReferToAssignment_2_1_1_in_rule__Property__Group_2_1__1__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_2_1__2__Impl_in_rule__Property__Group_2_1__25722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Property__Group_2_1__2__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__0__Impl_in_rule__Property__Group_4_0__05787 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__1_in_rule__Property__Group_4_0__05790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Property__Group_4_0__0__Impl5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__1__Impl_in_rule__Property__Group_4_0__15849 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__2_in_rule__Property__Group_4_0__15852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__PropertiesAssignment_4_0_1_in_rule__Property__Group_4_0__1__Impl5879 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Property__Group_4_0__2__Impl_in_rule__Property__Group_4_0__25910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Property__Group_4_0__2__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__0__Impl_in_rule__Property__Group_4_1__05975 = new BitSet(new long[]{0x00000080010001F0L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__1_in_rule__Property__Group_4_1__05978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Property__Group_4_1__0__Impl6006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_4_1__1__Impl_in_rule__Property__Group_4_1__16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_4_1_1_in_rule__Property__Group_4_1__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__0__Impl_in_rule__ForeignKey__Group__06098 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__1_in_rule__ForeignKey__Group__06101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ForeignKey__Group__0__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__1__Impl_in_rule__ForeignKey__Group__16160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__2_in_rule__ForeignKey__Group__16163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ForeignKey__Group__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__2__Impl_in_rule__ForeignKey__Group__26222 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__3_in_rule__ForeignKey__Group__26225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__RecordTypeAssignment_2_in_rule__ForeignKey__Group__2__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__3__Impl_in_rule__ForeignKey__Group__36282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__4_in_rule__ForeignKey__Group__36285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ForeignKey__Group__3__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__Group__4__Impl_in_rule__ForeignKey__Group__46344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeignKey__PropertyRefAssignment_4_in_rule__ForeignKey__Group__4__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__0__Impl_in_rule__Classifier__Group__06411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1_in_rule__Classifier__Group__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0_in_rule__Classifier__Group__0__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__1__Impl_in_rule__Classifier__Group__16472 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2_in_rule__Classifier__Group__16475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__ClassAssignment_1_in_rule__Classifier__Group__1__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group__2__Impl_in_rule__Classifier__Group__26532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__SizesAssignment_2_in_rule__Classifier__Group__2__Impl6559 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__0__Impl_in_rule__Classifier__Group_0__06596 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1_in_rule__Classifier__Group_0__06599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__PackageAssignment_0_0_in_rule__Classifier__Group_0__0__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Classifier__Group_0__1__Impl_in_rule__Classifier__Group_0__16656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Classifier__Group_0__1__Impl6684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__0__Impl_in_rule__ArraySize__Group__06719 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1_in_rule__ArraySize__Group__06722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__1__Impl_in_rule__ArraySize__Group__16780 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2_in_rule__ArraySize__Group__16783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ArraySize__Group__1__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__2__Impl_in_rule__ArraySize__Group__26842 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3_in_rule__ArraySize__Group__26845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__SizeAssignment_2_in_rule__ArraySize__Group__2__Impl6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArraySize__Group__3__Impl_in_rule__ArraySize__Group__36903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ArraySize__Group__3__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__0__Impl_in_rule__ReferenceProperty__Group__06970 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1_in_rule__ReferenceProperty__Group__06973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__RefAssignment_0_in_rule__ReferenceProperty__Group__0__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__1__Impl_in_rule__ReferenceProperty__Group__17030 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2_in_rule__ReferenceProperty__Group__17033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ReferenceProperty__Group__1__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__2__Impl_in_rule__ReferenceProperty__Group__27092 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3_in_rule__ReferenceProperty__Group__27095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__PropertiesAssignment_2_in_rule__ReferenceProperty__Group__2__Impl7122 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ReferenceProperty__Group__3__Impl_in_rule__ReferenceProperty__Group__37153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ReferenceProperty__Group__3__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__07220 = new BitSet(new long[]{0x00000080010001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__07223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArrayLiteral__Group__0__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__17282 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__17285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__27342 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__27345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl7372 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__37403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ArrayLiteral__Group__3__Impl7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__07470 = new BitSet(new long[]{0x00000080010001F0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__07473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArrayLiteral__Group_2__0__Impl7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__17532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__0__Impl_in_rule__BuiltInValueLiteral__Group__07593 = new BitSet(new long[]{0x00000080010001F0L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1_in_rule__BuiltInValueLiteral__Group__07596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__Group__1__Impl_in_rule__BuiltInValueLiteral__Group__17654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltInValueLiteral__ValueAssignment_1_in_rule__BuiltInValueLiteral__Group__1__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07715 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7801 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__QualifiedName__Group_1__0__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__07960 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__07963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__18019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__08081 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__08084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__18143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_18211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_28242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_38273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment_48304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_18335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_18366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_28401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TemplateType__AuthorAssignment_0_18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TemplateType__SinceAssignment_1_18467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemplateType__NameAssignment_38498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TemplateType__ParentsAssignment_4_18533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TemplateType__ParentsAssignment_4_2_18572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__TemplateType__PropertiesAssignment_5_1_08607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__TemplateType__ConstantsAssignment_5_1_18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RecordType__AuthorAssignment_0_18669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RecordType__SinceAssignment_1_18700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RecordType__AbstractAssignment_28736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RecordType__NameAssignment_48775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentAssignment_5_18810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_18849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RecordType__ParentsAssignment_6_2_18888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__RecordType__PropertiesAssignment_7_1_08923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_rule__RecordType__ConstantsAssignment_7_1_18954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Constant__TypeAssignment_18985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constant__NameAssignment_29016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Constant__ValueAssignment_49047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyModifier_in_rule__Property__ModifiersAssignment_09078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeignKey_in_rule__Property__ForeignKeyAssignment_19109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__Property__TypeAssignment_2_09140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ReferToAssignment_2_1_19175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_39210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__Property__PropertiesAssignment_4_0_19241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Property__ValueAssignment_4_1_19272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeignKey__RecordTypeAssignment_29307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeignKey__PropertyRefAssignment_49346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__PackageAssignment_0_09385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Classifier__ClassAssignment_19424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySize_in_rule__Classifier__SizesAssignment_29459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ArraySize__SizeAssignment_29490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReferenceProperty__RefAssignment_09525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceProperty_in_rule__ReferenceProperty__PropertiesAssignment_29560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_19591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_19622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstantLiteral__ValueAssignment9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__BuiltInValueLiteral__ValueAssignment_19821 = new BitSet(new long[]{0x0000000000000002L});

}
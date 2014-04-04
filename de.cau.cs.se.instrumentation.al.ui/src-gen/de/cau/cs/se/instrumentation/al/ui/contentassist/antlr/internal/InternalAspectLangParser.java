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
import de.cau.cs.se.instrumentation.al.services.AspectLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAspectLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'", "'package'", "'import'", "'register'", "'use'", "'on'", "','", "'.'", "'aspect'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'#'", "'$'", "'**'", "'<<'", "'@'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=11;
    public static final int RULE_INT=7;
    public static final int RULE_COMMENT_ANNOTATION=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_FLOAT=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=13;

    // delegates
    // delegators


        public InternalAspectLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAspectLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAspectLangParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g"; }


     
     	private AspectLangGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AspectLangGrammarAccess grammarAccess) {
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:63:1: ruleModel EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:77:2: rule__Model__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:90:1: ( ruleImport EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:91:1: ruleImport EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:105:2: rule__Import__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:117:1: entryRuleRegisteredPackage : ruleRegisteredPackage EOF ;
    public final void entryRuleRegisteredPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:118:1: ( ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:119:1: ruleRegisteredPackage EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:126:1: ruleRegisteredPackage : ( ( rule__RegisteredPackage__Group__0 ) ) ;
    public final void ruleRegisteredPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:130:2: ( ( ( rule__RegisteredPackage__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:131:1: ( ( rule__RegisteredPackage__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:131:1: ( ( rule__RegisteredPackage__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:132:1: ( rule__RegisteredPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:133:1: ( rule__RegisteredPackage__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:133:2: rule__RegisteredPackage__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:145:1: entryRuleApplicationModel : ruleApplicationModel EOF ;
    public final void entryRuleApplicationModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:146:1: ( ruleApplicationModel EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:147:1: ruleApplicationModel EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:154:1: ruleApplicationModel : ( ( rule__ApplicationModel__Group__0 ) ) ;
    public final void ruleApplicationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:158:2: ( ( ( rule__ApplicationModel__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:159:1: ( ( rule__ApplicationModel__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:159:1: ( ( rule__ApplicationModel__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:160:1: ( rule__ApplicationModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:161:1: ( rule__ApplicationModel__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:161:2: rule__ApplicationModel__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:173:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:174:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:175:1: ruleQualifiedName EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:182:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:186:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:187:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:187:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:188:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:189:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:189:2: rule__QualifiedName__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:201:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:202:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:203:1: ruleQualifiedNameWithWildcard EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:210:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:214:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:215:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:215:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:216:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:217:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:217:2: rule__QualifiedNameWithWildcard__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:229:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:230:1: ( ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:231:1: ruleAspect EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:238:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:242:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:243:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:243:1: ( ( rule__Aspect__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:244:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:245:1: ( rule__Aspect__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:245:2: rule__Aspect__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:257:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:258:1: ( ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:259:1: ruleQuery EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:266:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:270:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:271:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:271:1: ( ( rule__Query__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:272:1: ( rule__Query__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:273:1: ( rule__Query__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:273:2: rule__Query__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:285:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:286:1: ( ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:287:1: ruleParameterPattern EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:294:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:298:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:299:1: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:299:1: ( ( rule__ParameterPattern__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:300:1: ( rule__ParameterPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:301:1: ( rule__ParameterPattern__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:301:2: rule__ParameterPattern__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:313:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:314:1: ( ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:315:1: ruleLocationQuery EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:322:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:326:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:327:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:327:1: ( ( rule__LocationQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:328:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:329:1: ( rule__LocationQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:329:2: rule__LocationQuery__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:341:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:342:1: ( ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:343:1: ruleNode EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:350:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:354:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:355:1: ( ( rule__Node__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:355:1: ( ( rule__Node__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:356:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:357:1: ( rule__Node__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:357:2: rule__Node__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:369:1: entryRuleParamQuery : ruleParamQuery EOF ;
    public final void entryRuleParamQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:370:1: ( ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:371:1: ruleParamQuery EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:378:1: ruleParamQuery : ( ( rule__ParamQuery__Group__0 ) ) ;
    public final void ruleParamQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:382:2: ( ( ( rule__ParamQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:383:1: ( ( rule__ParamQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:383:1: ( ( rule__ParamQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:384:1: ( rule__ParamQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:385:1: ( rule__ParamQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:385:2: rule__ParamQuery__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:397:1: entryRuleParamCompare : ruleParamCompare EOF ;
    public final void entryRuleParamCompare() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:398:1: ( ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:399:1: ruleParamCompare EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:406:1: ruleParamCompare : ( ( rule__ParamCompare__Group__0 ) ) ;
    public final void ruleParamCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:410:2: ( ( ( rule__ParamCompare__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:411:1: ( ( rule__ParamCompare__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:411:1: ( ( rule__ParamCompare__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:412:1: ( rule__ParamCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:413:1: ( rule__ParamCompare__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:413:2: rule__ParamCompare__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:425:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:426:1: ( ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:427:1: ruleValue EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:434:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:438:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:439:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:439:1: ( ( rule__Value__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:440:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:441:1: ( rule__Value__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:441:2: rule__Value__Alternatives
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:453:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:454:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:455:1: ruleFloatValue EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:462:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:466:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:467:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:467:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:468:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:469:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:469:2: rule__FloatValue__ValueAssignment
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:481:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:482:1: ( ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:483:1: ruleIntValue EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:490:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:494:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:495:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:495:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:496:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:497:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:497:2: rule__IntValue__ValueAssignment
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:509:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:510:1: ( ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:511:1: ruleStringValue EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:518:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:522:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:523:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:523:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:524:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:525:1: ( rule__StringValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:525:2: rule__StringValue__ValueAssignment
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:537:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:538:1: ( ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:539:1: ruleReferenceValue EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:546:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:550:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:551:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:551:1: ( ( rule__ReferenceValue__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:552:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:553:1: ( rule__ReferenceValue__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:553:2: rule__ReferenceValue__Group__0
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:565:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:566:1: ( ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:567:1: ruleParameter EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:574:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:578:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:579:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:579:1: ( ( rule__Parameter__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:580:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:581:1: ( rule__Parameter__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:581:2: rule__Parameter__Alternatives
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


    // $ANTLR start "entryRuleInternalFunctionProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:593:1: entryRuleInternalFunctionProperty : ruleInternalFunctionProperty EOF ;
    public final void entryRuleInternalFunctionProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:594:1: ( ruleInternalFunctionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:595:1: ruleInternalFunctionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleInternalFunctionProperty_in_entryRuleInternalFunctionProperty1207);
            ruleInternalFunctionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInternalFunctionProperty1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInternalFunctionProperty"


    // $ANTLR start "ruleInternalFunctionProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:602:1: ruleInternalFunctionProperty : ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) ;
    public final void ruleInternalFunctionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:606:2: ( ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:607:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:607:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:608:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyAccess().getFunctionAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:609:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:609:2: rule__InternalFunctionProperty__FunctionAssignment
            {
            pushFollow(FOLLOW_rule__InternalFunctionProperty__FunctionAssignment_in_ruleInternalFunctionProperty1240);
            rule__InternalFunctionProperty__FunctionAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInternalFunctionPropertyAccess().getFunctionAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalFunctionProperty"


    // $ANTLR start "entryRuleRuntimeProperty"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:621:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:622:1: ( ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:623:1: ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1267);
            ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:630:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:634:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:635:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:635:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:636:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:637:1: ( rule__RuntimeProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:637:2: rule__RuntimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1300);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:649:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:650:1: ( ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:651:1: ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1327);
            ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty1334); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:658:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:662:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:663:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:663:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:664:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:665:1: ( rule__ReflectionProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:665:2: rule__ReflectionProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1360);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:677:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:678:1: ( ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:679:1: ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode1387);
            ruleContainerNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:686:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:690:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:691:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:691:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:692:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:693:1: ( rule__ContainerNode__ContainerAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:693:2: rule__ContainerNode__ContainerAssignment
            {
            pushFollow(FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1420);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:705:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:706:1: ( ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:707:1: ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1447);
            ruleWildcardNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:714:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:718:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:719:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:719:1: ( ( rule__WildcardNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:720:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:721:1: ( rule__WildcardNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:721:2: rule__WildcardNode__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1480);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:733:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:734:1: ( ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:735:1: ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1507);
            ruleSubPathNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:742:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:746:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:747:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:747:1: ( ( rule__SubPathNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:748:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:749:1: ( rule__SubPathNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:749:2: rule__SubPathNode__Group__0
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1540);
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


    // $ANTLR start "entryRuleParentNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:761:1: entryRuleParentNode : ruleParentNode EOF ;
    public final void entryRuleParentNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:762:1: ( ruleParentNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:763:1: ruleParentNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeRule()); 
            }
            pushFollow(FOLLOW_ruleParentNode_in_entryRuleParentNode1567);
            ruleParentNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParentNode1574); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParentNode"


    // $ANTLR start "ruleParentNode"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:770:1: ruleParentNode : ( ( rule__ParentNode__Group__0 ) ) ;
    public final void ruleParentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:774:2: ( ( ( rule__ParentNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:775:1: ( ( rule__ParentNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:775:1: ( ( rule__ParentNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:776:1: ( rule__ParentNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:777:1: ( rule__ParentNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:777:2: rule__ParentNode__Group__0
            {
            pushFollow(FOLLOW_rule__ParentNode__Group__0_in_ruleParentNode1600);
            rule__ParentNode__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParentNode"


    // $ANTLR start "entryRuleCollector"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:789:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:790:1: ( ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:791:1: ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector1627);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector1634); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:798:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:802:2: ( ( ( rule__Collector__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:803:1: ( ( rule__Collector__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:803:1: ( ( rule__Collector__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:804:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:805:1: ( rule__Collector__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:805:2: rule__Collector__Group__0
            {
            pushFollow(FOLLOW_rule__Collector__Group__0_in_ruleCollector1660);
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:817:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:818:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:819:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1687);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1694); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:826:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:830:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:831:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:831:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:832:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:833:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:833:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1720);
            rule__Annotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:847:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:848:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:849:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1749);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation1756); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCommentAnnotation"


    // $ANTLR start "ruleCommentAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:856:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:860:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:861:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:861:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:862:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:863:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:863:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1782);
            rule__CommentAnnotation__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentAnnotation"


    // $ANTLR start "entryRuleTagAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:875:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:876:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:877:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1809);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation1816); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTagAnnotation"


    // $ANTLR start "ruleTagAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:884:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:888:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:889:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:889:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:890:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:891:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:891:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1842);
            rule__TagAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:903:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:904:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:905:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1869);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1876); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyStringValueAnnotation"


    // $ANTLR start "ruleKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:912:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:916:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:917:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:917:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:918:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:919:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:919:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1902);
            rule__KeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:931:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:932:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:933:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1929);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1936); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTypedKeyStringValueAnnotation"


    // $ANTLR start "ruleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:940:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:944:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:945:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:945:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:946:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:947:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:947:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1962);
            rule__TypedKeyStringValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:959:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:960:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:961:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1989);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1996); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyBooleanValueAnnotation"


    // $ANTLR start "ruleKeyBooleanValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:968:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:972:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:973:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:973:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:974:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:975:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:975:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation2022);
            rule__KeyBooleanValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:987:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:988:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:989:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation2049);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation2056); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyIntValueAnnotation"


    // $ANTLR start "ruleKeyIntValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:996:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1000:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1001:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1001:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1002:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1003:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1003:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation2082);
            rule__KeyIntValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1015:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1016:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1017:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation2109);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation2116); if (state.failed) return ;

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
    // $ANTLR end "entryRuleKeyFloatValueAnnotation"


    // $ANTLR start "ruleKeyFloatValueAnnotation"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1024:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1028:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1029:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1029:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1030:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1031:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1031:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation2142);
            rule__KeyFloatValueAnnotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1045:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1046:1: ( ruleEString EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1047:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2171);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2178); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1054:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1058:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1059:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1059:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1060:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1061:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1061:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString2204);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1073:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1074:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1075:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID2231);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID2238); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1082:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1086:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1087:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1087:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1088:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1089:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1089:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2264);
            rule__ExtendedID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleInternalFunction"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1102:1: ruleInternalFunction : ( ( rule__InternalFunction__Alternatives ) ) ;
    public final void ruleInternalFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1106:1: ( ( ( rule__InternalFunction__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1107:1: ( ( rule__InternalFunction__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1107:1: ( ( rule__InternalFunction__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1108:1: ( rule__InternalFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1109:1: ( rule__InternalFunction__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1109:2: rule__InternalFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__InternalFunction__Alternatives_in_ruleInternalFunction2301);
            rule__InternalFunction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternalFunction"


    // $ANTLR start "ruleReflectionFunction"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1121:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1125:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1126:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1126:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1127:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1128:1: ( rule__ReflectionFunction__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1128:2: rule__ReflectionFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction2337);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1140:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1144:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1145:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1145:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1146:1: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1147:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1147:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator2373);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1159:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1163:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1164:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1164:1: ( ( rule__InsertionPoint__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1165:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1166:1: ( rule__InsertionPoint__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1166:2: rule__InsertionPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint2409);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1177:1: rule__Query__Alternatives_1_0 : ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1181:1: ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1182:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1182:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1183:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1184:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1184:2: rule__Query__ModifierAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_02444);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1188:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1188:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1189:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Query__Alternatives_1_02463); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1201:1: rule__Query__Alternatives_1_1 : ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1205:1: ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1206:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1206:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1207:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1208:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1208:2: rule__Query__ReturnTypeAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_12497);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1212:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1212:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1213:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Query__Alternatives_1_12516); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1225:1: rule__ParameterPattern__Alternatives_0 : ( ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) ) | ( '*' ) );
    public final void rule__ParameterPattern__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1229:1: ( ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) ) | ( '*' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1230:1: ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1230:1: ( ( rule__ParameterPattern__ModifierAssignment_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1231:1: ( rule__ParameterPattern__ModifierAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterPatternAccess().getModifierAssignment_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1232:1: ( rule__ParameterPattern__ModifierAssignment_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1232:2: rule__ParameterPattern__ModifierAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ParameterPattern__ModifierAssignment_0_0_in_rule__ParameterPattern__Alternatives_02550);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1236:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1236:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1237:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterPatternAccess().getAsteriskKeyword_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ParameterPattern__Alternatives_02569); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1249:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1253:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1254:1: ( ruleSubPathNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1254:1: ( ruleSubPathNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1255:1: ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_02603);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1260:6: ( ruleWildcardNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1260:6: ( ruleWildcardNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1261:1: ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_02620);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1266:6: ( ruleParentNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1266:6: ( ruleParentNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1267:1: ruleParentNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleParentNode_in_rule__Node__Alternatives_02637);
                    ruleParentNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1272:6: ( ruleContainerNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1272:6: ( ruleContainerNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1273:1: ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_02654);
                    ruleContainerNode();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1283:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1287:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
            case 15:
            case 16:
            case 17:
            case 18:
            case 46:
            case 47:
            case 48:
            case 49:
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1288:1: ( ruleStringValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1288:1: ( ruleStringValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1289:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives2686);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1294:6: ( ruleIntValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1294:6: ( ruleIntValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1295:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives2703);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1300:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1300:6: ( ruleFloatValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1301:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__Alternatives2720);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1306:6: ( ruleReferenceValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1306:6: ( ruleReferenceValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1307:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives2737);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1317:1: rule__Parameter__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) | ( ruleInternalFunctionProperty ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1321:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) | ( ruleInternalFunctionProperty ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 16:
            case 17:
            case 18:
                {
                alt6=3;
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1322:1: ( ruleRuntimeProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1322:1: ( ruleRuntimeProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1323:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives2769);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1328:6: ( ruleReflectionProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1328:6: ( ruleReflectionProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1329:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2786);
                    ruleReflectionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1334:6: ( ruleInternalFunctionProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1334:6: ( ruleInternalFunctionProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1335:1: ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleInternalFunctionProperty_in_rule__Parameter__Alternatives2803);
                    ruleInternalFunctionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getInternalFunctionPropertyParserRuleCall_2()); 
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1345:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1349:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1350:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1350:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1351:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives2835);
                    ruleCommentAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1356:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1356:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1357:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives2852);
                    ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1362:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1362:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1363:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives2869);
                    ruleKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1368:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1368:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1369:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives2886);
                    ruleTypedKeyStringValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1374:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1374:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1375:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives2903);
                    ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1380:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1380:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1381:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives2920);
                    ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1386:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1386:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1387:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives2937);
                    ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
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
    // $ANTLR end "rule__Annotation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1403:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1403:1: ( RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1404:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2970); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1409:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1409:6: ( RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1410:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2987); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__InternalFunction__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1420:1: rule__InternalFunction__Alternatives : ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) );
    public final void rule__InternalFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1424:1: ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1425:1: ( ( 'time' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1425:1: ( ( 'time' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1426:1: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1427:1: ( 'time' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1427:3: 'time'
                    {
                    match(input,16,FOLLOW_16_in_rule__InternalFunction__Alternatives3020); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1432:6: ( ( 'traceId' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1432:6: ( ( 'traceId' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1433:1: ( 'traceId' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1434:1: ( 'traceId' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1434:3: 'traceId'
                    {
                    match(input,17,FOLLOW_17_in_rule__InternalFunction__Alternatives3041); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1439:6: ( ( 'orderIndex' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1439:6: ( ( 'orderIndex' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1440:1: ( 'orderIndex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1441:1: ( 'orderIndex' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1441:3: 'orderIndex'
                    {
                    match(input,18,FOLLOW_18_in_rule__InternalFunction__Alternatives3062); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__InternalFunction__Alternatives"


    // $ANTLR start "rule__ReflectionFunction__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1451:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1455:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
                {
                alt10=3;
                }
                break;
            case 22:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1456:1: ( ( 'name' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1456:1: ( ( 'name' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1457:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1458:1: ( 'name' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1458:3: 'name'
                    {
                    match(input,19,FOLLOW_19_in_rule__ReflectionFunction__Alternatives3098); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1463:6: ( ( 'signature' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1463:6: ( ( 'signature' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1464:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1465:1: ( 'signature' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1465:3: 'signature'
                    {
                    match(input,20,FOLLOW_20_in_rule__ReflectionFunction__Alternatives3119); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1470:6: ( ( 'class' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1470:6: ( ( 'class' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1471:1: ( 'class' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1472:1: ( 'class' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1472:3: 'class'
                    {
                    match(input,21,FOLLOW_21_in_rule__ReflectionFunction__Alternatives3140); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1477:6: ( ( 'return-type' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1477:6: ( ( 'return-type' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1478:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1479:1: ( 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1479:3: 'return-type'
                    {
                    match(input,22,FOLLOW_22_in_rule__ReflectionFunction__Alternatives3161); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1489:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1493:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
                {
                alt11=5;
                }
                break;
            case 28:
                {
                alt11=6;
                }
                break;
            case 29:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1494:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1494:1: ( ( '=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1495:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1496:1: ( '=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1496:3: '='
                    {
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives3197); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1501:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1501:6: ( ( '~' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1502:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1503:1: ( '~' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1503:3: '~'
                    {
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives3218); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1508:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1508:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1509:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1510:1: ( '!=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1510:3: '!='
                    {
                    match(input,25,FOLLOW_25_in_rule__Operator__Alternatives3239); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1515:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1515:6: ( ( '>' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1516:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1517:1: ( '>' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1517:3: '>'
                    {
                    match(input,26,FOLLOW_26_in_rule__Operator__Alternatives3260); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1522:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1522:6: ( ( '<' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1523:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1524:1: ( '<' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1524:3: '<'
                    {
                    match(input,27,FOLLOW_27_in_rule__Operator__Alternatives3281); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1529:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1529:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1530:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1531:1: ( '>=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1531:3: '>='
                    {
                    match(input,28,FOLLOW_28_in_rule__Operator__Alternatives3302); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1536:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1536:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1537:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1538:1: ( '<=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1538:3: '<='
                    {
                    match(input,29,FOLLOW_29_in_rule__Operator__Alternatives3323); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1548:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1552:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1553:1: ( ( 'before' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1553:1: ( ( 'before' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1554:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1555:1: ( 'before' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1555:3: 'before'
                    {
                    match(input,30,FOLLOW_30_in_rule__InsertionPoint__Alternatives3359); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1560:6: ( ( 'after' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1560:6: ( ( 'after' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1561:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1562:1: ( 'after' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1562:3: 'after'
                    {
                    match(input,31,FOLLOW_31_in_rule__InsertionPoint__Alternatives3380); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1574:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1578:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1579:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03413);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03416);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1586:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1590:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1591:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1591:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1592:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Model__Group__0__Impl3444); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1605:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1609:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1610:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13475);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13478);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1617:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1621:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1622:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1622:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1623:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1624:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1624:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3505);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1634:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1638:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1639:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23535);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23538);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1646:1: rule__Model__Group__2__Impl : ( ( rule__Model__MetamodelsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1650:1: ( ( ( rule__Model__MetamodelsAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1651:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1651:1: ( ( rule__Model__MetamodelsAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1652:1: ( rule__Model__MetamodelsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1653:1: ( rule__Model__MetamodelsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1653:2: rule__Model__MetamodelsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl3565);
            	    rule__Model__MetamodelsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1663:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1667:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1668:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33596);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33599);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1675:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1679:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1680:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1680:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1681:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1682:1: ( rule__Model__ImportsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1682:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl3626);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1692:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1696:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1697:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43657);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43660);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1704:1: rule__Model__Group__4__Impl : ( ( rule__Model__SourcesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1708:1: ( ( ( rule__Model__SourcesAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1709:1: ( ( rule__Model__SourcesAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1709:1: ( ( rule__Model__SourcesAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1710:1: ( rule__Model__SourcesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1711:1: ( rule__Model__SourcesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1711:2: rule__Model__SourcesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__SourcesAssignment_4_in_rule__Model__Group__4__Impl3687);
            	    rule__Model__SourcesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1721:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1725:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1726:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53718);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1732:1: rule__Model__Group__5__Impl : ( ( rule__Model__AspectsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1736:1: ( ( ( rule__Model__AspectsAssignment_5 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1737:1: ( ( rule__Model__AspectsAssignment_5 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1737:1: ( ( rule__Model__AspectsAssignment_5 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1738:1: ( rule__Model__AspectsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1739:1: ( rule__Model__AspectsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMENT_ANNOTATION||LA16_0==39||LA16_0==50) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1739:2: rule__Model__AspectsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__AspectsAssignment_5_in_rule__Model__Group__5__Impl3745);
            	    rule__Model__AspectsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1761:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1765:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1766:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03788);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03791);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1773:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1777:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1778:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1778:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1779:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Import__Group__0__Impl3819); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1792:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1796:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1797:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13850);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1803:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1807:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1808:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1808:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1809:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1810:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1810:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3877);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1824:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1828:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1829:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03911);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03914);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1836:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1840:1: ( ( 'register' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1841:1: ( 'register' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1841:1: ( 'register' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1842:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__RegisteredPackage__Group__0__Impl3942); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1855:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1859:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1860:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13973);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13976);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1867:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1871:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1872:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1872:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1873:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1874:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1874:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl4003);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1884:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1888:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1889:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__24033);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1895:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1899:1: ( ( ( rule__RegisteredPackage__EPackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1900:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1900:1: ( ( rule__RegisteredPackage__EPackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1901:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1902:1: ( rule__RegisteredPackage__EPackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1902:2: rule__RegisteredPackage__EPackageAssignment_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl4060);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1918:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1922:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1923:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__04096);
            rule__ApplicationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__04099);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1930:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1934:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1935:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1935:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1936:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__ApplicationModel__Group__0__Impl4127); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1949:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1953:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1954:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__14158);
            rule__ApplicationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__14161);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1961:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1965:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1966:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1966:1: ( ( rule__ApplicationModel__UsePackagesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1967:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1968:1: ( rule__ApplicationModel__UsePackagesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1968:2: rule__ApplicationModel__UsePackagesAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl4188);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1978:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1982:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1983:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__24218);
            rule__ApplicationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__24221);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1990:1: rule__ApplicationModel__Group__2__Impl : ( ( rule__ApplicationModel__Group_2__0 )* ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1994:1: ( ( ( rule__ApplicationModel__Group_2__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1995:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1995:1: ( ( rule__ApplicationModel__Group_2__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1996:1: ( rule__ApplicationModel__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1997:1: ( rule__ApplicationModel__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:1997:2: rule__ApplicationModel__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl4248);
            	    rule__ApplicationModel__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2007:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2011:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2012:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__34279);
            rule__ApplicationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__34282);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2019:1: rule__ApplicationModel__Group__3__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2023:1: ( ( 'on' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2024:1: ( 'on' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2024:1: ( 'on' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2025:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__ApplicationModel__Group__3__Impl4310); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2038:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2042:1: ( rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2043:2: rule__ApplicationModel__Group__4__Impl rule__ApplicationModel__Group__5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__44341);
            rule__ApplicationModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__44344);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2050:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__NameAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2054:1: ( ( ( rule__ApplicationModel__NameAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2055:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2055:1: ( ( rule__ApplicationModel__NameAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2056:1: ( rule__ApplicationModel__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2057:1: ( rule__ApplicationModel__NameAssignment_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2057:2: rule__ApplicationModel__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl4371);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2067:1: rule__ApplicationModel__Group__5 : rule__ApplicationModel__Group__5__Impl ;
    public final void rule__ApplicationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2071:1: ( rule__ApplicationModel__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2072:2: rule__ApplicationModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__54401);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2078:1: rule__ApplicationModel__Group__5__Impl : ( ( rule__ApplicationModel__ModelAssignment_5 ) ) ;
    public final void rule__ApplicationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2082:1: ( ( ( rule__ApplicationModel__ModelAssignment_5 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2083:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2083:1: ( ( rule__ApplicationModel__ModelAssignment_5 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2084:1: ( rule__ApplicationModel__ModelAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2085:1: ( rule__ApplicationModel__ModelAssignment_5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2085:2: rule__ApplicationModel__ModelAssignment_5
            {
            pushFollow(FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl4428);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2107:1: rule__ApplicationModel__Group_2__0 : rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 ;
    public final void rule__ApplicationModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2111:1: ( rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2112:2: rule__ApplicationModel__Group_2__0__Impl rule__ApplicationModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__04470);
            rule__ApplicationModel__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__04473);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2119:1: rule__ApplicationModel__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ApplicationModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2123:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2124:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2124:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2125:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getCommaKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ApplicationModel__Group_2__0__Impl4501); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2138:1: rule__ApplicationModel__Group_2__1 : rule__ApplicationModel__Group_2__1__Impl ;
    public final void rule__ApplicationModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2142:1: ( rule__ApplicationModel__Group_2__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2143:2: rule__ApplicationModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__14532);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2149:1: rule__ApplicationModel__Group_2__1__Impl : ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) ;
    public final void rule__ApplicationModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2153:1: ( ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2154:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2154:1: ( ( rule__ApplicationModel__UsePackagesAssignment_2_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2155:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2156:1: ( rule__ApplicationModel__UsePackagesAssignment_2_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2156:2: rule__ApplicationModel__UsePackagesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl4559);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2170:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2174:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2175:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04593);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04596);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2182:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2186:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2187:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2187:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2188:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4623); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2199:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2203:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2204:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14652);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2210:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2214:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2215:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2215:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2216:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2217:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==RULE_ID) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2217:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4679);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2231:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2235:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2236:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04714);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04717);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2243:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2247:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2248:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2248:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2249:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2250:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2251:2: '.'
            {
            match(input,38,FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl4746); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2262:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2266:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2267:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14778);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2273:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2277:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2278:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2278:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2279:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4805); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2294:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2298:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2299:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__04838);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__04841);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2306:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2310:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2311:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2311:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2312:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl4868);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2323:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2327:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2328:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__14897);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2334:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2338:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2339:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2339:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2340:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2341:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2341:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl4924);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2355:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2359:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2360:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__04959);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__04962);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2367:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2371:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2372:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2372:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2373:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4990); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2386:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2390:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2391:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__15021);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2397:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2401:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2402:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2402:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2403:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl5049); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2420:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2424:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2425:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__05084);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__05087);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2432:1: rule__Aspect__Group__0__Impl : ( ( rule__Aspect__AnnotationAssignment_0 )? ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2436:1: ( ( ( rule__Aspect__AnnotationAssignment_0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2437:1: ( ( rule__Aspect__AnnotationAssignment_0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2437:1: ( ( rule__Aspect__AnnotationAssignment_0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2438:1: ( rule__Aspect__AnnotationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAnnotationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2439:1: ( rule__Aspect__AnnotationAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2439:2: rule__Aspect__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Aspect__AnnotationAssignment_0_in_rule__Aspect__Group__0__Impl5114);
                    rule__Aspect__AnnotationAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2449:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2453:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2454:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__15145);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__15148);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2461:1: rule__Aspect__Group__1__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2465:1: ( ( 'aspect' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2466:1: ( 'aspect' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2466:1: ( 'aspect' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2467:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Aspect__Group__1__Impl5176); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAspectKeyword_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2480:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2484:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2485:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__25207);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__25210);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2492:1: rule__Aspect__Group__2__Impl : ( ( rule__Aspect__QueryAssignment_2 ) ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2496:1: ( ( ( rule__Aspect__QueryAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2497:1: ( ( rule__Aspect__QueryAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2497:1: ( ( rule__Aspect__QueryAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2498:1: ( rule__Aspect__QueryAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2499:1: ( rule__Aspect__QueryAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2499:2: rule__Aspect__QueryAssignment_2
            {
            pushFollow(FOLLOW_rule__Aspect__QueryAssignment_2_in_rule__Aspect__Group__2__Impl5237);
            rule__Aspect__QueryAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getQueryAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2509:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2513:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2514:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__35267);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__35270);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2521:1: rule__Aspect__Group__3__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2525:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2526:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2526:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2527:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,40,FOLLOW_40_in_rule__Aspect__Group__3__Impl5298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2540:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl rule__Aspect__Group__5 ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2544:1: ( rule__Aspect__Group__4__Impl rule__Aspect__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2545:2: rule__Aspect__Group__4__Impl rule__Aspect__Group__5
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__45329);
            rule__Aspect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__5_in_rule__Aspect__Group__45332);
            rule__Aspect__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2552:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__CollectorsAssignment_4 )* ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2556:1: ( ( ( rule__Aspect__CollectorsAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2557:1: ( ( rule__Aspect__CollectorsAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2557:1: ( ( rule__Aspect__CollectorsAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2558:1: ( rule__Aspect__CollectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2559:1: ( rule__Aspect__CollectorsAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=30 && LA21_0<=31)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2559:2: rule__Aspect__CollectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Aspect__CollectorsAssignment_4_in_rule__Aspect__Group__4__Impl5359);
            	    rule__Aspect__CollectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getCollectorsAssignment_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Aspect__Group__5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2569:1: rule__Aspect__Group__5 : rule__Aspect__Group__5__Impl ;
    public final void rule__Aspect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2573:1: ( rule__Aspect__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2574:2: rule__Aspect__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__5__Impl_in_rule__Aspect__Group__55390);
            rule__Aspect__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__5"


    // $ANTLR start "rule__Aspect__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2580:1: rule__Aspect__Group__5__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2584:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2585:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2585:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2586:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,41,FOLLOW_41_in_rule__Aspect__Group__5__Impl5418); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2611:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2615:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2616:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__05461);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__05464);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2623:1: rule__Query__Group__0__Impl : ( ( rule__Query__LocationAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2627:1: ( ( ( rule__Query__LocationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2628:1: ( ( rule__Query__LocationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2628:1: ( ( rule__Query__LocationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2629:1: ( rule__Query__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2630:1: ( rule__Query__LocationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2630:2: rule__Query__LocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl5491);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2640:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2644:1: ( rule__Query__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2645:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__15521);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2651:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2655:1: ( ( ( rule__Query__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2656:1: ( ( rule__Query__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2656:1: ( ( rule__Query__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2657:1: ( rule__Query__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2658:1: ( rule__Query__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==15) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2658:2: rule__Query__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl5548);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2672:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2676:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2677:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__05583);
            rule__Query__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__05586);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2684:1: rule__Query__Group_1__0__Impl : ( ( rule__Query__Alternatives_1_0 ) ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2688:1: ( ( ( rule__Query__Alternatives_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2689:1: ( ( rule__Query__Alternatives_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2689:1: ( ( rule__Query__Alternatives_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2690:1: ( rule__Query__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2691:1: ( rule__Query__Alternatives_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2691:2: rule__Query__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl5613);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2701:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl rule__Query__Group_1__2 ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2705:1: ( rule__Query__Group_1__1__Impl rule__Query__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2706:2: rule__Query__Group_1__1__Impl rule__Query__Group_1__2
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__15643);
            rule__Query__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__15646);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2713:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__Alternatives_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2717:1: ( ( ( rule__Query__Alternatives_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2718:1: ( ( rule__Query__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2718:1: ( ( rule__Query__Alternatives_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2719:1: ( rule__Query__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2720:1: ( rule__Query__Alternatives_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2720:2: rule__Query__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl5673);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2730:1: rule__Query__Group_1__2 : rule__Query__Group_1__2__Impl rule__Query__Group_1__3 ;
    public final void rule__Query__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2734:1: ( rule__Query__Group_1__2__Impl rule__Query__Group_1__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2735:2: rule__Query__Group_1__2__Impl rule__Query__Group_1__3
            {
            pushFollow(FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__25703);
            rule__Query__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__25706);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2742:1: rule__Query__Group_1__2__Impl : ( ( rule__Query__MethodAssignment_1_2 ) ) ;
    public final void rule__Query__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2746:1: ( ( ( rule__Query__MethodAssignment_1_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2747:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2747:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2748:1: ( rule__Query__MethodAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2749:1: ( rule__Query__MethodAssignment_1_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2749:2: rule__Query__MethodAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl5733);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2759:1: rule__Query__Group_1__3 : rule__Query__Group_1__3__Impl rule__Query__Group_1__4 ;
    public final void rule__Query__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2763:1: ( rule__Query__Group_1__3__Impl rule__Query__Group_1__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2764:2: rule__Query__Group_1__3__Impl rule__Query__Group_1__4
            {
            pushFollow(FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__35763);
            rule__Query__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__35766);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2771:1: rule__Query__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Query__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2775:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2776:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2776:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2777:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,42,FOLLOW_42_in_rule__Query__Group_1__3__Impl5794); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2790:1: rule__Query__Group_1__4 : rule__Query__Group_1__4__Impl rule__Query__Group_1__5 ;
    public final void rule__Query__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2794:1: ( rule__Query__Group_1__4__Impl rule__Query__Group_1__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2795:2: rule__Query__Group_1__4__Impl rule__Query__Group_1__5
            {
            pushFollow(FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__45825);
            rule__Query__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__45828);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2802:1: rule__Query__Group_1__4__Impl : ( ( rule__Query__ParameterAssignment_1_4 ) ) ;
    public final void rule__Query__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2806:1: ( ( ( rule__Query__ParameterAssignment_1_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2807:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2807:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2808:1: ( rule__Query__ParameterAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2809:1: ( rule__Query__ParameterAssignment_1_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2809:2: rule__Query__ParameterAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl5855);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2819:1: rule__Query__Group_1__5 : rule__Query__Group_1__5__Impl rule__Query__Group_1__6 ;
    public final void rule__Query__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2823:1: ( rule__Query__Group_1__5__Impl rule__Query__Group_1__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2824:2: rule__Query__Group_1__5__Impl rule__Query__Group_1__6
            {
            pushFollow(FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__55885);
            rule__Query__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__55888);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2831:1: rule__Query__Group_1__5__Impl : ( ( rule__Query__Group_1_5__0 )* ) ;
    public final void rule__Query__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2835:1: ( ( ( rule__Query__Group_1_5__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2836:1: ( ( rule__Query__Group_1_5__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2836:1: ( ( rule__Query__Group_1_5__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2837:1: ( rule__Query__Group_1_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2838:1: ( rule__Query__Group_1_5__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2838:2: rule__Query__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl5915);
            	    rule__Query__Group_1_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2848:1: rule__Query__Group_1__6 : rule__Query__Group_1__6__Impl ;
    public final void rule__Query__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2852:1: ( rule__Query__Group_1__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2853:2: rule__Query__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__65946);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2859:1: rule__Query__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Query__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2863:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2864:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2864:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2865:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,43,FOLLOW_43_in_rule__Query__Group_1__6__Impl5974); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2892:1: rule__Query__Group_1_5__0 : rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 ;
    public final void rule__Query__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2896:1: ( rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2897:2: rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__06019);
            rule__Query__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__06022);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2904:1: rule__Query__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2908:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2909:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2909:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2910:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Query__Group_1_5__0__Impl6050); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2923:1: rule__Query__Group_1_5__1 : rule__Query__Group_1_5__1__Impl ;
    public final void rule__Query__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2927:1: ( rule__Query__Group_1_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2928:2: rule__Query__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__16081);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2934:1: rule__Query__Group_1_5__1__Impl : ( ( rule__Query__ParameterAssignment_1_5_1 ) ) ;
    public final void rule__Query__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2938:1: ( ( ( rule__Query__ParameterAssignment_1_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2939:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2939:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2940:1: ( rule__Query__ParameterAssignment_1_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2941:1: ( rule__Query__ParameterAssignment_1_5_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2941:2: rule__Query__ParameterAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl6108);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2955:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2959:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2960:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__06142);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__06145);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2967:1: rule__ParameterPattern__Group__0__Impl : ( ( rule__ParameterPattern__Alternatives_0 ) ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2971:1: ( ( ( rule__ParameterPattern__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2972:1: ( ( rule__ParameterPattern__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2972:1: ( ( rule__ParameterPattern__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2973:1: ( rule__ParameterPattern__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2974:1: ( rule__ParameterPattern__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2974:2: rule__ParameterPattern__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Alternatives_0_in_rule__ParameterPattern__Group__0__Impl6172);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2984:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2988:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2989:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__16202);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__16205);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:2996:1: rule__ParameterPattern__Group__1__Impl : ( ( rule__ParameterPattern__TypeAssignment_1 ) ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3000:1: ( ( ( rule__ParameterPattern__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3001:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3001:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3002:1: ( rule__ParameterPattern__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3003:1: ( rule__ParameterPattern__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3003:2: rule__ParameterPattern__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl6232);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3013:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3017:1: ( rule__ParameterPattern__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3018:2: rule__ParameterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__26262);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3024:1: rule__ParameterPattern__Group__2__Impl : ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3028:1: ( ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3029:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3029:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3030:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3031:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3031:2: rule__ParameterPattern__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl6289);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3047:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3051:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3052:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__06325);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__06328);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3059:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3063:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3064:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3064:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3065:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3066:1: ( rule__LocationQuery__NodeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3066:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl6355);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3076:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3080:1: ( rule__LocationQuery__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3081:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__16385);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3087:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Group_1__0 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3091:1: ( ( ( rule__LocationQuery__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3092:1: ( ( rule__LocationQuery__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3092:1: ( ( rule__LocationQuery__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3093:1: ( rule__LocationQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3094:1: ( rule__LocationQuery__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3094:2: rule__LocationQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl6412);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3108:1: rule__LocationQuery__Group_1__0 : rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 ;
    public final void rule__LocationQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3112:1: ( rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3113:2: rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__06447);
            rule__LocationQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__06450);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3120:1: rule__LocationQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3124:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3125:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3125:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3126:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__LocationQuery__Group_1__0__Impl6478); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3139:1: rule__LocationQuery__Group_1__1 : rule__LocationQuery__Group_1__1__Impl ;
    public final void rule__LocationQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3143:1: ( rule__LocationQuery__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3144:2: rule__LocationQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__16509);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3150:1: rule__LocationQuery__Group_1__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) ;
    public final void rule__LocationQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3154:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3155:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3155:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3156:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3157:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3157:2: rule__LocationQuery__SpecializationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl6536);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3171:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3175:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3176:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__06570);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__06573);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3183:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3187:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3188:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3188:1: ( ( rule__Node__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3189:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3190:1: ( rule__Node__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3190:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl6600);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3200:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3204:1: ( rule__Node__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3205:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__16630);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3211:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3215:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3216:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3216:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3217:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3218:1: ( rule__Node__ParameterAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3218:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl6657);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3232:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3236:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3237:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__06692);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__06695);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3244:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3248:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3249:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3249:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3250:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ParamQuery__Group__0__Impl6723); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3263:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3267:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3268:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__16754);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__16757);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3275:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3279:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3280:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3280:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3281:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3281:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3282:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3283:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3283:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl6786);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3286:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3287:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3288:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_INT)||(LA26_0>=15 && LA26_0<=18)||(LA26_0>=46 && LA26_0<=49)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3288:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl6798);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3299:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3303:1: ( rule__ParamQuery__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3304:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__26831);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3310:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3314:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3315:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3315:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3316:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,45,FOLLOW_45_in_rule__ParamQuery__Group__2__Impl6859); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3335:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3339:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3340:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__06896);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__06899);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3347:1: rule__ParamCompare__Group__0__Impl : ( ( rule__ParamCompare__LeftAssignment_0 ) ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3351:1: ( ( ( rule__ParamCompare__LeftAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3352:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3352:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3353:1: ( rule__ParamCompare__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3354:1: ( rule__ParamCompare__LeftAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3354:2: rule__ParamCompare__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl6926);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3364:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3368:1: ( rule__ParamCompare__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3369:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__16956);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3375:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 ) ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3379:1: ( ( ( rule__ParamCompare__Group_1__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3380:1: ( ( rule__ParamCompare__Group_1__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3380:1: ( ( rule__ParamCompare__Group_1__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3381:1: ( rule__ParamCompare__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3382:1: ( rule__ParamCompare__Group_1__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3382:2: rule__ParamCompare__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl6983);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3396:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3400:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3401:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__07017);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__07020);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3408:1: rule__ParamCompare__Group_1__0__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3412:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3413:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3413:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3414:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3415:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3415:2: rule__ParamCompare__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl7047);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3425:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3429:1: ( rule__ParamCompare__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3430:2: rule__ParamCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__17077);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3436:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__RightAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3440:1: ( ( ( rule__ParamCompare__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3441:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3441:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3442:1: ( rule__ParamCompare__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3443:1: ( rule__ParamCompare__RightAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3443:2: rule__ParamCompare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl7104);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3457:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3461:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3462:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__07138);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__07141);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3469:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 )? ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3473:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3474:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3474:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3475:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3476:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==15||(LA27_0>=48 && LA27_0<=49)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3476:2: rule__ReferenceValue__QueryAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl7168);
                    rule__ReferenceValue__QueryAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3486:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3490:1: ( rule__ReferenceValue__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3491:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__17199);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3497:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3501:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3502:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3502:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3503:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3504:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3504:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl7226);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3518:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3522:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3523:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__07260);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__07263);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3530:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3534:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3535:1: ( '#' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3535:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3536:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__RuntimeProperty__Group__0__Impl7291); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3549:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3553:1: ( rule__RuntimeProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3554:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__17322);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3560:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3564:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3565:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3565:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3566:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3567:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3567:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl7349);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3581:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3585:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3586:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__07383);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__07386);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3593:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3597:1: ( ( '$' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3598:1: ( '$' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3598:1: ( '$' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3599:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ReflectionProperty__Group__0__Impl7414); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3612:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3616:1: ( rule__ReflectionProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3617:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__17445);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3623:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3627:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3628:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3628:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3629:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3630:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3630:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl7472);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3644:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3648:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3649:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__07506);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__07509);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3656:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3660:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3661:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3661:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3662:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3663:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3665:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3675:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3679:1: ( rule__WildcardNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3680:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__17567);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3686:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3690:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3691:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3691:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3692:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__WildcardNode__Group__1__Impl7595); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3709:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3713:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3714:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__07630);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__07633);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3721:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3725:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3726:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3726:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3727:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3728:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3730:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3740:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3744:1: ( rule__SubPathNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3745:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__17691);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3751:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3755:1: ( ( '**' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3756:1: ( '**' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3756:1: ( '**' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3757:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__SubPathNode__Group__1__Impl7719); if (state.failed) return ;
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


    // $ANTLR start "rule__ParentNode__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3774:1: rule__ParentNode__Group__0 : rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 ;
    public final void rule__ParentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3778:1: ( rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3779:2: rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1
            {
            pushFollow(FOLLOW_rule__ParentNode__Group__0__Impl_in_rule__ParentNode__Group__07754);
            rule__ParentNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParentNode__Group__1_in_rule__ParentNode__Group__07757);
            rule__ParentNode__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentNode__Group__0"


    // $ANTLR start "rule__ParentNode__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3786:1: rule__ParentNode__Group__0__Impl : ( () ) ;
    public final void rule__ParentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3790:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3791:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3791:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3792:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3793:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3795:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentNode__Group__0__Impl"


    // $ANTLR start "rule__ParentNode__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3805:1: rule__ParentNode__Group__1 : rule__ParentNode__Group__1__Impl ;
    public final void rule__ParentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3809:1: ( rule__ParentNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3810:2: rule__ParentNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParentNode__Group__1__Impl_in_rule__ParentNode__Group__17815);
            rule__ParentNode__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentNode__Group__1"


    // $ANTLR start "rule__ParentNode__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3816:1: rule__ParentNode__Group__1__Impl : ( '<<' ) ;
    public final void rule__ParentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3820:1: ( ( '<<' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3821:1: ( '<<' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3821:1: ( '<<' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3822:1: '<<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__ParentNode__Group__1__Impl7843); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeAccess().getLessThanSignLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentNode__Group__1__Impl"


    // $ANTLR start "rule__Collector__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3839:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3843:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3844:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__07878);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__07881);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3851:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3855:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3856:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3856:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3857:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3858:1: ( rule__Collector__InsertionPointAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3858:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl7908);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3868:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl rule__Collector__Group__2 ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3872:1: ( rule__Collector__Group__1__Impl rule__Collector__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3873:2: rule__Collector__Group__1__Impl rule__Collector__Group__2
            {
            pushFollow(FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__17938);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__17941);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3880:1: rule__Collector__Group__1__Impl : ( ( rule__Collector__TypeAssignment_1 ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3884:1: ( ( ( rule__Collector__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3885:1: ( ( rule__Collector__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3885:1: ( ( rule__Collector__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3886:1: ( rule__Collector__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3887:1: ( rule__Collector__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3887:2: rule__Collector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl7968);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3897:1: rule__Collector__Group__2 : rule__Collector__Group__2__Impl rule__Collector__Group__3 ;
    public final void rule__Collector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3901:1: ( rule__Collector__Group__2__Impl rule__Collector__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3902:2: rule__Collector__Group__2__Impl rule__Collector__Group__3
            {
            pushFollow(FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__27998);
            rule__Collector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__28001);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3909:1: rule__Collector__Group__2__Impl : ( '(' ) ;
    public final void rule__Collector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3913:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3914:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3914:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3915:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__Collector__Group__2__Impl8029); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3928:1: rule__Collector__Group__3 : rule__Collector__Group__3__Impl rule__Collector__Group__4 ;
    public final void rule__Collector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3932:1: ( rule__Collector__Group__3__Impl rule__Collector__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3933:2: rule__Collector__Group__3__Impl rule__Collector__Group__4
            {
            pushFollow(FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__38060);
            rule__Collector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__38063);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3940:1: rule__Collector__Group__3__Impl : ( ( rule__Collector__Group_3__0 )? ) ;
    public final void rule__Collector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3944:1: ( ( ( rule__Collector__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3945:1: ( ( rule__Collector__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3945:1: ( ( rule__Collector__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3946:1: ( rule__Collector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3947:1: ( rule__Collector__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||(LA28_0>=15 && LA28_0<=18)||(LA28_0>=46 && LA28_0<=49)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3947:2: rule__Collector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl8090);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3957:1: rule__Collector__Group__4 : rule__Collector__Group__4__Impl ;
    public final void rule__Collector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3961:1: ( rule__Collector__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3962:2: rule__Collector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__48121);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3968:1: rule__Collector__Group__4__Impl : ( ')' ) ;
    public final void rule__Collector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3972:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3973:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3973:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3974:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,43,FOLLOW_43_in_rule__Collector__Group__4__Impl8149); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:3997:1: rule__Collector__Group_3__0 : rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 ;
    public final void rule__Collector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4001:1: ( rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4002:2: rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__08190);
            rule__Collector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__08193);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4009:1: rule__Collector__Group_3__0__Impl : ( ( rule__Collector__InitializationsAssignment_3_0 ) ) ;
    public final void rule__Collector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4013:1: ( ( ( rule__Collector__InitializationsAssignment_3_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4014:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4014:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4015:1: ( rule__Collector__InitializationsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4016:1: ( rule__Collector__InitializationsAssignment_3_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4016:2: rule__Collector__InitializationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl8220);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4026:1: rule__Collector__Group_3__1 : rule__Collector__Group_3__1__Impl ;
    public final void rule__Collector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4030:1: ( rule__Collector__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4031:2: rule__Collector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__18250);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4037:1: rule__Collector__Group_3__1__Impl : ( ( rule__Collector__Group_3_1__0 )* ) ;
    public final void rule__Collector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4041:1: ( ( ( rule__Collector__Group_3_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4042:1: ( ( rule__Collector__Group_3_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4042:1: ( ( rule__Collector__Group_3_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4043:1: ( rule__Collector__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4044:1: ( rule__Collector__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==37) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4044:2: rule__Collector__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl8277);
            	    rule__Collector__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4058:1: rule__Collector__Group_3_1__0 : rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 ;
    public final void rule__Collector__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4062:1: ( rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4063:2: rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__08312);
            rule__Collector__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__08315);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4070:1: rule__Collector__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Collector__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4074:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4075:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4075:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4076:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Collector__Group_3_1__0__Impl8343); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4089:1: rule__Collector__Group_3_1__1 : rule__Collector__Group_3_1__1__Impl ;
    public final void rule__Collector__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4093:1: ( rule__Collector__Group_3_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4094:2: rule__Collector__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__18374);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4100:1: rule__Collector__Group_3_1__1__Impl : ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) ;
    public final void rule__Collector__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4104:1: ( ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4105:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4105:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4106:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4107:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4107:2: rule__Collector__InitializationsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl8401);
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


    // $ANTLR start "rule__TagAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4121:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4125:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4126:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08435);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08438);
            rule__TagAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__0"


    // $ANTLR start "rule__TagAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4133:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4137:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4138:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4138:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4139:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__TagAnnotation__Group__0__Impl8466); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4152:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4156:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4157:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18497);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18500);
            rule__TagAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__1"


    // $ANTLR start "rule__TagAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4164:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4168:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4169:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4169:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4170:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4171:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4171:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8527);
            rule__TagAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__1__Impl"


    // $ANTLR start "rule__TagAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4181:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4185:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4186:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28557);
            rule__TagAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__2"


    // $ANTLR start "rule__TagAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4192:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4196:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4197:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4197:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4198:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4199:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4199:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8584);
                    rule__TagAnnotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4215:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4219:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4220:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08621);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08624);
            rule__TagAnnotation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__0"


    // $ANTLR start "rule__TagAnnotation__Group_2__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4227:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4231:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4232:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4232:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4233:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__TagAnnotation__Group_2__0__Impl8652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__0__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4246:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4250:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4251:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18683);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18686);
            rule__TagAnnotation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__1"


    // $ANTLR start "rule__TagAnnotation__Group_2__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4258:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4262:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4263:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4263:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4264:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4265:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==50) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4265:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8713);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__1__Impl"


    // $ANTLR start "rule__TagAnnotation__Group_2__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4275:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4279:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4280:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28744);
            rule__TagAnnotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__2"


    // $ANTLR start "rule__TagAnnotation__Group_2__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4286:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4290:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4291:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4291:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4292:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__TagAnnotation__Group_2__2__Impl8772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__Group_2__2__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4311:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4315:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4316:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08809);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08812);
            rule__KeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4323:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4327:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4328:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4328:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4329:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__KeyStringValueAnnotation__Group__0__Impl8840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4342:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4346:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4347:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18871);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18874);
            rule__KeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4354:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4358:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4359:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4359:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4360:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4361:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4361:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8901);
            rule__KeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4371:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4375:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4376:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28931);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28934);
            rule__KeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4383:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4387:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4388:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4388:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4389:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4390:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4390:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8961);
            rule__KeyStringValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4400:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4404:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4405:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38991);
            rule__KeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4411:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4415:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4416:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4416:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4417:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4418:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4418:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl9018);
                    rule__KeyStringValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4436:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4440:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4441:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__09057);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__09060);
            rule__KeyStringValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4448:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4452:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4453:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4453:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4454:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__KeyStringValueAnnotation__Group_3__0__Impl9088); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4467:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4471:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4472:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__19119);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__19122);
            rule__KeyStringValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4479:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4483:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4484:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4484:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4485:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4486:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_COMMENT_ANNOTATION||LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4486:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl9149);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4496:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4500:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4501:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__29180);
            rule__KeyStringValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyStringValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4507:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4511:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4512:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4512:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4513:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__KeyStringValueAnnotation__Group_3__2__Impl9208); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4532:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4536:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4537:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__09245);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__09248);
            rule__TypedKeyStringValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__0"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4544:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4548:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4549:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4549:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4550:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl9276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4563:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4567:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4568:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__19307);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__19310);
            rule__TypedKeyStringValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4575:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4579:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4580:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4580:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4581:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4582:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4582:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9337);
            rule__TypedKeyStringValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4592:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4596:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4597:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29367);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29370);
            rule__TypedKeyStringValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__2"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4604:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4608:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4609:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4609:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4610:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4623:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4627:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4628:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39429);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39432);
            rule__TypedKeyStringValueAnnotation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__3"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4635:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4639:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4640:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4640:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4641:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4642:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4642:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9459);
            rule__TypedKeyStringValueAnnotation__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4652:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4656:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4657:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49489);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49492);
            rule__TypedKeyStringValueAnnotation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__4"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__4__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4664:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4668:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4669:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4669:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4670:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_45_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9520); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__4__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4683:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4687:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4688:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59551);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59554);
            rule__TypedKeyStringValueAnnotation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__5__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4695:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4699:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4700:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4700:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4701:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4702:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4702:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9581);
            rule__TypedKeyStringValueAnnotation__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__5__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__6"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4712:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4716:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4717:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69611);
            rule__TypedKeyStringValueAnnotation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__6"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group__6__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4723:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4727:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4728:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4728:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4729:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4730:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4730:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9638);
                    rule__TypedKeyStringValueAnnotation__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group__6__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4754:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4758:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4759:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09683);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09686);
            rule__TypedKeyStringValueAnnotation__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__0"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4766:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4770:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4771:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4771:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4772:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9714); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__0__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4785:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4789:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4790:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19745);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19748);
            rule__TypedKeyStringValueAnnotation__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4797:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4801:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4802:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4802:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4803:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4804:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==50) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4804:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9775);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__1__Impl"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4814:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4818:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4819:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29806);
            rule__TypedKeyStringValueAnnotation__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4825:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4829:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4830:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4830:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4831:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__Group_6__2__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4850:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4854:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4855:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09871);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09874);
            rule__KeyBooleanValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4862:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4866:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4867:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4867:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4868:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4881:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4885:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4886:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19933);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19936);
            rule__KeyBooleanValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4893:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4897:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4898:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4898:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4899:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4900:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4900:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9963);
            rule__KeyBooleanValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4910:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4914:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4915:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29993);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29996);
            rule__KeyBooleanValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4922:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4926:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4927:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4927:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4928:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4929:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4929:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl10023);
            rule__KeyBooleanValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4939:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4943:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4944:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__310053);
            rule__KeyBooleanValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4950:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4954:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4955:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4955:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4956:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4957:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4957:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl10080);
                    rule__KeyBooleanValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4975:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4979:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4980:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__010119);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__010122);
            rule__KeyBooleanValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4987:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4991:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4992:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4992:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:4993:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl10150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5006:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5010:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5011:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__110181);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__110184);
            rule__KeyBooleanValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5018:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5022:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5023:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5023:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5024:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5025:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||LA37_0==50) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5025:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl10211);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5035:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5039:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5040:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__210242);
            rule__KeyBooleanValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5046:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5050:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5051:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5051:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5052:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl10270); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5071:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5075:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5076:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__010307);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__010310);
            rule__KeyIntValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5083:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5087:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5088:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5088:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5089:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__KeyIntValueAnnotation__Group__0__Impl10338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5102:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5106:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5107:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110369);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110372);
            rule__KeyIntValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5114:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5118:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5119:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5119:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5120:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5121:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5121:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10399);
            rule__KeyIntValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5131:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5135:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5136:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210429);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210432);
            rule__KeyIntValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5143:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5147:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5148:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5148:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5149:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5150:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5150:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10459);
            rule__KeyIntValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5160:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5164:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5165:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310489);
            rule__KeyIntValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5171:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5175:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5176:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5176:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5177:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5178:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5178:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10516);
                    rule__KeyIntValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5196:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5200:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5201:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010555);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010558);
            rule__KeyIntValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5208:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5212:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5213:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5213:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5214:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5227:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5231:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5232:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110617);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110620);
            rule__KeyIntValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5239:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5243:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5244:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5244:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5245:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5246:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==50) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5246:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10647);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5256:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5260:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5261:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210678);
            rule__KeyIntValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyIntValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5267:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5271:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5272:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5272:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5273:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5292:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5296:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5297:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010743);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010746);
            rule__KeyFloatValueAnnotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5304:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5308:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5309:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5309:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5310:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__KeyFloatValueAnnotation__Group__0__Impl10774); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__0__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5323:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5327:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5328:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110805);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110808);
            rule__KeyFloatValueAnnotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5335:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5339:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5340:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5340:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5341:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5342:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5342:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10835);
            rule__KeyFloatValueAnnotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__1__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5352:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5356:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5357:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210865);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210868);
            rule__KeyFloatValueAnnotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5364:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5368:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5369:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5369:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5370:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5371:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5371:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10895);
            rule__KeyFloatValueAnnotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__2__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5381:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5385:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5386:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310925);
            rule__KeyFloatValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group__3__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5392:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5396:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5397:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5397:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5398:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5399:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==42) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5399:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10952);
                    rule__KeyFloatValueAnnotation__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group__3__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5417:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5421:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5422:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010991);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010994);
            rule__KeyFloatValueAnnotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5429:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5433:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5434:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5434:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5435:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl11022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__0__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5448:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5452:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5453:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__111053);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__111056);
            rule__KeyFloatValueAnnotation__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5460:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5464:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5465:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5465:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5466:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5467:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_COMMENT_ANNOTATION||LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5467:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl11083);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__1__Impl"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5477:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5481:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5482:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__211114);
            rule__KeyFloatValueAnnotation__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__Group_3__2__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5488:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5492:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5493:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5493:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5494:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl11142); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__Group_3__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5514:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5518:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5519:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__011180);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__011183);
            rule__ExtendedID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__0"


    // $ANTLR start "rule__ExtendedID__Group__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5526:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5530:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5531:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5531:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5532:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl11210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5543:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5547:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5548:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__111239);
            rule__ExtendedID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__1"


    // $ANTLR start "rule__ExtendedID__Group__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5554:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5558:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5559:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5559:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5560:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5561:1: ( rule__ExtendedID__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==38) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5561:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl11266);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5575:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5579:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5580:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__011301);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__011304);
            rule__ExtendedID__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1__0__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5587:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5591:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5592:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5592:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5593:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExtendedID__Group_1__0__Impl11332); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5606:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5610:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5611:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111363);
            rule__ExtendedID__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1__1__Impl"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5617:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5621:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5622:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5622:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5623:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedID__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5639:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5643:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5644:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5644:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5645:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_111428);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5654:1: rule__Model__MetamodelsAssignment_2 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5658:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5659:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5659:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5660:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsRegisteredPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_211459);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5669:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5673:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5674:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5674:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5675:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_311490);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5684:1: rule__Model__SourcesAssignment_4 : ( ruleApplicationModel ) ;
    public final void rule__Model__SourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5688:1: ( ( ruleApplicationModel ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5689:1: ( ruleApplicationModel )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5689:1: ( ruleApplicationModel )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5690:1: ruleApplicationModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSourcesApplicationModelParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_411521);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5699:1: rule__Model__AspectsAssignment_5 : ( ruleAspect ) ;
    public final void rule__Model__AspectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5703:1: ( ( ruleAspect ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5704:1: ( ruleAspect )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5704:1: ( ruleAspect )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5705:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_511552);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5714:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5718:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5719:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5719:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5720:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_111583);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5729:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5733:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5734:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5734:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5735:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_111614); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5744:1: rule__RegisteredPackage__EPackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__RegisteredPackage__EPackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5748:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5749:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5749:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5750:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5751:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5752:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_211649); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5763:1: rule__ApplicationModel__UsePackagesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5767:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5768:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5768:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5769:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5770:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5771:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_111688); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5782:1: rule__ApplicationModel__UsePackagesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ApplicationModel__UsePackagesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5786:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5787:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5787:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5788:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageCrossReference_2_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5789:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5790:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUsePackagesRegisteredPackageIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_111727); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5801:1: rule__ApplicationModel__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5805:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5806:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5806:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5807:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_411762); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5816:1: rule__ApplicationModel__ModelAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5820:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5821:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5821:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5822:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_511793); if (state.failed) return ;
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


    // $ANTLR start "rule__Aspect__AnnotationAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5831:1: rule__Aspect__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Aspect__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5835:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5836:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5836:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5837:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Aspect__AnnotationAssignment_011824);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__AnnotationAssignment_0"


    // $ANTLR start "rule__Aspect__QueryAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5846:1: rule__Aspect__QueryAssignment_2 : ( ruleQuery ) ;
    public final void rule__Aspect__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5850:1: ( ( ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5851:1: ( ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5851:1: ( ruleQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5852:1: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_211855);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__QueryAssignment_2"


    // $ANTLR start "rule__Aspect__CollectorsAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5861:1: rule__Aspect__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Aspect__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5865:1: ( ( ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5866:1: ( ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5866:1: ( ruleCollector )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5867:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_411886);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__CollectorsAssignment_4"


    // $ANTLR start "rule__Query__LocationAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5876:1: rule__Query__LocationAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__Query__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5880:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5881:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5881:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5882:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_011917);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5891:1: rule__Query__ModifierAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ModifierAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5895:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5896:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5896:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5897:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5898:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5899:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_011952); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5910:1: rule__Query__ReturnTypeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ReturnTypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5914:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5915:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5915:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5916:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5917:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5918:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_011991); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5929:1: rule__Query__MethodAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Query__MethodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5933:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5934:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5934:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5935:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5936:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5937:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_212030); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5948:1: rule__Query__ParameterAssignment_1_4 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5952:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5953:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5953:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5954:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_412065);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5963:1: rule__Query__ParameterAssignment_1_5_1 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5967:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5968:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5968:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5969:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_112096);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5978:1: rule__ParameterPattern__ModifierAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ModifierAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5982:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5983:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5983:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5984:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5985:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5986:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_0_012131); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:5997:1: rule__ParameterPattern__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6001:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6002:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6002:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6003:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6004:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6005:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_112170); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6016:1: rule__ParameterPattern__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6020:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6021:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6021:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6022:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6023:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6024:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_212209); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6035:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6039:1: ( ( ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6040:1: ( ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6040:1: ( ruleNode )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6041:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_012244);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6050:1: rule__LocationQuery__SpecializationAssignment_1_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6054:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6055:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6055:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6056:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_112275);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6065:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6069:1: ( ( ruleParamQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6070:1: ( ruleParamQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6070:1: ( ruleParamQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6071:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_112306);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6080:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamCompare ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6084:1: ( ( ruleParamCompare ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6085:1: ( ruleParamCompare )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6085:1: ( ruleParamCompare )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6086:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_112337);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6095:1: rule__ParamCompare__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__ParamCompare__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6099:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6100:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6100:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6101:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_012368);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6110:1: rule__ParamCompare__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6114:1: ( ( ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6115:1: ( ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6115:1: ( ruleOperator )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6116:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_012399);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6125:1: rule__ParamCompare__RightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6129:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6130:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6130:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6131:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_112430);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6140:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6144:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6145:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6145:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6146:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12461); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6155:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6159:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6160:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6160:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6161:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12492); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6170:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6174:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6175:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6175:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6176:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment12523); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6185:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6189:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6190:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6190:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6191:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_012554);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6200:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6204:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6205:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6205:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6206:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_112585);
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


    // $ANTLR start "rule__InternalFunctionProperty__FunctionAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6215:1: rule__InternalFunctionProperty__FunctionAssignment : ( ruleInternalFunction ) ;
    public final void rule__InternalFunctionProperty__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6219:1: ( ( ruleInternalFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6220:1: ( ruleInternalFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6220:1: ( ruleInternalFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6221:1: ruleInternalFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleInternalFunction_in_rule__InternalFunctionProperty__FunctionAssignment12616);
            ruleInternalFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternalFunctionProperty__FunctionAssignment"


    // $ANTLR start "rule__RuntimeProperty__ReferenceAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6230:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6234:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6235:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6235:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6236:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_112647); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6245:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6249:1: ( ( ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6250:1: ( ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6250:1: ( ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6251:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_112678);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6260:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6264:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6265:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6265:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6266:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6267:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6268:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment12713); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6279:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6283:1: ( ( ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6284:1: ( ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6284:1: ( ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6285:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_012748);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6294:1: rule__Collector__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Collector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6298:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6299:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6299:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6300:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6301:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6302:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_112783);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6313:1: rule__Collector__InitializationsAssignment_3_0 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6317:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6318:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6318:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6319:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_012818);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6328:1: rule__Collector__InitializationsAssignment_3_1_1 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6332:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6333:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6333:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6334:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_112849);
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


    // $ANTLR start "rule__CommentAnnotation__ValueAssignment"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6343:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6347:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6348:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6348:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6349:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12880); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentAnnotation__ValueAssignment"


    // $ANTLR start "rule__TagAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6358:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6362:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6363:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6363:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6364:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112911);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__NameAssignment_1"


    // $ANTLR start "rule__TagAnnotation__AnnotationsAssignment_2_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6373:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6377:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6378:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6378:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6379:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112942);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TagAnnotation__AnnotationsAssignment_2_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6388:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6392:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6393:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6393:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6394:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112973);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyStringValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6403:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6407:1: ( ( ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6408:1: ( ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6408:1: ( ruleEString )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6409:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_213004);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6418:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6422:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6423:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6423:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6424:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_113035);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6433:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6437:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6438:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6438:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6439:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_113066);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__TypeAssignment_3"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6448:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6452:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6453:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6453:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6454:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_313097);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6463:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6467:1: ( ( ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6468:1: ( ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6468:1: ( ruleEString )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6469:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_513128);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__ValueAssignment_5"


    // $ANTLR start "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6478:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6482:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6483:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6483:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6484:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_113159);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6493:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6497:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6498:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6498:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6499:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_113190);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6508:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6512:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6513:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6513:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6514:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_213221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6523:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6527:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6528:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6528:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6529:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_113252);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyIntValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6538:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6542:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6543:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6543:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6544:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_113283);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyIntValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6553:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6557:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6558:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6558:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6559:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_213314); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6568:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6572:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6573:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6573:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6574:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_113345);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__NameAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6583:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6587:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6588:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6588:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6589:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_113376);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__NameAssignment_1"


    // $ANTLR start "rule__KeyFloatValueAnnotation__ValueAssignment_2"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6598:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6602:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6603:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6603:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6604:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_213407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6613:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6617:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6618:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6618:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalAspectLang.g:6619:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_113438);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\3\uffff\1\5\7\uffff\1\5";
    static final String DFA7_minS =
        "\1\10\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA7_maxS =
        "\1\62\1\uffff\1\5\1\62\1\5\6\uffff\1\62";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\1\4\1\5\1\7\1\3\1\6\1\uffff";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\51\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\10\1\12\1\5\1\7\34\uffff\1\4\1\5\2\uffff\2\5\1\6\5"+
            "\uffff\1\5",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\1\10\1\12\1\5\1\7\34\uffff\1\4\1\5\2\uffff\2\5\1\6\5"+
            "\uffff\1\5"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1345:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
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
    public static final BitSet FOLLOW_ruleInternalFunctionProperty_in_entryRuleInternalFunctionProperty1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInternalFunctionProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalFunctionProperty__FunctionAssignment_in_ruleInternalFunctionProperty1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentNode_in_entryRuleParentNode1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParentNode1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParentNode__Group__0_in_ruleParentNode1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0_in_ruleCollector1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation2109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID2231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InternalFunction__Alternatives_in_ruleInternalFunction2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Alternatives_1_02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_12497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Alternatives_1_12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ModifierAssignment_0_0_in_rule__ParameterPattern__Alternatives_02550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParameterPattern__Alternatives_02569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_02603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_02620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParentNode_in_rule__Node__Alternatives_02637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_02654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalFunctionProperty_in_rule__Parameter__Alternatives2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InternalFunction__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InternalFunction__Alternatives3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InternalFunction__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ReflectionFunction__Alternatives3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ReflectionFunction__Alternatives3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReflectionFunction__Alternatives3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReflectionFunction__Alternatives3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Alternatives3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Operator__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Operator__Alternatives3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Operator__Alternatives3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InsertionPoint__Alternatives3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InsertionPoint__Alternatives3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Model__Group__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13475 = new BitSet(new long[]{0x0004008E00000100L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23535 = new BitSet(new long[]{0x0004008E00000100L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_2_in_rule__Model__Group__2__Impl3565 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33596 = new BitSet(new long[]{0x0004008E00000100L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl3626 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43657 = new BitSet(new long[]{0x0004008E00000100L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SourcesAssignment_4_in_rule__Model__Group__4__Impl3687 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectsAssignment_5_in_rule__Model__Group__5__Impl3745 = new BitSet(new long[]{0x0004008000000102L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Import__Group__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03911 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RegisteredPackage__Group__0__Impl3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__24033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__EPackageAssignment_2_in_rule__RegisteredPackage__Group__2__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__0__Impl_in_rule__ApplicationModel__Group__04096 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1_in_rule__ApplicationModel__Group__04099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ApplicationModel__Group__0__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__1__Impl_in_rule__ApplicationModel__Group__14158 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2_in_rule__ApplicationModel__Group__14161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_1_in_rule__ApplicationModel__Group__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__2__Impl_in_rule__ApplicationModel__Group__24218 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3_in_rule__ApplicationModel__Group__24221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0_in_rule__ApplicationModel__Group__2__Impl4248 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__3__Impl_in_rule__ApplicationModel__Group__34279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4_in_rule__ApplicationModel__Group__34282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ApplicationModel__Group__3__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__4__Impl_in_rule__ApplicationModel__Group__44341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5_in_rule__ApplicationModel__Group__44344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__NameAssignment_4_in_rule__ApplicationModel__Group__4__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group__5__Impl_in_rule__ApplicationModel__Group__54401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__ModelAssignment_5_in_rule__ApplicationModel__Group__5__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__0__Impl_in_rule__ApplicationModel__Group_2__04470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1_in_rule__ApplicationModel__Group_2__04473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ApplicationModel__Group_2__0__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__Group_2__1__Impl_in_rule__ApplicationModel__Group_2__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationModel__UsePackagesAssignment_2_1_in_rule__ApplicationModel__Group_2__1__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04593 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4679 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04714 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__04838 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__04841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__14897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__04959 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__04962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__15021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__05084 = new BitSet(new long[]{0x0004008000000100L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__05087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__AnnotationAssignment_0_in_rule__Aspect__Group__0__Impl5114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__15145 = new BitSet(new long[]{0x0003000000008020L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__15148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Aspect__Group__1__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__25207 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__25210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__QueryAssignment_2_in_rule__Aspect__Group__2__Impl5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__35267 = new BitSet(new long[]{0x00000200C0000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__35270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Aspect__Group__3__Impl5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__45329 = new BitSet(new long[]{0x00000200C0000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__5_in_rule__Aspect__Group__45332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__CollectorsAssignment_4_in_rule__Aspect__Group__4__Impl5359 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__5__Impl_in_rule__Aspect__Group__55390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Aspect__Group__5__Impl5418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__05461 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__05464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__15521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__05583 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__05586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__15643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__15646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__25703 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__25706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__35763 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__35766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Query__Group_1__3__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__45825 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__45828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__55885 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__55888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl5915 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__65946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Query__Group_1__6__Impl5974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__06019 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__06022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Query__Group_1_5__0__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__06142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__06145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Alternatives_0_in_rule__ParameterPattern__Group__0__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__16202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__26262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__06325 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__06328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__16385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__06447 = new BitSet(new long[]{0x0003000000008020L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__06450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LocationQuery__Group_1__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__16509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__06570 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__06573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__16630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__06692 = new BitSet(new long[]{0x0003C000000780F0L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__06695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ParamQuery__Group__0__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__16754 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__16757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl6786 = new BitSet(new long[]{0x0003C000000780F2L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl6798 = new BitSet(new long[]{0x0003C000000780F2L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__26831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ParamQuery__Group__2__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__06896 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__06899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__16956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__07017 = new BitSet(new long[]{0x0003C000000780F0L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__07020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__17077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__07138 = new BitSet(new long[]{0x0003C000000780F0L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__07141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__17199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__07260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__07263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RuntimeProperty__Group__0__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__17322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__07383 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ReflectionProperty__Group__0__Impl7414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__07506 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__07509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__17567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WildcardNode__Group__1__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__07630 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__07633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__17691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__SubPathNode__Group__1__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParentNode__Group__0__Impl_in_rule__ParentNode__Group__07754 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ParentNode__Group__1_in_rule__ParentNode__Group__07757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParentNode__Group__1__Impl_in_rule__ParentNode__Group__17815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ParentNode__Group__1__Impl7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__07878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__07881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__17938 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__17941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__27998 = new BitSet(new long[]{0x0003C800000780F0L});
    public static final BitSet FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__28001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Collector__Group__2__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__38060 = new BitSet(new long[]{0x0003C800000780F0L});
    public static final BitSet FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__38063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__48121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Collector__Group__4__Impl8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__08190 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__08193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__18250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl8277 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__08312 = new BitSet(new long[]{0x0003C000000780F0L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__08315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Collector__Group_3_1__0__Impl8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__08435 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__08438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TagAnnotation__Group__0__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__18497 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__18500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__28557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__08621 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TagAnnotation__Group_2__0__Impl8652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__18683 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__18686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl8713 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__28744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TagAnnotation__Group_2__2__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__08809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__08812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__KeyStringValueAnnotation__Group__0__Impl8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__18871 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__28931 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__28934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__38991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__09057 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__09060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KeyStringValueAnnotation__Group_3__0__Impl9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__19119 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__19122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl9149 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__29180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KeyStringValueAnnotation__Group_3__2__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__09245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__09248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__19307 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__19310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__29367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__29370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__39429 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__39432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__49489 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__49492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__59551 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__59554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__69611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__09683 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__09686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl9714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__19745 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__19748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl9775 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__29806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl9834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__09871 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__09874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__KeyBooleanValueAnnotation__Group__0__Impl9902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__19933 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__19936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__29993 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__29996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__310053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl10080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__010119 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__010122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__110181 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__110184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl10211 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__210242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__010307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__010310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__KeyIntValueAnnotation__Group__0__Impl10338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__110369 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__110372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl10399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__210429 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__210432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__310489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__010555 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__010558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KeyIntValueAnnotation__Group_3__0__Impl10586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__110617 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__110620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl10647 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__210678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KeyIntValueAnnotation__Group_3__2__Impl10706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__010743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__010746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__KeyFloatValueAnnotation__Group__0__Impl10774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__110805 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__110808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__210865 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__210868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl10895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__310925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__010991 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__010994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__111053 = new BitSet(new long[]{0x0004080000000100L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__111056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl11083 = new BitSet(new long[]{0x0004000000000102L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__211114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__011180 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__011183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__111239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl11266 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__011301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__011304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExtendedID__Group_1__0__Impl11332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__111363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_111428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__MetamodelsAssignment_211459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_311490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationModel_in_rule__Model__SourcesAssignment_411521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_511552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_111583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_111614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__EPackageAssignment_211649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_111688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__UsePackagesAssignment_2_111727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationModel__NameAssignment_411762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ApplicationModel__ModelAssignment_511793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Aspect__AnnotationAssignment_011824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_211855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_411886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_011917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_011952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_011991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_212030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_412065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_112096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_0_012131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_112170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_212209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_012244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_112275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_112306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_112337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_012368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_012399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_112430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment12461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment12523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_012554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_112585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInternalFunction_in_rule__InternalFunctionProperty__FunctionAssignment12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_112647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_112678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_012748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_112783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_012818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_112849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_112911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_112942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_112973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_213004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_113035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_113066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_313097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_513128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_113159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_113190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_213221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_113252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_113283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_213314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_113345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_113376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_213407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_113438 = new BitSet(new long[]{0x0000000000000002L});

}